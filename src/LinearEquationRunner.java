import java.util.Scanner;

class LinearEquationRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1 (WITH PARENTHESES): ");
        String coord1 = scan.nextLine();

        int num = coord1.indexOf(",");
        String num1 = coord1.substring(1, num);
        int x1 = Integer.parseInt(num1);


        int num2 = coord1.indexOf( ")" );
        String num3 = coord1.substring(coord1.indexOf(",") + 1, num2);
        int y1 = Integer.parseInt(num3);

        System.out.println(" ");
        System.out.print("Enter coordinate 2 (WITH PARENTHESES): ");
        String coord2 = scan.nextLine();

        int num4 = coord2.indexOf(",");
        String num5 = coord2.substring(1, num4);
        int x2 = Integer.parseInt(num5);


        int num6 = coord2.indexOf( ")" );
        String num7 = coord2.substring(coord2.indexOf(",") + 1, num6);
        int y2 = Integer.parseInt(num7);


        if(x1 == x2){
            System.out.println("No");
        } else {
            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
            System.out.println("Equation: " + equation.equation());
            System.out.println("Slope: " + equation.slope());
            System.out.println("y-intercept: " + equation.yIntercept());
            System.out.println("Distance: " + equation.distance());
            System.out.println();
            System.out.println("----- Line info -----");
            System.out.println(equation.lineInfo());
            System.out.println();
            double testX = 4;
            System.out.println("Coordinate for x: " + equation.coordinateForX(testX));

        }

    }
}