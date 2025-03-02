import java.util.Scanner;

class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilkanData(int index) {
        System.out.println("Data Dosen ke-" + (index + 1));
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
        System.out.println("------------------------------");
    }
}

class DataDosen {
    public static void dataSemuaDosen(Dosen[] arrayOfDosen) {
        System.out.println("Data Semua Dosen:");
        int index = 0;
        for (Dosen dosen : arrayOfDosen) {
            dosen.tampilkanData(index);
            index++;
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\nJumlah Dosen:");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;

        for (Dosen dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                countPria++;
            } else {
                totalWanita += dosen.usia;
                countWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen:");
        System.out.println("Pria   : " + (countPria > 0 ? (double) totalPria / countPria : 0));
        System.out.println("Wanita : " + (countWanita > 0 ? (double) totalWanita / countWanita : 0));
    }

    public static void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen tertua = arrayOfDosen[0];

        for (Dosen dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("\nDosen Paling Tua:");
        tertua.tampilkanData(0);
    }

    public static void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen termuda = arrayOfDosen[0];

        for (Dosen dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.tampilkanData(0);
    }
}

public class TugasJB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = scanner.nextInt();
        scanner.nextLine();

        Dosen[] daftarDosen = new Dosen[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = scanner.nextLine();
            System.out.print("Nama          : ");
            String nama = scanner.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = scanner.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia          : ");
            int usia = scanner.nextInt();
            scanner.nextLine();

            daftarDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------");
        }

        DataDosen.dataSemuaDosen(daftarDosen);
        DataDosen.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen.infoDosenPalingTua(daftarDosen);
        DataDosen.infoDosenPalingMuda(daftarDosen);

        scanner.close();
    }
}
