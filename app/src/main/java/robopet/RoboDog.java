package robopet;

public class RoboDog extends Pet{

    private int oilLevel;
    private int batteryLevel;

    public RoboDog(String name, String description, boolean isCanine, boolean isRobotic, int oilLevel, int batteryLevel) {
        super(name, description, true, true);
        this.name= name;
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
        batteryLevel = 10;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    }
    

    
    
