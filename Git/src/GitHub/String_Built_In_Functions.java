package GitHub;

public class String_Built_In_Functions {
	public static void main(String[] args) {
		
		String s1="Hi Hello";
		String s2="Hi how are you";
		String s3="             Hi Hello";
		
		int a=s1.codePointAt(4);
		System.out.println("codePointAt()==returns an integer representing the Unicode point value : "+a);
		System.out.println("==========================");
		
		int b=s1.codePointBefore(6);
		System.out.println("codePointBefore()== "+b);
		System.out.println("==========================");
		
		int c=s1.codePointCount(2,4);
		System.out.println("codePointCount()== "+c);
		System.out.println("==========================");
		
		int d=s1.compareTo(s2);
		System.out.println("compareTo== "+d);
		System.out.println("==========================");
		
//		returns 0 if the strings are equal
//		returns a negative integer if the s1 comes before the s2 argument in the dictionary order
//		returns a positive integer if the s1 comes after the s2 argument in the dictionary order
		
		int e=s1.compareToIgnoreCase(s2);
		System.out.println("compareToIgnoreCase()== "+e);
		System.out.println("==========================");
		
		String f=s1.concat(s2);
		System.out.println("concat()== "+f);
		System.out.println("==========================");
		
		boolean g=s1.contains(s3);
		System.out.println("contains()== "+g);
		System.out.println("==========================");
		
//		The contentEquals() method searches a string to find out if it contains 
//		the exact same sequence of characters in the specified string or StringBuffer. 
//		Returns true if the characters exist and false if not.
		
		boolean h=s1.contentEquals(s3);
		System.out.println("contentEquals()== "+h);
		System.out.println("==========================");
		
		boolean i=s1.endsWith("Hello");
		System.out.println("endsWith()== "+i);
		System.out.println("==========================");
		
		boolean j=s1.equals(s3);
		System.out.println("equals()== "+j);
		System.out.println("==========================");
		
		boolean k=s1.equalsIgnoreCase(s3);
		System.out.println("equalsIgnoreCase()== "+k);
		System.out.println("==========================");
		
//		The getBytes() encodes a string into a sequence of bytes using the named character set and 
//		storing the result into a new byte array.
		
		byte[] l=s1.getBytes();
		System.out.println("getBytes()== "+l);
		System.out.println("==========================");
		
//		The indent(int i) method, in the simplest usage, adds space characters at the start of every line, 
//		with the argument indicating how many spaces to add. However, if that argument is a negative value, 
//		the method will delete up to that many whitespace characters from the beginning of each line.
		
		
		String m=s1.indent(6);
		System.out.println("indent()== "+m);
		System.out.println("==========================");
		
//		The indexOf() method returns the position of the first occurrence of specified character(s) in a string. 
		
		int n=s1.indexOf("e");
		System.out.println("indexOf()== "+n);
		System.out.println("==========================");
		
		int o=s1.indexOf("o", 2);
		System.out.println("indexOf()== "+o);
		System.out.println("==========================");
		
//		The method intern() creates an exact copy of a String object in the heap memory 
//		and stores it in the String constant pool. Note that, 
//		if another String with the same contents exists in the String constant pool,
//		then a new object won't be created and the new reference will point to the other String.
		
		String p=s1.intern();
		System.out.println("intern()== "+p);
		System.out.println("==========================");
		
//		isBlank() is an instance method that returns true if the string is empty or contains only white space codepoints.
		
		boolean q=s1.isBlank();
		System.out.println("isBlank()== "+q);
		System.out.println("==========================");
		
//		isBlank() returns true for blanks(just whitespaces)and for null String as well. 
//		Actually it trims the Char sequences and then performs check. StringUtils. 
//		isEmpty() returns true when there is no charsequence in the String parameter or when String parameter is null.
		
		boolean r=s1.isEmpty();
		System.out.println("isEmpty()== "+r);
		System.out.println("==========================");
		
		//The lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string. 
		
		int s=s1.lastIndexOf('o');
		System.out.println("lastIndexOf()== "+s);
		System.out.println("==========================");
		
		int t=s1.lastIndexOf("i");
		System.out.println("lastIndexOf()== "+t);
		System.out.println("==========================");
		
		int u=s1.length();
		System.out.println("length()== "+u);
		System.out.println("==========================");
		
//		The dot “.” in the string signifies that there can be any character before the string in the bracket and 
//		the steric “*” signifies that these characters can be in any number.
		
		boolean w=s1.matches("(.*)Hello(.*)");
		System.out.println("matches()== "+w);
		System.out.println("==========================");
		
		String x=s1.repeat(4);
		System.out.println("repeat()== "+x);
		System.out.println("==========================");
		
		String y=s1.replace('e','f');
		System.out.println("replace()== "+y);
		System.out.println("==========================");
		
		String z=s1.replace("Hi", "Good");
		System.out.println("replace()== "+z);
		System.out.println("==========================");
		
		String a1=s1.replaceAll(s1, s2);
		System.out.println("replaceAll()== "+a1);
		
		System.out.println("=======Split()========");
		String[] arr=s2.split(" ");
		for(int A=0;A<arr.length;A++)
		{
			System.out.println(arr[A]);
		}
		System.out.println("==========================");
		
		
		boolean b1=s1.startsWith("Hi");
		System.out.println("startsWith()== "+b1);
		System.out.println("==========================");
		
//		strip() is an instance method that returns a string 
//		whose value is the string with all leading and trailing white spaces removed.
		
		String c1=s3.strip();
		System.out.println("strip()== "+c1);
		System.out.println("==========================");
		
		CharSequence e1=s1.subSequence(1, 6);
		System.out.println("subSequence()== "+e1);
		System.out.println("==========================");
		
		String f1=s1.substring(1, 5);
		System.out.println("substring()== "+f1);
		
		System.out.println("=====toCharArray()=====");
		char[] g1=s1.toCharArray();
		for(int A=0;A<g1.length;A++)
		{
			System.out.println(g1[A]);
		}
		System.out.println("==========================");
		
		String h1=s1.toLowerCase();
		System.out.println("toLowerCase()== "+h1);
		System.out.println("==========================");
		
//		String i1=s1.toString();
//		System.out.println("toString()== "+i1);
//		System.out.println("==========================");
		
		String j1=s1.toUpperCase();
		System.out.println("toUpperCase()== "+j1);
		System.out.println("==========================");
		
//		trim() removes a single leading white space and a single trailing white space, 
//		but does not remove multiple leading or trailing white spaces. 
//		strip() removes both leading and trailing white spaces from a string.
		
		String k1=s3.trim();
		System.out.println("trim()== "+k1);
		System.out.println("==========================");
	}

}
