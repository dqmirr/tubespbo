import java.util.Scanner; //Get User inpurt


public class main{
    public static void main(String[] args) {
        method m = new method();
        method bmi = new bodymassindex();
        method bf = new bodyfat();
        method idw = new idealw();
        Scanner input = new Scanner(System.in);
        System.out.println("Fitculator \n");
        System.out.println("1. Body Mass Index(BMI)");
        System.out.println("2. Body Fat Percentage");
        System.out.println("3. Berat Badan Ideal");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan anda :");
        int choice = 0;
        while (choice != 4) {
        choice = input.nextInt();
            switch (choice) {
                case 1:
                    bmi.hitung();
                    break;
                case 2:
                    bf.hitung();
                    break;
                case 3:
                    idw.hitung();
                    break;
                case 4:
                    System.exit(choice);
            }
        }
    }
}

