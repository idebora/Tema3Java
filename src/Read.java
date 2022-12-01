import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Read {

    public int getInt() {
                Scanner scan = new Scanner(System.in);
                int number = 0;
                boolean repeat = true;
                while (repeat) {
                    try {
                        System.out.print("Please enter a number: ");
                        number = scan.nextInt();
                        repeat = false;
                    } catch (InputMismatchException e) {
                        System.out.println("The value [" + scan.nextLine() + "] is not a numeric value.\n" +
                                "Please try again!");
                    }
                }
                return number;
            }

    public float getFloat() {
        Scanner scan = new Scanner(System.in);
        float number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                number = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("The value [" + scan.nextLine() + "] is not a numeric value.\n" +
                        "Please try again!");
            }
        }
        return number;
    }

    public double geDouble() {
        Scanner scan = new Scanner(System.in);
        double number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                number = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("The value [" + scan.nextLine() + "] is not a numeric value.\n" +
                        "Please try again!");
            }
        }
        return number;
    }

    public long getLong() {
        Scanner scan = new Scanner(System.in);
        long number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                number = scan.nextLong();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("The value [" + scan.nextLine() + "] is not a numeric value.\n" +
                        "Please try again!");
            }
        }
        return number;
    }

    public short getshort() {
        Scanner scan = new Scanner(System.in);
        short number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                number = scan.nextShort();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("The value [" + scan.nextLine() + "] is not a numeric value.\n" +
                        "Please try again!");
            }
        }
        return number;
    }

    public byte getByte() {
        Scanner scan = new Scanner(System.in);
        byte number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                number = scan.nextByte();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("The value [" + scan.nextLine() + "] is not a numeric value.\n" +
                        "Please try again!");
            }
        }
        return number;
    }
    public int[] getPopulatedArray(int position){
        int[] myarray = new int[position];
        System.out.println("Introdu "+position+" valori pentru Array:");
        for (int i = 0; i < myarray.length; i++){
            myarray[i] = getInt();
        }
        System.out.println("Array-ul populat este: ");
        return myarray;
    }

    public List<Integer> getPopulatedList(){
            List<Integer> mylist = new ArrayList<>();
            while(true){
                try{
                    System.out.print("Introdu un numar: ");
                    Scanner scanner =new Scanner(System.in);
                    int value = scanner.nextInt();
                    mylist.add(value);
                }catch (InputMismatchException e){
                    System.out.println("Valoare invalida");
                    break;
                }
            }
            return mylist;
    }



}
