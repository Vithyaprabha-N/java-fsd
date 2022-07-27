
public class Employee {
		int id=1;
		double salary=2000;
		String geneder="male";
		void display() {
	System.out.println(id +"  "+salary+"  "+geneder);		
			
		}
		
		public static void main(String[] args) {
			String name="ravi";
	     Employee employee=new Employee();	
		System.out.println(employee);	
		System.out.println(employee.salary);
		employee.display();
		
		}

}
