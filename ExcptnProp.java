public class ExcptnProp {
    public static void main(String[] args) {
        int a =10, b = 0;
        int div = a/b;
        System.out.println("result = "+div);
        System.out.println("----done---");
    }

}
/*
output
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExcptnProp.main(ExcptnProp.java:4)*/
