package findduplicatesinstring;
//time complexity: O(n)
//space complexity: O(n)
public class Findduplicatesfromcountarray {
	public static int NO_OF_CHARS=256;
	public static char[] count_array=new char[NO_OF_CHARS]; 
	public static void populatecountarray(String str) {
		for(int i=0;i<str.length();i++) {
			count_array[str.charAt(i)]++;
		}//take count array to maintain the count of every char in the string 
		
	}
	
	public static void printduplicates(String str) {
		populatecountarray(str);
		for(int i=0;i<str.length();i++)
		{
			if(count_array[str.charAt(i)]>1)
				System.out.print(str.charAt(i)+" ");
		}
	}//traverse through the count array to check for the duplicates
	public static void main(String[] args) {
		String str="geeksioopss";
		printduplicates(str);
	}

}
