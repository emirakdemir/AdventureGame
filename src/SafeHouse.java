public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("");
        System.out.println("########### Güvenli Ev ###########");
        System.out.println("Güvenli Evdesiniz !");
        System.out.println("Canınız Yenilendi !");
        this.getPlayer().setOrjinalHealth(this.getPlayer().getOrjinalHealth());

        return true;
    }
}