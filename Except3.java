class Except3 {

    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int divide = x / y;
            System.out.println("divide = " + divide);//java.lang.ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("cannot divide a number by 0");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("provide minimum 2 cmd args");
        }
        catch (NumberFormatException e) {
            System.out.println("provide whole numbers as cmd args ");
        }
        System.out.println("----done--------");
    }
}

