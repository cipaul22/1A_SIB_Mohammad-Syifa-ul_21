
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Segitiga : ");
        int tinggi = input.nextInt(); // Scan Tinggi Segitiga
        for (int i = 1; i <= tinggi; i++) { // Loop Untuk Tinggi Segitiga
            for (int j = tinggi; j > i; j--) { // Loop Untuk Print Spasi
                System.out.print(" ");  // Print Spasi
            }
            for (int k = 1; k <= i; k++) { // Loop Untuk Print Angka Horizontal
                System.out.print(k); // Print Angka
            }
            System.out.println(); // Baris Baru
        }
    }
}