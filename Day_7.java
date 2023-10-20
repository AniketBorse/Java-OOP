Q. 1

package Day_7;

class DACDBDACourse extends Course{
	double b;
	public double getFee() {
		System.out.println("DAC and DBDA fee");
		return b;
	}
	
	public void evaluate() {
		System.out.println("Evaluation of DAC DBDA");
	}
}

class MSCitCourse extends Course{
	double c;
	public double getFee() {
		System.out.println("MSCIT fee");
		return c;
	}
	
	public void evaluate() {
		System.out.println("Evaluation of MSCIT");
	}
}

public abstract class Course
{
	public static void perform(Course c) { //Static method hence late binding
		c.getFee();
		c.evaluate();
	}

	public abstract double getFee();
	public abstract void evaluate();
	
	public static void main(String[] args) {
		perform(new DACDBDACourse());
		perform(new MSCitCourse());
	}
}

Q. 2

package Day_7;

abstract class Beverages {

	// Defined
	public void addMilk() {
		System.out.println("Add Milk");
	}

	// abstract
	abstract void addIngredients();
}

class Coffee extends Beverages
{
	void addIngredients()
	{
		System.out.println("Ingredients of Coffee");
	}
}
class Tea extends Beverages
{
	void addIngredients()
	{
		System.out.println("Ingredients of Tea");
	}
	// addMilk inherited
}
class FruitJuice extends Beverages
{
	void addIngredients()
	{
		System.out.println("Ingredients of Fruit Juice");
	}
	// addMilk inherited
}

public class Q2 {
	public static void main(String[] args) {
		Beverages arr[] = new Beverages[3];
		arr[0] = new Coffee();
		arr[1] = new Tea();
		arr[2] = new FruitJuice();
		
		for(int i = 0; i<arr.length; i++) {
			arr[i].addIngredients();
		}
	}
}

Q. 3

package Day_7;

abstract class Shape{
	abstract void draw();
	void show() {
		
	}
}

class Triangle extends Shape{
	void draw() {
		System.out.println("Draw Triangle");
	}
	
	void show() {
		System.out.println("Show Triangle");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Draw Rectangle");
	}
	
	void show() {
		System.out.println("Show Rectangle");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Draw Circle");
	}
	
	void show() {
		System.out.println("Show Circle");
	}
}

public class ShapeDemo {
	public static void main(String[] args) {
		Shape arr[] = new Shape[3];
		arr[0] = new Triangle();
		arr[1] = new Rectangle();
		arr[2] = new Circle();
		
		for(int i = 0; i<arr.length; i++) {
			arr[i].draw();
			arr[i].show();
		}
	}
}

Q. 4

package Day_7;

public class UIComponent
{
}
public class Button extends UIComponent
{
}
public class TextField extends UIComponent
{
}
public class CheckBox extends UIComponent
{
}
public abstract class UIComponentCreator
{
	public void show(String type)
	{
		UIComponent comp=createUIComponent(type);
		add(comp);
	}
	public void add(UIComponent component)
	{
		System.out.prinlnt("Added the component\t"+component);
	}
	public abstract UIComponent createUIComponent(String type);
}

public class WindowsUIComponentCreator extends UIComponentCreator {
    public UIComponent createUIComponent(String type) {
        if ("button".equalsIgnoreCase(type)) {
            return new Button();
        } else if ("textfield".equalsIgnoreCase(type)) {
            return new TextField();
        } else if ("checkbox".equalsIgnoreCase(type)) {
            return new CheckBox();
        } else {
            throw new IllegalArgumentException("Invalid component type: " + type);
        }
    }
}

public class LinuxUIComponentCreator extends UIComponentCreator {
    public UIComponent createUIComponent(String type) {
        if ("button".equalsIgnoreCase(type)) {
            return new Button();
        } else if ("textfield".equalsIgnoreCase(type)) {
            return new TextField();
        } else if ("checkbox".equalsIgnoreCase(type)) {
            return new CheckBox();
        } else {
            throw new IllegalArgumentException("Invalid component type: " + type);
        }
    }
}

public class MacUIComponentCreator extends UIComponentCreator {
    public UIComponent createUIComponent(String type) {
        if ("button".equalsIgnoreCase(type)) {
            return new Button();
        } else if ("textfield".equalsIgnoreCase(type)) {
            return new TextField();
        } else if ("checkbox".equalsIgnoreCase(type)) {
            return new CheckBox();
        } else {
            throw new IllegalArgumentException("Invalid component type: " + type);
        }
    }
}

public class UIComponentCreatorDemo {
    public static void main(String[] args) {
        UIComponentCreator windowsCreator = new WindowsUIComponentCreator();
        UIComponentCreator linuxCreator = new LinuxUIComponentCreator();
        UIComponentCreator macCreator = new MacUIComponentCreator();

        // Example usage
        windowsCreator.show("button");
        linuxCreator.show("textfield");
        macCreator.show("checkbox");
    }
}

Q. 5

package Day_7;

public class CommandLineSum {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide exactly three numbers as command-line arguments.");
            return;
        }

        try {
            // Parse the command-line arguments as integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);

            // Calculate the sum
            int sum = num1 + num2 + num3;

            // Display the result
            System.out.println("Sum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid integer numbers.");
        }
    }
}

Q. 6

package Day_7;

abstract class Shape{
	abstract void draw();
}

class Triangle extends Shape{
	void draw() {
		System.out.println("Draw Triangle");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Draw Rectangle");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Draw Circle");
	}
}

public class ShapeDemo {
	public void perform(Shape s) {
		s.draw();
	}
	public static void main(String[] args) {
		perform(new Triangle());
		perform(new Rectangle());
		perform(new Circle());
		
	}
}

Q. 7

package Day_7;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
    public Clams createClams();
}

public class USPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        System.out.println("Create Dough");
    }

    public Sauce createSauce() {
    	System.out.println("Create Sauce");
    }

    public Cheese createCheese() {
    	System.out.println("Create Cheese");
    }

    public Pepperoni createPepperoni() {
    	System.out.println("Create Pepperoni");
    }

    public Clams createClams() {
    	System.out.println("Create Clams");
    }
}

public class IndianPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
    	System.out.println("Create Dough");
    }

    public Sauce createSauce() {
    	System.out.println("Create Sauce");
    }

    public Cheese createCheese() {
    	System.out.println("Create Cheese");
    }

    public Pepperoni createPepperoni() {
    	System.out.println("Create Pepperoni");
    }

    public Clams createClams() {
    	System.out.println("Create Clams");
    }
}

public class PizzaFactoryDemo {
    public static void main(String[] args) {
        PizzaIngredientFactory[] factories = new PizzaIngredientFactory[2];
        factories[0] = new USPizzaIngredientFactory();
        factories[1] = new IndianPizzaIngredientFactory();

        for (PizzaIngredientFactory factory : factories) {
            System.out.println("Ingredients for Pizza:");
            Dough dough = factory.createDough();
            Sauce sauce = factory.createSauce();
            Cheese cheese = factory.createCheese();
            Pepperoni pepperoni = factory.createPepperoni();
            Clams clams = factory.createClams();
            
            System.out.println(dough);
            System.out.println(sauce);
            System.out.println(cheese);
            System.out.println(pepperoni);
            System.out.println(clams);
        }
    }
}

Q. 8

package Day_7;

class Course {
    public void start() {
        System.out.println("Start course");
    }

    public void stop() {
        System.out.println("Stop course");
    }
}

class DACDBDACourse extends Course {
    public void orientation() {
        System.out.println("Orientation for DACDBDA course");
    }
}

class MSCit extends Course {
}

class Basic extends Course {
}

public class CourseDemo {
    public static void main(String[] args) {
        Course[] courses = new Course[3];

        courses[0] = new DACDBDACourse();
        courses[1] = new MSCit();
        courses[2] = new Basic();

        for (Course course : courses) {
            course.start();
            course.stop();

            if (course instanceof DACDBDACourse) {
                ((DACDBDACourse) course).orientation();
            }
        }
    }
}

Q. 9

interface Course {
    void start();
    void stop();
}

class DACDBDACourse implements Course {
    public void start() {
        System.out.println("Start DACDBDA course");
    }

    public void stop() {
        System.out.println("Stop DACDBDA course");
    }

    public void orientation() {
        System.out.println("Orientation for DACDBDA course");
    }
}

class MSCit implements Course {
    public void start() {
        System.out.println("Start MSCit course");
    }

    public void stop() {
        System.out.println("Stop MSCit course");
    }
}

class Basic implements Course {
    public void start() {
        System.out.println("Starting the Basic course");
    }

    public void stop() {
        System.out.println("Stopping the Basic course");
    }
}

public class CourseClass {
    public static void show(Course course) {
        course.start();
        course.stop();

        if (course instanceof DACDBDACourse) {
            	DACDBDACourse d = (DACDBDACourse) course;
		d.orientation();
        }
    }

    public static void main(String[] args) {
        Course dacdbdaCourse = new DACDBDACourse();
        Course mscitCourse = new MSCit();
        Course basicCourse = new Basic();

        System.out.println("Demonstrating DACDBDACourse:");
        show(dacdbdaCourse);

        System.out.println("\nDemonstrating MSCit:");
        show(mscitCourse);

        System.out.println("\nDemonstrating Basic:");
        show(basicCourse);
    }
}


Q. 10

package Day_7;

public class Demo {
    public void disp(int... n) {
        int sum = 0;
        for (int num : n) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.disp(10, 20, 30, 40);
    }
}