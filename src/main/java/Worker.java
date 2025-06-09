public class Worker {
    private String name;
    private String role;
    private double baseSalary;
    private int extraHours;

    public Worker(String name, String role, double baseSalary){
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
        this.extraHours = 0;
    }

    public int addExtraHours(int hours){
        if (hours > 0){
            extraHours += hours;
            return extraHours;
        }
        throw new IllegalArgumentException("Digite uma quantidade de horas maior do que 0");

    }

    public double calculateTotalSalary(){
        double totalSalary = baseSalary + (extraHours * 100.50);
        return totalSalary;
    }

    public void promote(String newRole, double increase){
        role = newRole;
        baseSalary += increase;
        System.out.printf("Parabéns pela promoção, você foi promovido para '%s', e teve um aumento de salário de 'R$ %.2f'\n", role, baseSalary);
    }

    public void generatePayCheck(){
        System.out.println("===CONTRA CHEQUE===");
        System.out.printf("Nome: %s\nCargo: %s\nSalário Base: %.2f\nHoras Extras: %d\nSalário Total: %.2f\n",name, role, baseSalary, extraHours, calculateTotalSalary());
    }



}
