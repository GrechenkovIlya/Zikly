package motocicly;

import java.util.Scanner;


public class motocicly {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task20();
        task21();
        task22();
    }

    //Задача 1 Пользователь вводит 2 числа (A и B). Возвести число A в степень B.
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        int c = 1;
        for (int i = 1; i <= b; i++) {
            c *= a;

        }
        System.out.println("c=" + c);
    }

    //Задача 2 Пользователь вводит 1 число (A). Вывести все числа от 1 до 1000, которые делятся на A.
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();

        for (int i = a; i <= 1000; i = i + a) {
            System.out.println("zada4a2=" + i);
        }
    }

    //Задача 3 Пользователь вводит 1 число (A). Найдите количество положительных целых чисел, квадрат которых меньше A.
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < Math.sqrt(a); i++) count++;
        System.out.println("zada4a3=" + count);
    }

    // Задача 4 Пользователь вводит 1 число (A). Вывести наибольший делитель (кроме самого A) числа A.
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 1;
        int max = 0;
        while (b < a) {
            if (a % b == 0) {
                max = b;
            }
            b++;
        }
        System.out.println("zada4a4= " + max);
    }

    // Задача 5 Пользователь вводит 2 числа (A и B). Вывести сумму всех чисел из диапазона от A до B, которые делятся без остатка на 7. (Учтите, что при вводе B может оказаться меньше A).
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("zada4a5= " + sum);
    }

    //Задача 6 Пользователь вводит 1 положительное число (N). Выведите N-ое число ряда фибоначчи. В ряду фибоначчи каждое следующее число является суммой двух предыдущих. Первое и второе считаются равными 1.
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int past = 1;
        int now = 1;
        int posnow = 2;
        for (int i = 1; posnow != n; i++) {
            int next = past + now;
            past = now;
            now = next;
            posnow++;
            if (posnow == n) {
                System.out.println("zada4a6= " + now);
            }
        }
    }

    //Задача 7 Пользователь вводит 2 числа. Найти их наибольший общий делитель используя алгоритм Евклида.

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println("zada4a7= " + a);
    }


    //Задача 9 Пользователь вводит 1 число. Найти количество нечетных цифр этого числа.
    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        int count = 0;
        int b = 0;
        while (a != 0) {
            b = a % 10;
            a = a /= 10;
            if (b % 2 != 0)
                count++;
        }
        System.out.print("zada4a9= " + count);
    }

    //Задача 10 Пользователь вводит 1 число. Найти число, которое является зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.
    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        int count = 0;
        while (a != 0) {
            int b = a % 10;
            count = count * 10 + b;
            a /= 10;
        }
        System.out.println("zada4a10= " + count);
    }

    // Задача 11 Пользователь вводит целое положительное  число (N). Выведите числа в диапазоне от 1 до N, сумма четных цифр которых больше суммы нечетных.
    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            int sumeven = 0;
            int sumodd = 0;
            b = i;
            while (b != 0) {
                a = b % 10;
                if (a % 2 == 0) {
                    sumeven = sumeven + a;
                } else {
                    sumodd = sumodd + a;
                }
                b = b / 10;
            }
            if (sumeven > sumodd) {
                System.out.println("zada4a11= " + i + "- в этом числе сумма четных цифр больше суммы нечетных");
            }
        }
    }
    //Задача 12 Пользователь вводит 2 числа. Сообщите, есть ли в написании двух чисел одинаковые цифры. Например, для пары 123 и 3456789, ответом будет являться “ДА”, а, для пары 500 и 99 - “НЕТ”.

    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int lastDigitA;
        int lastDigitB;
        boolean result = false;
        int copiedB = B;
        while (A > 0) {
            lastDigitA = A % 10;
            A /= 10;
            B = copiedB;
            while (B > 0) {
                lastDigitB = B % 10;
                B /= 10;
                result = lastDigitA == lastDigitB;
                if (result) break;
            }
            if (result) break;
        }
        if (result) {
            System.out.print("zada4a12= " + "yes");
        } else {
            System.out.print("zada4a12= " + "no");
        }
    }

    //Задача 13 Дано натуральное n. Вычислить:
    public static void task13() {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        double a = 0;
        for (int i = 1; i <= n; i++) {
            a = a + (1 + 1 / Math.pow(i, 2));
        }
        System.out.println("zada4a13= " + n);
    }

    //Задача 14 Дано действительное число х, натуральное число n. Вычислить:
    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        int n;
        double x;
        n = scanner.nextInt();
        x = scanner.nextInt();
        int sum = 0;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            b /= (x + i);
            sum += b;
        }
        System.out.println("zada4a14= " + sum);
    }

    //Задача 14.2 Дано действительное число х, натуральное число n. Вычислить:
    public static void task15() {
        Scanner scanner = new Scanner(System.in);
        int n;
        double x;
        n = scanner.nextInt();
        x = scanner.nextInt();
        int sum = 0;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            b *= x / i;
            sum += b;
        }
        System.out.println("zada4a14= " + sum);
    }

    //Задача 15
    public static void task16() {
        Scanner scanner = new Scanner(System.in);
        int n;
        int fact = 1;
        double sum = 0;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum *= (double) 3 / fact;
        }
        System.out.println("zada4a15= " + sum);
    }

    //Задача 15.2
    public static void task17() {
        Scanner scanner = new Scanner(System.in);
        int n;
        int fact = 1;
        double sum = 0;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum *= (double) (1 + i) / fact;
        }
        System.out.println("zada4a15= " + sum);
    }


    //Задача 18 Найти все трехзначные числа, представимые в виде сумм факториалов своих цифр.
    public static void task18() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 100; i < 999; i++) {
            int n1 = i % 10;
            int n2 = i / 10 % 10;
            int n3 = i / 100;
            int sum = getFactorial(n1) + getFactorial(n2) + getFactorial(n3);
            if (sum == i) {
                System.out.println("zada4a18= " + i);
            }
        }
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    //Задача 19 Можно ли заданное натуральное число М представить в виде суммы квадратов двух натуральных чисел? Написать программу решения этой задачи.
    public static void task19() {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        for (int i = 1; i <= Math.sqrt(a); i++) {
            for (int j = i; j <= Math.sqrt(a); j++) {
                if (i * i + j * j == a) {
                    System.out.println("zada4a19= " + "можно");
                    return;
                }
            }
        }
        System.out.println("zada4a19= " + "нельзя");
    }

    //Задача 20 Определить, является ли заданное число совершенным
    public static void task20() {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (sum == a) {
            System.out.println("zada4a20= " + "Число совершенное");
        } else {
            System.out.println("zada4a20= " + "Несовершенное");
        }
    }

    //Задача 21 Дано натуральное k. Напечатать k-ю цифру последовательности 1234567891011121314..., в которой выписаны подряд все натуральные числа
    public static void task21() {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        int lenght = 0;
        int i = 1;
        while (lenght < a) {
            System.out.print(i);
            lenght += countNumbers(i);
            i++;
        }
        System.out.println("zada4a21= " + "\n" + (int) ((i - 1) / Math.pow(10, lenght - a)) % 10);
    }

    public static int countNumbers(int a) {
        int count = 0;
        while (a != 0) {
            a /= 10;
            count++;
        }
        return count;
    }

    public static void task22() {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        int lenght = 0;
        int i = 1;
        while (lenght < a) {
            System.out.print(i * i);
            lenght += countNumbers(i * i);
            i++;
        }
        System.out.println("zada4a22= " + "\n" + (int) ((i - 1) * (i - 1) / Math.pow(10, lenght - a)) % 10);
    }

    // Задача 23 Дано натуральное k. Напечатать k-ю цифру последовательности 1123581321..., в которой выписаны подряд все числа Фибоначчи.

    public static void task23() {
    }
}