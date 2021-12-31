import java.util.Scanner;

public class method {
    static void addition(){
        Scanner math1 = new Scanner(System.in);
        double bb;
        double tb;
        double res;
        System.out.println("Body Mass Index(BMI)");
        System.out.println("Kategori : ");
        System.out.println("<18,5 : kekurangan berat badan");
        System.out.println("18,5-22,9 : Normal ");
        System.out.println("23-24,9 : Kelebihan berat badan ");
        System.out.println("25> : Obesitas ");
        System.out.println("Berat Badan(cm) : ");
        bb = math1.nextInt();
        System.out.print("Tinggi Badan(cm) : ");
        tb = math1.nextInt();
        res = bb/tb*tb;
        System.out.println ("BMI anda adalah " + res);
    }
    static void substraction() {
        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("First Num");
        a = math1.nextInt();
        System.out.print("Second Num");
        b = math1.nextInt();
        c = a - b;
        System.out.println ("The total value is " + c);
        return;
    }
    static void multiplication(){
        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("First Num");
        a = math1.nextInt();
        System.out.print("Second Num");
        b = math1.nextInt();
        c = a * b;
        System.out.println ("The total value is " + c);
        return;
    }
    static void divide(){

        Scanner math1 = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("First Num");
        a = math1.nextInt();
        System.out.print("Second Num");
        b = math1.nextInt();
        c = a / b;
        System.out.println ("The total value is " + c);
        return;
    }
}
