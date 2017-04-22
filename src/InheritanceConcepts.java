public class InheritanceConcepts extends As{
	
	public InheritanceConcepts() {
		
	}
	
	public InheritanceConcepts(int x,int y) {
		
		super(x);
		this.y=y;
	}
	
	
	
	int y;
	
	
	
	void someOtherMethod(){
		System.out.println("some other method");
	}
	
	void someMethod(){
		
		//x and y on the object that is calling it
		System.out.println("overriden method");
		System.out.println();
		System.out.println(x+"-"+y);//this.x+"-"+this.y
	}
	
	public static void main(String args[]){
		As as=new InheritanceConcepts();
		as.someMethod();//overriden method,0,0
		
		as=new InheritanceConcepts(2,3);
		as.someMethod();//overriden method
	}
}

 class As{
	 
	 int x;
	 
	As(){}
	
	As(int x){
		this.x=x;
		}
	
	void someMethod(){
		System.out.println("some method");
	}
	
}
