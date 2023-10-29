import java.util.Scanner;

public class ArrayRataNilai20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jmlMhs =input.nextInt();
        int[] nilai = new int[jmlMhs];
        double totalLulus = 0;
        double totalTdkLulus= 0;
        int counterLulus = 0;
        int counterTdkLulus = 0;
        for (int i = 0; i < nilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) +" : ");
            nilai[i] =input.nextInt();
            if (nilai [i] > 70){
                totalLulus += nilai[i];
                counterLulus++;
            } else
            totalTdkLulus += nilai[i];
            counterTdkLulus++;
        } 
        System.out.println("Rata-Rata Nilai Lulus = " + totalLulus / counterLulus);
        System.out.println("Rata-Rata Nilai Tidak Lulus = " + totalTdkLulus / counterTdkLulus );
    } 
}