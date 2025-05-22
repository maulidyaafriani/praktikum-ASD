public class AntrianKRS15 {
    Mahasiswa15[] data;
    int front, rear, size, max, jumlahDiproses;

    public AntrianKRS15(int n) {
        max = n;
        data = new Mahasiswa15[max];
        front = rear = -1;
        size = 0;
        jumlahDiproses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa15 m) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = m;
        size++;
        System.out.println(m.nama + " berhasil masuk ke antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak dapat diproses!");
            return;
        }
        System.out.println("Mahasiswa yang diproses:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa15 m = data[front];
            m.tampilkanData();
            size--;
            jumlahDiproses++;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        int i = front;
        while (i != rear) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
        data[i].tampilkanData(); 
    }

    public void peek2() {
        if (size < 2) {
            System.out.println("Tidak cukup mahasiswa dalam antrian untuk ditampilkan (minimal 2).");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan:");
        int i = front;
        for (int j = 0; j < 2; j++) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa paling belakang:");
            data[rear].tampilkanData();
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDiproses() {
        return jumlahDiproses;
    }

    public int getSisaMahasiswa() {
        return 30 - jumlahDiproses;
    }
}
