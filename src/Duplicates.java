public class Duplicates {
    long number;
    boolean flag=true;

    public Duplicates(long number) {
        this.number = number;
    }

    public void getDuplicates() {
        while (number != 0) {
            long res1 = number % 10;
            number /= 10;
            long res2 = number;
            //циклом проходи по цифрам и сраниваем ,есть ли дубликат , если есть меняем флаг на false
            while (res2 != 0) {
                if (res1 == res2 % 10) {
                    flag = false;
                    break;
                }
                res2 /= 10;
            }
        }
    }

    public String getOutput() {
        return "Дубликаты: " + flag;
    }
}
