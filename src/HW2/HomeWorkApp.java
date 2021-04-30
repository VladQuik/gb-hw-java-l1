/*
1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/

package HW2;

public class HomeWorkApp {
    public static void main(String[] args) {
        //Задание 1
        System.out.println(checkSumInRange(1, 19));
        //Задание 2
        checkValue(1);
        //Задание 3
        System.out.println(checkValueBool(-1));
        //Задание 4
        printString("Тестовая строка", 5);
        //Задание 5
        System.out.println(checkYear(1600));
    }
    //Задание 1
    public static boolean checkSumInRange(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
    //Задание 2
    public static void checkValue(int a) {
        if (a <= 0) {
            System.out.println("Передано отрицательное число");
        } else {
            System.out.println("Передано положительное число");
        }
    }
    //Задание 3
    public static boolean checkValueBool(int a) {
        return (a <= 0);
    }

    //Задание 4
    public static void printString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    //Задание 5
    public static boolean checkYear(int year) {
        return (year % 400 == 0 || (year % 100 != 0) && (year % 4 == 0));
    }
}
