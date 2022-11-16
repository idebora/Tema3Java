package AnimalRescuer;

public class Veterinarian {
    private String name;
    private String specialty;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
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
