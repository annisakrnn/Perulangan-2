import java.util.Arrays;
import java.util.Scanner;
public class Atlet04 {

    public static void main(String [] args) {
        Scanner scan04 = new Scanner(System.in);

        String[] atletBadminton = {"Anita", "Budi", "Citra", "Dewi", "Eko"};
        String[] atletTenisMeja = {"Fandi", "Gita", "Hana", "Indra", "Joko"};
        String[] atletBasket = {"Kevin", "Lina", "Mira", "Nina", "Oscar"};
        String[] atletBolaVoly = {"Putri", "Qori", "Rudi", "Sari", "Tono"};

        // Mengurutkan nama atlet secara ascending untuk setiap cabang olahraga
        Arrays.sort(atletBadminton);
        Arrays.sort(atletTenisMeja);
        Arrays.sort(atletBasket);
        Arrays.sort(atletBolaVoly);

        // Menampilkan nama atlet yang sudah diurutkan
        System.out.println("Daftar Atlet Badminton:");
        for (String atlet : atletBadminton) {
            System.out.println(atlet);
        }

        System.out.println("\nDaftar Atlet Tenis Meja:");
        for (String atlet : atletTenisMeja) {
            System.out.println(atlet);
        }

        System.out.println("\nDaftar Atlet Basket:");
        for (String atlet : atletBasket) {
            System.out.println(atlet);
        }

        System.out.println("\nDaftar Atlet Bola Voly:");
        for (String atlet : atletBolaVoly) {
            System.out.println(atlet);
        }
    }
}
