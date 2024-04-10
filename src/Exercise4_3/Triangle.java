package Exercise4_3;

public class Triangle {
    // variables to store the lengths of the three triangles
    private double side1;
    private double side2;
    private double side3;

    // Constructor to provide the triangle with each of the side lengths
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
   // Main method to test the triangles
    public static void main(String[] args) {
        // Create Triangle objects with different side lengths
        try {
            Triangle t1 = new Triangle(3.0, 4.0, 6.0);
            System.out.println("Triangle 1: " + t1.checkSides());

            Triangle t2 = new Triangle(2.0, 5.0, 6.0);
            System.out.println("Triangle 2: " + t2.checkSides());

            Triangle t3 = new Triangle(1.0, 1.0, 1.0);
            System.out.println("Triangle 3: " + t3.checkSides());
        } catch (IllegalTriangleSideException e) {
            System.out.println("Exception was caught: " + e.getMessage());
        }
    }
    // Method to check if the triangle's sides meet the criteria
    public boolean checkSides() throws IllegalTriangleSideException {
        if (!(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)) {
            throw new IllegalTriangleSideException("Error. Wrong triangles sides!");
        }
        return true;
    }
}
