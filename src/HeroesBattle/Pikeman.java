package HeroesBattle;

public class Pikeman extends Heroes {

    public Pikeman(String name) {
        super(100,
                100,
                5,
                new int[] {20, 30},
                name);
    }

    @Override
    public String toString() {
        return "Копейщик " + name + " здорорье: " + health + "/" + maxHealth + ", броня: " + armor;
    }
}
