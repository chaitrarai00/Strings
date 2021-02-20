package palindrome;

public class Comparefirstlastcharacters {
	
	public static boolean palindrome(String str) {
		int i=0,j=str.length()-1;
		while(i<j) {
			//check if the first and last element is equal
		if(!(str.charAt(i)==str.charAt(j))) 
		{
			return false;// if the last and first element is not equal it mmeans thats not a palindrome
		}
		i++;
		j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String str="abccba";
		if(palindrome(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
