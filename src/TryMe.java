/*public class TryMe {
    
    public static void printB(String str) {
         System.out.print(Boolean.valueOf(str) ? "true" : "false"); 
    }
    
    public static void main(String args[]) {
        printB("tRuE");
        printB("false");
        
        
    }
}//truefalse
*/

public class TryMe {
       /*static*/ Integer A;
       int a;
       public TryMe(int a) {
           this.a = A + a;//Exception in thread "main" java.lang.NullPointerException
           System.out.print(this.a);//2 if static added and Integer removed from line 24
       }
       public static void main(String args[]) {        
          Integer A = new Integer(1);
          TryMe t = new TryMe(A);
      }
  }
