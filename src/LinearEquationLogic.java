import java.util.Scanner;
public class LinearEquationLogic {
        private Scanner scan;
        private String coordinateset1 = "";
        private String coordinateset2 = "";

        public LinearEquationLogic () {
            scan = new Scanner(System.in);
        }
        public void start() {
            System.out.println("Welcome, this is the linear equation thingymabob");
            System.out.println("enter your first coordinate pair");
            System.out.println("x");
            int x1 = scan.nextInt();
            System.out.println("y");
            int y1 = scan.nextInt();
            System.out.println("enter your second coordinate pair");
            System.out.println("x");
            int x2 = scan.nextInt();
            System.out.println("y");
            int y2 = scan.nextInt();
            if (x1 == x2) {
                System.out.println("i see what you did there, trying to make a vertical line huh?");
            }
            LinearEquation linear = new LinearEquation(x1,y1,x2,y2);
            System.out.println(linear.lineInfo());
            System.out.println("enter an x value");
            double x3 = scan.nextDouble();
            double y3 = linear.slope() * x3 + linear.yintercept();
            System.out.println(x3 + ", " + y3);
            System.out.println("wanna go again yes or no?");
            String answer = scan.nextLine();
            while (answer.equals("yes")) {
                x3 = scan.nextDouble();
                y3 = linear.slope() * x3 + linear.yintercept();
                System.out.println(x3 + ", " + y3);
                System.out.println("wanna go again yes or no?");
                answer = scan.nextLine();
            }
        }
}
