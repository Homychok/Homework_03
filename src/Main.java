public class Main {
    public static void main(String[] args) {
        lessonwork1();
        lessonwork2();
        lessonwork3();
        lessonwork4();
        lessonwork5();
        lessonwork6();
        lessonwork7();
        lessonwork8();
        lessonwork9();
        lessonwork10();
        homework1();
        homework2();
        homework3();
        homework4();
        homework5();
        homework6();
        homework7();
        homework8();
    }
    public static void lessonwork1 () {
        System.out.println("Самостоятельна задача 1");
        for (int i = 1; i < 11; i++) {
            System.out.println("Число " + i);
        }
    }
    public static void lessonwork2 () {
        System.out.println("Самостоятельна задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println("Значение числа " + i);
        }
    }
    public static void lessonwork3 () {
        System.out.println("Самостоятельна задача 3");
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println("Четное число " + i);
        }
    }
    public static void lessonwork4 () {
        System.out.println("Самостоятельна задача 4");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println("Значение числа " + i);
        }
    }
    public static void lessonwork5 () {
        System.out.println("Самостоятельна задача 5");
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }
    public static void lessonwork6 () {
        System.out.println("Самостоятельна задача 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println("Число " + i);
        }
    }
    public static void lessonwork7 () {
        System.out.println("Самостоятельна задача 7");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
    }
    public static void lessonwork8 () {
        System.out.println("Самостоятельна задача 8");
        int salary = 29000;
        int piggybank = 0;
        for (int i = 0; i < 12; i++) {
            piggybank = piggybank + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + piggybank + " рублей");
        }
    }
    public static void lessonwork9 () {
        System.out.println("Самостоятельна задача 9");
        int salary = 29000;
        int bank = 0;
        for (int i = 0; i < 12; i++) {
            bank = bank + bank/100;
            bank = bank + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей");
        }
    }
    public static void lessonwork10 () {
        System.out.println("Самостоятельна задача 10");
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i < 12; i++) {
            c=b+a;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
    public static void homework1 () {
        System.out.println("Домашняя задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
        public static void homework2 () {
            System.out.println("Домашняя задача 2");
            int i = 0;
            while (i < 10) {
                i = i + 1;
                System.out.print(" " + i);
            }
            System.out.println("");
            for (i = 10; i >= 1; i = i - 1) {
                System.out.print(" " + i);
            }
        }
    public static void homework3 () {
        System.out.println("Домашняя задача 3");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int i = 1;
        for (i = 1; i <= 10; i++) {
            population = population + population * (born - death) / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }
    public static void homework4 () {
        System.out.println("Домашняя задача 4");
        int moneyInBank = 15_000;
        int total = 0;
        int i = 0;
        for (i = 0; total <= 12_000_000; i++) {
            total = total + total * 7 / 100;
            total = total + moneyInBank;
            System.out.println("Месяц " + i + " в банке " + total + " рублей");
        }
        System.out.println(i-1 + " месяцев нужно, чтобы накопить 12_000_000 рублей");
    }
    public static void homework5 () {
        System.out.println("Домашняя задача 5");
        int moneyInBank = 15_000;
        int total = 0;
        int i = 0;
        for (i = 0; total <= 12_000_000; i++) {
            total = total + total * 7 / 100;
            total = total + moneyInBank;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " в банке " + total + " рублей");
            }
        }
        System.out.println(i-1 + " месяцев нужно, чтобы накопить 12_000_000 рублей");
    }
    public static void homework6 () {
        System.out.println("Домашняя задача 6");
        int moneyInBank = 15_000;
        int total = 0;
        int i = 0;
        int mounth = 9 * 12;
        for (i = 0; i <= mounth; i++) {
            total = total + total * 7 / 100;
            total = total + moneyInBank;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " в банке " + total + " рублей");
            }
        }
        i = i - 1;
        System.out.println(total + " накопит Василий за " + i + " месяцев");
    }
    public static void homework7 () {
        System.out.println("Домашняя задача 7");
        int numberOfDay = 1;
        for (numberOfDay = 1; numberOfDay <= 31; numberOfDay = numberOfDay + 7) {
            System.out.println("Сегодня пятница, " + numberOfDay + "-е число. Необходимо подготовить отчет!");
        }
    }
    public static void homework8 () {
        System.out.println("Домашняя задача 8");
        int firstYear = 1822;
        int lastYear = 2222;
        int year;
        for (year = 1822; year <= lastYear; year++) {
            if (year % 79 == 0){
                System.out.println(year);}
        }
    }
}