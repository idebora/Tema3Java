public class Calculator {

    public int sum(int first, int second) {
        int result = first + second;
        return result;
    }

    public float rest(float first, float second) {
        float result = first % second;
        return result;
    }

    public float oper1(float first, float second, float third) {
        float result = first + second * third;
        return result;
    }

    public float oper2(float first, float second, float third) {
        float result = (first + second) % third;
        return result;
    }

    public float oper3(float first, float second, float third, float forth) {
        float result = first + second * third / forth;
        return result;
    }

    public float oper4(float first, float second, float third, float forth, float fifth, float sixth) {
        float result = first + second / third * forth - fifth % sixth;
        return result;
    }
    public float med(float first, float second, float third) {
        float result = (first + second + third)/3;
        return result;
    }
    public double distanta(float first){
        double result = first * 0.0254;
        return result;
    }
    public double temperatura(float first){
        float result = (float) (5.0/9*(first-32));
        return result;
    }
    public String viteza(float distance, int hours, int minutes, int seconds){
        float result1 = distance / (hours * 3600 + minutes * 60 + seconds);
        double result2 = result1 * 3.6;
        float result3 =  result1 * 3600 / 1609;
        String s= result1+ "  m/s \n" + result2 + "  km/h \n" + result3 + "  mile/h";
        return s;
    }

}