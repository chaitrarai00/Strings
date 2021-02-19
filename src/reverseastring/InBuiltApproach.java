package reverseastring;



public class InBuiltApproach {
	public static void main(String[] args) {
		String str="utah";
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
		StringBuffer sbuffer=new StringBuffer(str);
		System.out.println(sbuffer.reverse());
	}
}
