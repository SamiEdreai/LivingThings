package LivingThing;

public class Runner extends LivingThing implements Cloneable, Comparable<Runner>, Runnable, Breathable{
	private double avarageSpeed;
	
	
	public Runner(String name, double avarageSpeed) {
		super(name);
		this.avarageSpeed = avarageSpeed;
	}


	@Override
	public String toString() {
		return super.toString() + ", avarageSpeed=" + avarageSpeed + "]";
	}
	@Override
	public void run() {
		System.out.println(getClass().getSimpleName()+ "  " + name + "is running");
	}
	
	@Override
	public Runner clone() throws CloneNotSupportedException {
		return (Runner)super.clone();
	}


	@Override
	public int compareTo(Runner other) {
		return name.compareTo(other.name);
	}
	@Override
	public void breath() {
		System.out.println(getClass().getSimpleName() + " " + name + "is running");
	}

}
