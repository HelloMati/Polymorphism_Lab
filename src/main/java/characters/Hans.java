package characters;

public class Hans extends Character{

    private int numberOfHenchmen;

    public Hans(String name, String role, int numberOfHenchmen){
        super(name, role);
        this.numberOfHenchmen = numberOfHenchmen;
    }

    @Override
    public String makeCatchphrase(){
        return "I have " + this.numberOfHenchmen + " henchmen. Give me my detonators. I am going to count to three. There will not be a four. 1, 2, 3. SHOOT THE GLASS!";}
}
