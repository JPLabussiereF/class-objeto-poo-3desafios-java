import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int number;
    private Cliente cliente;
    private double saldo;
    private double limit;
    private List<String> history;

    public Conta(int number, Cliente cliente, double limit){
        this.number = number;
        this.cliente = cliente;
        this.limit = limit;
        this.saldo = 0;
        this.history = new ArrayList<>();
    }

    public void deposit(double value){
        System.out.println("Deposito feito com sucesso");
        history.add("Deposito feito no valor de: " + value);
        saldo += value;
    }

    public boolean withdraw(double value){
        if (value > (saldo+limit)){
            System.out.println("Voce não tem limite suficiente para sacar! Tente novamente.\n Dinheiro atual em conta: " + saldo + "\nLimite atual para saques: " + limit);
            return false;
        }
        history.add("Saque feito no valor de : " + value);
        saldo -= value;
        return true;
    }

//    public boolean transfer();

}
