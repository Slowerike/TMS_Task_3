import java.util.Arrays;

public class TheMostShortAndLongNumberInArray implements OutputTheResultToTheConsoleOfArray {
    int[] numbers;
    String maxNumberString = "";
    String minNumberString = "";

    public TheMostShortAndLongNumberInArray(int lengthOfMassive) {
        this.numbers = new RandomMassiveOfNumbers().getMassiveWithRandomNumber(lengthOfMassive);
    }

    public void getTheMostShortAndLongNumberInArray() {
        int[] numbersLength = new int[numbers.length];
        for (int x = 0; x < numbers.length; x++) {
            numbersLength[x] = getNumberLength(numbers[x]);
        }

        int maxNumber = numbersLength[0];
        int minNumber = numbersLength[0];

        for (int i = 1; i < numbersLength.length; i++) {
            if (numbersLength[i] > maxNumber) {
                maxNumber = numbersLength[i];
            }
            if (numbersLength[i] < minNumber) {
                minNumber = numbersLength[i];
            }
        }
        for (int x = 0; x < numbers.length; x++) {
            if (maxNumber == numbersLength[x]) {
                maxNumberString += numbers[x] + " ";
            } else if (minNumber == numbersLength[x]) {
                minNumberString += numbers[x] + " ";
            }
        }
    }

    public int getNumberLength(int number) {
        int length = 0;
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        } else {
            while (number > 0) {
                number /= 10;
                length++;
            }
        }
        return length;
    }

    @Override
    public String getOutputOfArray() {
        return "Массив:" + Arrays.toString(numbers) + "\n" +
                "Числа с максимальной длиной: " + maxNumberString + "\n" + "Числа с минимальной длиной: " + minNumberString;
    }
}
