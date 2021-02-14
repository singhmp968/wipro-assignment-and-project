package IDENTIFYpOSSIBLEwORD;

public class identifyPossibleWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abc("Fi_er","Fever:file:Filter:fiber:fibre:tailor:offer:fixer");
	}
	public static void abc(String a,String b)
	{
		String nb=b.toUpperCase();
	String na = a.toUpperCase();
StringBuffer op =new StringBuffer();
		String at[]=nb.split(":");
		int indexof = a.indexOf("_");
		System.out.println(indexof);
		for(String i :at) {
			//System.out.println(i);
		
			
				if(na.length()>=i.length() && na.replace('_', i.charAt(indexof)).contentEquals(i)) {
					op.append(i).append(":");
				System.out.print(op);
			}
		
		}
	//System.out.println(op.length());	
	}
}
