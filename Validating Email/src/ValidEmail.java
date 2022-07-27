import java.util.Scanner;
public class ValidEmail{
     public static void main(String[]arrgs)
     {
    	 Scanner sc=new Scanner(System.in);
    	 String array[]= {"name@gmail.com",
    			           "Domain@gmail.com"
    	                 };
    	 boolean found=false;
    	 System.out.println("Enter your email id:");
    	 String name=sc.next();
    	 sc.close();
    	 for(int i=0;i<array.length;i++)
    	 {
    		 if(array[i].equals(name))
    		 {
    			 System.out.println('\n');
    			 System.out.println("Email id which you entered are found");
    			 found=true;
    			 break;
    		 }
    	 }
    	 if(found==false)
    		 System.out.println("Email id which you entered are not found");
     }
}

