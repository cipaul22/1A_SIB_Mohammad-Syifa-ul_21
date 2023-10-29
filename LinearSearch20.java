import java.util.Scanner;

public class LinearSearch20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah Elemen Array   : ");
        int jmlArray = input.nextInt();
        int[] array = new int[jmlArray];
        int hasil = -1;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan Elemen Array ke-" + (i) + "     : ");
            array[i] = input.nextInt();
        }
        System.out.print("Masukkan Key Yang Ingin Dicari : ");
        int key = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil == -1){
            System.out.println("Key Tidak Ditemukan");
        } else
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
    }
}