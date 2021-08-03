package arithmetic_operations;
import edu.neu.Client.*;

import edu.neu.API.Operations;

public class Add implements Operations {

	private Client clint;
	private int num1;
	private int num2;
	
	public Add(int num1, int num2,Client clint) {
		super();
		this.clint = clint;
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void execute() {
		System.out.println(clint.add(num2, num1)+"\n");
	}

}
