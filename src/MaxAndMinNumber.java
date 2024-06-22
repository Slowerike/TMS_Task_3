public class MaxAndMinNumber {
    long min = 9;  // Инициализируем min как максимальное возможное значение цифры
    long max = 0;  // Инициализируем max как минимальное возможное значение цифры
    long number;//наше число

    public MaxAndMinNumber(long num) {
        this.number = num;
    }

    public void getMaxAndMinNumber() {
        while (number != 0) {
            long digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
            number /= 10;
        }
    }

    public String getOutput() {
        return "Минимальная цифра: " + min + "\n" + "Максимальная цифра: " + max;
    }
}
