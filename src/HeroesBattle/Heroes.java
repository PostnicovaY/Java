package HeroesBattle;

public abstract class Heroes {
    int maxHealth, health, armor;
    int[] damage;
    String name;

    public Heroes(int maxHealth, int health, int armor, int[] damage, String name) {
        this.maxHealth = maxHealth;
        this.health = health;
        this.armor = armor;
        this.damage = damage;
        this.name = name;
    }

}
