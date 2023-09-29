import java.util.Scanner;

public class Ekspedisi21 {
    public static void main(String[] args) {
        Scanner ekspedisi = new Scanner(System.in);
        // Deklarasi
        String isi_barang, namaPenerima, alamatTujuan, pengirim;
        int no_resi, jumlah, berat, ongkosKirim;
        long no_hp, biaya;
        // output
        System.out.println("--Data Ekspedisi--");
        System.out.print("Masukkan No. Resi: ");
        no_resi = ekspedisi.nextInt();
        System.out.print("isi barang: ");
        isi_barang = ekspedisi.next();
        System.out.print("Jumlah barang: ");
        jumlah = ekspedisi.nextInt();
        System.out.print("Masukkan no HP customer: ");
        no_hp = ekspedisi.nextLong();
        System.out.print("Berat (kg): ");
        berat = ekspedisi.nextInt();
        System.out.print("Ongkos Kirim: ");
        ongkosKirim = ekspedisi.nextInt();
        biaya = berat * ongkosKirim;
        System.out.println("Total Biaya: " + biaya);
        System.out.print("Nama Penerima: ");
        namaPenerima = ekspedisi.next();
        System.out.print("Alamat Tujuan: ");
        alamatTujuan = ekspedisi.next();
        System.out.print("Nama Pengirim: ");
        pengirim = ekspedisi.next();
        System.out.println("Data Anda Telah Diproses");
    }
}