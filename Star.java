import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}