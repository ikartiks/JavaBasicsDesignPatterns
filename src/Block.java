
public class Block {
	
	public Block() {
		System.out.println("Constructor");
	}
	
	{
		System.out.println("non static block initialised");
	}
	static {
		System.out.println("static block initialised");
	}

	public static void main(String[] args) {
		
		System.out.println("main");
		Block a=new Block();
		Block b=new Block();
		String s="asd";
		System.out.println(s.toString());
	}
}
