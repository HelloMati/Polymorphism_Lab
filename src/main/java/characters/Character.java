package characters;

public abstract class Character {

    protected String name;
    protected String role;

    public Character(String name, String role){
        this.name = name;
        this.role = role;
    }

    public abstract String makeCatchphrase();

}
