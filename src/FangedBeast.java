/**

 * Project: Solo Lab 2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Child class for fanged beasts derived from Monsters
 * Course: IST 242
 * Author: Martin Naugle
 * Date Developed: 05/30/2026
 * Last Date Changed: 06/02/2026
 * Revision:

 */

class FangedBeast extends Monster {
    /// If fanged beast uses fists or not
    private boolean usesFists;

    /**
     * Constructs default FangedBeast
     */
    public FangedBeast() {
        super();
        this.usesFists = true;
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
     * @param usesFists If monster uses fists
     */
    public FangedBeast(String monsterType, String name, double size, int health, int strength, int speed, boolean usesFists) {
        super(monsterType, name, size, health, strength, speed);
        this.usesFists = usesFists;
    }

    /**
     * Overrides abstracted specialPowers from Monster to output special power attack
     */
    @Override
    public void specialPowers() {
        if (usesFists) {
            System.out.println(this.getName() + " punched with it's fist dealing " + (this.getStrength() + 10) + " damage.");
        } else {
            System.out.println(this.getName() + " headbutted dealing " + (this.getStrength() + 10) + " damage.");
        }
    }

    /**
     * Overloads Monster setSpecialPower to set special power for FangedBeast specifically
     *
     * @param specialPower monster's new specialPower
     */
    public void setSpecialPower(SpecialPower specialPower) {
        if (specialPower == SpecialPower.PUNCH || specialPower == SpecialPower.HEADBUT) {
            super.setSpecialPower(specialPower);
            if (specialPower == SpecialPower.PUNCH) {
                this.usesFists = true;
            } else {
                this.usesFists = false;
            }
        } else {
            System.out.println("That's not an ability that this monster can do");
        }
    }

    /**
     * Gets fanged beast ability to punch or not
     *
     * @return can punch or not
     */
    public boolean getUsesFists() {
        return usesFists;
    }

    /**
     * Sets if fanged beast can punch or not
     *
     * @param usesFists new can punch or not
     */
    public void setUsesFists(boolean usesFists) {
        this.usesFists = usesFists;
    }
}