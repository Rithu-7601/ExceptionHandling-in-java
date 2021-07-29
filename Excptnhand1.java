public class Excptnhand1
{
    public static void main(String[] args) {

        //to know the no. of cmd line arguments

        System.out.println("no. of cmd line arguments = "+args.length);
        for(String arg : args){
            System.out.println(arg);
        }

        String s1 = "456";
        System.out.println(s1 + 25);

        // parsing is the process of converting data in String form to any numeric type

        int n = Integer.parseInt(s1);
        System.out.println(n+25);

        int l = Integer.parseInt("A");
        System.out.println(l+25);//java.lang.NumberFormatException

    }
}
//output
/*
no. of cmd line arguments = 3
10
        20
        abc
        45625
        481
        Exception in thread "main" java.lang.NumberFormatException: For input string: "A"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.base/java.lang.Integer.parseInt(Integer.java:652)
        at java.base/java.lang.Integer.parseInt(Integer.java:770)
        at Excptnhand1.main(Excptnhand1.java:20)*/