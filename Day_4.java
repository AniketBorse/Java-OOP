Q. 1

package Day_4;

class First{
	int num = 10;
	void disp() {
		System.out.println(num);
	}
	
	First(){
		System.out.println("Default Constructor First");
	}
}

class Second{
	int num1 = 20;
	void disp() {
		System.out.println(num1);
	}
	
	Second(){
		System.out.println("Default Constructor Second");
	}
}

public class Two {
	public static void main(String[] args) {
		First f1 = new First();
		Second s1 = new Second();
		
		f1.disp();
		s1.disp();
	}
}

Q. 2

package Day_4;

class Myclass{
	static int a = 10;
	int b = 20;
	
	static void disp() {
		System.out.println(a);
	}
	void disp1() {
		System.out.println(b);
	}
}

public class Q2 {
	public static void main(String[] args) {
		Myclass m1 = new Myclass();
		
		Myclass.disp();
		m1.disp1();
	}
}

Q. 3

package Day_4;

class Check{
	int a = 10;
	public int b =20;
	protected int c = 30;
	private int d = 40;
	
	public void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d); // Cannot be accessed directly
	}
}

public class CheckDemo {
	public static void main(String[] args) {
		Check c1 = new Check();
		c1.disp();
	}
}

Q. 4

package Day_4;

class A{
	int num1 = 10;
	
	void disp1() {
		System.out.println(num1);
	}
	
	A(){
		System.out.println("Default constructor of A");
	}
}

class B extends A{
int num2 = 20;
	
	void disp2() {
		System.out.println(num2);
	}
	
	B(){
		System.out.println("Default constructor of B");
	}
}

public class Q4 {
	public static void main(String[] args) {
		B b = new B();
		b.disp1();
		b.disp2();
	}
}

Q. 5

package Day_4;

class L{
	int num1 = 10;
	
	void disp1() {
		System.out.println(num1);
	}
	
	L(){
		System.out.println("Default constructor of L");
	}
}

class M extends L{
	int num2 = 20;
	
	void disp2() {
		System.out.println(num2);
	}
	
	M(){
		System.out.println("Default constructor of M");
	}
}

class N extends M{
	int num3 = 30;
	
	void disp3() {
		System.out.println(num3);
	}
	
	N(){
		System.out.println("Default constructor of N");
	}
}

public class Q5 {
	public static void main(String[] args) {
		N c = new N();
		c.disp1();
		c.disp2();
		c.disp3();
	}
}

Q. 6

package Day_4;

class base{
	int num1 = 10;
	
	void disp1() {
		System.out.println(num1);
	}

	public base() {
		System.out.println("Default constructor base");
	}
	
}

class sub1 extends base{
	int num2 = 20;
	
	void disp2() {
		System.out.println(num2);
	}
	
	public sub1() {
		System.out.println("Default constructor sub1");
	}
}

class sub2 extends base{
	int num3 = 20;
	
	void disp3() {
		System.out.println(num3);
	}
	
	public sub2() {
		System.out.println("Default constructor sub2");
	}
}

public class Q6 {
	public static void main(String[] args) {
		sub1 s1 = new sub1();
		sub2 s2 = new sub2();
		
		s1.disp1();
		s1.disp2();
		s2.disp1();
		s2.disp3();
	}
}

Q. 7

package Day_4;

class Parent{
	Parent disp() //Overridden method 
	{
		System.out.println("Parent class method");
		return null;
	}
}

class Child extends Parent{
	int num2 = 10;
	
	Child disp() //Overriding method
	{
		System.out.println("Child class method");
		return null;
	}
}

public class Q7 {
	public static void main(String[] args) {
		Child c = new Child();
		c.disp();
	}
}

Q. 8

package Day_4;

class X{
	void disp(int a, int b) {
		System.out.println(a + " " + b);
	}
}

class Y extends X{
	void disp(int b) {
		System.out.println(b);
	}
}

public class Q8 {
	public static void main(String[] args) {
		Y y = new Y();
		y.disp(20, 30);
		y.disp(10);
	}
}

Q. 9

package Day_4;

class Shape{
	Shape draw() {
		System.out.println("Draw Shape");
		return null;
	}
}

class Circle extends Shape{
	Circle draw() {
		System.out.println("Draw Circle");
		return null;
	}
}

class Triangle extends Shape{
	Triangle draw() {
		System.out.println("Draw Triangle");
		return null;
	}
}

class Rectangle extends Shape{
	Rectangle draw() {
		System.out.println("Draw Rectangle");
		return null;
	}
}

public class ShapeDemo {
	public static void main(String[] args) {
		Shape ref1 = new Circle();
		Shape ref2 = new Triangle();
		Shape ref3 = new Rectangle();
		
		ref1.draw();
		ref2.draw();
		ref3.draw();
	}
}

Q. 10

package Day_4;

interface Vehicle{
	default void start() {
		System.out.println("Start Vehicle");
	}
}

class TwoWheeler implements Vehicle{
	public void start() {
		System.out.println("Start TwoWheeler");
	}
}

class ThreeWheeler implements Vehicle{
	public void start() {
		System.out.println("Start ThreeWheeler");
	}
}

class FourWheeler implements Vehicle{
	public void start() {
		System.out.println("Start FourWheeler");
	}
}

public class VDemo {
	public static void main(String[] args) {
		Vehicle ref1 = new TwoWheeler();
		Vehicle ref2 = new ThreeWheeler();
		Vehicle ref3 = new FourWheeler();
		
		ref1.start();
		ref2.start();
		ref3.start();
	}
}
