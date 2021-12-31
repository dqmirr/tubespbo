import java.util.Scanner; //Get User inpurt
public class main extends method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fitculator");
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
                    addition();
                    break;
                case 2:
                    substraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    System.exit(choice);
            }
        }
    }
}

