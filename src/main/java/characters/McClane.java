package characters;

import interfaces.HeroAchievements;

public class McClane extends Hero implements HeroAchievements{

    private boolean hasMachineGunHoHoHo;

    public McClane(String name, String role, boolean hasMachineGunHoHoHo){
        super(name, role);
        this.hasMachineGunHoHoHo = hasMachineGunHoHoHo;
    }

    @Override
    public String makeCatchphrase(){
        return "Yippee-ki-yay, motherf****r!";
    }

    public String makeCatchphrase(String message){
        return "Come out to the coast!" + message + ".";
    }

    @Override
    public String askForHelp(){
        return "Mayday Mayday. [gets told urgent line only] No s**t lady! Does it sound like I'm ordering a pizza?";
    }

    @Override
    public int enemyKillCount(){
        return 10;
    }

    @Override
    public String nakatomiplaza(int level){ return this.name + " reached" + " floor " + level;
    }
}
