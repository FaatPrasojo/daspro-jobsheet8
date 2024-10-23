import java.util.Scanner;
public class Tugas2_08 {
    public static void main(String[] args) {
        Scanner prasojo = new Scanner(System.in);
        String nama;

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jmlh = prasojo.nextInt();
        System.out.println();

            int x;
            for (x = 1;x <= jmlh;x++) {
                System.out.println("================= POLITEKNIK KE " + x + " =================");
                if (x==1) {
                prasojo.nextLine();
                } int y,z;
                for (y = 0;y <= 5;y++) {
                    if (y == 0 && x >= 1 && x <= jmlh) {
                        System.out.println("---- Masukkan nama atlet pada cabor Badminton ----");
                        for (z = 1;z <= 5;z++) {
                            System.out.print("Nama atlet ke-" + z + ": ");
                            nama = prasojo.nextLine();
                        }
                    } 
                    if (y == 1 && x >= 1 && x <= jmlh) {
                        System.out.println("---- Masukkan Nama Atlet Pada Cabor Tenis Meja ----");
                        for (z = 1;z <= 5;z++) {
                            System.out.print("Nama atlet ke-" + z + ": ");
                            nama = prasojo.nextLine();
                        }
                    } 
                    if (y == 2 && x >= 1 && x <= jmlh) {
                        System.out.println("---- Masukkan nama atlet pada cabor Basket ----");
                        for (z = 1;z <= 5;z++) {
                            System.out.print("Nama atlet ke-" + z + ": ");
                            nama = prasojo.nextLine();
                        }
                    } 
                    if (y == 3 && x >= 1 && x <= jmlh) {
                        System.out.println("---- Masukkan nama atlet pada cabor Bola Voli ----");
                        for (z = 1;z <= 5;z++) {
                            System.out.print("Nama atlet ke-" + z + ": ");
                            nama = prasojo.nextLine();
                        }
                        System.out.println();
                    }
                }
            }
    }
}