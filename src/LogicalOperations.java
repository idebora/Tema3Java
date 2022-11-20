import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LogicalOperations {


    public int checkBiggerNumber(int first, int second) {
        if (first > second)
            return first;
        else
            return second;
    }

    public String textComp(String textInput) {
        String fast = "FastTrackIT";

        if (fast.equals(textInput))
            return "Learning text comparison";
        else
            return "Got to try some more";
    }

    public String textNumberReturn(String textInput, int number) {
        String fast = "FastTrackIT";
        if (textInput.equals(fast) && number <= 3)
            return textInput + number;
        else if (!textInput.equals(fast) && number >= 4)
            return number + textInput;
        return "No condition met";
    }

    public String forecast(int number) {
        if (number == 8 || number == 6)
            return "The amount of snow this winter was(cm): " + number;
        else
            return "The forecast snow is(cm): " + number;
    }

    public String numberCompare(int number) {
        if (number == 4)
            return "The number is equal to 4";
        else if (number > 3)
            return "The number is greater than 3 and not equal to 4";
        else
            return "The number is lower than 3";
    }

    public void printNumber(int number) {
        String result = String.format("The number is %s", number);
        System.out.println(result);
    }

    public boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public boolean isEligibleToVote(int number) {
        return number > 18;
    }

    public int theMaxNumber(int first, int second, int third) {
        if (first > second && first > third)
            return first;
        else if (second > third && second > first)
            return second;
        else return third;
    }

    public int theMaxNumber2(int first, int second, int third) {
        int v;
        if (first > second)
            v = first;
        else v = second;
        if (third > v)
            return third;
        else
            return v;
    }

    public void afis100(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void afisNegativ(int x) {
        for (int i = x; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void afisXY(int x, int y) {

        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }

    }

    public void numarare(int x, int y) {
        if (x < y)
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        else System.out.println(x + " e mai mare decat " + y);
    }

    public void even100(int x) {
        x = 1;
        for (int i = x; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public void odd100(int x) {
        x = 0;
        for (int i = x; i <= 100; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
    }

    public int sum100(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public float med100(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum = sum + i;
        }
        int y = 101 - x;
        return (float) sum / y;

    }

    public void asterix(int x) {
        String ast;
        for (int i = x; i >= 1; i--) {
            ast = "";
            for (int j = 1; j <= i; j++) {
                ast += "*";
            }
            System.out.println(ast);
        }
    }

    public void while100(int x) {
        int i = x;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }

    public void whileNegativ(int x) {
        int i = x;
        do {
            System.out.println(i);
            i--;
        } while (i >= -100);
    }

    public void whileXY(int x, int y) {
        int i = x;
        do {
            System.out.println(i);
            i++;
        } while (i <= y);
    }

    public void whileGreater(int x, int y) {
        if (x > y) {
            int i = y;
            do {
                System.out.println(i);
                i++;
            } while (i <= x);
        } else {
            int j = x;
            do {
                System.out.println(j);
                j++;
            } while (j <= y);
        }
    }

    public void whileEven() {
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }

    public void whileodd() {
        int i = 1;
        do {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }

    public void whileMed() {
        int i = 111;
        int sum = 0;
        int count = 0;
        do {
            sum = sum + i;
            i++;
            count += 1;
        } while (i <= 8899);
        System.out.println(sum);
        float med = sum / count;
        System.out.println(med);
    }

    public void divid7(int x, int y) {
        int i = x;
        int sum = 0;
        int count = 0;
        float med = 0;
        do {
            if (i % 7 == 0) {
                sum = sum + i;
                count += 1;
            }
            i++;
        } while (i <= y);
        med = (float) sum / count;
        System.out.println(med);
    }

    public void fibonacci() {
        int n = 0;
        int i = 0;
        int j = 1;
        int sum = 1;

        do {
            System.out.println(sum);
            sum = i + j;
            i = j;
            j = sum;
            n++;
        } while (n < 20);
    }

    public void CozaLozaWoza() {
        int i = 1;
        while (i <= 110) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;

        }
    }

    public int[] myArray100() {
        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int[] evenArray() {
        int index = 0;
        int[] myArray = new int[50];
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                myArray[index] = i;
                index += 1;
            }
        }
        return myArray;
    }

    public float averageOfValues(int[] myArray) {
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum / myArray.length;
    }

    public boolean existString(String[] array, String S) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(S))
                return true;
        }

        return false;
    }

    public int getIndexforValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public char[] grilaArray() {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println("-");
            } else {
                System.out.print("-");
            }
        }
        return "-".toCharArray();
    }

    public int[] getArrayLessNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                i = i;
            } else {
                System.out.print(array[i] + " ");
            }
        }
        return array;
    }

    public int getSecondSmallerNumber(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    x = array[j];
                    array[j] = array[i];
                    array[i] = x;
                }
            }
        }
        return array[1];
    }

    public int[] getCopyOfArray(int[] array1, int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }
        return array2;
    }

    public void printListElements(List<Integer> mylist) {
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }

    public void addNUmberToList(List<Integer> mylist, int number) {
        mylist.add(number);
        System.out.println(mylist);
    }

    public void printListFromNumber(List<Integer> myList, int number) {
        int i = 0;
        for (i = number; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    public void printListElementsFromBack(List<Integer> mylist) {
        for (int i = (mylist.size() - 1); i > 0; i--) {
            System.out.println(mylist.get(i));
        }
    }

    public void addStringToListAtIndex(List<String> myList, int position, String text) {
        myList.add(position, text);
        System.out.println(myList);
    }

    public void addNumberToFirstPosition(List<Integer> myList, int number) {
        myList.add(0, number);
        System.out.println(myList);
    }

    public void printIndexAndElement(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Pe pozitia " + i + " valoarea este: " + myList.get(i));
        }
    }

    public int getGreaterNumberFromList(List<Integer> myList) {
        int g = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (myList.get(i) > g) {
                g = myList.get(i);
            }
        }
        return g;

    }

    public void changeIndexForTwoElements(List<Integer> myList) {
        int x = myList.get(myList.size() - 1);
        myList.add((myList.size() - 2), x);
        myList.remove((myList.size() - 1));
        System.out.println(myList);
    }

    public List<Integer> evenList(List<Integer> myList) {
        List<Integer> evenList = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                evenList.add(j, myList.get(i));
                j += 1;
            }
        }
        return evenList;
    }

    public List<Integer> sortList(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            for (int j = i + 1; j < myList.size(); j++) {
                if (myList.get(i) > myList.get(j)) {
                    int temp = myList.get(j);
                    myList.set(j, myList.get(i));
                    myList.set(i, temp);
                }
            }
        }
        return myList;
    }

    public void test_1() {
        System.out.println("Functie test 1");
    }
}

