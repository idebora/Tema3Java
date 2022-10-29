import AnimalRescuer.AppMain;

public class Main {
    public static void main(String[] args) {
//
//        Calculator calc = new Calculator();
//
//        int s = calc.sum(2,3);
//        System.out.println(s);
//        float r = calc.rest(10,3);
//        System.out.println(r);
//        float o1 = calc.oper1(-5,8,6);
//        System.out.println(o1);
//        float o2 = calc.oper2(55,9,9);
//        System.out.println(o2);
//        float o3 = calc.oper3(20,-3,5,8);
//        System.out.println(o3);
//        float o4 = calc.oper4(5,15,3,2,8,3);
//        System.out.println(o4);
//
//        float m = calc.med(1,2,3);
//        System.out.println(m);
//        double d = calc.distanta(2);
//        System.out.println(d);
//        float t = (float) calc.temperatura(100);
//        System.out.println(t+" grade Celsius");
//        String v = calc.viteza(1000,0,6,0);
//        System.out.println(v);
//
//        LogicalOperations logicOp = new LogicalOperations();
//        int biggest = logicOp.checkBiggerNumber(2,3);
//        String fast = "FastTrackIT";
//        System.out.println("The bigger number is: " + biggest);
//        System.out.println(logicOp.textComp(fast));
//        System.out.println(logicOp.textNumberReturn(fast,1));
//        System.out.println(logicOp.forecast(6));
//        System.out.println(logicOp.numberCompare(2));
//        logicOp.printNumber(32123);
//        System.out.println(logicOp.isNumberEven(9));
//        System.out.println(logicOp.isEligibleToVote(19));
//        System.out.println(logicOp.theMaxNumber(12,9,3));
//        System.out.println(logicOp.theMaxNumber2(12,19,3));
    LogicalOperations op = new LogicalOperations();
    op.afis100(88);
    op.afisNegativ(-98);
    op.afisXY(8,10);
    op.numarare(41,9);
    op.even100(0);
    op.odd100(3);
        System.out.println(op.sum100(99));
        System.out.println(op.med100(99));
        op.asterix(7);
        op.while100(98);
        op.whileNegativ(-98);
        op.whileXY(2,7);
        op.whileGreater(9,8);
//        AppMain.main();
    }
}

