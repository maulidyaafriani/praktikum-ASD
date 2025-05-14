public class StackSurat15 {
    Surat15[] stack;
    int top;
    int size;

    public StackSurat15(int size) {
        this.size = size;
        stack = new Surat15[size];
        top = -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat15 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }
    public Surat15 pop() {
        if (!isEmpty()) {
            Surat15 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dicek.");
            return null;
        }
    }
    
    public Surat15 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
            return null;
        }
    }
}