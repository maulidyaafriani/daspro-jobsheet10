import java.util.Scanner;
public class ModifikasiBWS {

    static String[][] penonton = new String[4][2];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    inputDataPenonton();
                    break;
                case 2:
                    tampilkanDaftarPenonton();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }

    public static void inputDataPenonton() {
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan baris (1-4): ");
        int baris = sc.nextInt();
        System.out.print("Masukkan kolom (1-2): ");
        int kolom = sc.nextInt();
        sc.nextLine(); 

        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
            System.out.println("Nomor baris atau kolom tidak tersedia. Silakan coba lagi.");
            return;
        }

        if (penonton[baris - 1][kolom - 1] != null) {
            System.out.println("Kursi tersebut sudah terisi. Silakan pilih kursi lain.");
            inputDataPenonton(); 
        } else {
            penonton[baris - 1][kolom - 1] = nama;
            System.out.println("Data penonton berhasil dimasukkan.");
        }
    }

    public static void tampilkanDaftarPenonton() {
        System.out.println("Daftar kursi penonton:");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] == null) {
                    System.out.print("*** ");
                } else {
                    System.out.print(penonton[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}



    

