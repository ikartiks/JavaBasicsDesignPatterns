import java.util.HashMap;


public class HashMapExample {
	
	
		private int color;
	 
		public HashMapExample(int color) {
			this.color = color;
		}
		
		public int hashCode(){
			return this.color;	
		}
	 
		public boolean equals(Object obj) {
			if (!(obj instanceof HashMapExample))
				return false;	
			if (obj == this)
				return true;
			return this.color == ((HashMapExample) obj).color;
		}
	 
		public static void main(String[] args) {
			HashMapExample a1 = new HashMapExample(1);
			HashMapExample a2 = new HashMapExample(2);
			HashMapExample a3 = new HashMapExample(1);
			
			System.out.println(a1.hashCode());
			//hashMap stores HashMapExample type and its quantity
			HashMap<HashMapExample, Integer> m = new HashMap<HashMapExample, Integer>();
			m.put(a1, 10);
			m.put(a1, 10);
			m.put(a3, 30);
			System.out.println(m.get(new HashMapExample(1)));//if equals commented gives null since two objects are not equal,else 10
			//same funda with hashcode since are different for diff objects
			
			System.out.println(m.get(a3));
		}

}
