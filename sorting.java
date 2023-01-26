public class sorting {

    static int a[] = { 7, 3, 21, 8, 4, 9 };
    static int x = a.length;
    static int temp;

    public static void main(String args[]) {
        bubbleSort();
        selectionSort();
        insertionSort();
    }

    static void bubbleSort() {
        // bubble sort
        // time complexity = O(n^2)
        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < x - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // swap
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Bubble Sort : ");
        for (int i = 0; i < x; i++) {
            System.out.println(a[i] + " ");
        }
    }

    static void selectionSort() {
        // Selection sort
        // time complexity = O(n^2)
        for (int i = 0; i < x; i++) {
            int smallest = i;
            for (int j = i + 1; j < x; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }

        System.out.println("Selection Sort : ");
        for (int i = 0; i < x; i++) {
            System.out.println(a[i] + " ");
        }
    }

    static void insertionSort() {
        // Insertion Sort
        // time complexity = O(n^2)
        for (int i = 0; i < x; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j]) {
                a[j + 1] = a[j];
                j--;
            }

            // placement
            a[j + 1] = current;
        }

        System.out.println("Insertion Sort : A");
        for (int i = 0; i < x; i++) {
            System.out.println(a[i] + " ");
        }
    }

}
