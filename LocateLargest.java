import java.util.Scanner;

class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
}

public class LocateLargest {
    public static Location locateLargest(double[][] array) {
        int row = 0, column = 0;
        double maxValue = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new Location(row, column, maxValue);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter rows and columns
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

       //Create array and prompt user
        double[][] array = new double[rows][columns];
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location location = locateLargest(array);
       
        System.out.printf("The location of the largest element is %.2f at (%d, %d)%n",location.maxValue, location.row, location.column);
    }
}
