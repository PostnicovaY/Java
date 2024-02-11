package HeroesBattle;

public class Crossbower extends  Heroes{
    public Crossbower(String name) {
        super(75,
                75,
                2,
                new int[] {10, 15},
                name);
    }

    @Override
    public String toString() {
        return "Арбалетчик " + name + " здорорье: " + health + "/" + maxHealth + ", броня: " + armor;
    }
}
