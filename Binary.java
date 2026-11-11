import java.util.*;
public class Binary {
    static int binarySearch(int arr[], int size, int key) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low +high)/2;

            if (arr[mid] == key) {
                return mid; 
            } else if (arr[mid] < key) {
                low = mid + 1; 
            } else {
                high= mid - 1; 
            }
        }

        return -1; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key=sc.nextInt();
        int result=binarySearch(arr,size,key);
        System.out.println("The element is found at index: "+result);
        sc.close();
    }
}
