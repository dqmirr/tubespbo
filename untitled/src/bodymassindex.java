import java.util.Scanner;

public class bodymassindex extends method{
     void hitung(){
        Scanner s = new Scanner(System.in);
        double bb;
        double tb;
        double res;
        System.out.println("Body Mass Index(BMI)");
        System.out.println("Kategori : ");
        System.out.println("<18,5     : kekurangan berat badan");
        System.out.println("18,5-22,9 : Normal ");
        System.out.println("23-24,9   : Kelebihan berat badan ");
        System.out.println("25>       : Obesitas ");
        System.out.print("Berat Badan(kg) : ");
        bb = s.nextDouble();
        System.out.print("Tinggi Badan(m) : ");
        tb = s.nextDouble();
        res = bb/(tb*tb);

        double dataBMI[] = {tb, bb, res};
        System.out.println("Tinggi badan anda : "+dataBMI[0]);
        System.out.println("Berat badan anda : "+dataBMI[1]);
        System.out.println ("BMI anda adalah " + dataBMI[2]);
        System.out.print("Masukkan pilihan anda :");
    }
}
