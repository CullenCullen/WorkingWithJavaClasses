/**
 * Author: Cullen Shortt
   This class instantiates Family objects by using method calls 
   to the Family class.It displays the Annual Income, number of dependents, the insurance
   rate, and the withholding amount. It uses getter and setters methods to set the 
   date fields of the different family objects. 
*/
import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class TestFamily {
   
   public static void main(String [] args) {
      
  
   //This instance starts with no input data, then changes data initial value
   //using a setter metho.
      Family family1 = new Family(); 
      family1.setAnnualIncome(12000);
      family1.calcInsurance(.065);
      family1.calcWithhold();
      System.out.println(" Family 1 Information");
      printInfo(family1.getDependents(), family1.getAnnualIncome(),family1.calcInsurance(),family1.calcWithhold());
    
      Family family2 = new Family(25000);
      family2.setDependents(2);
      double family2Insurance = family2.calcInsurance(); 
      double family2Withholding = family2.calcWithhold();
      System.out.println("\n Family 2 Information");
      printInfo(family2.getDependents(), family2.getAnnualIncome(), family2Insurance, family2Withholding);
      
      String userDependents;
      int    numDependents;
      String userAnnualIncome;
      double annualIncome;
      
        
        //Collecting # of dependents and annual salary from user for Family 3 values. 
        userDependents = JOptionPane.showInputDialog(null, "How many dependents are in your family?", 
        " # of Dependents", JOptionPane.QUESTION_MESSAGE);
        
        //converts user input from a String value into an integer value and stores in variable.
        numDependents = Integer.parseInt(userDependents);

        userAnnualIncome = JOptionPane.showInputDialog(null, "What is your family's annual salary?",
        "Annual Salary", JOptionPane.QUESTION_MESSAGE);
        
        //converts userinput from a String value into an integer value and stores in variable.
        annualIncome = Double.parseDouble(userAnnualIncome);
       
         
         Family family3 = new Family(numDependents, annualIncome);
         System.out.println("\n Family 3 Information");
         printInfo(family3.getDependents(), family3.getAnnualIncome(),family3.calcInsurance(.07), family3.calcWithhold());
   }
         
   
    public static void printInfo(int dependents, double aIncome, double insuranceRate, double withHolding)
         {  
            // Print output with appropriate formatting
		      NumberFormat money = NumberFormat.getCurrencyInstance();
            System.out.println(" Number of dependents = "+ dependents +"\n Annual Income: " + money.format(aIncome) +
             "\n Insurance Cost: " + money.format(insuranceRate) + "\n Withholding Amount: " + money.format(withHolding));
             
         }

     
}