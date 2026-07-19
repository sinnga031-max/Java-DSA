import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxRight = arr[n - 1];
        System.out.print("Leaders:");
        System.out.print(maxRight + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                System.out.print(arr[i] + " ");
                maxRight = arr[i];
            }
        }
        sc.close();
    }
}
