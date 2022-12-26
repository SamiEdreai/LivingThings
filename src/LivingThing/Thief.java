package LivingThing;

public class Thief extends LivingThing implements Cloneable, Runnable{
	private double height;
	private int numOfSteals;
	
	public Thief(String name, double height, int numOfSteals) {
		super(name);
		this.height = height;
		this.numOfSteals = numOfSteals;
	}

	@Override
	public String toString() {
		return super.toString() +  ", height=" + height + ", numOfSteals=" + numOfSteals + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Thief))
			return false;
		
		Thief temp = (Thief)other;
		return name.equals(temp.name);
		
	}
	
	public void steal() {
		System.out.println(getClass().getSimpleName()+ "  " + name + "is stealing");
	}
	@Override
	public void run() {
		System.out.println(getClass().getSimpleName()+ "  " + name + "is running");
	}
	
	@Override
	public Thief clone() throws CloneNotSupportedException {
		return (Thief)super.clone();
	}

	public double getHeight() {
		return height;
	}


	public int getNumOfSteals() {
		// TODO Auto-generated method stub
		return numOfSteals;
	}
	
}
