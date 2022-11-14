public class Main2 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        int[] myArray = op.myArray100();
        for (int i = 0; i < 100; i++) {
            System.out.println(myArray[i]);
        }


        int[] mySecondArray = op.evenArray();
        for (int i = 0; i < 50; i++) {
            System.out.println(mySecondArray[i]);
        }

        float a = op.averageOfValues(myArray);
        System.out.println(a);

        String[] array = {"ala","bala","cala","nala"};
        System.out.println(op.existString(array,"b"));
        System.out.println(op.existString(array,"bala"));

        System.out.println(op.getIndexforValue(myArray,209));
        if (op.getIndexforValue(myArray,240) == -1){
            System.out.println("Valoarea nu exista in array");
        }
        else {
            System.out.println(op.getIndexforValue(myArray,20));
        }

        op.grilaArray();

        int[] altArray = op.getArrayLessNumber(myArray,2);
        System.out.println(" ");

        int[] arr = op.getCopyOfArray(myArray,mySecondArray);

        op.printArray(arr);
    }
}
