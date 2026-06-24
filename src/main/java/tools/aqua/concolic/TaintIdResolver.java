package tools.aqua.concolic;

import static tools.aqua.concolic.Tainting.XSS;
import static tools.aqua.concolic.Tainting.SQL_INJECTION;
import static tools.aqua.concolic.Tainting.CMD_INJECTION;
import static tools.aqua.concolic.Tainting.WEAK_HASHING_CONFIG;
import static tools.aqua.concolic.Tainting.WEAK_CRYPTO_CONFIG;
import static tools.aqua.concolic.Tainting.XPATH_INJECTION;
import static tools.aqua.concolic.Tainting.LDAP_INJECTION;
import static tools.aqua.concolic.Tainting.PATH_TRAVERSAL;
import static tools.aqua.concolic.Tainting.TRUST_BOUND;

public class TaintIdResolver {

    public static void main(String args[]) {
        String taintId = args[0];
        switch (Integer.parseInt(taintId)) {
            case XSS:
                System.out.println("XSS");
                break;
            case SQL_INJECTION:
                System.out.println("SQL_INJECTION");
                break;
            case CMD_INJECTION:
                System.out.println("CMD_INJECTION");
                break;
            case WEAK_HASHING_CONFIG:
                System.out.println("WEAK_HASHING_CONFIG");
                break;
            case WEAK_CRYPTO_CONFIG:
                System.out.println("WEAK_CRYPTO_CONFIG");
                break;
            case XPATH_INJECTION:
                System.out.println("XPATH_INJECTION_TAINT");
                break;
            case LDAP_INJECTION:
                System.out.println("LDAP_INJECTION_TAINT");
                break;
            case PATH_TRAVERSAL:
                System.out.println("PATH_TRAVERSAL_TAINT");
                break;
            case TRUST_BOUND:
                System.out.println("TRUST_BOUND_TAINT");
                break;
            default:
                System.out.println("unkown taint id: {}".formatted(taintId));
        }
    }
}
