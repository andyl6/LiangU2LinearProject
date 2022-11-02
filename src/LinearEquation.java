public class LinearEquation{
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;
/* Creates a LinearEquation object */
/* PRECONDITION: x1 and x2 are NOT equal (client programs are responsible for ensuring
   this precondition is not violated)*/

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    public double distance () {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return roundedToHundredth(distance);
    }

    public double yIntercept () {
        double yintercept = y1 - slope() * x1;
        return yintercept;
    }

    public double slope () {
        return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
    }


    public String equation () {
        int numeratorOfSlope = y2 - y1;
        int denominatorOfSlope = x2 - x1;

        String slope = numeratorOfSlope + "/" + denominatorOfSlope;

        if ((numeratorOfSlope / denominatorOfSlope) % 1 == 0) {
            int wholeSlope = numeratorOfSlope / denominatorOfSlope;
            if (yIntercept() == 0) {
                return "y = " + wholeSlope + "x";
            } else if(yIntercept() < 0){
                return "y = " + wholeSlope + " - " + Math.abs(yIntercept());
            }
            return "y = " + wholeSlope + "x" + " + " + yIntercept();

        }

        if (numeratorOfSlope < 0 && denominatorOfSlope < 0) {
            slope = Math.abs(numeratorOfSlope) + "/" + Math.abs(denominatorOfSlope);
        } else if (numeratorOfSlope < 0 && denominatorOfSlope > 0) {
            slope = numeratorOfSlope + "/" + Math.abs(denominatorOfSlope);
        } else if (numeratorOfSlope > 0 && denominatorOfSlope < 0) {
            slope = "-" + denominatorOfSlope + "/" + Math.abs(denominatorOfSlope);
        }


        if (yIntercept() > 0) {
            return "y = " + slope + "x" + " + " + yIntercept();
        } else if(yIntercept() == 0){
            return "y = " + slope + "x";
        } else
            return "y = " + slope + "x" + " - " + Math.abs(yIntercept());
    }

    public String coordinateForX ( double xValue){
        return "xValue = " + xValue + " Coordinates: " + xValue + ", " + (xValue * slope() + yIntercept());
    }

    public double roundedToHundredth ( double toRound){
        double temp = toRound * 100;
        double temp2 = Math.round(temp);
        return temp2 / 100 ;
    }

    public String lineInfo () {
        return "The two points are: (" + x1 + ", " + y1 + ")" + " and   (" + x2 + ", " + y2 + ")" + "\n" + "The equation of the line between these points is: " + equation() + "\n"
                + "The slope of this line is: " + slope() + "\n" + "the y-intercept of this line is: " + yIntercept() + "\n" + "The distance between the two points is: " + distance();
    }


}