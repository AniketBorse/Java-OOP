Q. 1

package Day_5;

class A{
	
	A(int a){
		System.out.println("Paramterized Constructor A having parameter "+a);
	}
	
}

class B extends A{
	B(){
		super(20);
		System.out.println("Constructor of B");
	}
}

class C extends B{
	C(){
		System.out.println("Constructor of C");
	}
}

public class Q1 {
	public static void main(String[] args) {
		C c = new C();
	}
}

Q. 2

package Day_5;

class Vehicle {
	public void start() {
		System.out.println("Start Vehicle");
	}
}

class FourWheeler extends Vehicle{
	public void start() {
		super.start();
		System.out.println("Start Four Wheeler");
	}
}

Q. 3

package Day_5;

class base{
	base(){
		System.out.println("Default constructor of base");
	}
}

class sub1 extends base{
	sub1(){
		System.out.println("Default constructor of sub1");
	}
}

class sub2 extends base{
	sub2(){
		System.out.println("Default constructor of sub2");
	}
}

public class Q3 {
	public static void main(String[] args) {
		sub1 s1 = new sub1();
		sub2 s2 = new sub2();
	}
}

public class Q2 {
	public static void main(String[] args) {
		FourWheeler f = new FourWheeler();
		f.start();
	}
}

Q. 4

package Day_5;

class Top1{
	void disp1() {
		
	}
}

class Bottom1 extends Top1{
	void disp1() {
		System.out.println("Display Bottom1");
	}
}

class Bottom2 extends Top1{
	void disp1() {
		System.out.println("Display Bottom2");
	}
}

class Bottom3 extends Top1{
	void disp1() {
		System.out.println("Display Bottom3");
	}
}

public class Q4 {
	public static void main(String[] args) {
		Bottom1 b1 = new Bottom1();
		b1.disp1();
		Bottom2 b2 = new Bottom2();
		b2.disp1();
		Bottom3 b3 = new Bottom3();
		b3.disp1();
	}
}

Q. 5

package Day_5;

abstract class Shape{
	abstract void draw();
}

class Triangle extends Shape{
	void draw() {
		System.out.println("Draw Triangle");
	}
}

class Polygon extends Shape{
	void draw() {
		System.out.println("Draw Polygon");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Draw Circle");
	}
}

public class Q5 {
	public static void main(String[] args) {
		Shape arr[] = new Shape[3];
		
		arr[0] = new Triangle();
		arr[1] = new Polygon();
		arr[2] = new Circle();
		
		for(int i = 0; i<arr.length; i++) {
			arr[i].draw();
		}
	}
}

Q. 6

package Day_5;

interface A{
	abstract void disp1();
}

interface B extends A{
	abstract void disp2();
}

class C implements B{
	public void disp1() {
		System.out.println("Display 1 of C");
	}
	public void disp2() {
		System.out.println("Display 2 of C");
	}
}

public class Q6 {
	public static void main(String[] args) {
		C c = new C();
		c.disp1();
		c.disp2();
	}
}

Q. 7

package Day_5;

class Parent1{
	void disp1() {
		
	}
	
	void disp2() {
		
	}
}

interface Parent2{
	abstract void disp3();
	abstract void disp4();
}

class Child extends Parent1 implements Parent2{
	void disp1() {
		System.out.println("Display 1");
	}
	void disp2() {
		System.out.println("Display 2");
	}
	public void disp3() {
		System.out.println("Display 3");
	}
	public void disp4() {
		System.out.println("Display 4");
	}
}
public class Q7 {
	public static void main(String[] args) {
		Child c = new Child();
		c.disp1();
		c.disp2();
		c.disp3();
		c.disp4();
	}
}

Q. 8

package Day_5;

class base1{
	base1(int a){
		System.out.println("1 parameter of base class " + a);
	}
}

class sub1 extends base1{
	sub1(){
		this(10);
		System.out.println("Default Constructor");
	}
	sub1(int a){
		this(10, 20);
		System.out.println("1 Parameter "+a);
	}
	sub1(int b, int c){
		super(30);
		System.out.println("2 Parameters "+b+" "+c);

	}
}

public class Q8 {
	public static void main(String[] args) {
		sub1 s1 = new sub1();
	}
}

Q. 9

package Day_5;

interface Game{
	abstract void play();
}

class Cricket implements Game{
	public void play() {
		System.out.println("Play Cricket");
	}
}

class Football implements Game{
	public void play() {
		System.out.println("Play Football");
	}
}

class Tennis implements Game{
	public void play() {
		System.out.println("Play Tennis");
	}
}

public class Demo {
	static void perform(Game g) {
		g.play();
	}
	public static void main(String[] args) {
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());
	}
}
