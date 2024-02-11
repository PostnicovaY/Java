package HeroesBattle;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        heroesWhite = generateCommand(0);
        heroesBlack = generateCommand(3);

//        Heroes heroA1 = new Crossbower("Sauron");
//        Heroes heroA2 = new Monk("Saruman");
//        Heroes heroA3 = new Rogue("Golum");
//        Heroes heroA4 = new Peasant("Grimu");
//        Heroes heroB1 = new Peasant("Sam");
//        Heroes heroB2 = new Pikeman("Frodo");
//        Heroes heroB3 = new Sniper("Legolas");
//        Heroes heroB4 = new Wizard("Gendalf");

//        System.out.println(heroA1);
//        System.out.println(heroA2);
//        System.out.println(heroA3);
//        System.out.println(heroA4);
//        System.out.println(heroB1);
//        System.out.println(heroB2);
//        System.out.println(heroB3);
//        System.out.println(heroB4);

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("++++++++++++++++++++++++++++++++");
        heroesBlack.forEach(n -> System.out.println(n.toString()));

    }

    static ArrayList<Heroes> heroesWhite = new ArrayList<>();
    static ArrayList<Heroes> heroesBlack = new ArrayList<>();

    static ArrayList<Heroes> generateCommand(int n) {
        ArrayList<Heroes> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;
        for (int i = 0; i < 10; i++) {
            ArrayList<Heroes> typeheroes = new ArrayList<>();
            rand = random.nextInt(1,5) + n;
            switch (rand){
                case 1:
                    commandHeroes.add(new Crossbower(getName()));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName()));
                    break;
                case 3:
                    commandHeroes.add(new Rogue(getName()));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getName()));
                    break;
                case 5:
                    commandHeroes.add(new Pikeman(getName()));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName()));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getName()));
                    break;
            }
        }
        return commandHeroes;
    }

    static String getName(){
        return Names.values()[new Random().nextInt(Names.values().length - 1)].toString();
    }
}
