public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        int savings = 15000;
        int total = 0;
        int month = 1;

        while (total <= 2_459_000) {
            total = total + savings;
            total = total + total / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }

        System.out.println("Задание №2");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        for (i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        System.out.println("Задание №3");
        int population = 12_000_000;
        int birthRate = 17 * 1000;
        int mortality = 8 * 1000;

        for (int a = 2024; a <= 2034; a++) {
            population = population + birthRate - mortality;
            System.out.println("Год " + a + ", численность населения составляет " + population);
        }

        System.out.println("Задание №4");
        int investment = 15000;
        int total2 = 0;
        int time = 1;

        while (total2 <= 12_000_000) {
            total2 = total2 + total2 / 100 * 7;
            total2 = total2 + investment;
            System.out.println("Месяц " + time + ", сумма накоплений равна " + total2 + " рублей");
            time++;
        }

        System.out.println("Задание №5");
        int investmentNext = 15000;
        int totalNext = 0;
        int timeNext = 1;

        for (; totalNext <= 12_000_000; timeNext++) {
            totalNext = totalNext + investmentNext;
            totalNext = totalNext + totalNext / 100 * 7;
            if (timeNext % 6 == 0) {
                System.out.println("Месяц " + timeNext + ", сумма накоплений равна " + totalNext + " рублей");
            }
        }

        System.out.println("Задание №6");
        int investmentNext2 = 15000;
        int totalNext2 = 0;

        for (int timeNext2 = 1; timeNext2 <= 9 * 12; timeNext2++) {
            totalNext2 = totalNext2 + investmentNext2;
            totalNext2 = totalNext2 + totalNext2 / 100 * 7;
            if (timeNext2 % 6 == 0) {
                System.out.println("Месяц " + timeNext2 + ", сумма накоплений равна " + totalNext2 + " рублей");
            }
        }

        System.out.println("Задание №7");
        int friday = 5;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задание №8");

        for (int year = 2024 - 200; year < 2024 + 100; year ++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

    }
}




