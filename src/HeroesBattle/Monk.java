package HeroesBattle;

public class Monk extends Heroes {

    public Monk(String name) {
        super(50,
                50,
                1,
                new int[] {-10, -5},
                name);
    }

    @Override
    public String toString() {
        return "Монах " + name + " здорорье: " + health + "/" + maxHealth + ", броня: " + armor;
    }
}
