package HerroWars;

public class Mage extends BaseHero {

    private int mana;
    private int maxMana;

    public Mage() {
        super(String.format("Hero_Mage #%d", ++Mage.number),
                Mage.r.nextInt(100, 200));
        this.maxMana = Mage.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);
    }
}