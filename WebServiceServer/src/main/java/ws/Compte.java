package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date dataCreation;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDataCreation() {
        return dataCreation;
    }

    public void setDataCreation(Date dataCreation) {
        this.dataCreation = dataCreation;
    }

    public Compte(int code, double solde, Date dataCreation) {
        this.code = code;
        this.solde = solde;
        this.dataCreation = dataCreation;
    }

    public Compte() {
    }
}
