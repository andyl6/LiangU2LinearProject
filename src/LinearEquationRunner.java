import java.util.Scanner;

class LinearEquationRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: (x,y)");
        String coord1 = scan.nextLine();

        int temp = coord1.indexOf(",");
        String temp1 = coord1.substring(1, temp);
        int x1 = Integer.parseInt(temp1);


        int temp2 = coord1.indexOf( ")" );
        String temp3 = coord1.substring(coord1.indexOf(",") + 1, temp2);
        int y1 = Integer.parseInt(temp3);


        System.out.println("Enter coordinate 2: (x,y)");
        String coord2 = scan.nextLine();

        int temp4 = coord2.indexOf(",");
        String temp5 = coord2.substring(1, temp4);
        int x2 = Integer.parseInt(temp5);


        int temp6 = coord2.indexOf( ")" );
        String temp7 = coord2.substring(coord2.indexOf(",") + 1, temp6);
        int y2 = Integer.parseInt(temp7);


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

        }

    }
}