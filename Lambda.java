/*
1) define a functional interface "First" with an abstract method "void disp1()" , default method "void disp2()" and a static method "void disp3()"

inside main function using lambda expression invoke "disp1()" and "disp2()" methods.
also invoke "disp3()" method inside main.
*/

package Day_14;

interface First{
	void disp1();
	
	default void disp2() {
		System.out.println("Display 2");
	}
	
	static void disp3() {
		System.out.println("Display 3");
	}
}

public class Q1 {
	public static void main(String[] args) {
		First f = ()->{System.out.println("Display 1");};
		f.disp1();
		
		First f1 = ()->{};
		f1.disp2();
		
		First f2 = ()->{First.disp3();};
		First.disp3();
	}
}

*
2) define a functional interface "Second" with an abstract method "void disp4()".

define a class Demo with main function.
inside main function create two implementations of "Second" using lambda expression and display their names.
*/

package Day_14;

interface Second{
	void disp4();
}

public class Demo {
	public static void main(String[] args) {
		Second s = ()->{System.out.println("Display 1");};
		s.disp4();
		
		Second s1 = ()->{System.out.println("Display 2");};
		s1.disp4();
	}
}

/*
3) define a functional interface "MyInterface" with an abstract method "void fun()"

define a class Demo with two functions "static void perform" and main.

from main function pass lambda expression, collect it in "perform" method and invoke "fun()" function.
*/

package Day_14;

interface MyInterface{
	void fun();
}

public class Demo1 {
	static void perform() {
		System.out.println("My Function");
	}
	
	public static void main(String[] args) {
		MyInterface m = ()->{perform();};
		m.fun();
	}
}

/*
4) define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
define a class "CalcDemo" with main method.
inside main using lambda create an implementation of "Calculator" , invoke "multiply()" method and display its result.
*/

package Day_14;

interface Calculator{
	int multiply(int a, int b);
}

public class CalcDemo {
	public static void main(String[] args) {
		Calculator c = (a, b)->{
			return a*b;
		};
		System.out.println(c.multiply(3, 9));
	}
}

/*
5) define a class "Display" with "void disp" method. inside this method display values from 1 to 10.

create an implementation of "Runnable" using lambda expression which will invoke "disp()" method of "Display" class.

create 2 threads and pass above created "Runnable" implementation to these threads.
make sure while one thread is executing other thread will not interfere.
*/

package Day_14;

class Disp{
	synchronized void disp() {
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
	}
}

public class Q5 {
	public static void main(String[] args) {
		Disp d = new Disp();
		Runnable r = ()->{d.disp();};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
}