package arithmetic_operations;

import java.util.List;

import edu.neu.API.Operations;
import edu.neu.Client.Client;

public class Sum implements Operations{
	private Client clint;
	private List<Integer> lst;
	
	public Sum( Client client, List<Integer> lst) {
		this.clint = client;
		this.lst = lst;	
	}

	@Override
	public void execute() {
		System.out.println(" = "+clint.sum(lst)+"\n");
	}
}
