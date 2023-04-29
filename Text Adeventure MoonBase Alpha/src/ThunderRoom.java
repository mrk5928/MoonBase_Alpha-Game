public class ThunderRoom extends EnemyRoom{
    private boolean isThunderDefeated;

    public ThunderRoom(int x, int y, Thunderman thund) {
        super(x, y, thund);
        this.isThunderDefeated = false;
    }

    public String intro_text() {
        if (isThunderDefeated) {
            return "\nYou have defeated the thunderman and returned to its room.";
        } else {
            return "\nYou have entered a room and see a huge thunderman blocking your path!";
        }
    }

    public boolean fightOgre() {
        if (isThunderDefeated) {
            return true;
        } else {
            // Simulate a fight with the ogre
            boolean isPlayerVictorious = (Math.random() < 0.5);

            if (isPlayerVictorious) {
                this.isThunderDefeated = true;
                return true;
            } else {
                return false;
            }
        }
    }
    public void modify_player(Player player) {
//Room has no action on player
    }
}
