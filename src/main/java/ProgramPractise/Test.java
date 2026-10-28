package ProgramPractise;

public class Test{

	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c=new Child();
		Parent pc=new Child();
		
	
		Parent.staticMethod();//parentStaticMethod
		
		p.nonStaticMethod();//non static parent method
		
		Child.child(); //childStaticMethod
		
		
		c.child1();//childNonStaticMethod
		
		pc.nonStaticMethod();//parentNonStaticMethod
		//pc.childStatic(); //childNonStaticMethod
		
		//pc.child1(); //childNonStaticMethod
		
	//pc.child1(); //childNonStaticMethod
		//pc.child(); //childStaticMethod
		//pc.childStatic(); //childStaticMethod
		
		
		System.out.println("Parent static variable: "+Parent.staticA_parent);
		System.out.println("Child static variable: "+Child.staticA_child);
		
		System.out.println("Parent non-static variable: "+p.nonStaticB_parent);
		System.out.println("Child non-static variable: "+c.nonStaticB_child);
		
		System.out.println("Parent non-static variable from child object: "+c.nonStaticB_parent);
		
		System.out.println("Parent non-static variable from parent reference to child object: "+pc.nonStaticB_parent);
		

		
		
	

	}

}
