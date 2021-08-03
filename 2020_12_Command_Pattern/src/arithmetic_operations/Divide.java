package arithmetic_operations;
import edu.neu.API.Operations;
import edu.neu.Client.Client;

public class Divide implements Operations {
	
	private Client clint;
	private double a;
	private double b;

	public Divide(int a, int b, Client client) {
		this.clint = client;
		this.a = a;
		this.b = b;
	}

	@Override
	public void execute() {
		System.out.println(clint.divide(a, b)+"\n");
	}

}
