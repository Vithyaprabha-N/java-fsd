package inheritance;
class Bike{
	int speed=200;
	void display() {
		System.out.println("this is a bike"+speed);
	}
}
class R15 extends Bike{
	void speedOfR15() {
		speed=super.speed+120;
		System.out.println(speed);
	}
}
class YamahanewR15 extends Bike{
	void speedofnewR15() {
		System.out.println(speed+200);
	}
}


public class BikeEx {
public static void main(String[] args) {
	R15 r15=new R15();
	r15.display();
	r15.speedOfR15();
	
	YamahanewR15 newr15=new YamahanewR15();
	newr15.speedofnewR15();
}
}





