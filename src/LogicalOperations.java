public class LogicalOperations {



    public int checkBiggerNumber(int first, int second) {
        if (first > second)
            return first;
        else
            return second;
    }

    public String textComp (String textInput) {
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
    public String forecast(int number){
        if (number == 8 || number == 6)
            return "The amount of snow this winter was(cm): " + number;
        else
            return "The forecast snow is(cm): " + number;
    }
    public String numberCompare(int number){
        if (number == 4)
            return "The number is equal to 4";
        else if (number > 3)
            return "The number is greater than 3 and not equal to 4";
        else
            return "The number is lower than 3";
    }
    public void printNumber(int number){
        String result = String.format("The number is %s",number);
        switch(number) {
            default:System.out.println(result);

        }
    }
    public boolean isNumberEven(int number){
        if (number % 2 == 0)
            return true;
        else
            return false;
    }
    public boolean  isEligibleToVote(int number){
        if (number > 18)
            return true;
        else
            return false;
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
}

