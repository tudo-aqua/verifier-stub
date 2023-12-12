package tools.aqua.concolic;

import static tools.aqua.concolic.Tainting.XSS;
import static tools.aqua.concolic.Tainting.SQL_INJECTION;
import static tools.aqua.concolic.Tainting.CMD_INJECTION;
import static tools.aqua.concolic.Tainting.WEAK_HASHING_CONFIG;
import static tools.aqua.concolic.Tainting.WEAK_CRYPTO_CONFIG;

public class TaintIdResolver {

	public static void main(String args[]){
		String taintId = args[0];
		switch(Integer.parseInt(taintId)){
		case XSS: System.out.println("XSS"); break;
		case SQL_INJECTION: System.out.println("SQL_INJECTION");break;
		case CMD_INJECTION: System.out.println("CMD_INJECTION");break;
		case WEAK_HASHING_CONFIG: System.out.println("WEAK_HASHING_CONFIG");break;
		case WEAK_CRYPTO_CONFIG: System.out.println("WEAK_CRYPTO_CONFIG");break;
		default: System.out.println("unkown taint id: {}".formatted(taintId));
		}
	}
}
