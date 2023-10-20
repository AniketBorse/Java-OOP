1) create a multi-threaded application by using  "extends Thread " method.create 2 threads. they should display characters from A to J.

package Day_10;

class MyThread extends Thread{
	public void run() {
		for(char i = 'A'; i<='J'; i++) {
			System.out.println(i);
		}
	}
}

public class Q1 {
	public static void main(String[] args) {
		MyThread ob = new MyThread();
		Thread th1 = new Thread(ob);
		Thread th2 = new Thread(ob);
		th1.start();
		th2.start();
	}
}


2) above program  using "implements Runnable" method.

package Day_10;

class MyThread implements Runnable{
	synchronized public void run() {
		for(char i = 'A'; i<='J'; i++) {
			System.out.println(i);
		}
	}
}

public class Q2 {
	public static void main(String[] args) {
		MyThread ob = new MyThread();
		Thread th1 = new Thread(ob);
		Thread th2 = new Thread(ob);
		th1.start();
		th2.start();
	}
}


3) create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere. they should display output "Exec  0" to "Exec 5".

4)create 2 threads. Write a program which displays number 1 to 10 using class lock. 
[hint:- use "implements Runnable" and synchronized block]

package Day_10;

public class Q4 implements Runnable{
	synchronized static void disp1(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException ie){
			}
		}
	}
	public void run()
	{
		disp1();
	}
	public static void main(String args[])
	{
		Q4 c=new Q4();
		Q4 c1=new Q4();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();
	}
}

5) create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
both the threads should start simultaneously.

(use implements method)

package Day_10;
public class Th1 implements Runnable
{
		synchronized public void run()
	{
			int i=1,j=50;
		for(i=1;i<=50;i++)
		{
			System.out.println(i);
		}
		for(j=50;j>=1;j--)
		{
			System.out.println(j);
		}
	}
	public static void main(String args[])
	{
		Th1 ob =new Th1();
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		t1.start();
		t2.start();
		
	}
}