package reverseastring;

public class Traverseviachararray {

	public static void main(String[] args) {
		String str="takestime";
		char[] stream=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(stream[i]);
	}

}
