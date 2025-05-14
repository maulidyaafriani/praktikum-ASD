public class StackTugasMahasiswa15 {
    Mahasiswa15[] stack;
    int size, top;

    StackTugasMahasiswa15(int size) {
        this.size = size;
        this.stack = new Mahasiswa15[size];
        this.top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Mahasiswa15 mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
        } else {
            System.out.println("Stack penuh. Tidak dapat menambahkan tugas.");
        }
    }

    Mahasiswa15 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong. Tidak ada tugas yang bisa dinilai.");
            return null;
        }
    }

    Mahasiswa15 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
        } else {
            System.out.println("Stack kosong.");
        }
    }

    Mahasiswa15 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }

    public void konversiDesimalKeBiner(int kode) {
        StackKonversi15 biner = new StackKonversi15(10);
        while (kode > 0) {
            int sisa = kode % 2;
            biner.push(sisa);
            kode = kode / 2;
        }
        System.out.print("Nilai dalam biner: ");
        while (!biner.isEmpty()) {
            System.out.print(biner.pull());
        }
        System.out.println();
    }
}
