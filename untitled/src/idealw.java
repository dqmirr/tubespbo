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
        double dataIdealWeight[] = {tb,resl,resp};
        if(jk==1){
            System.out.println("Tinggi badan anda "+dataIdealWeight[0]);
            System.out.println("Berat badan ideal anda "+dataIdealWeight[1]);
        }else{
            System.out.println("Berat badan ideal anda "+dataIdealWeight[2]);
        }
        System.out.print("Masukkan pilihan anda : ");
    }
}
