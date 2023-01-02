public class VarEx2 {
  public static void main(String[] args) {
    int x = 10, y = 20;
    int tem;
    
    System.out.println("x: " + x + " y: " + y);

    tem = x;
    x = y;
    y = tem;

    System.out.println("x: " + x + " y: " + y);
  }
  
}
