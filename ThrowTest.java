class Calculator {
    public int calc(int x, int y){
        if(y == 0){

           //ArithmeticException ex = new ArithmeticException();
            ArithmeticException ex = new ArithmeticException("cant divide an integer by zero");
           throw ex;
//            throw new ArithmeticException("cant divide an integer by zero");

        }
        return x/y;
    }
}

public class ThrowTest {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        try {

            System.out.println("Result = "+ cal.calc(10, 0));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }


}

