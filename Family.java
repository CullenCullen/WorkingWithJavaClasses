/**
 * Author: Cullen Shortt
   This class creates Family objects based on user input from the TestFamily class. 
   It has has a default constructor and constructor with predetermined values. 
*/

public class Family {
   
   //instance variables
   private int numDependents;
   private double annualIncome;
  
   
   //Instance Methods
   
   public Family()
    {
      numDependents = 1;
      annualIncome = 0;
    }
    
    public Family(double annualIncome) 
    {
      this.annualIncome = annualIncome;
      numDependents = 1;
    }
    
    public Family(int numDependents, double annualIncome)
    {
      this.numDependents = numDependents;
      this.annualIncome = annualIncome;
    }


   //Accessor Methods
   public int getDependents()
   {
      return numDependents;
   }
   
   public double getAnnualIncome()
   {
      return annualIncome;
   }
   
   //Setter Methods
   public void setDependents(int numDependents)
   {
      this.numDependents = numDependents;
   }
   
   public void setAnnualIncome(double annualIncome)
   {
      this.annualIncome = annualIncome;
   }
   
   //A Function with one input argument representing an insurance rate.
   public double calcInsurance(double insuranceRate)
   {
      return roundMoney(numDependents * annualIncome * insuranceRate);
   }
   
   //A function with no arguments. It calculates and returns an insurance charge 
   //using a default insurance rate of 10%.
   public double calcInsurance() 
   {
      return roundMoney(numDependents * annualIncome * .10);
   }
   
   //a function to calculate and return a withholding amount.
   public double calcWithhold()
   {
      return roundMoney((annualIncome *.22) - (500 * numDependents));
   }
   
   // Method to round the input value to the nearest "cents" amount
   public static float roundMoney(double money) {

      int temp;
      temp = (int)(money * 100.00 + .5);
      return ((float)temp /100);
   }
   
}