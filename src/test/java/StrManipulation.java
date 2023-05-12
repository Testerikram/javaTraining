
public class StrManipulation {

	public static void main(String[] args) {
	  
		//Trim
		
		String a ="             Ikram hussaInI";
		String b = a.trim();
		System.out.println(b);
		
		//index of
		
		System.out.println(a.indexOf("I"));
		
		//Index of Second Occurance
		System.out.println(a.indexOf("I",a.indexOf("I")+1));
		
		//Index of third occurance
		int three =a.indexOf("I",a.indexOf("I")+1);
		System.out.println(a.indexOf("I",three+1));
		
		//Equals
		System.out.println(a.equals(b));
		
		//Equals Ignoring Capital Case
		String small = "abcdefg";
		String cap = "ABCDEFG";
		System.out.println(small.equalsIgnoreCase(cap));
		
		//Repalcing a character
		
		String date = "16.03.2023";
		System.out.println("Before replacing an date"+" "+ date);
		System.out.println(date.replace(".","/"));
		

	}

}
