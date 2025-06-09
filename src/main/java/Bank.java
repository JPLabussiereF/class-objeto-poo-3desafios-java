import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Account account){
        accounts.add(account);
    }

    public Account shearchAccount(int number){
        for (Account account : accounts){
            if (account.getNumber() == number){
                return account;
            }
        }
        return null;
    }

    public void showAccounts(){
        if (accounts.isEmpty()){
            System.out.println("Você não tem contas. Crie contas e volte aqui para visualiza-las!");
        }
        System.out.println("===LISTAGEM DE CONTAS===");
        for (Account account: accounts){
            System.out.println("| Conta: " +account.getNumber() + " - Cliente: " + account.getClient());
        }
    }

//    public





}
