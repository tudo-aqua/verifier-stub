package tools.aqua.concolic;

import static tools.aqua.concolic.Tainting.XSS;
import static tools.aqua.concolic.Tainting.SQL_INJECTION;

public class TaintIdResolver {

	public static void main(String args[]){
		String taintId = args[0];
		switch(Integer.parseInt(taintId)){
		case XSS: System.out.println("XSS"); break;
		case SQL_INJECTION: System.out.println("SQL_INJECTION");break;
		default: System.out.println("unkown taint id: {}".formatted(taintId));
		}
	}
}
