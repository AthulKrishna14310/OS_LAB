
public class CalculatorImplement extends
 java.rmi.server.UnicastRemoteObject implements Calculator{

      public CalculatorImplement()throws Exception{
        super();
      }
      public  int add(int a,int b)throws Exception{
        return a+b;
      }
      public  int sub(int a,int b)throws Exception{
        return a-b;
      }
      public  int mul(int a,int b)throws Exception{
          return a*b;
      }
      public  int div(int a,int b)throws Exception{
          return a/b;
      }

}
