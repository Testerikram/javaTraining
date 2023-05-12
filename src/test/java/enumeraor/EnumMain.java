package enumeraor;

public class EnumMain {

	public static void main(String[] args) {
		
		//Enum  day = new Enum.Monday;
		
		for (Enum d : Enum.values())
		{
			System.out.println(d);
		}

	}

}
