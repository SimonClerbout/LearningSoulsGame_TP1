package characters;

public class Monster {

    private String name;
    private int life, maxLife, stamina, maxStamina;
    private static int INSTANCES_COUNT=0;


    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getLife() {

        return life;

    }

    protected void setLife(int life) {

        this.life = life;

    }

    public int getMaxLife() {
        return maxLife;
    }

    protected void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getStamina() {
        return stamina;
    }

    protected void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    protected void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }


    public Monster(){

        INSTANCES_COUNT ++;
        name = "Monster_" + INSTANCES_COUNT;
        life = 10;
        maxLife = 10;
        stamina = 10;
        maxStamina = 10;


    }

    public Monster(String name){

        this.name = name;
        life = 10;
        maxLife = 10;
        stamina = 10;
        maxStamina = 10;
        INSTANCES_COUNT ++;


    }

    public void printStats(){

        System.out.println(this.toString());

    }

    public boolean isAlive(){

        return this.getLife()>0;


    }

    @Override
    public String toString() {
        return ("[ characters.Monster ]\t" + name + "\t" + "LIFE: " + life + "\t" + "STAMINA: " + stamina + ((this.isAlive())? "\t(ALIVE)" : "\t(DEAD)"));
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
