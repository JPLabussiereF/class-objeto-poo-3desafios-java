public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.432);
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.showInfo();


        Funcionario funcionario = new Funcionario("João Pedro", "Estagiário", 1000.00);
        funcionario.addExtraHours(3);
        funcionario.promote("Pedreiro", 2000.00);
        funcionario.generatePayCheck();

        Cliente cliente = new Cliente("João Pedro", "86588340508", "15102003");
        cliente.cpfValidator();
        System.out.println("Idade: " + cliente.calculateAge() + " anos");


    }
}