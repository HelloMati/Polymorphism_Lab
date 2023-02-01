package diehard;

import characters.Character;
import characters.Hero;

import java.util.ArrayList;

public class DieHard {

    private ArrayList<Character> characters;

    public DieHard(){
        this.characters = new ArrayList<>();
    }

    public int countCharacters(){
        return this.characters.size();
    }

    public void addCharacter(Character character){
        this.characters.add(character);
    }

    public int countEnemiesKilled() {
        int totalKilled = 0;
        for (int i = 0; i < this.characters.size(); i++) {
            Hero hero = (Hero) characters.get(i);
            hero.enemyKillCount();
            totalKilled += hero.enemyKillCount();
        }
        return totalKilled;
    }

    public void getCatchphraseCharacters() {
        for(Character character : this.characters) {
            System.out.println(character.makeCatchphrase());
        }
    }
}
