import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] prefixsum = new int[n];
        System.out.println("enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        prefixsum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + arr[i];
        }
        System.out.println("Prefix sum array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(prefixsum[i] + " ");
        }
        System.out.println();
        System.out.print("Enter Left Index: ");
        int left = sc.nextInt();

        System.out.print("Enter Right Index: ");
        int right = sc.nextInt();

        int sum;
        if (left == 0) {
            sum = prefixsum[right];
        } else {
            sum = prefixsum[right] - prefixsum[left - 1];
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
