package edu.neu.Driver;

import java.util.ArrayList;
import java.util.List;

import arithmetic_operations.Add;
import arithmetic_operations.Divide;
import arithmetic_operations.Multiply;
import arithmetic_operations.Subtract;
import arithmetic_operations.Sum;
import edu.neu.API.Operations;
import edu.neu.Client.Client;

public class Calculator {
	
	 private List<Operations> orderList = new ArrayList<Operations>(); 
	 
	 public void takeOperation(Operations op) {
		 orderList.add(op);
	 }
	 
	 public void executeOperation() {
		 for(Operations op :orderList) {
			 op.execute();
		 }
		 
		 orderList.clear();
	 }
	
	 
	 public static void Demo() {
		 Client cl = new Client();
		 List<Integer> sumList = new ArrayList<>();
		 
		 sumList.add(1);
		 sumList.add(2);
		 sumList.add(3);
		 sumList.add(4);
		 
		 Add ad = new Add(6, 3, cl);
		 Subtract sub = new Subtract(3, 6, cl);
		 Multiply mul = new Multiply(6, 3, cl);
		 Divide div = new Divide(6, 3, cl);
		 Sum sm = new Sum(cl, sumList);
		 
		 Calculator cal = new Calculator();
		 cal.takeOperation(ad);
		 cal.takeOperation(sub);
		 cal.takeOperation(mul);
		 cal.takeOperation(div);
		 cal.takeOperation(sm);
		 
		 cal.executeOperation();
	 }
}
