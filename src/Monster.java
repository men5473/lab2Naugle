abstract class Monster {
    private String monsterType;
    private String name;
    private double size;
    private int health;
    private int strength;
    private int speed;
    private Combat combat;
    private Status status;

    public Monster() {
        this.monsterType = "";
        this.name = "";
        this.size = 0.0;
        this.health = 0;
        this.strength = 0;
        this.speed = 0;
        this.combat = UNBOTHERED;
        this.status = NONE;
    }

    public Monster(String monsterType, String name, double size, int health, int strength, int speed) {
        this.monsterType = monsterType;
        this.name = name;
        this.size = size;
        this.health = health;
        this.strength = strength;
        this.speed = speed;
        this.combat = UNBOTHERED;
        this.status = NONE;
    }

    public abstract void specialPowers();


    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public Combat getCombat() {
        return combat;
    }

    public void setCombat(String combat) {
        this.combat = combat;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}