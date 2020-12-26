package DEMO3;

public abstract class Bird extends Animals  {
	String feather;
	
	

	public Bird(String feather) {
		System.out.println("创建了一个鸟类");
		
		this.feather=feather;
		
	}
public void   growfeather() {
	System.out.println("长满"+feather+"羽毛");
	
	
	
}
abstract public void move();
public void reproduce() {
	
	System.out.println("下蛋");
}

}
