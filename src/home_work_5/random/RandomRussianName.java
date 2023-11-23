package home_work_5.random;

import home_work_5.api.IRandomName;

import java.util.Random;

public class RandomRussianName implements IRandomName {

    @Override
    public String generate() {
        String rusLetters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String rusLettersUpperCase = rusLetters.toUpperCase();
        Random random = new Random();

        StringBuilder strBuilder = new StringBuilder();
        int nameLenght = random.nextInt(20);
        int rndFirtsLetterCharAt = random.nextInt(rusLettersUpperCase.length());
        strBuilder.append(rusLettersUpperCase.charAt(rndFirtsLetterCharAt));

        for (int i = 0; i < nameLenght - 1; i++) {
            int rndCharAt = random.nextInt(rusLetters.length());
            char rndChar = rusLetters.charAt(rndCharAt);
            strBuilder.append(rndChar);
        }
        return strBuilder.toString();
    }
}
