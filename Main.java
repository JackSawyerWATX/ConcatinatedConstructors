// Create a Main class
public class Main {
    String x;
    String y;
    String z;
  
    // Create a class constructor for the Main class
    public Main() {
      x = "Danny Boy O'Connor";
      y = "Everlast";
      z = "DJ Lethal";
    }
  
    public static void main(String[] args) {
      Main boxer1 = new Main();
      
      System.out.println(boxer1.y + ", & " + boxer1.z + ", and sometimes " + boxer1.x + ".");
      
    }
  }
  