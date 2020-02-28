
public class BubbleSort {
    static void bubbleSort(int[] arraytest) {
        int n = arraytest.length;
        int temp = 0;

        for (int i = 0;i < n;i++) {
            for (int j = 1;j <(n-i);j++) {
                if (arraytest[j-1] > arraytest[j]) {
                    temp = arraytest[j-1];
                    arraytest[j -1] = arraytest[j];
                    arraytest[j] = temp;
                }
            }
        }
    }

public static void main(String[] args) {
        int arraytest[] = {23, 16, 3, 42, 75, 61};
        System.out.println("Array before sorting");

        for (int i = 0;i <arraytest.length;i++) {
            System.out.print(arraytest[i] + " ");
        }
        System.out.println();
        bubbleSort(arraytest);
        System.out.println("Array after bubble sort");
            for (int i = 0;i < arraytest.length;i++) {
                System.out.print(arraytest[i] + " ");
            }
}
}
