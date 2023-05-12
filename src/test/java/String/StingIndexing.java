package String;

public class StingIndexing {

	public static void main(String[] args) {
		
		String firstname="Ikram";
		String middlename="Hussain";
		String lastname="Jailapdeen";
		String fullname = null;
		
		fullname = firstname.concat(" "+middlename);
		fullname=fullname.concat(" "+lastname);
		System.out.println(fullname);
		
		System.out.println(fullname.charAt(6));
		
		System.out.println(fullname.substring(5));
		
		System.out.println(fullname.substring(5, 10));

	}

}
