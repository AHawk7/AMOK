package robopet;

public class OrganicCat extends Pet {

    private int hunger;
    private int thirst;
    private int boredom;
    private int groom;
    private int dirtyHabitat;

    public OrganicCat(String name, String description, int hunger, int thirst,
            int groom, int boredom, int dirtyHabitat) {
        super(name, description, false, false);
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.dirtyHabitat = dirtyHabitat;
        hunger = 50;
        thirst = 50;
        boredom = 10;
        groom = 5;
        dirtyHabitat = 5;
    }

    

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getGroom() {
        return groom;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getDirtyHabitat() {
        return dirtyHabitat;
    }

    public void tick() {
        hunger = hunger + 5;
        thirst = thirst + 5;
        boredom = boredom + 5;
        groom = groom + 1;
        dirtyHabitat = dirtyHabitat + 3;
    }

    public void cleanLitter() {
        dirtyHabitat -= 9;
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
        groom -= 10;
    }


}
