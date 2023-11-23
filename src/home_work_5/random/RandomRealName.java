package home_work_5.random;

import home_work_5.api.IRandomName;

import java.util.Random;

public class RandomRealName implements IRandomName {
    @Override
    public String generate() {
        String[] arrayOfNames = {"Артем", "Марк", "Михаил", "Максим", "Алиса", "Ева", "София", "Мария", "Ричард", "Эрик", "Демьян", "Яромир", "Марьян", "Любава", "Мишель", "Венера", "Аглая", "Окулина"};
        Random random = new Random();

        int nameID = random.nextInt(arrayOfNames.length - 1);
        return arrayOfNames[nameID];
    }
}
