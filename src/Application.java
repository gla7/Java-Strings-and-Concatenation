
public class Application {// every program in java must have a main method

	public static void main(String[] args) {//first non-primitive type: strings! notice that if you type in main then ctrl+space it makes main method much like sysout then ctrl+space gives the whole sysout! 
		int myInt = 7;
		String text = "Hello";//a string is a class which is a type of object that can hold text
		System.out.println(text);
		String blank = " ";// lets see string concatenation!
		String name = "Bob";
		String greeting = text + blank + name;
		System.out.println(greeting);// same as below
		System.out.println("Hello" + " " + "Bob");
		System.out.println("My integer is " + myInt);// can concatenate string with numbers like JS!
		double myDouble = 7.8;
		System.out.println("My number is " + myDouble + "!");// next up loops!
	}

}
