Arthmetic Operator Assignments:

Q. 1
package Arithmetic;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
	}
}

Q. 2
package Arithmetic;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a-b);
	}
}

Q. 3
package Arithmetic;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*b);
	}
}

Q. 4
package Arithmetic;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a/b);
	}
}

Q. 5
package Arithmetic;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a<b) {
			System.out.println(b+" is greater");
		}
		else if(a>b) {
			System.out.println(a+" is greater");
		}
		else {
			System.out.println(a+" and "+b+ " both are equal");
		}
	}
}

Q. 6
package Arithmetic;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%3 == 0) {
			System.out.println(a+ " is divisible by 3");
		}
		if(a%3 != 0) {
			System.out.println(a+ " is not divisible by 3");
		}
	}
}

Control Flow Assignments:

Q. 1

package Control_Flow;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=10; i++) {
			System.out.println(i*n);
		}
	}
}

Q. 2

package Control_Flow;

import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter nos");
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.print("Enter operator");
		char ch= sc.next().charAt(0);
		
		switch(ch) {
		case '+':{
			System.out.print(a+b);
			break;}
		case '-':{
			
			System.out.print(a-b);
			break;}
		case '*':{
			System.out.print(a*b);
			break;}
		case '/':{
			System.out.print(a/b);
			break;}
		}
	}
}

Q. 3

package Control_Flow;

public class Q3 {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			System.out.println();
		}
	}
}

Q. 4

package Control_Flow;

public class Q4 {
	public static void main(String[] args) {
		for(int i = 3; i<=30; i++) {
			if(i == 24) {
				continue;
			}
			System.out.println(i);
		}
	}
}

Q. 5

package Control_Flow;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		if(result<35) {
			System.out.println("Fail");
		}
		else if(result>35 && result<50) {
			System.out.println("Pass");
		}
		else if(result>50 && result<59) {
			System.out.println("Second Class");
		}
		else if(result>60 && result<75) {
			System.out.println("First Class");
		}
		else {
			System.out.println("Distinction");
		}
		
	}
}

Q. 6

package Control_Flow;

public class Q6 {
	public static void main(String[] args) {
		for(int i = 3; i<=30; i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isprime(int n) {
		int c = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c == 2) {
			return true;
		}
		else
			return false;
	}
}

Q. 7

package Control_Flow;

public class Q7 {
	public static void main(String[] args) {
		for(char i = 'A'; i<='A'+2; i++) {
			for(char j = 'a'; j<='a'+2; j++) {
				System.out.println(i+" "+j);
			}
			System.out.println();
		}
	}
}

Q. 8

package Control_Flow;

public class Q8 {
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			for(int s = 4; s>=i; s--) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}

Q. 9

package Control_Flow;

public class Q9 {
	public static void main(String[] args) {
		for(int k = 4; k>=1; k--) {
			for(int s = 5; s>=k; s--) {
				System.out.print(" ");
			}
			for(int r = k; r>0; r--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

Q. 10

package Control_Flow;

public class Q10 {
	public static void main(String[] args) {
		for(int i = 1; i<=4; i++) {
			for(int s = 4; s>=i; s--) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(int k = 3; k>=1; k--) {
			for(int s = 4; s>=k; s--) {
				System.out.print(" ");
			}
			for(int r = k; r>0; r--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

Q. 11

package Control_Flow;

public class Q11 {
	public static void main(String[] args) {
		for(int i = 3; i<=30; i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isprime(int n) {
		int c = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c == 2) {
			return true;
		}
		else
			return false;
	}
}

Q. 12

package Control_Flow;

public class Q13 {
	public static void main(String[] args) {
		for(char i = 'A'; i<='A'+2; i++) {
			for(char j = 'a'; j<='a'+2; j++) {
				System.out.println(i+" "+j);
			}
			System.out.println();
		}
	}
}