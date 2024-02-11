package HeroesBattle;

public class Wizard extends Heroes {

    public Wizard(String name) {
        super(50,
                50,
                1,
                new int[] {-10, -5},
                name);
    }

    @Override
    public String toString() {
        return "Маг " + name + " здорорье: " + health + "/" + maxHealth + ", броня: " + armor;
    }
}
