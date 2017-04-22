
public class EqualAndDoubleEquals {
	
	int x ;
	
	EqualAndDoubleEquals(int x){
		this.x=x;
	}
	
	public static void main(String[] args) {
		
		int x= 1;
		int y=1;
		System.out.println(x==y);//true
		
		/*Object x1=new Object();
		Object y1=new Object();
		System.out.println(x1==y1);//false
		System.out.println(x1.equals(y1));//false
		*/
		EqualAndDoubleEquals a=new EqualAndDoubleEquals(1);
		EqualAndDoubleEquals a1=new EqualAndDoubleEquals(1);
		EqualAndDoubleEquals b=new EqualAndDoubleEquals(2);
		System.out.println(a==b);//false == true if same mem location
		System.out.println(a.equals(b));//false
		System.out.println(a.equals(a1));//false
		
		System.out.println(a.hashCode());//different hashcodes
		System.out.println(b.hashCode());
		
		//Note that it is generally necessary to override the hashCode method whenever this method is overridden, 
		//so as to maintain the general contract for the hashCode method,
		//which states that equal objects must have equal hash codes.
		
		a=b;
		System.out.println(a==b);//true
		System.out.println(a.equals(b));//true
		
		String personalLoan=new String ("cheap personal loans");
		String homeLoan =new String ("cheap personal loans");
		      
		System.out.println(personalLoan == homeLoan);//false
		System.out.println(personalLoan.equals(homeLoan));//true
		      
		homeLoan = personalLoan;
		//since both homeLoan and personalLoand reference variable are pointing to same object
		//"==" should return true
		System.out.println(homeLoan == personalLoan);//true
		
		String s="cheap personal loans";
		String d="cheap personal loans";
		System.out.println(s==d);//true
		s+="lol";
		System.out.println(s);//cheap personal loanslol
		System.out.println(d);//cheap personal loans
		System.out.println(s==d);//false
	}
}
