package characters;

public class Hero {

    private String name;
    private int life, maxLife, stamina, maxStamina;


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


    public Hero(){

        name = "Gregooninator";
        life = 100;
        maxLife = 100;
        stamina = 50;
        maxStamina = 50;

    }

    public Hero(String name){

        this.name = name;
        life = 100;
        maxLife = 100;
        stamina = 50;
        maxStamina = 50;


    }

    public void printStats(){

        System.out.println(this.toString());

    }

    public boolean isAlive(){

        return this.getLife()>0;


    }

    @Override
    public String toString() {
        return ("[ characters.Hero ]\t" + name + "\t" + "LIFE: " + life + "\t" + "STAMINA: " + stamina + ((this.isAlive())? "\t(ALIVE)" : "\t(DEAD)"));
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
