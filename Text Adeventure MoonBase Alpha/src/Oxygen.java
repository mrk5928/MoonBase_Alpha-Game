public class Oxygen extends Item{
    public int amt;
    private int amount;
    public Oxygen(int amount){
        super("Oxygen", String.format("A cylindrical icon with a %s stamped on the front", (amount)), amount);
        this.amount = amount;
    }
}
