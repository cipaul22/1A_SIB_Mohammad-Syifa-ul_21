import java.util.Scanner;
public class NestedLoop_2341760054{
    public static void main(String[] args) {
        double[][] temperatur = new double[5][7]; 
        double[] rata2 = new double[5];
        double jumlah = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < temperatur.length; i++){
            System.out.println("Kota ke-" + (i+1));
            for(int j = 0; j < temperatur[0].length; j++){
                System.out.print("Hari ke-" + (j + 1) + " : ");
                temperatur[i][j] = input.nextDouble();
                jumlah += temperatur[i][j];
            }
            rata2[i] = jumlah / temperatur[1].length; 
            jumlah = 0;
            System.out.println();
        }
        for(int i = 0; i < temperatur.length; i++){
            System.out.println("Kota ke-" + (i+1) + " : ");
            for(double x : temperatur[i]){
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.println("Rata - Rata : " + rata2[i]);
        }

    }
}