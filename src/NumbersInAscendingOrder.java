import java.util.Arrays;

public class NumbersInAscendingOrder implements OutputTheResultToTheConsoleOfArray {
    int[] numbers;
    String stringOfAscendingNumbers = "";

    public NumbersInAscendingOrder(int lengthOfMassive) {
        this.numbers = new RandomMassiveOfNumbers().getMassiveWithRandomNumber(lengthOfMassive);
    }

    public int ascOrder(int number) {
        String numberStr = Integer.toString(number);
        int lengthNum = 1;
        int firstDigit = numberStr.charAt(0) - '0';
        // Итерируемся по символам строки и выводим их
        for (int i = 1; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            if (digit == firstDigit + 1) {
                firstDigit = digit;
                lengthNum++;
            } else {
                break;
            }
        }
        if ((Math.abs(number) >= 0 & Math.abs(number) <= 9) | lengthNum == 1 | (lengthNum != numberStr.length())) {
            return 0;
        } else {
            return number;
        }
    }

    public void getNumbersInAscendingOrder() {
        for (int digit : numbers) {
            if (ascOrder(digit) != 0) {
                stringOfAscendingNumbers += digit + " ";
            }
        }
    }

    @Override
    public String getOutputOfArray() {
        return "Массив:" + Arrays.toString(numbers) + "\n" +
                "Числа,которые идут в порядке возрастания: " + stringOfAscendingNumbers;
    }
}
