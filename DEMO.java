package demo11;
 class Animals{//多态的效果
	 
	 
	 void move () {
		 
		 
	 }
 }
 class Fish extends Animals{
      void move () {
		 
		System.out.println("游泳"); 
	 }
 }
 class Hawk extends Animals {
	 
void move () {
		 
		System.out.println("飞翔"); 
	 }
 }
public class DEMO {
	public static void main(String[] args) {
		person p1=new person();
		Animals jack=new Fish();
		jack.move();
		
		jack =new Hawk();
		jack.move();
		
		
	}

	public DEMO() {
		// TODO Auto-generated constructor stub
	}

}
