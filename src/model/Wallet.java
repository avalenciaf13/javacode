package model;

public class Wallet{

    public static final int CAPACIDADMAXIMA = 1000000;

    private int saldo;
    private boolean tieneLimite;

    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;   
    }

    public String saveMoney(int valor){
        if (valor < 0){
            return "Debe digitar una cantidad válida";
        }
        if (tieneLimite && valor + saldo > CAPACIDADMAXIMA){
            return "El saldo no puede superar la capacidad maxima"
        }
        saldo += valor;
        return "Transaccion exitosa!";
    }

    public String sendMoney(int valor){
        if (valor > saldo){
            return "Debe digitar una cantidad válida";
        }
        if (tieneLimite && valor + saldo > CAPACIDADMAXIMA){
            return "El saldo no puede superar la capacidad maxima"
        }
        saldo += valor;
        return "Transaccion exitosa!";
    }
    
}