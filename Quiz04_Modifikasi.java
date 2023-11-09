import java.util.Scanner;
import java.util.Random;

public class Quiz04_Modifikasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int angkaAcak = random.nextInt(10);
        int tebakan;

        System.out.println("Tebak angka antara 1 - 10");
        
        do {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();

            if (tebakan == angkaAcak) {
                System.out.println("Selamat, tebakan Anda benar!");
                break;
            } else if (tebakan < angkaAcak) {
                System.out.println("Tebakan Anda terlalu kecil!");
            } else {
                System.out.println("Tebakan Anda terlalu besar!");
            }
        } while (true);

        input.close();
    }
}