public class Circle {
    private double ray;

    public Circle(double ray){
        if(ray >=0){
            this.ray = ray;
        } else {
            throw new IllegalArgumentException("O raio deve ser maior ou igual a 0");
        }
    }

    public double setRay(){
        return ray;
    }

    public double getRay(){
        return ray;
    }

    public double calculateArea(){
        double area = Math.PI * Math.pow(ray,2);
        System.out.printf("A área do círculo é: %.2f\n", area);
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = Math.PI * 2 * ray;
        System.out.printf("O perímetro do círculo é: %.2f\n", perimeter);
        return perimeter;
    }

    public void showInfo(){
        System.out.println("===INFORMAÇÕES DO CÍRCULO===");
        System.out.printf("O raio do círculo é: %.2f\nA área do círculo é: %.2f\nO perímetro do círculo é: %.2f\n", ray, calculateArea(), calculatePerimeter());
    }

}

