import java.util.Scanner;
public class Tugas20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int elemen = input.nextInt();
        int[] nilai = new int[elemen];
        System.out.print("Masukkan Nilai Mahasiswa ke-1 : ");
        nilai[0] = input.nextInt();
        total += nilai[0];
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            total += nilai[i];
            if (nilai[i] >= tertinggi){
                tertinggi = nilai[i];
            } 
            if (nilai[i] <= terendah){
                terendah = nilai[i];
            }
        }
        double avg =(double)total / elemen;
        System.out.println("Nilai Tertinggi Adalah       : " + tertinggi);
        System.out.println("Nilai Terendah Adalah        : " + terendah);
        System.out.println("Rata-Rata Nilai Mahasiswa Adalah : " + avg);
    }
}