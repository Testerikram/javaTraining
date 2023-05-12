package trycatch;

public class TryCatch {

	public static class TryCatchBlock {

		public  static void main(String[] args) {
			
			int p = 15; 
			
			try 
			{
				System.out.println(p/0);
			}
			catch(Exception e)
			{
			System.out.println(e);	
			}
			finally {
				System.out.println("This will be printed");
			}

		}

	}


}
