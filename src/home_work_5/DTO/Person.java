package home_work_5.DTO;

import home_work_5.api.IRandomName;
import home_work_5.api.IRandomNick;

import java.util.Objects;

public class Person {
    private String nick;
    private String password;
    private String name;

    /**
     * Конструктор инициализирует вновь созданный объект Person
     *
     * @param randomNick - рандомно-сгенерированный ник
     * @param password - пароль
     * @param randomName - рандомно-сгенерированное имя
     */
    public Person(IRandomNick randomNick, String password, IRandomName randomName) {
        this.nick = randomNick.generate();
        if (password.length() > 4 && password.length() < 11) {
            this.password = password;
        } else {
            throw new RuntimeException("The password must be between 5 and 10 characters long.");
        }
        this.name = randomName.generate();
    }

    /**
     * Метод получения псевдонима пользователя
     *
     * @return - возвращает псевдонима пользователя
     */
    public String getNick() {
        return nick;
    }

    /**
     * Метод получения пароля пользователя
     *
     * @return - возвращает пароль пользователя
     */
    public String getPassword() {
        return password;
    }

    /**
     * Метод получения имени пользователя
     *
     * @return - возвращает имя пользователя
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{nick: " + nick + ", password: " + password + ", name: " + name + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) && Objects.equals(password, person.password) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, name);
    }
}
