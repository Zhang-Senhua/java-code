package demo11;

public class paochuthrows {
	
	
	
	public static void show() throws InterruptedException  {
		
		
		
		for(int i=0;i<100;i++) {
			
			System.out.println(i);
			Thread.sleep(1000);//Ë¯ÃßÒ»Ãë
		}
	} 
	
public static void main(String[] args) {
	try {
		show();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
