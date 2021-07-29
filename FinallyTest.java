import java.util.Scanner;

public class FinallyTest
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter the first no. = ");
            int fno = sc.nextInt();

            System.out.println("enter the second no. = ");
            int sno = sc.nextInt();

            int div = fno / sno;
            System.out.println("divide = " + div);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("inside finally block");
            System.out.println("done by");
            System.out.println("java developer");
        }
        System.out.println("-----finished-----");

    }

}
