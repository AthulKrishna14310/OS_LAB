public class RMI_Server{
   public static void main(String[] args)throws Exception {
      Calculator c=new CalculatorImplement();
      java.rmi.Naming.rebind("rmi://localhost:1099/CalculatorService",c);
  }
}
