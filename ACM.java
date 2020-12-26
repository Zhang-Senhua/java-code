package DEMO3;

import java.util.Scanner;

public class ACM {

	
	
	
	
	int n;//定义一共n个桶
	int q;//定义q次操作
	int opt;//操作的种类，1为倒水 2为看水
	int t;//定义时间
	int x;//定义第X个桶
    int v;//定义每个桶的水量
    
 
	
	                                                                                                                                                                                        
	
	
	
	public static void main(String[] args) throws InterruptedException {
		int v=0;
		
		Scanner a = new Scanner (System.in);
		int n=a.nextInt();
		int q=a.nextInt();
		int opt=a.nextInt();
		
		for (int t=0;t<=100000000;t++,v++) {
			
			Thread.sleep(100);
			//System.out.println(t+" "+v);
			
			if (opt==2) {
				System.out.print(" "+t);
			}
			}
		
		
		
	
		//System.out.println(n+ "  "+q);
		
		
		
		
		
		
		
		
	}
	public ACM() {
		// TODO Auto-generated constructor stub
	}

}
