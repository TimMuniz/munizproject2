public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    public LinearEquation ( int x1 , int y1 , int x2 , int y2 ) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }


    private double roundedToHundreth (double toRound) {
        return ((int)(toRound *100))/100;
    }


    public double distance () {
        int a = (x2 - x1);
        int b = (y2 - y1);
        double pythag = roundedToHundreth(Math.sqrt(a^2 + b^2));
        return pythag;
    }
    public double slope () {
        double slopecalc = roundedToHundreth(((x2 - x1)/(y2 - y1)));
        return slopecalc;
    }
    public double yintercept () {
        int distzero = (0 - y1);
        double yinter = roundedToHundreth((((x2 - x1)/(y2 - y1))*distzero) + y1);
        return yinter;
    }
    public String equation () {
        return "y = " + (x2-x1) + "/" + (y2-y1) + "x + " + yintercept();
    }
    public String coordinateforX (double x) {
        double y = roundedToHundreth(Double.parseDouble(equation()));
        return "(" + x + ", " + y + ")";
    }
    public String lineInfo () {
        String linestuff = "slope: " + slope() + " distance: " + distance() + " y intercept: " + yintercept() + " equation: " + equation();
        return linestuff;
    }

}
