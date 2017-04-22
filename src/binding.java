
class SuperClass{
	public String someVariable = "Some Variable in SuperClass";
}

class SubClass extends SuperClass{
	public String someVariable = "Some Variable in SubClass";
}

public class binding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SuperClass superClass1 = new SuperClass();
		SuperClass superClass2 = new SubClass();

		System.out.println(superClass1.someVariable);
		System.out.println(superClass2.someVariable);
		
		/*op
		Some Variable in SuperClass
		Some Variable in SuperClass
		since polymorphism is only for methods not instance variables*/ 

	}
}
