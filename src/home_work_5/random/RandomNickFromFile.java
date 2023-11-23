package home_work_5.random;

import home_work_5.api.IRandomNick;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class RandomNickFromFile implements IRandomNick {

    @Override
    public String generate() {
        try {
            List<String> names = Files.readAllLines(Path.of("nick.txt"));
            Random randomNum = new Random();

            return names.get(randomNum.nextInt(names.size()));
        } catch (IOException e) {
            throw new RuntimeException("File reading error: " + e.getMessage());
        }
    }
}
