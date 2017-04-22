class CloneExample  implements Cloneable{
	int rollno;
	String name;

	CloneExample(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		return null;
	}

	public static void main(String args[]) {
		try {
			CloneExample s1 = new CloneExample(101, "amit");

			CloneExample s2 = (CloneExample) s1.clone();

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}