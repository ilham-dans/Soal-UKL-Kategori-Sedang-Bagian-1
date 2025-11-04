
import java.util.Scanner;

public class soalnumber2bagian1 {
     static void faktorial() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Bilangan harus positif!");
            return;
        }

        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah: " + hasil);

        input.close();
    }

    public static void main(String[] args) {
    
        faktorial();
    }
}