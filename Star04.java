import java.util.Scanner;
public class Star04 {

    public static void main (String[] args) {
        Scanner scan04 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = "); 
        int N = scan04.nextInt(); 

        for(int i=1; i<=N; i++) {
            System.out.print("*");
        }

    }
}