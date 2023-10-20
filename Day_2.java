1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
provide accessor methods on these attributes and allow them to call from outside of your class.

package Day_2;

class Shape{
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}

public class Q1 {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.setWidth(5);
		System.out.println(s1.getWidth());
		
		s1.setHeight(10);
		System.out.println(s1.getHeight());
	}
}

2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments

package Day_2;

class Myclass{
	Myclass(){
		System.out.println("Without any argument");
	}
	Myclass(int a){
		System.out.println("With one argument " + a);
	}
	Myclass(int a, int b){
		System.out.println("With two argument " + a + " and " + b);
	}
}

public class Q2 {
	public static void main(String[] args) {
		Myclass m1 = new Myclass();
		Myclass m2 = new Myclass(10);
		Myclass m3 = new Myclass(20, 30);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}
}

3) Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt ?

package Day_2;

class Emp{
	private static int cnt;
	{
		cnt++;
	}
	Emp(){
		
	}
	Emp(int a){
		
	}
	Emp(int a, int b){
		
	}
	int get() {
		return cnt;
	}
}

public class Q3 {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp(10);
		Emp e3 = new Emp(10, 20);
		System.out.println(e1.get());
	}
}

4) Define a class "DemoOb". 
create an instance of it.
now create a reference and assign the reference created in the above statement.
	Discuss what happens?
Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
(For ur discussion, write necessary comments in the program)

package Day_2;

class DemoOb{
	
}

public class Q4 {
	public static void main(String[] args) {
		DemoOb obj = new DemoOb();
		DemoOb ref1 = obj;
		ref1 = new DemoOb();
	}
}

5) Define 3 classes A , B and C
in all these classes create static and nonstatic variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the members of A ,B  and C.

package Day_2;

class A{
	static int a = 10;
	int b = 20;
	
	static void staticA(){
		System.out.println("Static method A");
	}
	
	void nonstaticB(){
		System.out.println("Non static method B");
	}
}

class B{
	static int c = 30;
	int d = 40;
	
	static void staticC(){
		System.out.println("Static method C");
	}
	
	void nonstaticD(){
		System.out.println("Non static method D");
	}
}

class C{
	static int e = 50;
	int f = 60;
	
	static void staticE(){
		System.out.println("Static method E");
	}
	
	void nonstaticF(){
		System.out.println("Non static method F");
	}
}

public class Demo {
	public static void main(String[] args) {
		System.out.println(A.a);
		A.staticA();
		
		A obj1 = new A();
		System.out.println(obj1.b);
		obj1.nonstaticB();
		
		System.out.println(B.c);
		B.staticC();
		
		B obj2 = new B();
		System.out.println(obj2.d);
		obj2.nonstaticD();
		
		System.out.println(C.e);
		C.staticE();
		
		C obj3 = new C();
		System.out.println(obj3.f);
		obj3.nonstaticF();
	}
}


6) define static initializers in the above A,B and C classes and check the order of their execution.

package Day_2;

class A{
	static int a = 10;
	int b = 20;
	
	static {
		System.out.println("Static initializer in A");
	}
	
	{
		System.out.println("Non static initializer in A");
	}
	
	static void staticA(){
		System.out.println("Static method A");
	}
	
	void nonstaticB(){
		System.out.println("Non static method B");
	}
}

class B{
	static int c = 30;
	int d = 40;
	
	static {
		System.out.println("Static initializer in B");
	}
	
	{
		System.out.println("Non static initializer in B");
	}
	
	static void staticC(){
		System.out.println("Static method C");
	}
	
	void nonstaticD(){
		System.out.println("Non static method D");
	}
}

class C{
	static int e = 50;
	int f = 60;
	
	static {
		System.out.println("Static initializer in C");
	}
	
	{
		System.out.println("Non static initializer in C");
	}
	
	static void staticE(){
		System.out.println("Static method E");
	}
	
	void nonstaticF(){
		System.out.println("Non static method F");
	}
}

public class Demo {
	public static void main(String[] args) {
		A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
	}
}