import java.util.Scanner;
    public class Gaji21{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int jmlMasuk, jmlTdkMasuk, totGaji;
           // int gaji = 400000, potGaji = 25000;
            System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda : ");
            jmlMasuk = input.nextInt();
            System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
            jmlTdkMasuk = input.nextInt();
            System.out.print("Masukkan Gaji Perhari : ");
            int gaji = input.nextInt();
            System.out.println("Masukkan Potongan Gaji Untuk Perhari : ");
            int potGaji = input.nextInt();
            totGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);
            System.out.println("Gaji yang anda terima adalah : " + totGaji);
            input.close();
        }
    }