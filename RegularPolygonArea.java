import java.util.Scanner;

public class RegularPolygonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user for the number of sides
        System.out.print("Enter the number of sides: ");
        int n = scanner.nextInt();

        // Prompting the user for the length of a side
        System.out.print("Enter the side: ");
        double s = scanner.nextDouble();

        // Calculating the area of the polygon
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        // Displaying the result
        System.out.printf("The area of the polygon is %.12f%n", area);
    }
}
