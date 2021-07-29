import java.lang.reflect.Array;

public class Except4 {
    public static void main(String[] args) {

        /*String str = "abc";

        System.out.println(str);//abc
        System.out.println(str.length());//3

        String str1 = null;
        System.out.println(str1);//null
        System.out.println(str1.length());//Exception in thread "main" java.lang.NullPointerException at Except4.main(Except4.java:11)*/
        try {

            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int divide = x / y;
            System.out.println("divide = " + divide);

        } catch (Exception e) {
           // System.out.println("Exception Occured!");//Exception Occured!
            //System.out.println("Message = "+e.getMessage());//Message = / by zero

            //object_type with message
            //System.out.println("toString = "+e.toString());//toString = java.lang.ArithmeticException: / by zero

           //toString() + callstack
            //e.printStackTrace();//java.lang.ArithmeticException: / by zero at Except4.main(Except4.java:6)

            if(e instanceof ArrayIndexOutOfBoundsException)
            {
                System.out.println("***sufficient arguments are not provided***");
            }
            else if(e instanceof NumberFormatException){
                System.out.println("***provide numbers***");
            }
            else if(e instanceof ArithmeticException){
                System.out.println("***Check your values***");
            }

        }

        System.out.println("----done--------");
    }
}
