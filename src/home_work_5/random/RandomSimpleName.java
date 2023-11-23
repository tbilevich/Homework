package home_work_5.random;

import home_work_5.api.IRandomName;
import home_work_5.api.IRandomNick;

import java.util.Random;

public class RandomSimpleName implements IRandomName, IRandomNick {
    @Override
    public String generate() {
        int minValue = 0;
        int maxValue = 127;
        Random random = new Random();
        StringBuilder strBuilder = new StringBuilder();
        int nameLenght = random.nextInt(20);

        for (int i = 0; i < nameLenght; i++) {
            int rndCharAt = random.nextInt(minValue,maxValue);
            strBuilder.append((char) rndCharAt);
        }
        return strBuilder.toString();
    }
}
