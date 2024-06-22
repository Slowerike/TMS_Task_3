import java.util.Arrays;

public class OddAndEvenNumbersInArray implements OutputTheResultToTheConsoleOfArray {
    int[] numbers;
    String evenNumbers = "";
    String oddNumbers = "";

    public OddAndEvenNumbersInArray(int lengthOfMassive) {
        this.numbers = new RandomMassiveOfNumbers().getMassiveWithRandomNumber(lengthOfMassive);
    }

    public void getOddAndEvenNumbers() {
        for (int digit : numbers) {
            if (digit % 2 == 0) {
                evenNumbers += digit + " ";

            } else {
                oddNumbers += digit + " ";
            }
        }
    }

    @Override
    public String getOutputOfArray() {
        return "Массив:" + Arrays.toString(numbers) + "\n" +
                "Четные числа: " + evenNumbers + "\n" + "Нечетные числа: " + oddNumbers;
    }
}
