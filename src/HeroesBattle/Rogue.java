package HeroesBattle;

public class Rogue extends Heroes {

    public Rogue(String name) {
        super(100,
                100,
                5,
                new int[] {20, 30},
                name);
    }

    @Override
    public String toString() {
        return "Разбойник " + name + " здорорье: " + health + "/" + maxHealth + ", броня: " + armor;
    }
}
