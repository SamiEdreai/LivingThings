package LivingThing;

public class Chita extends LivingThing implements Cloneable, Runnable {
	private double height;
	private int numOfEatenAnimals;
	
	
	public Chita(String name, double height, int numOfEatenAnimals) {
		super(name);
		this.height = height;
		this.numOfEatenAnimals = numOfEatenAnimals;
	}


	@Override
	public String toString() {
		return super.toString() + ", height=" + height + ", numOfEatenAnimals=" + numOfEatenAnimals + "]";
	}
	@Override
	public void run() {
		System.out.println(getClass().getSimpleName()+ "  " + name + "is running");
	}
	
	@Override
	public Chita clone() throws CloneNotSupportedException {
		return (Chita)super.clone();
	}
	

}
