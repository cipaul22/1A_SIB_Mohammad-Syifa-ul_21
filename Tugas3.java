
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Sisi Persegi : ");
        int x = input.nextInt(); // x sebagai patokan panjang dan tinggi persegi
        for (int i = 1; i <= x; i++) { // Loop Untuk Jumlah Baris yang akan di print
            if (i == 1 || i == x) { // Jika Loop Berjalan Pada Awal Dan Akhir Baris
                for (int j = 1; j <= x; j++) { // Loop Untuk Print Angka Dan Spasi
                    System.out.print(x + " "); // Print Angka Dan Spasi
                }
                System.out.println(); // Baris Baru
            } else { // Jika Loop Berjalan Tidak Pada Aawal Dan Akhir
                for (int k = 1; k <= x; k++) { // Loop untuk Print Elemen Spasi Atau Angka
                    if (k == 1 || k == x) { // Print Angka Pada Kolom Awal Dan Akhir
                        System.out.print(x + " "); // Print Angka
                    } else { // Jika Tidak Memenuhi Kondisi Print Spasi Sebanyak 2 Kali
                        System.out.print("  "); // Print Spasi 2 Kali
                    }
                }
                System.out.println(); // Baris Baru
            }
        }
    }
}