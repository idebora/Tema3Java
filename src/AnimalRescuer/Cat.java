package AnimalRescuer;

public abstract class Cat extends Animal{

    public void happyBehavior() {
        System.out.println("Cat makes moves around you and say:miau!");
    }

    @Override
    public void sickBehavior() {
        System.out.println("Cat is sleepy,don't eat");
    }

    @Override
    public void setName(String name) {
        System.out.println(name);;
    }

    @Override
    public void setHealth(int health) {
        System.out.println(health);
    }

    @Override
    public int getHealth(int scorehealth) {
        return scorehealth;
    }

    @Override
    public void setHunger(int hunger) {
        System.out.println(hunger);
    }

    @Override
    public int getHunger(int hungerscore) {
        return hungerscore;
    }

    @Override
    public void setSpirit(int spirit) {
        System.out.println(spirit);
    }

    @Override
    public int getSpirit(int spiritscore) {
        return spiritscore;
    }

    @Override
    public void setFood(String food) {
        System.out.println("Cat eat canned food");
    }

    @Override
    public String getFood(String food) {
        return food;
    }

    @Override
    public void setActivity(String activity) {
        System.out.println(" Cat run and make many moves");
    }

    @Override
    public String getActivity(String activity) {
      return activity;
    }

    public void hungerBehavior(){
        System.out.println("Cat say:miau! and climb on your legs");
    }

}
