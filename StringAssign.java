package strng;

public class StringAssign {

	public static void main(String[] args) {
	System.out.println("........First Que.......");
     String str = "Hello World";
     System.out.println(str.length());
     System.out.println("............Second que............");
     String str2 = "Hello";
     String str3=" How are you?";
     System.out.println(str2.concat(str3));
     System.out.println("........Third Que.......");
     String str4="Java String Pool refers to collection of Strings which are stored in heap memory";
     System.out.println(str4.toLowerCase());
     System.out.println(str4.toUpperCase());
     System.out.println(str4.replace("a", "$"));
     System.out.println(str4.contains("collection"));
     System.out.println(str4.contentEquals("Java String Pool refers to collection of Strings which are stored in heap memory"));
     System.out.println(str4.equalsIgnoreCase(str4));
     System.out.println(".......Fourth Que.......");
     StringBuffer str5 = new StringBuffer( "String Buffer");
     str5.append(" is a peer class of string");
     str5.append(" that provides much of ");
     str5.append("the functionality of strings");
     System.out.println(str5);
     StringBuffer str6 = new StringBuffer( "It is used to  at the specified index position");
     str6.insert(14, "Insert text");
     System.out.println(str6);
     StringBuffer str7 = new StringBuffer("This method returns the reversed object when it was called");
     str7.reverse();
     System.out.println(str7);
     
	}
	

}
