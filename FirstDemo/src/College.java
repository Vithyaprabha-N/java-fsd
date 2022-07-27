
public class College {
	
		
		int id;
		String name;
		static String college="IIT";
		//auto constructor right click->source->generate constructor with fields
		public College(int id, String name) {
			this.id = id;
			this.name = name;
		}

		void display() {
			System.out.println(id+" "+name+" "+college);
		}

		void change(String newcollege) {
		college=newcollege;
		}


		}


