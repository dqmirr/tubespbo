import java.util.Scanner;

public class bodyfat extends method{
    void hitung() {
        Scanner s = new Scanner(System.in);
        double bmi;
        double age;
        double res;

        System.out.println("Persentase Lemak Tubuh :");
        System.out.println("Kategori ideal:");
        System.out.println("Wanita :");
        System.out.print("Umur 20-39 : 21-33%\n");
        System.out.print("Umur 40-59 : 35-40%\n");
        System.out.println("Umur 60-79 : 36-42% \n");
        System.out.println("Pria :");
        System.out.println("Umur 20-39 : 8-19%");
        System.out.println("Umur 40-59 : 11-21%");
        System.out.println("Umur 60-79 : 13-24%");

        System.out.print("Masukkan umur : ");
        age = s.nextDouble();
        System.out.print("Masukkan BMI : ");
        bmi = s.nextDouble();
        res = (1.20*bmi+ 0.23*age-16.2)*100;
        double dataBodyFat[] = {age, bmi, res};
        System.out.println("Umur anda : "+dataBodyFat[0]);
        System.out.println("BMI anda adalah anda : "+dataBodyFat[1]);
        System.out.println ("Persentase lemak tubuh anda " +dataBodyFat[2]+"%");
        System.out.print("Masukkan pilihan anda : ");


    }
}
