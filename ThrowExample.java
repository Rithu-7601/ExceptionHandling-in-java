import java.util.Scanner;

class Age extends RuntimeException{
    Age() {}
    Age(String msg){
        super(msg);
    }
}

public class ThrowExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String isInQueue = "Y";

        while(isInQueue.equalsIgnoreCase("Y")) {
            try {
                System.out.println("enter age: ");
                int age = sc.nextInt();
                if (age < 18) {
                    throw new Age("not eligible");
                } else {

                    System.out.println("VOting done - eligible");
                }

        }
            catch(Exception e){
                System.out.println("Exception: "+e.toString());
            }
            System.out.println("any voter in queue ");
            isInQueue = sc.next();
        }
        System.out.println("voting completed");

    }
}
