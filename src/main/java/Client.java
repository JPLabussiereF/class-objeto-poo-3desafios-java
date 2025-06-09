import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Client {
    private String name;
    private String cpf;
    private String dateOfBirth;

    public Client(String name, String cpf, String dateOfBirth){
        this.name = name;
        this.cpf = cpf;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void cpfValidator(){
        int sumFirstDigit = 0;
        int sumSecondDigit = 0;

        for (int i = 0; i < 9; i++) {
            int aux = Character.getNumericValue(cpf.charAt(i));
            sumFirstDigit += aux * (10-i);
        }

        sumFirstDigit %= 11;
        int valueFistDigit;

        if (sumFirstDigit <2){
            valueFistDigit = 0;
        } else {
            valueFistDigit = 11 - sumFirstDigit;
        }

        for (int i = 0; i < 10; i++) {
            int aux = Character.getNumericValue(cpf.charAt(i));
            sumSecondDigit += aux * (11-i);
        }

        sumSecondDigit %=11;
        int valueSecondDigit;

        if (sumSecondDigit <2){
            valueSecondDigit = 0;
        } else {
            valueSecondDigit = 11 - sumSecondDigit;
        }

        boolean isValid;

        isValid = valueFistDigit == Character.getNumericValue(cpf.charAt(9)) && valueSecondDigit == Character.getNumericValue(cpf.charAt(10));

        String message = isValid ? "Seu CPF é válido!" : "Seu CPF é inválido!";
        System.out.println(message);
    }

    public int calculateAge(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

        LocalDate nascimento = LocalDate.parse(this.dateOfBirth, formatter);

        LocalDate today = LocalDate.now();

        return Period.between(nascimento, today).getYears();
    }

}
