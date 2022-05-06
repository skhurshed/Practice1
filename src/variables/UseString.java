package variables;

public class UseString {

	public static void main(String[] args) {
		String str1= "Hello";
		String str2= "World";
		
		//String Concatenation
		System.out.println(str1+str2);
		
		//String manipulation
		System.out.println(str1.indexOf("H"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		//array is a variable that can hold multiple value in the same time
		//syntax: variableType[] arrayName= {value1, value2, value3....};
		
		int[] myArray = {2,5,7,3,9};
		System.out.println(myArray [4]);

	}

}
