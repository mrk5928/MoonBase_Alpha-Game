public class OxygenRoom extends LootRoom{
    private boolean isLooted;

    public OxygenRoom(int x, int y, Oxygen oxygen) {
        super(x, y, oxygen);
        this.isLooted = false;
    }

    public String intro_text() {
        if (isLooted) {
            return "\nThis room appears to be empty.";
        } else {
            return "\nYou have found the oxygen room! There is a large box of oxygen cylinders in the middle of the room.";
        }
    }

    public String loot() {
        if (isLooted) {
            return "\nThe box is empty.";
        } else {
            this.isLooted = true;
            return "\nYou opened the box and find a valuable cylinder!";
        }
    }
}
