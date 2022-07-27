
public class Person1 {

		public static void main(String[] args) {
			PersonDetails persondetail=new PersonDetails();
			persondetail.bonus=5000;
			persondetail.salary=50000;
			int finalamount=persondetail.incSalary();
		System.out.println("final amount is :"+finalamount);
		}

	}

