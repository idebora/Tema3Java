package AnimalRescuer;

public class Animal {
    private String name;
    private int health;
    private int hunger;
    private int spirit;
    private String food;
    private String activity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public void setHunger(int hunger){
        this.hunger = hunger;
    }
    public int getHunger() {
        return hunger;
    }
    public void setSpirit(int spirit){
        this.spirit = spirit;
    }
    public int getSpirit() {
        return spirit;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getFood() {
        return food;
    }
    public void setActivity(String activity){
        this.activity = activity;
    }
    public String getActivity() {
        return activity;
    }

}
