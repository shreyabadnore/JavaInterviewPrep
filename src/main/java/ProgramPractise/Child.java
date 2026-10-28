package ProgramPractise;

public class Child extends Parent {
	
	public static void child() {
		System.out.println("This is a static method Child.");
	}
	
	public void child1() {
		System.out.println("This is a non-static method Child.");
	}
	
	public static void childStatic() {
		System.out.println("This is a static method Child.");
	}
	
	static int staticA_child = 200;
	int nonStaticB_child = 100;
	int nonStaticB_parent = 500;


}
