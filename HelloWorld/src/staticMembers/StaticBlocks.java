package staticMembers;

public class StaticBlocks {
	static int a = 5;
	static int b = 5;

	static {
		System.out.println("This is static block");
		int c = a+b;
		System.out.println(a + "+" + b + "=" + c);
	}
	
	public static void main(String[] args) {
		int d = 15;
		int c = a+b+d;
		System.out.println(a + "+" + b + "+" + d + "=" + c);

	}

}
