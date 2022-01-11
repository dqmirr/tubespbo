import java.util.Scanner;

public class bodyfat extends method{
    void hitung() {
        Scanner s = new Scanner(System.in);
        double bb;
        double tb;
        double bmi;
        double age;
        double c;
        System.out.println("Body Fat Percentage :");
        System.out.print("Umur : ");
        age = s.nextDouble();
        /*System.out.print("Berat Badan : ");
        bb = math1.nextDouble();
        System.out.print("Tinggi badan : ");
        tb = math1.nextDouble();
        /*

         */
        System.out.print("BMI : ");
        bmi = s.nextDouble();
        c = (1.20*bmi+ 0.23*age-16.2)*100;
        System.out.println ("The total value is " +c);
        System.out.print("Masukkan pilihan anda : ");


    }
}
