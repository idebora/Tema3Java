package AnimalRescuer;

public class AppMain {
    public static void main() {
        Animal dog = new Animal();
        Animal cat = new Animal();
        dog.name = "Azor";
        cat.name = "Kitty";
        System.out.println("Animals name are " + dog.name + " and " + cat.name);

        Adopter human = new Adopter();
        human.name = "Alex";
        System.out.println("Adopter name is " + human.name);

        AnimalFood food = new AnimalFood();
        food.price = 10.5;
        System.out.println("Food's price is " + food.price + " euro");

        RecreationalActivity activ = new RecreationalActivity();
        activ.name = "running";
        System.out.println(dog.name + " is " + activ.name);

        Veterinarian vet = new Veterinarian();
        vet.name = "Maria";
        System.out.println("Vet name is " + vet.name);
    }
}
