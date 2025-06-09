public class Main {
    public static void main(String[] args) {

//        Circle circulo = new Circle(4.432);
//        circulo.calculateArea();
//        circulo.calculatePerimeter();
//        circulo.showInfo();
//
//        Worker funcionario = new Worker("João Pedro", "Estagiário", 1000.00);
//        funcionario.addExtraHours(3);
//        funcionario.promote("Pedreiro", 2000.00);
//        funcionario.generatePayCheck();
//
//
        Client cliente = new Client("João Pedro", "86588340508", "15102003");
        Client cliente2 = new Client("Júlio", "83522172311", "20042003");
//
//        cliente.cpfValidator();
//        System.out.println("Idade: " + cliente.calculateAge() + " anos");


        Account conta = new Account(1, cliente, 100);
        Account conta2 = new Account(1, cliente2, 200);

        conta.deposit(300);
        conta.withdraw(100);
        conta.transfer(conta2, 300);
        conta.viewExtract();


    }
}