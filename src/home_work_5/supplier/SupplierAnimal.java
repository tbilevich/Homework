package home_work_5.supplier;

import home_work_5.DTO.Animal;
import home_work_5.api.IRandomName;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierAnimal implements Supplier<Animal> {
    private Random random = new Random();
    private IRandomName randomName;

    /**
     * Конструктор инициализирует вновь созданный объект SupplierAnimal
     *
     * @param randomName - рандомно-сгенерированный ник животного
     */
    public SupplierAnimal(IRandomName randomName) {
        this.randomName = randomName;
    }

    @Override
    public Animal get() {
        return new Animal((random.nextInt(14) + 1), randomName);
    }
}
