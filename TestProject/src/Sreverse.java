
public class Sreverse {

	public static void main(String[] args) {
		String d="Rutik";
		String rev="";
		//	StringBuilder s=new StringBuilder(d);
		//System.out.println(s.reverse());
	for(int i=d.length()-1;i>=0;i--)
	{
		rev=rev +d.charAt(i);
	}
	System.out.println(rev);
	}


}
