package robopet;

import java.util.UUID;

public abstract class Pet {

    private String petId;

    protected String name;
    protected String description;
    protected boolean isCanine;
    protected boolean isRobotic;
    

    // constructor for pet
    public Pet(String name, String description, boolean isRobotic,  boolean isCanine) {

        UUID uuid = UUID.randomUUID();
        petId = uuid.toString();
        this.name = name;
        this.description = description;
        this.isCanine = isCanine;
        this.isRobotic = isRobotic;

    }


    // common shared method infoPet and tick for organic pets
/// add set name and description
    public void tick() {
        System.out.println("tick in pet class");
    }
    
    
    
    public void setName(String name) {
        this.name = name;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public boolean isCanine() {
        return isCanine;
    }

    public String getPetId() {
        return petId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public boolean isRobotic() {
        return isRobotic;
    }


    public void infoPet() {
    }


    public boolean isAlive() {
        return false;
    }


    public void oilLevel() {
    }


    public void batteryLevel() {
    }


    
    
}

