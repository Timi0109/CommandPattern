
public class Multiply implements Operations {

	private int num1;
	private int num2;
	
	public Multiply(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public int exexecute() {
		// TODO Auto-generated method stub
		return this.num1 * this.num2;
	}
}
