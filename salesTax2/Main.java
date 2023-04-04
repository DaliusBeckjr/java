import java.util.Scanner;
  
class Main {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int purchase; // the user input the amount he 
                  // purchased
    double stateTax; // should be 2 percent
    double countyTax; // should be 4 percent
    double totalTax; // total amount of taxes all together

    System.out.println("How much was your purchase?");
    purchase = keyboard.nextInt();

    // formulas for program
    stateTax = purchase * 0.02;
    countyTax = purchase * 0.04;
    totalTax = stateTax + countyTax;

    //call methods 
    showStateTax(purchase, stateTax);
    showCountyTax(purchase, countyTax);
    showTotalTax(stateTax, countyTax, totalTax);  
  }
  //
  //
  //
  static void showStateTax(int purchase, double stateTax) {
    
    System.out.println("Your state tax is $" + stateTax);
  }
  //
  //
  //
  static void showCountyTax(int purchase, double countyTax) {
    
    System.out.println("Your county tax is $" + countyTax);
  }
  //
  //
  //
  static void showTotalTax(double stateTax, double countyTax, double totalTax) {
    
    System.out.println("Your total taxes are $" + totalTax);
  }
}