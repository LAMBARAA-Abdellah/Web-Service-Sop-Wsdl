package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
//POJO  plain old java object
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConvertToDirham")
    public double conversion(@WebParam(name = "montant") double amount) {
        return amount * 11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, 1000 + Math.random()*9888, new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1, 1000 + Math.random()*9888, new Date()),
                new Compte(2, 1000 + Math.random()*9888, new Date()),
                new Compte(3, 1000 + Math.random()*9888, new Date())
        );
    }
}
