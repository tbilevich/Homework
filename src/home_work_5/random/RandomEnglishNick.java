package home_work_5.random;

import home_work_5.api.IRandomNick;

import java.util.Random;

public class RandomEnglishNick implements IRandomNick {
    @Override
    public String generate() {
        String engLetters = "abcdefghijklmnopqrstuvwxyz";
        String engLettersUpperCase = engLetters.toUpperCase();
        Random random = new Random();

        StringBuilder strBuilder = new StringBuilder();
        int nickLenght = random.nextInt(20);
        int rndFirtsLetterCharAt = random.nextInt(engLettersUpperCase.length());
        strBuilder.append(engLettersUpperCase.charAt(rndFirtsLetterCharAt));

        for (int i = 0; i < nickLenght - 1; i++) {
            int rndCharAt = random.nextInt(engLetters.length());
            char rndChar = engLetters.charAt(rndCharAt);
            strBuilder.append(rndChar);
        }
        return strBuilder.toString();
    }
}
