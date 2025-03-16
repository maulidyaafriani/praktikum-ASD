class Mahasiswa {
    String nama;
    String NIM;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa(String nama, String NIM, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.NIM = NIM;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
}

public class RataRataUAS15 {
    
   
    public static double hitungRataUAS(Mahasiswa[] mhs) {
        int total = 0;
        for (Mahasiswa mahasiswa : mhs) {
            total += mahasiswa.nilaiUAS;
        }
        return (double) total / mhs.length;
    }

    public static void main(String[] args) {
        Mahasiswa[] mahasiswaList = {
            new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        double rataUAS = hitungRataUAS(mahasiswaList);
        System.out.println("Rata-rata nilai UAS: " + rataUAS);
    }
}
