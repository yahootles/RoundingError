/*
 * Andrew Thompson
 * February 19, 2020
 * Rounding Error: determines the rounding error from the square root function
 */
package roundingerror;

/**
 *
 * @author antho6229
 */
import javax.swing.JOptionPane;

public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variable declaration
        double inputNum; //number that is input by user
        double squareOfRoot; //the square of the square root of the input number
        double error; //the difference between the inpur number and the square of the square root (error)

        boolean flag = false;
        while (!flag) {
            try {
                //get number from user
                inputNum = Double.parseDouble(JOptionPane.showInputDialog("Please enter a number"));

                //calculations
                squareOfRoot = Math.pow(Math.sqrt(inputNum), 2);
                error = inputNum - squareOfRoot;

                flag = true;
                
                System.out.println("The square of the square root = " + squareOfRoot);
                System.out.println("The round off error = " + error);
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input.");
            } catch (NullPointerException nfe){
                System.exit(0);
            }
        }
    }

}
