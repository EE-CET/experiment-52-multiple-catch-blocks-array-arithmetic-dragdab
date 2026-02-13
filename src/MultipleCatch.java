import java.util.Scanner;
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read array size
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Read array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Read the index to access and the divisor
            int index = sc.nextInt();
            int divisor = sc.nextInt();

            // Perform the operation (potentially throws exceptions)
            int result = arr[index] / divisor;
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Triggered if the index is negative or >= array size
            System.out.println("Invalid Index");
        } catch (ArithmeticException e) {
            // Triggered if the divisor is zero
            System.out.println("Divide by zero error");
        } finally {
            sc.close();
        }
    }
}
