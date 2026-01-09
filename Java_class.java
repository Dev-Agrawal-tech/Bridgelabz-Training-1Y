public class Java_class {

	static int x=5;
	int z=6;
		
		public static void m2(){
			int y=30;
			System.out.println("m2 local var" + y);
		}
		
		public static void m1() {
			int y=20;
			System.out.println("m1 local var" + y);
			m2();
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x=50;
		int y=10;
		System.out.println("Helloworld");
		System.out.println("main static var x " + x);
		System.out.println("main static var y " + y);
		m1();
		
		
		Java_class obj=new Java_class();
		System.out.println("instance/non-static/object-level var " + obj.z );
		
	}

}