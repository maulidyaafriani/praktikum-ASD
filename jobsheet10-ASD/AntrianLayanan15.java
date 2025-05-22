public class AntrianLayanan15 {
    Mahasiswa15[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan15(int n) {
        max = n;
        data = new Mahasiswa15[max];
        size = 0;
        front = rear = -1;
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
        System.out.println(m.nama + " berhasil masuk ke antrian. ");
    }

    public Mahasiswa15 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswa15 temp = data[front];
        size--;
        if (isEmpty()) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
        return temp;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi Antrian:");
            int i = front;
            while (i != rear) {
                data[i].tampilkanData();
                i = (i + 1) % max;
            }
            data[i].tampilkanData(); 
            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public int getJumlahAntrian() {
        return size;
    }
    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa dalam antrian terakhir ");
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }
}
