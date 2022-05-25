package ua.lviv.lgs;

public class SimpleGenerics <T> {
	T ob;
	

	public SimpleGenerics(T ob) {
		super();
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
	public void showType() {
		System.out.println("Type of ob is: " + ob.getClass().getName());
	}

}