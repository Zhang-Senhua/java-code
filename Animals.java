package DEMO3;

public abstract class Animals {//	顶层父类 

	public Animals() {
		System.out.println("创建了一个动物");

	}

	public abstract void eat();

	abstract public void reproduce();

}
