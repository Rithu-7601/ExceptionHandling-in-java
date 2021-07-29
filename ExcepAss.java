import java.util.Scanner;

public class ExcepAss {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the no.of array elements");
        int n = sc.nextInt();
        

        int[] a = new int[5];


        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i <= 5; i++) {

            a[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.println("elements are " + a[i]);
        }




    }
}
