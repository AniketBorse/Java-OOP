/*1) define a functional interface "First" with an abstract method "void disp1()".
define a class "Second" with a method "void fun1()"

inside main function create a method reference for "First" and invoke "fun1" of "Second"*/

package Day_15;

interface First{
	void disp1();
}

class Second{
	void fun1() {
		System.out.println("Function 1");
	}
}

public class Q1 {
	public static void main(String[] args) {
		Second s = new Second();
		First f = s::fun1;
		f.disp1();
	}
}


/*2) define a functional interface "Third" with an abstract method "void show(int num)".
define a class "Sample" with a method "void disp(int num)"

inside main function create a method reference for "Third" and invoke "disp" of "Sample" by passing a value "500".*/

package Day_15;

interface Third{
	void show(int k);
}

class Sample{
	void disp(int num) {
		System.out.println(num);
	}
}

public class Q2 {
	public static void main(String[] args) {
		Sample s = new Sample();
		Third t = s::disp;
		t.show(500);
	}
}


/*3) define a functional interface "Fifth" with an abstract method "int add(int a,int b)"
define a class Math1 with a method "int calc(int a,int b)" 

inside main function invoke "calc" method with the help of
	a) lamdba expression
	b) method reference*/

package Day_15;

interface Fifth{
	int add(int a, int b);
}

class Math1{
	int calc(int a, int b) {
		return a+b;
	}
}

public class Q3 {
	public static void main(String[] args) {
		Math1 m = new Math1();
		Fifth f = (a, b)->{return m.calc(a, b);};
		System.out.println(f.add(10, 40));
		
		Fifth f1 = m::calc;
		System.out.println(f1.add(10, 50));
	}
}

/*4) define a functional interface "Sixth" with an abstract method "void disp5()".
define a class "Sample" with a static method "void fun1()"

inside main function create a method reference for "Sixth" and invoke "fun1" of "Sample"*/

package Day_15;

interface Sixth{
	void disp5();
}

class Sample1{
	static void fun1() {
		System.out.println("Function 1");
	}
}

public class Q4 {
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		Sixth ref = Sample1::fun1;
		ref.disp5();
	}
}
