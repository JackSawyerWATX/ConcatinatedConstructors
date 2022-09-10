// Create a Main class
public class Main {
    String x;
    String y;
    String z;
    String a;
    String b;
    String c;
  
    // Create a class constructor for the Main class
    public Main() {
      x = "Danny Boy O'Connor";
      y = "Everlast";
      z = "DJ Lethal";
      a = "House of Pain";
      b = "them";
      c = "Remember";
    }
  
    public static void main(String[] args) {
      Main boxer1 = new Main();
      
      System.out.print(boxer1.y + ", & " + boxer1.z + ", and sometimes " + boxer1.x + ".");
      System.out.println(" That's " + boxer1.a + ". " + boxer1.c + " " + boxer1.b + "?");
      
    }
  }
  