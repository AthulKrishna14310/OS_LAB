public class RMI_Client {
  public static void main(String args[])throws Exception{
    Calculator c=(Calculator)java.rmi.Naming.lookup("rmi://localhost/CalculatorService");
    System.out.println("Subtract : "+c.sub(18,10));
    System.out.println("Add : "+c.add(18,10));
    System.out.println("Multiply : "+c.mul(18,10));
    System.out.println("Divide : "+c.div(18,6));
    }
}
