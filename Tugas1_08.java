import java.util.Scanner;
public class Tugas1_08 {
    public static void main(String[] args) {
        Scanner prasojo = new Scanner(System.in);

        System.out.print("Masukkan nilai angka (minimal 3) = ");
        int x = prasojo.nextInt();

        if (x > 2) {
        for(int iOuter = 1; iOuter <= x; iOuter++) {
        for(int i = 1; i <= x; i++) {
            if (iOuter > 1 && iOuter < x && i>1 && i<x) {
            System.out.print("  ");
        } else {
        System.out.print(" " + x);
        }
        }
        System.out.println();
        }
    }  
    else {
        System.out.print("Nilai yang dimasukkan tidak valid");
    }
} 
}
