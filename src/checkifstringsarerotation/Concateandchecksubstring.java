package checkifstringsarerotation;

//time complexity O(n1+n2)
public class Concateandchecksubstring {
	public static void main(String[] args) {
		String str1="abca";
		String str2="acb";
		//check first if the lengths are the same eliminate the possibilty immediately if its not of same length
		// concatenate these 2 strings and check if str2 is a substrimng of the result
		// it should be a substring if its a rotation
		//String str3=str1+str2;
		if(str1.length()==str2.length() && (str1+str2).contains(str2))
			System.out.print("YESSS a substring");
	}
}
