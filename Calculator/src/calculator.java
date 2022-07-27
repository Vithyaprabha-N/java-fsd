
	import java.util.Scanner;
	class calculator{
		public static void main(String []args) {
			char operator;
			double numb1,numb2,result;
			Scanner input=new Scanner(System.in);
			System.out.println(" Choose an operator:+,-,*,/");
			operator=input.next().charAt(0);
			System.out.println("Enter first number");
			numb1=input.nextDouble();
			System.out.println("Enter second number");
			numb2=input.nextDouble();
			switch(operator) {
			case'+':
			result=numb1+numb2;
			System.out.println(numb1+"+"+numb2+"="+result);
			break;
			case'-':
				result=numb1-numb2;
				System.out.println(numb1+"-"+numb2+"="+result);
				break;
			case'*':
				result=numb1*numb2;
				System.out.println(numb1+"*"+numb2+"="+result);
				break;
			case'/':
				result=numb1/numb2;
				System.out.println(numb1+"/"+numb2+"="+result);
				break;
			default:
				System.out.println("Invalid operator");
				break;
			}
			input.close();
			
		}
	}

