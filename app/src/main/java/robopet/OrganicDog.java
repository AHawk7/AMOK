package robopet;

public class OrganicDog extends Pet {

    private int hunger;
    private int thirst;
    private int mange;
    private int boredom;
    private int dirtyHabitat;

    public OrganicDog(String name, String description, int hunger, int thirst,
            int mange, int boredom, int dirtyHabitat) {
        super(name, description, false, true);
        this.hunger = hunger;
        this.thirst = thirst;
        this.mange = mange;
        this.boredom = boredom;
        this.dirtyHabitat = dirtyHabitat;
        hunger = 50;
        thirst = 50;
        boredom = 10;
        mange = 5;
        dirtyHabitat = 5;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getMange() {
        return mange;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getDirtyHabitat() {
        return dirtyHabitat;
    }

    public boolean isCanine() {
        return isCanine;
    }

    public void tick() {
        hunger = hunger + 5;
        thirst = thirst + 5;
        boredom = boredom + 5;
        mange = mange + 1;
        dirtyHabitat = dirtyHabitat + 3;
    }

    public void cleanCage() {
        dirtyHabitat -= 10;
    }

    public void feed() {
        hunger -= 10;
    }

    public void water() {
        thirst -= 10;
    }

    public void play() {
        boredom -= 10;
    }

    public void clean() {
        mange -= 10;
    }

    public void walk() {
        hunger = hunger + 5;
        thirst = thirst + 10;
        boredom = boredom - 10;

    }

}
