package lei.yu;

public class FizzBuzz {
    public String run(int inputNum) {
        if (inputNum % 3 == 0 && inputNum % 5 == 0) {
            return "FizzBuzz";
        } else if (inputNum % 3 == 0) {
            return "Fizz";
        } else if (inputNum % 5 == 0) {
            return "Buzz";
        }
        return "";
    }
}
