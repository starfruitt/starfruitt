import java.util.Scanner;

public class MergeLists {

    // Method to merge two sorted lists
    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        int i = 0, j = 0, k = 0;

        // Merge lists while there are elements in both
        while (i < list1.length && j < list2.length) {
            if (list1[i] <= list2[j]) {
                mergedList[k++] = list1[i++];
            } else {
                mergedList[k++] = list2[j++];
            }
        }

        // Copy remaining elements of list1
        while (i < list1.length) {
            mergedList[k++] = list1[i++];
        }

        // Copy remaining elements of list2
        while (j < list2.length) {
            mergedList[k++] = list2[j++];
        }

        return mergedList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first list
        System.out.print("Enter list1 size and contents: ");
        int list1Size = scanner.nextInt();
        int[] list1 = new int[list1Size];
        for (int i = 0; i < list1Size; i++) {
            list1[i] = scanner.nextInt();
        }

        // Input second list
        System.out.print("Enter list2 size and contents: ");
        int list2Size = scanner.nextInt();
        int[] list2 = new int[list2Size];
        for (int i = 0; i < list2Size; i++) {
            list2[i] = scanner.nextInt();
        }

        // Merge the lists
        int[] mergedList = merge(list1, list2);

        System.out.print("The merged list is: ");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
