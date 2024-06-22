public class NumbersInDescOrderInRow implements OutputTheResultToTheConsole {
    long number;

    public NumbersInDescOrderInRow(long number) {
        this.number = number;
    }

    public long getNumbersInDescOrderInRow() {
        long result = 0;
        long numberForLastCycle = 0;
        while (number != 0) {
            long digit = number % 10;
            number /= 10;
            long nextDigit = number % 10;
            if (digit - 1 == nextDigit) {
                result = digit + 10 * result;
                numberForLastCycle = digit;
            } else {
                if (numberForLastCycle - 1 == digit) {
                    result = digit + 10 * result;
                }
            }
        }
        return result;
    }

    @Override
    public String getOutput(long number) {
        return String.valueOf(number);
    }
}
