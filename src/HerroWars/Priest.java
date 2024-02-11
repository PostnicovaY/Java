package HerroWars;

public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Mage.number),
                Mage.r.nextInt(100, 200));
        this.maxElixir = Mage.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
