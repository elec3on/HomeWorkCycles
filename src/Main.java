public class Main {
    public static void main(String[] args) {
        // Циклы, Задача 1
        System.out.println("Циклы, задача № 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Вывод значения итерации: " + i);
        }
        System.out.println("------------------------------------");
        System.out.println("Циклы, задача № 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Вывод значения итерации: " + i);
        }
        System.out.println("------------------------------------");
        System.out.println("Циклы, задача № 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println("Четное число из диапазона от 0 до 17: " + i);
        }
        System.out.println("------------------------------------");
        System.out.println("Циклы, задача № 4");
        for (int i = 10; i >= -10; i -= 2) {
            System.out.println("Четное число из диапазона от 10 до -10 : " + i);
        }
        System.out.println("------------------------------------");
        System.out.println("Циклы, задача № 5");
        for (int i = 1904; i <= 2096; i += 4) {
                System.out.println(i + " год является високосным.");
        }
        System.out.println("------------------------------------");
        System.out.println("Циклы, задача № 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println("Вывод результата цикличного суммирования числа 7: " + i);
        }
        System.out.println("------------------------------------");
        System.out.println("Циклы, задача № 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println("Вывод результата цикличного умножения на 2: " + i);
        }
        System.out.println("------------------------------------");
        System.out.println("Циклы, задача № 8");
        // Сумма, откладываемая каждый месяц
        int monthlyDeposit = 29000;
        // Переменная для хранения общей суммы накоплений
        int totalSavings = 0;
        // Цикл по месяцам (предполагаем один год — 12 месяцев)
        for (int month = 1; month <= 12; month++) {
            // Добавляем ежемесячный взнос к общей сумме
            totalSavings += monthlyDeposit;
            // Выводим текущий месяц и сумму накоплений
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", month, totalSavings);
        }
        System.out.println("------------------------------------");
        System.out.println("Циклы, задача № 9");
        // Годовая процентная ставка (12%)
        double annualInterestRate = 0.12;
        // Месячная процентная ставка (12% / 12 месяцев = 1% в месяц)
        double monthlyInterestRate = annualInterestRate / 12;
        // Переменная для хранения общей суммы накоплений с процентами
        totalSavings = 0;
        // Цикл по месяцам (12 месяцев)
        for (int month = 1; month <= 12; month++) {
            // Добавляем ежемесячный взнос к общей сумме
            totalSavings += monthlyDeposit;
            // Начисляем проценты на текущую сумму накоплений (включая предыдущие взносы)
            totalSavings += (int) (totalSavings * monthlyInterestRate);
            // Выводим текущий месяц и сумму накоплений
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", month, totalSavings);
        }
        System.out.println("------------------------------------");
        System.out.println("Циклы, задача № 10");
        int num = 2;
        int result;
        for (int i = 1; i <= 10; i++) {
            result = i * num;
            System.out.println(num + " * " + i + " = " + result);
        }
        System.out.println("------------------------------------");
    }
}