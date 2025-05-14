public class StackKonversi15 {
    int[] stack;
    int size, top;

    StackKonversi15(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(int data) {
        if (!isFull()) {
            stack[++top] = data;
        } else {
            System.out.println("Stack konversi penuh.");
        }
    }

    int pull() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack konversi kosong.");
            return -1;
        }
    }
}
