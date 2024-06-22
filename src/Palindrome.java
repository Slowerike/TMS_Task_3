import java.util.Arrays;

public class Palindrome implements OutputTheResultToTheConsoleOfArray{
    int[] numbers;
    String stringOfPalindromeNumbers = "";
    public Palindrome(int lengthOfMassive) {
        this.numbers = new RandomMassiveOfNumbers().getMassiveWithRandomNumber(lengthOfMassive);
    }
    public static boolean palindromeCheker(int number) {
        int lengthNumber = 0;
        int innerNUmber = number;
        boolean isEqual = true;
        while (number > 0) {
            number /= 10;
            lengthNumber++;
        }
        int[] localMassive = new int[lengthNumber];
        for (int i = 0; i < localMassive.length; i++) {
            localMassive[i] = innerNUmber % 10;
            innerNUmber /= 10;
        }
        if (lengthNumber == 0) {
            return false;
        }
        if (lengthNumber % 2 == 0) {
            for (int i = 0; i < localMassive.length / 2; i++) {
                if (localMassive[i] != localMassive[localMassive.length - 1 - i]) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            for (int i = 0; i < localMassive.length / 2; i++) {
                if (localMassive[i] != localMassive[localMassive.length - 1 - i]) {
                    isEqual = false;
                    break;
                }
            }
        }
        return isEqual;
    }
    public void getPalindrome(){
        for (int digit : numbers) {
            if (palindromeCheker(digit)) {
              stringOfPalindromeNumbers+=digit+" ";
            }
        }
    }

    @Override
    public String getOutputOfArray() {
        return "Массив:" + Arrays.toString(numbers) + "\n" +
                "Палиндром: " + stringOfPalindromeNumbers ;
    }
}
