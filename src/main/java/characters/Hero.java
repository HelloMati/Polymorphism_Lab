package characters;

public abstract class Hero extends Character{

    public Hero(String name, String role){
        super(name, role);
    }

    public String askForHelp() { return "I need backup. Now!";}
    public int enemyKillCount() { return 12; }
}
