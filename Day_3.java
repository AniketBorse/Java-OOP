Client Code

/**
 * 
 */
package clientpro;
import devpack.Myclass1();
/**
 * @author DELL
 *
 */
public class ClientApp {
	public static void main String[] args) {
		Myclass1 m1 = new Myclass1();
	}
}

Developer Code

/**
 * 
 */
package devpack;

/**
 * @author Anni
 *
 */
public class Myclass1 {
	int num;

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	public Myclass1() {
		this.num = num;
	}
}