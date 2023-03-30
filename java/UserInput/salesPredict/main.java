// Name:            Dalius Beck
// Date:            Mar 29, 2023
// Description:     A company has determined that it's annual profit is
//                  typically 23 percent of total sales. Design a program
//                  that asks the user to enter the projected amount of 
//                  total sales. and then display that will be made  
//                  from that amount. Practice (1/16)

import java.util.Scanner;

class Main {
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
int totalSales;

    System.out.println("what's the total sales? ");
    totalSales = keyboard.nextInt();

    double annualProfit = totalSales * 0.23;
    System.out.println("The annual profit is: " + annualProfit);
    
}
}