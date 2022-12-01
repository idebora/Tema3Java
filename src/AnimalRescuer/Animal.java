package AnimalRescuer;

public abstract class Animal {
    private String name;
    private int health;
    private int hunger;
    private int spirit;
    private String food;
    private String activity;

    public void setName(String Name) {
        this.name = Name;
    }
    public abstract String getName();

    public abstract void setHealth(int health);
    public abstract int getHealth();

    public abstract int getHealth(int scorehealth);

    public abstract void setHunger(int hunger);
    public abstract int getHunger();

    public abstract int getHunger(int hungerscore);

    public abstract void setSpirit(int spirit);
    public abstract int getSpirit();

    public abstract int getSpirit(int spiritscore);

    public abstract void setFood(String food);
    public abstract String getFood();

    public abstract String getFood(String food);

    public abstract void setActivity(String activity);
    public abstract String getActivity();

    public abstract String getActivity(String activity);

    public abstract void hungerBehavior();
    public abstract void happyBehavior();
    public abstract void sickBehavior();

}
