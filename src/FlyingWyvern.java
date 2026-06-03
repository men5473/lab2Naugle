/**

 * Project: Solo Lab 2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Child class for flying wyverns derived from Monsters
 * Course: IST 242
 * Author: Martin Naugle
 * Date Developed: 05/30/2026
 * Last Date Changed: 06/02/2026
 * Revision:

 */

public class FlyingWyvern extends Monster {
    /// If flying wyvern shoots fire or not
    private boolean breathesFire;

    /**
     * Constructs default FlyingWyvern
     */
    public FlyingWyvern() {
        super();
        this.breathesFire = false;
    }

    /**
     * Constructs FangedBeast from parameters
     *
     * @param monsterType Type of monster this is
     * @param name It's given name
     * @param size Size of this monster
     * @param health It's max health
     * @param strength How powerful this monster is
     * @param speed How fast this monster is
     * @param breathesFire If monster shoots fire
     */
    public FlyingWyvern(String monsterType, String name, double size, int health, int strength, int speed, boolean breathesFire) {
        super(monsterType, name, size, health, strength, speed);
        this.breathesFire = breathesFire;
    }

    /**
     * Overrides abstracted specialPowers from Monster to output special power attack
     */
    @Override
    public void specialPowers() {
        if (breathesFire) {
            System.out.println(this.getName() + " shot a fireball dealing " + (this.getStrength() * 1.5) + " damage.");
        } else {
            System.out.println(this.getName() + " struck it's wings dealing " + (this.getStrength() + 10) + " damage.");
        }
    }

    /**
     * Overloads Monster setSpecialPower to set special power for FlyingWyvern specifically
     *
     * @param specialPower monster's new specialPower
     */
    public void setSpecialPower(SpecialPower specialPower) {
        if (specialPower == SpecialPower.FIRE || specialPower == SpecialPower.WINGATTACK) {
            super.setSpecialPower(specialPower);
            if (specialPower == SpecialPower.FIRE) {
                this.breathesFire = true;
            } else {
                this.breathesFire = false;
            }
        } else {
            System.out.println("That's not an ability that this monster can do");
        }
    }

    /**
     * Gets flying wyvern ability to shoot fire or not
     *
     * @return can shoot fire or not
     */
    public boolean isBreathesFire() {
        return breathesFire;
    }

    /**
     * Sets if flying wyvern can shoot fire or not
     *
     * @param breathesFire new can shoot fire or not
     */
    public void setBreathesFire(boolean breathesFire) {
        this.breathesFire = breathesFire;
    }
}
