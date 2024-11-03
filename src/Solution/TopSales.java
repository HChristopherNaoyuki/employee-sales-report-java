package Solution;

import java.text.DecimalFormat;

public class TopSales 
{
    public static void main(String[] args) 
    {
        // Employee numbers
        String[] EMPLOYEE_NUMBER = 
        {
            "101111",
            "101122",
            "101133",
            "101144",
            "101155"
        };
        
        // Number of employees
        int nums = EMPLOYEE_NUMBER.length;
        
        // Sales data for each employee
        double[][] SALES = 
        {
            {3000.00, 2000.00, 3500.00},
            {2500.00, 5500.00, 3500.00},
            {1100.00, 2000.00, 4500.00},
            {1700.00, 2700.00, 2500.00},
            {5000.00, 2900.00, 5900.00}
        };
        
        // Create a DecimalFormat instance for formatting numbers
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        // Print header for sales report
        System.out.println("***********************************************************************************");
        System.out.println("EMPLOYEE SALES REPORT");
        System.out.println("***********************************************************************************");
        System.out.println("\t\t\tSALES 1\t\t\tSALES 2\t\t\tSALES 3");
        
        // Loop through employees and print their sales
        for (int i = 0; i < nums; i++) 
        {
            System.out.println(
                EMPLOYEE_NUMBER[i] + " --> \t\tR " + 
                df.format(SALES[i][0]) + "\t\tR "  + 
                df.format(SALES[i][1]) + "\t\tR "  + 
                df.format(SALES[i][2])
            );
        }
        
        // Print header for total sales
        System.out.println("***********************************************************************************");
        System.out.println("EMPLOYEE TOTAL SALES");
        System.out.println("***********************************************************************************");
        
        // Loop through employees and calculate total sales
        for (int x = 0; x < nums; x++) 
        {
            double SUM = SALES[x][0] + SALES[x][1] + SALES[x][2];
            System.out.println(EMPLOYEE_NUMBER[x] + " -->  R " + df.format(SUM));
        }
        
        // End of report
        System.out.println("***********************************************************************************");
    }
}
