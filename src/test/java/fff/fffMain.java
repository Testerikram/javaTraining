package fff;

public class fffMain {

	public static void main(String[] args) {
		
		Finalize f = new Finalize();
		
		f = null;
		
		System.gc();
				

	}

}
