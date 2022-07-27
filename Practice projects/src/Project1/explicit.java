package Project1;

public class explicit {
     public static void main(String[]args) {
    	 double d=34.99;
    	 float f=(float)d;
    	 long l=(long)d;
    	 int i=(int)l;
    	 int j=(int)f;
    	 System.out.println("Before conversion:"+d);
    	 System.out.println("After conversion into float type:"+f);
    	 System.out.println("After conversion into  long type:"+l);
    	 System.out.println("After conversion into int type:"+i);
    	 System.out.println("After conversion into int type:"+j);
    	 
     }
}
