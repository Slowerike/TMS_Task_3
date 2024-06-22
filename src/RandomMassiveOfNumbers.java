import java.util.Random;

public class RandomMassiveOfNumbers {
    Random randomNumber = new Random();

    public int[] getMassiveWithRandomNumber(int lengthMassiveFromConsole) {
        int[] massiveWithRandomNumber = new int[lengthMassiveFromConsole];
        for (int i = 0; i < massiveWithRandomNumber.length; i++) {

            massiveWithRandomNumber[i] = randomNumber.nextInt(2100000) - 1000000;
        }
        return massiveWithRandomNumber;

    }

}
