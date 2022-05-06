package variables;

public class Variables {
	public static void main(String[]args) {
		
		//single line comment
		/* multi-line comment
		 * 
		 */
		//numbers
		//Primitive variables
			//whole numbers
			byte b=127; // 1 byte memory (cannot use total more than 127 )
			short s=2542; // 2 bytes
			int x=1234567892;// 4 bytes(only takes up to 10 characters)
			long c=5647L; // 8 bytes
		
			
			//use strong names and camel case for variable name
			int ageOfTheDog= 35;
			
			
			//fractions
			double d= 1.1234;// 8 bytes
			float f= 1.234567F;// 4 bytes
		
		//character
		char a= '1';// 2 bytes
		
		//boolean
		boolean boo= false;// 1 bit(1/8 byte)
		
		//non primitive variables
		//chain of characters
		String str="can be numbers or characters or anything";
		String str2= "Hello World";
		
		
		System.out.println(str);
		
		//string concatenation- no space between words
		System.out.println(str+str2);
		// to print with space between words ""-is a string 
		System.out.println(str+" "+str2);
		
		//declare multiple variables in one line
		int n, k, p;
		
		//variable reassignment- applicable to all variables (second value overrides first value)
		String name= "John";	
		
		System.out.println(name);
		
		name="dave";
		System.out.println(name);//changed to dave
		
		//java logic:(true or false)
		//arithmetic operators: +, -, /, *, %(use to get remainder of division),++, --
		ageOfTheDog--;
		System.out.println(ageOfTheDog);
		
		//Assignment operator: =
		
		//comparison operator:<,>,<=,>=,!=(not equal),==(equal)
		
		//Logical operators:&&(and),||(or),!(not)
	
		//Escape Character: \"\"(begining and end)\\(if need to use slash then use 2 \\)
		String st="my name is: \"John\"";
		
		//Escape character \n (space and moves to next line)
		System.out.println("Hello \n World");
		// Escape character \t(tab)
		System.out.println("Hello \\ \t World");
		
	}
	

}
