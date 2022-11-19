public class Main {
    public static void main(String[] args) {
        System.out.println(" ДОМАШНЕЕ ЗАДАНИЕ - 1");
        System.out.println("  Задание - 1");
        int deposit = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2459000) {
              month ++;
              total = total + total / 100;
              total = total + deposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("  Задание - 2");
        int number = 0;
        while (number < 10) {
            number ++;
            System.out.print(number + " ");
                    }
        System.out.println("");
        for (number = 10; number >=1; number --) {
            System.out.print(number + " ");
        }
        System.out.println("");
        System.out.println("  Задание - 3");
        int birthRate = 17;
        int mortality = 8;
        int population = 12_000_000;
        int dif = birthRate - mortality;
        int year = 0;
        while (year < 10) {
            year ++;
            population += population * dif / 1000;
            System.out.println(" Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("  ДОМАШНЕЕ ЗАДАНИЕ - 2");
        System.out.println("   Задание - 1");
        int deposit1 = 15000;
        int month1 = 0;
        while (deposit1 < 12_000_000) {
            month1 ++;
            deposit1 = deposit1 + deposit1 / 100 * 7;
            System.out.println("Месяц " + month1 + " сумма накоплений равна " + deposit1 + " рублей");
        }
        System.out.println("   Задание - 2");
        int deposit2 = 15000;
        int month2 = 0;
        while (deposit2 < 12_000_000) {
            month2 ++;
            deposit2 = deposit2 + deposit2 / 100 * 7;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма накоплений равна " + deposit2 + " рублей");
            }
                    }
        System.out.println(" Для накопления потребуется месяцев - " + month2);
        System.out.println("   Задание - 3");
        int deposit3 = 15000;
        int month3 = 0;
        while (month3 <= 9 * 12) {
            month3++;
            deposit3 = deposit3+ deposit3 / 100 * 7;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накоплений равна " + deposit3 + " рублей");
            }
        }
        System.out.println(" За 9 лет сумма накоплений составит " + deposit3 + " рублей");
        System.out.println("   Задание - 4");
        int date = 0;
        int friday = 2;
        while (date < 31) {
            date++;
            if (date == friday) {
                friday = friday + 7;
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println("  ДОМАШНЕЕ ЗАДАНИЕ - 3");
        System.out.println("   Задание - 1");
        int currentYear = 2022;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int yearComet = 0;
        while (yearComet <= endYear) {
            startYear ++;
            yearComet = yearComet + 79;
            if (yearComet > startYear && yearComet < endYear) {
                System.out.println(yearComet);
            }
        }
        System.out.println("   Задание - 2");
        int variable = 2;
        for (int variableTwo = 1; variableTwo <=10; variableTwo ++) {
            int result;
            result = variable * variableTwo;
            System.out.println(result);
        }
    }
}