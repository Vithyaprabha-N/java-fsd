package string;

public class DemoString {
	
	public static void main(String[] args) {
		            //0123456
			String s="agfhe";
			String s1="abcdef";
			//length
			System.out.println("the string length is "+s.length());
			//***to find a character at a specific location
			System.out.println("the character at a location is "+s.charAt(2));
			//find the location from a character
			System.out.println("location of a character "+s.indexOf('d'));
			//find the location from a character in reverse
			System.out.println("location of a character in reverse "+s.lastIndexOf('d'));
			//convert the string to upper case and lower case
			System.out.println("convert lower to upper "+s.toUpperCase());//viceversa
			//substring:part of the string
			//substring(start),substring(start,end)
			System.out.println("substring model 1 "+s.substring(2));
			System.out.println("substring model 2 "+s.substring(2,5));
			//equals()
			System.out.println("equals " +s1.equals(s));
			System.out.println("==  " +s1==(s));
			//split
			System.out.println("split example");
			String s2="abcd_edf_ijkl";
			String ss[]=s2.split("_");
			for(String l:ss) {
				System.out.println(l);
			}
			//compareTo s="abcdefd" s1="efd"   -ve , 0 , +ve   abcdefgh
			/*id both are equal then we get 0
			 * if s1>s we get +ve value
			 * if s1<s we get -ve value
			 * */
			System.out.println("string compare "+s1.compareTo(s));
			
			//concatenation
			System.out.println("concat model 1 "+ s.concat(s1));
			System.out.println("concat model 2 "+ s+s1);
			
			//conversions
			int a=1;
			String s3=a+"";
			String s4=String.valueOf(a);
			String s5=Integer.toString(a);
			
		}
}
