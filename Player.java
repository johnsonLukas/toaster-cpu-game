public class Player extends Creature{
    int level;
    String name;
    int attackPwr;
    int health;
    public Player(level, name, attackPwr, health){
        
        super(level, name, attackPwr, health);
        this.level = level;
        this.name = name;
        this.attackPwr = attackPwr;
        this.health = health
    }
}