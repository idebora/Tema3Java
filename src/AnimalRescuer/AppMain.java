package AnimalRescuer;

public class AppMain {
    public static void main() {
        Animal dog = new Animal();
        Animal cat = new Animal();
        dog.setName("Azor");
        cat.setName("Kitty");
        System.out.println("Animals name are " + dog.getName() + " and " + cat.getName());

        Adopter human = new Adopter();
        human.setName("Alexandru");
        System.out.println("Adopter name is " + human.getName());

        AnimalFood food = new AnimalFood();
        food.setPrice(10.9);
        System.out.println("Food's price is " + food.getPrice() + " euro");

        RecreationalActivity activ = new RecreationalActivity();
        activ.setName("running");
        System.out.println(dog.getName() + " is " + activ.getName());

        Veterinarian vet = new Veterinarian();
        vet.setName("Maria");
        System.out.println("Vet name is " + vet.getName());
    }
}
