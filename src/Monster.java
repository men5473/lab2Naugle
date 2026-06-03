/**

 * Project: Solo Lab 2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Abstract class for all monsters
 * Course: IST 242
 * Author: Martin Naugle
 * Date Developed: 05/30/2026
 * Last Date Changed: 06/02/2026
 * Revision:

 */

abstract class Monster {
    /// Type of monster
    private String monsterType;
    /// Name given
    private String name;
    /// Size of monster, in cm
    private double size;
    /// It's max health
    private int health;
    /// How powerful it is
    private int strength;
    /// How fast it is
    private int speed;
    /// Whether it's in combat and how angry
    private Combat combat;
    /// If it has a status condition
    private Status status;
    /// The special move it uses
    private SpecialPower specialPower;

    /**
     * Constructs default Monster
     */
    public Monster() {
        this.monsterType = "";
        this.name = "";
        this.size = 0.0;
        this.health = 0;
        this.strength = 0;
        this.speed = 0;
        this.combat = Combat.UNBOTHERED;
        this.status = Status.NONE;
    }

    /**
     * Constructs Monster using parameters
     *
     * @param monsterType Type of monster this is
     * @param name It's given name
     * @param size Size of this monster
     * @param health It's max health
     * @param strength How powerful this monster is
     * @param speed How fast this monster is
     */
    public Monster(String monsterType, String name, double size, int health, int strength, int speed) {
        this.monsterType = monsterType;
        this.name = name;
        this.size = size;
        this.health = health;
        this.strength = strength;
        this.speed = speed;
        this.combat = Combat.UNBOTHERED;
        this.status = Status.NONE;
    }

    /**
     * Abstract method for using special power
     */
    public abstract void specialPowers();

    /**
     * Gets monster's special power
     *
     * @return monster's special power
     */
    public SpecialPower getSpecialPower() {
        return specialPower;
    }

    /**
     * Sets monster's special power
     *
     * @param specialPower monster's new specialPower
     */
    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }


    /**
     * Gets the type of monster
     *
     * @return monster's type
     */
    public String getMonsterType() {
        return monsterType;
    }

    /**
     * Sets monster type
     *
     * @param monsterType monster's new type
     */
    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }


    /**
     * Gets monster's name
     *
     * @return monster's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets monster's name
     *
     * @param name monster's new name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets monster's size
     *
     * @return monster's size
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets monster's size
     *
     * @param size monster's new size
     */
    public void setSize(double size) {
        this.size = size;
    }


    /**
     * Gets monster's health
     *
     * @return monster's health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets monster's health
     *
     * @param health monster's new health
     */
    public void setHealth(int health) {
        this.health = health;
    }


    /**
     * Gets monster's strength
     *
     * @return monster's strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets monster's strength
     *
     * @param strength monster's new strength
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }


    /**
     * Gets monster's speed
     *
     * @return monster's speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets monster's speed
     *
     * @param speed monster's new speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }


    /**
     * Gets monster's combat status
     *
     * @return monster's combat status
     */
    public Combat getCombat() {
        return combat;
    }

    /**
     * Sets monster's combat status
     *
     * @param combat monster's new combat status
     */
    public void setCombat(Combat combat) {
        this.combat = combat;
    }


    /**
     * Gets monster's inflicted status
     *
     * @return monster's inflicted status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets monster's inflicted status
     *
     * @param status monster's new inflicted status
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}