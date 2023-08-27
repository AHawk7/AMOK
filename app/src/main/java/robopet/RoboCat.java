package robopet;

// new pet class for robot, methods different than organic pets.
public class RoboCat extends Pet {

    private int oilLevel;
    private int batteryLevel;

    public RoboCat(String name, String description, boolean isCanine, boolean isRobotic, int oilLevel,
            int batteryLevel) {
        super(name, description, true, false);
        this.name = name;
        this.description = description;
        this.isCanine = isCanine;
        this.isRobotic = isRobotic;
        this.oilLevel = oilLevel;
        this.batteryLevel = batteryLevel;
    }

    public void tick() {
        oilLevel = oilLevel + 10;
        batteryLevel =  batteryLevel+ 10;
    }

    public void maintenance() {
        oilLevel -= 50;
    }

    public void repairs() {
        batteryLevel -= 10;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    // charge uses feed method and hunger variable


    // oil uses water method and thirst variable}
        // create tick value for oil and battery level

        // if (days != 0) {
        //     days = days + 1;
        // }
        // if (days % 2 == 0 ) {
        //     hunger = hunger - 49;
        // }
        // if (days % 7 == 0) {
        //     thirst = thirst - 95;
        // }
        // if (hunger < 0 || thirst < 0) {
        //     days = 0;
}
