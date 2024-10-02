import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------Training conditions (Тренировка условий)--------------------------");
        for (int i = 1; i <= 500; i++) fizzbuzz(i);
        System.out.println("-----------------------Expanding the line (Разворачиваем строку)--------------------------");
        String stroka = "make install";
        ReversedString(stroka.length(),stroka);
        System.out.println("----------------------Solving the quadratic equation (Решаем квадратное уравнение)----------------------");
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a,b,c");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        SquareSolver(a,b,c);
        System.out.println("--------------------Counting the sum of the series (Считаем сумму ряда)-----------------------------");
        double n = 2;
        SummaRuada(n);
        System.out.println("--------------------A palindrome string (Строка палиндром)-----------------------------");
        Scanner scanner1 = new Scanner(System.in);
        stroka = scanner1.nextLine();
        Palindrom(stroka);
    }
    public static void fizzbuzz(int a){
        if (a % 5 == 0 && a % 7 == 0) System.out.println("fizzbuzz");
        else if (a % 5 == 0) System.out.println("fizz");
        else if (a % 7 == 0) System.out.println("buzz");
    }

    public static void ReversedString(int a, String str){
        for (int i=a-1; i>=0; i--)
            System.out.print(str.charAt(i));
        System.out.println();
    }

    public  static void SquareSolver (double a,double b,double c){
        double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-1*b-Math.sqrt(D))/(2*a);
            x2 = (-1*b+Math.sqrt(D))/(2*a);
            System.out.print("x1 = ");
            System.out.println(x1);
            System.out.print("x2 = ");
            System.out.println(x2);
        } else if (D == 0) {
            double x;
            x = (-1*b)/(2*a);
            System.out.print("x = ");
            System.out.println(x);
        } else if (D < 0) {
            System.out.println("There are no roots! (Нет корней!)");
        }
    }

    public static void SummaRuada(double n) {
        double Summa = 0;
        while (true) {
            if (1 / (n * n + n-2) > 1e-6){
                Summa += 1 / (n * n + n - 2);
                n++;
            }
            else break;
        }
        System.out.println(Summa);
    }

    public static void Palindrom(String stroka){
        boolean f = false;
        for (int i = 0; i < stroka.length() / 2; i++) {
            if (stroka.charAt(i) != stroka.charAt(stroka.length()-i-1)) f = false;
            else
                f = true;
        }
        if (f == false) System.out.println("It's not a palindrom:(");
        else System.out.println("That string is a palindrom!");
    }
}
