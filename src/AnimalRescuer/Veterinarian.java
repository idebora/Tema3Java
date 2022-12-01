package AnimalRescuer;

public class Veterinarian extends Human {

    private String specialty;

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Veterinarian() {
    }

    public String getSpecialty() {
        return specialty;
    }

    public void callAnimal(){
        System.out.println("Hey! Come to me,come to me!");
    }

    public void calmAnimal(){
        System.out.println("Sh,sh...it's ok!");
    }
}
