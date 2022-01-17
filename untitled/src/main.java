import java.util.InputMismatchException;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        method m = new method();
        method bmi = new bodymassindex();
        method bf = new bodyfat();
        method idw = new idealw();
        Scanner input = new Scanner(System.in);

        m.hitung();
        int choice = 0;
        try {
            choice = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Invalid Input");

        }
            while (choice != 4) {
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
                default:
                    System.out.println("Invalid Input");
                    System.out.println("Masukkan pilihan anda : ");
                    input.nextInt();
            }

        }
        }
    }


