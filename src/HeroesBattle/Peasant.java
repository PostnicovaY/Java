package HeroesBattle;

public class Peasant extends Heroes{
    public Peasant(String name) {
        super(100,
                100,
                0,
                new int[] {1},
                name);
    }

    @Override
    public String toString() {
        return "Крестьянин " + name + " здорорье: " + health + "/" + maxHealth + ", броня: " + armor;
    }
}
