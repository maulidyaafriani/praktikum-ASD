public class DataDosen15 {
    Dosen15[] dataDosen = new Dosen15[10];
    int idx;

    void tambah(Dosen15 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx++] = dsn;
        } else {
            System.out.println("Data Dosen Sudah Penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Tidak Ada Data Dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen15 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia < dataDosen[j + 1].usia) {
                    Dosen15 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void pencarianDataSequential(String nama) {
        boolean ditemukan = false;
        int hitung =0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                ditemukan = true;
                hitung++;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dengan nama '" + nama + "' tidak ditemukan.");
        }
    }
    
    void pencarianDataBinary(int usiaCari) {
        sortingASC();
        int left = 0, right = idx - 1;
        boolean ditemukan = false;
    
        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == usiaCari) {
                int awal = mid, akhir = mid;
    
                while (awal - 1 >= 0 && dataDosen[awal - 1].usia == usiaCari) {
                    awal--;
                }
                while (akhir + 1 < idx && dataDosen[akhir + 1].usia == usiaCari) {
                    akhir++;
                }
    
                int jumlah = akhir - awal + 1;
                System.out.println("Ditemukan " + jumlah + " data dengan usia " + usiaCari + ":");
                for (int i = awal; i <= akhir; i++) {
                    dataDosen[i].tampil();
                }
    
                ditemukan = true;
                break;
            } else if (usiaCari < dataDosen[mid].usia) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    
        if (!ditemukan) {
            System.out.println("Data dengan usia " + usiaCari + " tidak ditemukan.");
        }
    }
}
