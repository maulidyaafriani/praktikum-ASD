import java.util.Scanner;

public class KRSMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS15 antrian = new AntrianKRS15(10);
        int pilih;

        do {
            System.out.println("\n=== Menu Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa sekaligus)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Paling Belakang");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cek Jumlah Antrian");
            System.out.println("8. Cek Jumlah yang Sudah Diproses");
            System.out.println("9. Cek Sisa Mahasiswa Belum Proses (max 30)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    if (antrian.getJumlahDiproses() >= 30) {
                        System.out.println("Kuota proses KRS oleh DPA sudah terpenuhi!");
                        break;
                    }
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa15 m = new Mahasiswa15(nim, nama, prodi, kelas);
                    antrian.enqueue(m);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.printAll();
                    break;
                case 4:
                    antrian.peek2();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa yang sudah diproses: " + antrian.getJumlahDiproses());
                    break;
                case 9:
                    System.out.println("Mahasiswa yang belum proses KRS: " + antrian.getSisaMahasiswa());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}
