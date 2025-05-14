import java.util.Scanner;
public class MainSurat15 {
    public static void main(String[] args) {
        StackSurat15 stack = new StackSurat15(10);
        Scanner input = new Scanner(System.in);
        int menu;
        Surat15[] srtTerverif = new Surat15[10];
        int jmlVerif = 0;

        do {
            System.out.println("\n=========== MENU ===========");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar Program");
            System.out.print("Pilih : ");
            menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    System.out.println();
                    System.out.print("ID Surat : ");
                    String idSurat = input.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String namaMahasiswa = input.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis perizinan (I/S) : ");
                    char jenisIzin = input.next().charAt(0);
                    input.nextLine();
                    System.out.print("Lama waktu izin : ");
                    int durasi = input.nextInt();
                    input.nextLine();
                    Surat15 srt = new Surat15(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil dikumpulkan\n", srt.namaMahasiswa);
                    break;

                case 2:
                    Surat15 dicek = stack.pop();
                    if (dicek != null) {
                        System.out.println();
                        System.out.println("Memverifikasi surat dari " + dicek.namaMahasiswa);
                        dicek.suratDicek();
                        Surat15 temp = dicek;
                        srtTerverif[jmlVerif] = temp;
                        System.out.printf("Surat dari mahasiswa %s sudah di verifikasi.\n", dicek.namaMahasiswa);
                        jmlVerif++;
                    }
                    break;

                case 3:
                    Surat15 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("\nSurat terakhir dikumpulkan oleh : " + lihat.namaMahasiswa);
                    } else {
                        System.out.println("\nTidak ada surat yang dikumpulkan.");
                    }
                    break;

                case 4:
                    System.out.println();
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari : ");
                    String namaCari = input.nextLine();
                    boolean find = false;
                    int posisi = -1;
                    for (int j = 0; j < stack.size; j++) {
                        if (stack.stack[j] != null && stack.stack[j].namaMahasiswa.equalsIgnoreCase(namaCari)) {
                            find = true;
                            posisi = j;
                            break;
                        }
                    }
                    if (!find) {
                        for (int j = 0; j < srtTerverif.length; j++) {
                            if (srtTerverif[j] != null && srtTerverif[j].namaMahasiswa.equalsIgnoreCase(namaCari)) {
                                find = true;
                                posisi = j;
                                break;
                            }
                        }
                    }
                    if (find) {
                        if (posisi >= 0 && posisi < stack.size && stack.stack[posisi] != null) {
                            Surat15 suratDitemukan = stack.stack[posisi];
                            System.out.println("\nSurat Ditemukan : ");
                            System.out.println("ID Surat : " + suratDitemukan.idSurat);
                            System.out.println("Nama Mahasiswa : " + suratDitemukan.namaMahasiswa);
                            System.out.println("Kelas : " + suratDitemukan.kelas);
                            System.out.println("Jenis Perizinan : " + suratDitemukan.jenisIzin);
                            System.out.println("Lama Waktu Izin : " + suratDitemukan.durasi);
                        } else if (posisi >= 0 && posisi < srtTerverif.length && srtTerverif[posisi] != null) {
                            Surat15 suratDitemukan = srtTerverif[posisi];
                            System.out.println("\nSurat Ditemukan : ");
                            System.out.println("ID Surat : " + suratDitemukan.idSurat);
                            System.out.println("Nama Mahasiswa : " + suratDitemukan.namaMahasiswa);
                            System.out.println("Kelas : " + suratDitemukan.kelas);
                            System.out.println("Jenis Perizinan : " + suratDitemukan.jenisIzin);
                            System.out.println("Lama Waktu Izin : " + suratDitemukan.durasi);
                        }
                    } else {
                        System.out.println("\nSurat Mahasiswa " + namaCari + " tidak ditemukan dalam daftar surat.");
                    }
                    break;

                case 5:
                    System.out.println("\nTerima kasih, program selesai.");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid, silakan coba lagi.");
            }
        } while (menu != 5);
    }
}