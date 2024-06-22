import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""     
                Введите число от 1 до 9:        
                1-Число в обратном порядке
                2-Вывести максимальные и минимальные цифры
                3-Вывести true,eсли в числе нет цифр дубликатов
                4-Вывести цифры которые идут в стр. порядке убывания
                5-Вывести максимальные и минимальные числа в массиве
                6-Вывести четные и нечетные числа в массиве
                7-Вывести самое длинное и самое короткое число
                8-Вывести только те числа,которые идут в порядке возрастания в массиве
                9-Вывести все числа пилиндромы в массиве
                """);
        while (true) {
            System.out.print("Введите номер операции:");
            int numberOfOperation = scanner.nextInt();
            int number = 0;
            if (numberOfOperation > 0 & numberOfOperation < 5) {
                System.out.print("Введите число: ");
                number = scanner.nextInt();
            }
            int lengthOfMassive = 0;
            if (numberOfOperation > 4 & numberOfOperation < 10) {
                System.out.print("Введите длину массива: ");
                lengthOfMassive = scanner.nextInt();
            }
            switch (numberOfOperation) {
                case 1 -> {
                    ReversNumber reversNumber = new ReversNumber(number);
                    long result = reversNumber.getReverseTheNumber();
                    System.out.println(reversNumber.getOutput(result));
                }
                case 2 -> {
                    MaxAndMinNumber maxAndMinNumber = new MaxAndMinNumber(number);
                    maxAndMinNumber.getMaxAndMinNumber();
                    System.out.println(maxAndMinNumber.getOutput());
                }
                case 3 -> {
                    Duplicates duplicates = new Duplicates(number);
                    duplicates.getDuplicates();
                    System.out.println(duplicates.getOutput());
                }
                case 4 -> {
                    NumbersInDescOrderInRow numbersInDescOrderInRow = new NumbersInDescOrderInRow(number);
                    long result4 = numbersInDescOrderInRow.getNumbersInDescOrderInRow();
                    System.out.println(numbersInDescOrderInRow.getOutput(result4));
                }
                case 5 -> {
                    MaxAndMinNumericInArray maxAndMinNumericInArray = new MaxAndMinNumericInArray(lengthOfMassive);
                    maxAndMinNumericInArray.getMaxAndMinNumericInArray();
                    System.out.println(maxAndMinNumericInArray.getOutputOfArray());
                }
                case 6 -> {
                    OddAndEvenNumbersInArray oddAndEvenNumbersInArray = new OddAndEvenNumbersInArray(lengthOfMassive);
                    oddAndEvenNumbersInArray.getOddAndEvenNumbers();
                    System.out.println(oddAndEvenNumbersInArray.getOutputOfArray());
                }
                case 7 -> {
                    TheMostShortAndLongNumberInArray theMostShortAndLongNumberInArray = new TheMostShortAndLongNumberInArray(lengthOfMassive);
                    theMostShortAndLongNumberInArray.getTheMostShortAndLongNumberInArray();
                    System.out.println(theMostShortAndLongNumberInArray.getOutputOfArray());
                }
                case 8 -> {
                    NumbersInAscendingOrder numbersInAscendingOrder = new NumbersInAscendingOrder(lengthOfMassive);
                    numbersInAscendingOrder.getNumbersInAscendingOrder();
                    System.out.println(numbersInAscendingOrder.getOutputOfArray());
                }
                case 9 -> {
                    Palindrome palindrome = new Palindrome(lengthOfMassive);
                    palindrome.getPalindrome();
                    System.out.println(palindrome.getOutputOfArray());
                }
                default -> System.out.println("Неверная цифра команды,введите заново");
            }
            if (numberOfOperation > 0 & numberOfOperation < 10) {
                scanner.close();
                break;
            }
        }
    }

}
