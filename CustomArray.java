import java.util.Arrays;

public class CustomArray {
    private int[] array;
    private int size;

    public CustomArray(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // Traversal
    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Search
    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i; // Return the index of the element if found
            }
        }
        return -1; // Return -1 if the element is not found
    }

    // Insertion
    public void insert(int value) {
        if (size < array.length) {
            array[size++] = value;
            System.out.println("Element " + value + " inserted at index " + (size - 1));
        } else {
            System.out.println("Array is full. Cannot insert element.");
        }
    }

    // Deletion
    public void delete(int value) {
        int index = search(value);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            System.out.println("Element " + value + " deleted from index " + index);
        } else {
            System.out.println("Element not found. Cannot delete.");
        }
    }

    // Sorting
    public void sort() {
        Arrays.sort(array, 0, size);
        System.out.println("Array sorted in ascending order.");
    }

    // Merging
    public void merge(int[] otherArray) {
        if (size + otherArray.length <= array.length) {
            System.arraycopy(otherArray, 0, array, size, otherArray.length);
            size += otherArray.length;
            System.out.println("Arrays merged successfully.");
        } else {
            System.out.println("Merging not possible. Insufficient space in the array.");
        }
    }

    // Reversing
    public void reverse() {
        for (int i = 0, j = size - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("Array reversed.");
    }

    public static void main(String[] args) {
        CustomArray customArray = new CustomArray(10);

        customArray.insert(5);//did this instead of taking user input
        customArray.insert(3);
        customArray.insert(8);//felt complex taking the user inputs
        customArray.insert(1);//simpler

        System.out.print("Original Array: ");
        customArray.traverse();

        System.out.println("Search for value 8 at index: " + customArray.search(8));

        customArray.sort();
        System.out.print("Sorted Array: ");
        customArray.traverse();

        customArray.delete(3);
        System.out.print("Array after deletion: ");
        customArray.traverse();

        int[] anotherArray = { 10, 7, 2 };
        customArray.merge(anotherArray);
        System.out.print("Merged Array: ");
        customArray.traverse();

        customArray.reverse();
        System.out.print("Reversed Array: ");
        customArray.traverse();
    }
}
