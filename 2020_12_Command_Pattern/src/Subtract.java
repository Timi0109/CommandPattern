
public class Subtract implements Operations {
	private int a;
	private int b;

	public Subtract(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}

	@Override
	public int exexecute() {
		// TODO Auto-generated method stub
		return a - b;
	}

}
