package AnimalRescuer;

public abstract class Dog extends Animal {
    @Override
    public void happyBehavior() {
        System.out.println("Dog makes moves around you and wags its tail");
    }

    public void hungerBehavior(){
        System.out.println("Dog bark and jumps in front of you");
    }
}
