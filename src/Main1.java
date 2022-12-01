import java.sql.Array;

public class Main1 {

    public static void main(String[] args) {
//        Read read = new Read();
//        System.out.println(read.getPopulatedList());

    LogicalOperations op = new LogicalOperations();
    int[] myArray = op.myArray100();
    op.tryArray(myArray, 1444);
    op.wait(3);

    }


}

