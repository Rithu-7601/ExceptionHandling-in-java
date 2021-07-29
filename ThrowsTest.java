class Myclass {
    void display() throws InterruptedException { //checked exception
        System.out.println("DIsplay the items");
    }
}
public class ThrowsTest {
    public static void main(String[] args) throws InterruptedException {
        Myclass obj = new Myclass();
        try {
            obj.display();
       }
        catch (Exception e)
       {

       }
       obj.display();
    }
}