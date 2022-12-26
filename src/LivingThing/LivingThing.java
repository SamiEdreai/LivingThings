package LivingThing;

public abstract class LivingThing {
	protected String name;

	public LivingThing(String name) {
		this.name = name;
	}

	@Override
	public LivingThing clone() throws CloneNotSupportedException {
		return (LivingThing)super.clone();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ": name=" + name;
	}
	
	
	
	

}
