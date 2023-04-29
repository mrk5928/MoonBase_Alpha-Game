public class BlackHolePath extends MapTile {
    public BlackHolePath(int x, int y) {
        super(x, y);
    }

    public String intro_text() {
        return "\nYou are on a path that leads deeper into the black. !!!CAUTION WALK ON YOUR OWN RISK!!!";
    }
    public void modify_player(Player player) {
//Room has no action on player
    }
}
