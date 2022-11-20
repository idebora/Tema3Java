import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
////        int[] myArray = op.myArray100();
////        for (int i = 0; i < 100; i++) {
////            System.out.println(myArray[i]);
////        }
////
////
////        int[] mySecondArray = op.evenArray();
////        for (int i = 0; i < 50; i++) {
////            System.out.println(mySecondArray[i]);
////        }
////
////        float a = op.averageOfValues(myArray);
////        System.out.println(a);
////
////        String[] array = {"ala","bala","cala","nala"};
////        System.out.println(op.existString(array,"b"));
////        System.out.println(op.existString(array,"bala"));
////
////        System.out.println(op.getIndexforValue(myArray,209));
////        if (op.getIndexforValue(myArray,240) == -1){
////            System.out.println("Valoarea nu exista in array");
////        }
////        else {
////            System.out.println(op.getIndexforValue(myArray,20));
////        }
////
////        op.grilaArray();
////
////        int[] altArray = op.getArrayLessNumber(myArray,2);
////        System.out.println();
////
////        int[] arr = op.getCopyOfArray(myArray,mySecondArray);
////
////        op.printArray(arr);
//        int[] newArray = {1,29,32,28,7,6,5};
//        int secondSmallerNumber = op.getSecondSmallerNumber(newArray);
//        System.out.println(secondSmallerNumber);
//    }
        List<Integer> firstList = new ArrayList<>();
        firstList.add(0,0);
        firstList.add(1,2);
        firstList.add(2,4);
        firstList.add(3,6);
        firstList.add(4,8);
        firstList.add(5,123);
        firstList.add(6,1);
        op.printListElements(firstList);
//        op.addNUmberToList(firstList, 14);
//        op.printListFromNumber(firstList,3);
//        System.out.println("Elementele listei de la ultimul la primul:");
//        op.printListElementsFromBack(firstList);
//        List<String> stringList = new ArrayList<>();
//        stringList.add(0, "ala");
//        stringList.add(1,"bala");
//        stringList.add(2,"cala");
//        stringList.add(3,"dala");
//        op.addStringToListAtIndex(stringList,2,"ciulandra");
//        op.addNumberToFirstPosition(firstList, 999);
//        op.printIndexAndElement(firstList);
//        System.out.println("Cel mai mare numar din lista este: "+op.getGreaterNumberFromList(firstList));
        System.out.println("Tema optionala:");
        op.changeIndexForTwoElements(firstList);
        System.out.println(op.evenList(firstList));
        System.out.println(op.sortList(firstList));










    }
}
