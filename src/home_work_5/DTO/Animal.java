package home_work_5.DTO;

import home_work_5.api.IRandomName;

import java.util.Objects;

public class Animal {
    private Integer age;
    private String nick;

    /**
     * Конструктор инициализирует вновь созданный объект Animal
     *
     * @param age        - возраст
     * @param randomName - рандомно-сгенерированное имя
     */
    public Animal(Integer age, IRandomName randomName) {
        if (age > 0 && age < 16) {
            this.age = age;
        } else {
            throw new RuntimeException("The age must be between 1 and 15.");
        }
        this.nick = randomName.generate();
    }

    /**
     * Метод получения возраста животного
     *
     * @return - возвращает возраст животного
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Метод получения ника животного
     *
     * @return - возвращает ник животного
     */
    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "{age: " + age + ", nick: " + nick + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(age, animal.age) && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nick);
    }
}
