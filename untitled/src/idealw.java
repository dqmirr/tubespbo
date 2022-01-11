import java.util.Scanner;

public class idealw extends method{
    void hitung(){
        Scanner s = new Scanner(System.in);
        double tb;
        int jk;
        double resl;
        double resp;
        System.out.println("Berat ideal ");
        System.out.println("Jenis kelamin : ");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        jk = s.nextInt();
        System.out.println("Tinggi Badan : ");
        tb = s.nextDouble();
        resl=(tb - 100) - (tb - 100) * 0.1;
        resp=(tb - 100) - (tb - 100) * 0.15;
        if(jk==1){
            System.out.println("Berat badan ideal anda "+resl);
        }else{
            System.out.println("Berat badan ideal anda "+resp);
        }
        System.out.print("Masukkan pilihan anda : ");
    }
}
