/**

 * Project: Solo Lab 2 Assignment Abstraction, Inheritance, Polymorphism: Monsters
 * Purpose Details: Creates and displays 5 Monsters
 * Course: IST 242
 * Author: Martin Naugle
 * Date Developed: 05/30/2026
 * Last Date Changed: 06/02/2026
 * Revision:

 */

class Main {
    public static void main(String[] args) {
        /// Constructs 5 types of new monster (2 Fanged Beast, 2 Flying Wyverns, and 1 Elder Dragon)
        FangedBeast rajang = new FangedBeast("Fanged Beast", "Rajang", 845.91, 12000, 100, 120, true);
        FangedBeast gammoth = new FangedBeast("Fanged Beast", "Gammoth", 2276.07, 18000, 80, 40, false);
        FlyingWyvern rathalos = new FlyingWyvern("Flying Wyvern", "Rathalos", 1704.22 , 10000, 90, 100, true);
        FlyingWyvern arkveld = new FlyingWyvern("Flying Wyvern", "Arkveld", 1666.54, 14000, 110, 110, false);
        ElderDragon fatalis = new ElderDragon("Elder Dragon", "Fatalis", 4137.17, 22000, 220, 120, "Fire");

        /// Puts monsters into an array
        Monster[] monsters = {rajang, gammoth, rathalos, arkveld, fatalis};

        /// Set's their special powers individually
        rajang.setSpecialPower(SpecialPower.PUNCH);
        gammoth.setSpecialPower(SpecialPower.HEADBUT);
        rathalos.setSpecialPower(SpecialPower.FIRE);
        arkveld.setSpecialPower(SpecialPower.WINGATTACK);
        fatalis.setSpecialPower(SpecialPower.ELEMENTALBLAST, fatalis.getElement());

        /// Uses for each loop to output each monster's properties and special power attack
        for (Monster monster : monsters) {
            System.out.println("Monster type: " + monster.getMonsterType() + " | Monster name: " + monster.getName() +
                    " | Monster size " + monster.getSize() + "cm | Monster health: " + monster.getHealth() + " | Monster strength: " + monster.getStrength() +
                    " | Monster speed: " + monster.getSpeed() + " | Combat status: " + monster.getCombat() + " | Special status: " + monster.getStatus() +
                    " | Special power: " + monster.getSpecialPower());
            monster.specialPowers();
        }
    }
}