import java.util.Scanner;

class Dosen {
    private String idDosen;
    private String nama;
    private boolean statusAktif;
    private int tahunBergabung;
    private String bidangKeahlian;
    
    public Dosen() {
        this.idDosen = "";
        this.nama = "Unknown";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "Tidak Diketahui";
    }

    public Dosen(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    public void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status aktif berhasil diubah.");
    }
    
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi: " + bidang);
    }
}

public class DosenMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan data dosen pertama:");
        System.out.print("ID Dosen: ");
        String id1 = scanner.nextLine();
        System.out.print("Nama: ");
        String nama1 = scanner.nextLine();
        System.out.print("Status Aktif (true/false): ");
        boolean status1 = scanner.nextBoolean();
        System.out.print("Tahun Bergabung: ");
        int tahun1 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Bidang Keahlian: ");
        String bidang1 = scanner.nextLine();
        
        Dosen dosen1 = new Dosen(id1, nama1, status1, tahun1, bidang1);

        System.out.println("Masukkan data dosen kedua:");
        System.out.print("ID Dosen: ");
        String id2 = scanner.nextLine();
        System.out.print("Nama: ");
        String nama2 = scanner.nextLine();
        System.out.print("Status Aktif (true/false): ");
        boolean status2 = scanner.nextBoolean();
        System.out.print("Tahun Bergabung: ");
        int tahun2 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Bidang Keahlian: ");
        String bidang2 = scanner.nextLine();
        
        Dosen dosen2 = new Dosen(id2, nama2, status2, tahun2, bidang2);

        System.out.println("=== Informasi Dosen 1 ===");
        dosen1.tampilInformasi();
        
        System.out.println("=== Informasi Dosen 2 ===");
        dosen2.tampilInformasi();
        
        
        System.out.print("Masukkan tahun saat ini untuk menghitung masa kerja Dosen 1: ");
        int tahunSekarang = scanner.nextInt();
        System.out.println("Masa kerja Dosen 1: " + dosen1.hitungMasaKerja(tahunSekarang) + " tahun");
        
        scanner.nextLine(); 
        System.out.print("Masukkan bidang keahlian baru untuk Dosen 2: ");
        String bidangBaru = scanner.nextLine();
        dosen2.ubahKeahlian(bidangBaru);
        
        System.out.print("Ubah status aktif Dosen 1 (true/false): ");
        boolean statusBaru = scanner.nextBoolean();
        dosen1.setStatusAktif(statusBaru);
        
        
        System.out.println("=== Informasi Setelah Perubahan Dosen 1 ===");
        dosen1.tampilInformasi();
        
        System.out.println("=== Informasi Setelah Perubahan Dosen 2 ===");
        dosen2.tampilInformasi();
        
        scanner.close();
    }
}
