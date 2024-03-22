public class Stack {
    private int[] stck;
    private int index;


    public Stack() {
        stck = new int[10];
        index = -1;
    }

    public void push(int item) {
        if (index == 9) {
            System.out.println("Stack penuh, push gagal.");
        } else {
            stck[++index] = item;
        }
    }

    public int pop() {
        if (index < 0) {
            System.out.println("Stack kosong, pop gagal.");
            return -1;
        } else {
            return stck[index--];
        }
    }

    public void display() {
        if (index < 0) {
            System.out.println("Stack kosong.");
        } else {
            for (int i = 0; i <= index; i++) {
                System.out.print(stck[i] + " ");
            }
            System.out.println();
        }
    }
}
