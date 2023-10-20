Q. 1
developer side:

interface Shape{
	void draw();
}

class Triangle implements Shape{
	public void draw() {
		System.out.println("Draw Triangle");
	}
}

class Rectangle implements Shape{
	public void draw() {
		System.out.println("Draw Rectangle");
	}
}

class Circle implements Shape{
	public void draw() {
		System.out.println("Draw Circle");
	}
}

client side:

package Day_6;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape arr[] = new Shape[3];
		arr[0] = new Triangle();
		arr[1] = new Rectangle();
		arr[2] = new Circle();
		
		for(int i = 0; i<arr.length; i++) {
			arr[i].draw();
		}
	}
}


Q. 2

package Day_6;

public interface MouseHandler
{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
}
public interface WindowHandler
{
	void windowClosing();
	void windowClosed();
}

public class WindowGUIApp implements MouseHandler,WindowHandler
{
	public void mouseClicked() {
		System.out.println("Mouse Clicked");
	}
	
	public void mousePressed() {
		System.out.println("Mouse Pressed");
	}
	
	public void mouseReleased() {
		System.out.println("Mouse Released");
	}
	
	public void windowClosing() {
		System.out.println("Window Closing");
	}
	
	public void windowClosed() {
		System.out.println("Window Closed");
	}
}
public class GUIDemo
{
	static void perform(WindowGUIApp w) {
		w.mouseClicked();
		w.mousePressed();
		w.mouseReleased();
		w.windowClosing();
		w.windowClosed();
	}
	public static void main(String[] args) {
		perform(new WindowGUIApp());
	}
}

Q. 3
developer side:

package Day_6;

public interface PersistenceMechanism
{
	void writeData(String ref);
	String readData();
}

client side:

class FileSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		// how to write data inside FileSystem
	}
	public String readData()
	{
		// how to read data from FileSystem
	}
}

class DatabaseSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		// how to write data inside DatabaseSystem
	}
	public String readData()
	{
		// how to read data from DatabaseSystem
	}
}

class BigdataSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		// how to write data inside BigdataSystem
	}
	public String readData()
	{
		// how to read data from BigdataSystem
	}
}

Q. 4

developer side:

package Day_6;

class FourWheeler implements Vehicle
{
	public void changeGear(int a)
	{
		// how to change gear in FourWheeler
	}
	public void speedUp(int a)
	{
		// how to speed up FourWheeler
	}
	public void applyBrakes(int a)
	{
		// how to apply brakes of FourWheeler
	}
}


class TwoWheeler implements Vehicle
{
	public void changeGear(int a)
	{
		// how to change gear in TwoWheeler
	}
	public void speedUp(int a)
	{
		// how to speed up TwoWheeler
	}
	public void applyBrakes(int a)
	{
		// how to apply brakes of TwoWheeler
	}
}

public class Demo {
    public static void main(String[] args) {
        // Create instances of FourWheeler and TwoWheeler
        Vehicle fourWheeler = new FourWheeler();
        Vehicle twoWheeler = new TwoWheeler();

        // Call the perform method with different implementations
        perform(fourWheeler);
        perform(twoWheeler);
    }

    public static void perform(Vehicle vehicle) {
        // Invoke the methods polymorphically
        vehicle.changeGear(3);
        vehicle.speedUp(60);
        vehicle.applyBrakes(20);
    }
}

client side:

package Day_6;

interface Vehicle { 
    
    // all are the abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 

Q. 5

developer side:

package weaponpack;

public class Weapon
{
	public void attack()
	{
	}
}
public class Sword extends Weapon
{
	override attack
}
public class Bomb extends Weapon
{
	override attack
}
public class Gun extends Weapon
{
	override attack
		+
	public void fillBullets()
	{
		S.o.p("filling bullets");
	}
}

public class Soldier {
    public void fight(Weapon ref) {
        ref.attack();
        if (ref instanceof Gun) {
            ((Gun) ref).fillBullets(); // Cast to Gun and call fillBullets
        }
    }
}


public class Demo
{
	public static void main(String[] args) 
	{
		//invoke "fight" method of Soldier class
		Soldier s1=new Soldier();
		s1.fight(new Gun());
	}
}

client side:

package weaponpack;

public class WeaponDemo {
    public static void main(String[] args) {
        // Invoke "fight" method of Soldier class
        Soldier s1 = new Soldier();
        s1.fight(new Gun());
        s1.fight(new Sword());
        s1.fight(new Bomb());
    }
}
