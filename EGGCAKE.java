package Eggcake;

public class EGGCAKE {
 int eggcount;
 public EGGCAKE(int eggcount) {
	this.eggcount=eggcount;
	System.out.println("这个饼里有"+eggcount+"个鸡蛋");
}
  
	public EGGCAKE() {
		//eggcount=1;
		//System.out.println("这个饼里有"+eggcount+"个鸡蛋");
		this(2);
		
		// TODO Auto-generated constructor stub
	}
     public static void main(String[] args) {
		EGGCAKE A=new EGGCAKE();
		EGGCAKE A2=new EGGCAKE(5);
		
	}
}




//静态区