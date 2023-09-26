import java.util.Scanner;

public class ModifikasiPemilihanPercobaan2_21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        String nilaiHuruf = "-";
        System.out.print("Nilai UAS   :  ");
        float uas = input21.nextFloat();
        System.out.print("Nilai UTS   :  ");
        float uts = input21.nextFloat();
        System.out.print("Nilai Kuis  :  ");
        float kuis = input21.nextFloat();
        System.out.print("Nilai Tugas :  ");
        float tugas = input21.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        if (total > 80 && total <= 100) {
        nilaiHuruf = "A";
        } 
        else if (total > 73 && total <= 80) {
        nilaiHuruf = "B+";
        } 
        else if (total > 65 && total <= 73) {
        nilaiHuruf = "B";
        } 
        else if (total > 60 && total <= 65) {
        nilaiHuruf = "C+";
        } 
        else if (total > 50 && total <= 60) {
        nilaiHuruf = "C";
        } 
        else if (total > 39 && total <= 50) {
        nilaiHuruf = "D";
        } 
        else if (total <= 39 && total < 0) {
        nilaiHuruf = "E";
        } 
        else {System.out.println("Masukkan Nilai Yang Sesuai !");}
        String message = total <= 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai Akhir = " + total + " Dengan Kredikat " + nilaiHuruf + " Sehingga " + message);
    }
}
