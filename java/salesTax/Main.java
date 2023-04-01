import java.util.Scanner;
  
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int purchase; // the user input the amount he purchased
    double stateTax; // should be 2 percent
    double countyTax; // should be 4 percent
    double totalTax; // total amount of taxes all together

    System.out.println("How much was your purchase?");
    purchase = keyboard.nextInt();

    stateTax = purchase * 0.02;
    System.out.println("Your state tax is $" + stateTax);

    countyTax = purchase * 0.04;
    System.out.println("Your county tax is $" + countyTax);

    totalTax = stateTax + countyTax;
    System.out.println("Your total taxes are $" + totalTax);
    
  }
}