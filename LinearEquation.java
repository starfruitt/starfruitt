import java.util.Scanner;

public class LinearEquation {
   
    private double a, b, c, d, e, f;
    
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    public double getD() { return d; }
    public double getE() { return e; }
    public double getF() { return f; }

    // Check solvability
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // get X
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // get Y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter:
        System.out.println("Enter a, b, c, d, e, and f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

      
        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        
        if (equation.isSolvable()) {
            System.out.println("x is " + equation.getX());
            System.out.println("y is " + equation.getY());
        } else {
            System.out.println("The equation has no solution.");
        }

        input.close();
    }
}
