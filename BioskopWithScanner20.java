import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];
        boolean menu = true;
        while (menu) {
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan Input : ");
            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama  : ");
                    nama = input.nextLine();
                    System.out.print("Masukkan baris : ");
                    baris = input.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = input.nextInt();
                    input.nextLine();
                    if (baris < 5 && kolom < 3) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                        } else {
                            System.out.println("Kursi Telah Terisi");
                            System.out.println("Masukkan Input Kembali !");
                        }
                    } else {
                        System.out.println(" Kursi tidak tersedia");
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int x = 0; x < penonton[i].length; x++) {
                            if (penonton[i][x] == null) {
                                penonton[i][x] = "***";
                            }
                        }
                        System.out.println("Penonton pada baris ke-" + (i + 1) + " : " + String.join(", ", penonton[i]));
                    }
                    break;
                case 3:
                    menu = false;
                    break;
            }
        }
    }
}
