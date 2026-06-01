class FangedBeast extends Monster {
    private boolean usesFists;

    public FangedBeast() {
        super();
        this.usesFists = true;
    }

    public FangedBeast(String monsterType, String name, double size, int health, int strength, int speed,  boolean usesFists) {
        super(String monsterType, String name, double size, int health, int strength, int speed);
        this.usesFists = usesFists;
    }

    @Override
    public void specialPowers() {
        if (usesFists) {
            System.out.println(this.getName() " ");
        }
    }
}