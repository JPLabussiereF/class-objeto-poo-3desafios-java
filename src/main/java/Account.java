import java.util.ArrayList;
import java.util.List;

public class Account {
    private int number;
    private Client client;
    private double balance;
    private double limit;
    private List<String> history;

    public Account(int number, Client client, double limit){
        this.number = number;
        this.client = client;
        this.limit = limit;
        this.balance = 0;
        this.history = new ArrayList<>();
    }

    public Client getClient() {
        return client;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
        history.add("Deposito feito no valor de: R$ " + value +"");
        balance += value;
    }

    public boolean withdraw(double value){
        if (value > (balance+limit)){
            System.out.println("Voce não tem limite suficiente para sacar! Tente novamente.\nDinheiro atual em conta: " + balance + "\nLimite atual para saques: " + limit);
            return false;
        }
        history.add("Saque feito no valor de: R$ " + value+"!");
        balance -= value;
        return true;
    }

    public boolean transfer(Account destiny, double value){
        if (value > (balance+limit)){
            System.out.println("Voce não tem limite suficiente para sacar! Tente novamente.\nDinheiro atual em conta: " + balance + "\nLimite atual para saques: " + limit);
            return false;
        }
        history.add("Transferencia feita no valor de R$ " + value + ", para a conta de número '" +destiny.number +"'!");
        destiny.deposit(value);
        balance -= value;
        return true;
    }

    public void viewExtract(){
        if (history.isEmpty()){
            System.out.println("O seu extrato está vazio. Faça transações para poder visualiza-las aqui!");
        }

        //        System.out.println(history);

        System.out.println("===EXTRATO DA CONTA: " + number + "===");

        for (String info : history){
            System.out.println(info);
        }

        System.out.println("\n\nSALDO ATUAL: " + balance);

    }


}
