package AnimalRescuer;

public class AppMain {
    public static void main() {
//        Animal dog = new Animal();
//        Animal cat = new Animal();
//        dog.setName("Azor");
//        cat.setName("Kitty");
//        System.out.println("Animals name are " + dog.getName() + " and " + cat.getName());
//
//        Adopter human = new Adopter();
//        human.setName("Alexandru");
//        System.out.println("Adopter name is " + human.getName());
//
//        AnimalFood food = new AnimalFood();
//        food.setPrice(10.9);
//        System.out.println("Food's price is " + food.getPrice() + " euro");
//
//        RecreationalActivity activ = new RecreationalActivity();
//        activ.setName("running");
//        System.out.println(dog.getName() + " is " + activ.getName());
//
//        Veterinarian vet = new Veterinarian();
//        vet.setName("Maria");
//        System.out.println("Vet name is " + vet.getName());
//    }
        Dog max = new Dog();
        max.setName("Max");
        System.out.println("Dog's name is "+ max.getName());
        max.setActivity("is running");
        System.out.println("Max " + max.getActivity());
        Cat kity = new Cat();
        kity.setName("Kitty");
        System.out.println("Cat's name is " + kity.getName());
        Child alex = new Child();
        alex.setName("Alex");
        System.out.println("The adopter is " + alex.getName());
        alex.setCash(120);
        System.out.println(alex.getName() + " has " + alex.getCash() + " euro");
        CannedFood conserve = new CannedFood();
        conserve.setName("meat");
        System.out.println(max.getName() + " likes " + conserve.getName());
        OutsideActivity out = new OutsideActivity();
        out.setName("climbing in the trees");
        System.out.println(kity.getName() + " is " + out.getName());
        WomanVet women = new WomanVet();
        women.setName("Ana");
        System.out.println(max.getName() + "'s veterinarian is " + women.getName());
    }
}
