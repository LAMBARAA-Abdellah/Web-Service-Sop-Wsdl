import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWebService {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.convertToDirham(100));
        System.out.println("-------------------------------");
        Compte cp=proxy.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println("-------------------------------");
        List<Compte> compteList = proxy.listComptes();
        compteList.forEach(c -> {
                System.out.println("-------------------------------");
                System.out.println(c.getCode());
                System.out.println(c.getSolde());
                System.out.println(c.getDataCreation());
        });

    }
}
