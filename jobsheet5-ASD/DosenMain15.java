import java.util.Scanner;

public class DosenMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen15 datadsn = new DataDosen15();
        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (datadsn.idx >= 10) {
                        System.out.println("Kapasitas data sudah penuh.");
                        break;
                    }
                    System.out.print("Masukkan jumlah data yang ingin ditambahkan: ");
                    int jumlah = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < jumlah; i++) {
                        if (datadsn.idx >= 10) {
                            System.out.println("Kapasitas data sudah penuh.");
                            break;
                        }
                        System.out.println("Data Dosen ke-" + (datadsn.idx + 1));
                        System.out.print("Kode Dosen       : ");
                        String kode = sc.nextLine();
                        System.out.print("Nama Dosen       : ");
                        String nama = sc.nextLine();
                        System.out.print("Jenis Kelamin (L/P): ");
                        char jk = sc.next().toUpperCase().charAt(0);
                        boolean jenisKelamin = jk == 'L';
                        System.out.print("Usia             : ");
                        int usia = sc.nextInt();
                        sc.nextLine();

                        Dosen15 dsn = new Dosen15(kode, nama, jenisKelamin, usia);
                        datadsn.tambah(dsn);
                        System.out.println("----------------------------------");
                    }
                    break;

                case 2:
                    datadsn.tampil();
                    break;

                case 3:
                    datadsn.sortingASC();
                    System.out.println("Data Dosen Diurutkan (Termuda ke Tertua):");
                    datadsn.tampil();
                    break;

                case 4:
                    datadsn.sortingDSC();
                    System.out.println("Data Dosen Diurutkan (Tertua ke Termuda):");
                    datadsn.tampil();
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }

        } while (pilihan != 5);

        sc.close();
    }
}
