import java.util.Scanner;

public class LayananAkademikSIAKAD15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan15 antrian = new AntrianLayanan15(5);
        int pilihan;

        do {
            System.out.println("\n========= Menu Antrian Layanan Akademik =========");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Cek Antrian Paling Belakang"); // ✅ TAMBAHAN MENU
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // flush newline

            switch (pilihan) {
                case 1:
                    System.out.print("NIM    : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama   : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi  : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas  : ");
                    String kelas = sc.nextLine();
                    Mahasiswa15 mhs = new Mahasiswa15(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa15 keluar = antrian.dequeue();
                    if (keluar != null) {
                        System.out.println("Mahasiswa yang dipanggil:");
                        keluar.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.print();
                    break;
                case 5:
                    antrian.clear();
                    break;
                case 6: 
                    antrian.lihatAkhir();
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan layanan ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 7);

        sc.close();
    }
}
