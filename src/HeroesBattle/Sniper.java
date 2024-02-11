package HeroesBattle;

public class Sniper extends Heroes {
    public Sniper(String name) {
        super(75,
                75,
                2,
                new int[] {10, 15},
                name);
//        int rangeDamage =
    }

    @Override
    public String toString() {
        return "Снайпер " + name + " здорорье: " + health + "/" + maxHealth + ", броня: " + armor;
    }
}
