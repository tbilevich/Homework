package home_work_5.supplier;

import home_work_5.DTO.Person;
import home_work_5.api.IRandomName;
import home_work_5.api.IRandomNick;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierPerson implements Supplier<Person> {
    private String password = "pass";
    private Random random = new Random();
    private IRandomName randomName;
    private IRandomNick randomNick;

    /**
     * Конструктор инициализирует вновь созданный объект SupplierPerson
     *
     * @param randomNick - рандомно-сгенерированный ник пользователя
     * @param randomName - рандомно-сгенерированный имя пользователя
     */
    public SupplierPerson(IRandomNick randomNick, IRandomName randomName) {
        this.randomName = randomName;
        this.randomNick = randomNick;
    }

    @Override
    public Person get() {
        return new Person(randomNick, password + random.nextInt(999999), randomName);
    }
}
