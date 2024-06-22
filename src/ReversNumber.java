

public class ReversNumber implements OutputTheResultToTheConsole {
    long number;

    public ReversNumber(long number) {
        this.number = number;
    }
    public long getReverseTheNumber() {
        long finalNum = 0;
        while (number != 0) {
            long local = number % 10;
            finalNum = local + 10 * finalNum;
            number /= 10;
        }
        return finalNum;
    }
    public String getOutput(long number) {
        return "Число в обратном порядке:"+number;
    }

}
