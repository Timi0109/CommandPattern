package arithmetic_operations;
import edu.neu.API.Operations;
import edu.neu.Client.Client;

public class Multiply implements Operations {

	private Client clint;
	private int a;
	private int b;

	public Multiply(int a, int b, Client client) {
		this.clint = client;
		this.a = a;
		this.b = b;
	}

	@Override
	public void execute() {
		System.out.println(clint.multiply(a, b)+"\n");
	}

}
