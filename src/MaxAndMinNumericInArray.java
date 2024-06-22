import java.util.Arrays;

public class MaxAndMinNumericInArray implements OutputTheResultToTheConsoleOfArray {
    int max;
    int min;
    int[] numbers;

    public MaxAndMinNumericInArray(int lengthOfMassive) {
        this.numbers = new RandomMassiveOfNumbers().getMassiveWithRandomNumber(lengthOfMassive);
        this.max = numbers[0];
        this.min = numbers[0];
    }

    public void getMaxAndMinNumericInArray() {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
    }

    @Override
    public String getOutputOfArray() {
        return "Массив:"+Arrays.toString(numbers) + "\n" +
                "Минимальное число: " + min + "\n" + "Максимальное число: " + max;
    }
}
