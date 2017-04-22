import java.lang.reflect.Method;


public class TestPrivateAccessMain {
	
	public static void main(String[] args)throws Exception{  
		
		TestPrivateAccess testPrivateAccess=new TestPrivateAccess();
		
	    Class c = Class.forName("TestPrivateAccess");  
	    Object o= c.newInstance();  
	    Method m =c.getDeclaredMethod("message", null);  
	    m.setAccessible(true);  
	    m.invoke(o, null);  
	}  
}
