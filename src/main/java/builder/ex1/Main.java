package builder.ex1;

import builder.ex1.GameCharacter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameCharacter.GameCharacterBuilder builder = new GameCharacter.GameCharacterBuilder();
        GameCharacter gameCharacter1 = builder
                .setName("Zenon")
                .setHealth(100)
                .setMana(105)
                .setNumberOfPoints(45.2)
                .createGameCharacter();

        GameCharacter gameCharacter2 = builder
                .setName("Maria")
                .setHealth(85)
                .setMana(125)
                .setNumberOfPoints(56.8)
                .createGameCharacter();

        GameCharacter gameCharacter3 = builder
                .setName("John")
                .setHealth(160)
                .setMana(150)
                .setNumberOfPoints(84.6)
                .createGameCharacter();

        GameCharacter gameCharacter4 = builder
                .setName("Abdul")
                .setHealth(94)
                .setMana(40)
                .setNumberOfPoints(95.4)
                .createGameCharacter();

        GameCharacter gameCharacter5 = builder
                .setName("Julia")
                .setHealth(50)
                .setMana(104)
                .setNumberOfPoints(65.3)
                .createGameCharacter();

        List<GameCharacter> gameCharacterList = new ArrayList<>();
        gameCharacterList.add(gameCharacter1);
        gameCharacterList.add(gameCharacter2);
        gameCharacterList.add(gameCharacter3);
        gameCharacterList.add(gameCharacter4);
        gameCharacterList.add(gameCharacter5);
        gameCharacterList.add(gameCharacter1);
        gameCharacterList.add(gameCharacter1);



        System.out.println(gameCharacterList.toString());
    }
}
