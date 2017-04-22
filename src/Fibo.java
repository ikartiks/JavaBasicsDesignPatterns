
public class Fibo {
	
	// 0 1 1 2 3 5 8 13 fiboonachi series 
	// 0 1 2 3 4 5 6 7	 indexes
	static int fibon(int n){
		
		if(n==0)
			return 0;
		
		if(n==1)
			return 1;
		
		return fibon(n-1)+fibon(n-2);
		
	}
	
	static void printFibo(int x) {
		
		int firstNo=0;
		int secNo=1;
		
		System.out.print(firstNo+" "+secNo);
		
		//6
		int i=2;
		while (i<=x){
			
			int thirdNo=firstNo+secNo;
			
			firstNo=secNo;
			secNo=thirdNo;
			
			System.out.print(" "+thirdNo);
			i++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fibon(6));
		printFibo(6);
	}

}
