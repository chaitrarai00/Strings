package validshuffleofstring;
/*
 * A valid shuffles is one in which the strings internal order remains unchanged
 * i. ex: in below example ACBD is a valid shuffle
 * but BCDA is not since A must come before B the order changes here
 */
public class ValidShuffle {
	public static boolean validshuffle(String A, String B, String C) {
		int i=0, j=0, k=0;
		while(k != C.length()) {
			if(i<A.length() && A.charAt(i)==C.charAt(k))
				i++;
			else if(j<B.length() && B.charAt(j)==C.charAt(k))
				j++;
			else 
				return false;
			k++;
			
		}
		if(i<A.length() || j<B.length())
			return false;
		return true;
	}
	public static void main(String[] args) {
		String A="AB";
		String B="CD";
		String C="CDBA";
		
		if(validshuffle(A, B, C))
			System.out.println("Yep a valid shuffle");
	}

}
