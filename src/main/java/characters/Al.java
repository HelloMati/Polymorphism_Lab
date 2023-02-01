package characters;

public class Al extends Hero {

    private boolean hasTwinkies;

    public Al(String name, String role, boolean hasTwinkies){
        super(name, role);
        this.hasTwinkies = hasTwinkies;
    }

    @Override
    public String makeCatchphrase(){
        return "Aw, the hell with this";
    }

    @Override
    public String askForHelp(){
        return "I need backup assistance now! Now means now dammit!";
    }

    @Override
    public int enemyKillCount(){
        return 2;
    }
}
