interface Ax {
	
	int i = 1; 
	int ml();
	
}
interface B extends Ax {

	int i = 10; 
	int ml();
	
}

class C implements B {
public int ml() {
	return i;
}

public static void main(String[] args) {
	System.out.print(new C().ml());
	}

}
