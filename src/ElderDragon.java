/**

 * Project: Solo Lab 2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Child class for elder dragons derived from Monsters
 * Course: IST 242
 * Author: Martin Naugle
 * Date Developed: 05/30/2026
 * Last Date Changed: 06/02/2026
 * Revision:

 */

public class ElderDragon extends Monster {
    /// Element used for elder dragon's special power
    private String element;

    /**
     * Constructs default FlyingWyvern
     */
    public ElderDragon() {
        super();
        this.element = "";
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
     * @param element Type of element used in special power
     */
    public ElderDragon(String monsterType, String name, double size, int health, int strength, int speed, String element) {
        super(monsterType, name, size, health, strength, speed);
        this.element = element;
    }

    /**
     * Overrides abstracted specialPowers from Monster to output special power attack
     */
    @Override
    public void specialPowers() {
        System.out.println(this.getName() + " shoots a beam of " + this.element + " energy for " + (this.getStrength() * 4) + " damage.");
    }

    /**
     * Overloads Monster setSpecialPower to set special power for ElderDragon specifically
     *
     * @param specialPower monster's new specialPower
     */
    public void setSpecialPower(SpecialPower specialPower, String element) {
        if (specialPower == SpecialPower.ELEMENTALBLAST) {
            super.setSpecialPower(specialPower);
            this.element = element;
        } else {
            System.out.println("That's not an ability that this monster can do");
        }
    }

    /**
     * Gets monster's element
     *
     * @return monster's element
     */
    public String getElement() {
        return element;
    }

    /**
     * Sets monster's element
     *
     * @param element monster's new element
     */
    public void setElement(String element) {
        this.element = element;
    }
}
