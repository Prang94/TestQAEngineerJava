import java.util.Scanner;

/*
1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.

 */
public class Task1 {
    public static void compare() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = in.nextInt();
        System.out.println("Enter the second value: ");
        int b = in.nextInt();

        if(a > b) {
            System.out.println(String.format("%d > %d", a, b));
        }
        else if(a < b) {
            System.out.println(String.format("%d < %d", a, b));
        }

        else {
            System.out.println(String.format("%d = %d", a, b));
        }
    }

    public static void main(String[] args) {
        Task1.compare();
    }
}

/*
2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
 */
public class Task2 {
    public static void compareStrings() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = in.nextLine();
        System.out.println("Enter the second value: ");
        String str2 = in.nextLine();
        String result = str1.equals(str2) ? "Строки идентичны" : "Строки неидентичны";
        System.out.println(result);
    }

    public static void main(String[] args) {
        Task2.compareStrings();
    }
}


/*
3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Необходимо написать программу, которая выведет в консоль все чётные числа.
 */
public class Task3 {
    public static void showEvenNumbers(int[] mas) {
        for (var i : mas) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int[] mas = {1,2,3,4,5,6,7,8,9,10};
        Task3.showEvenNumbers(mas);
    }
}