
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Segitiga : "); 
        int tinggi = input.nextInt(); // Input Tinggi Segitiga
        for (int i = tinggi; i > 0; i--) { // Loop untuk Berapa Baris Segitiga Akan Di Print
            for (int j = i; j > 0; j--) { // Loop Untuk print berapa kolom bintang
                System.out.print("*"); // Print Bintang
            }
            System.out.println(); // Baris Baru
        }
    }
}