package Interview_Programs;

public class PalindromePrg {
	
	public static void main(String[] args) {
		//0 1 2 3  1 2 3 
		String a = "dad";
		String rev = "";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev = rev+a.charAt(i);
		}
		if(a.equals(rev))
		{
			System.out.println(a + " it is a palindrome");
		}else {
			System.out.println("not a palindrome");
		}

	}

}
