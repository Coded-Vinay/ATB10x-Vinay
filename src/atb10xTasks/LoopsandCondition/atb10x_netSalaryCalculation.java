package atb10xTasks.LoopsandCondition;


/*
TODO: Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)
 Salary Calculation Rules:
 * Basic Pay (BP): The core salary amount agreed upon before any allowances or deductions.
 * House Rent Allowance (HRA):
 >>>> If the employee lives in a metro city → HRA = 50% of Basic Pay
 >>>> If the employee lives in a non-metro city → HRA = 40% of Basic Pay
 * Dearness Allowance (DA): DA is calculated as a percentage of Basic Pay (varies by organization).
 Example: DA = 20% of Basic Pay
 Gross Salary Calculation: GrossSalary=BP+HRA+DA
 *Tax Deductions:
 >>>> Provident Fund (PF): 12% of Basic Pay
 >>>> Professional Tax (PT): Fixed amount (e.g., ₹200 per month)
 >>>> Income Tax (IT): Based on applicable tax slabs. Example:
 >>>> Income up to ₹2,50,000 → No tax
 >>>> ₹2,50,001 – ₹5,00,000 → 5% of taxable income
 >>>> ₹5,00,001 – ₹10,00,000 → 20% of taxable income
 >>>> Above ₹10,00,000 → 30% of taxable income
 * Net Salary Calculation: >> NetSalary=GrossSalary−(PF+PT+IncomeTax)
 */


import java.util.Scanner;

public class atb10x_netSalaryCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the resident City ==>>");
        String City = sc.nextLine();
        System.out.print("Enter the Base Pay ===>> ");
        double BP = sc.nextFloat();
        double HRA, DA, PF, IncomeTax;
        int PT = 200; // >>>> Professional Tax (PT): Fixed amount (let's assume ₹200 per month)

        HRA = HRACalculation(BP, City);
        DA = DACalculation(BP);
        PF = PFCalcualtion(BP);
        IncomeTax = ITCalcualtion(BP);

        double GrossSalary = BP + HRA + DA;
        System.out.println("Gross Salary = " + GrossSalary);
        double Taxes = PF + PT + IncomeTax;
        System.out.println("Tax Deductions = " + Taxes);
        double NetSalary = GrossSalary + Taxes;
        System.out.println("Net Salary = " + NetSalary);

    }


/* TODO: House Rent Allowance (HRA):
>>>> If the employee lives in a metro city → HRA = 50% of Basic Pay
>>>> If the employee lives in a non-metro city → HRA = 40% of Basic Pay
*/

    static double HRACalculation(double basePay, String metroCity) {
        double HRA;
        if (metroCity.equalsIgnoreCase("Delhi") || metroCity.equalsIgnoreCase("Mumbai") || metroCity.equalsIgnoreCase("Kolkata") || metroCity.equalsIgnoreCase("Banglore")) {
            HRA = (basePay * 0.5);
            System.out.println("HRA amount is ₹" + HRA);
            return HRA;
        } else {
            HRA = (basePay * 0.4);
            System.out.println("HRA amount is ₹" + HRA);
            return HRA;
        }
    }

    /* TODO: Dearness Allowance (DA)
    DA is calculated as a percentage of Basic Pay (varies by organization).
    lets Assume DA = 20% of Basic Pay
    */
    static double DACalculation(double basePay) {
        double DA = basePay * 0.2;
        System.out.println("DA amount is ₹" + DA);
        return DA;
    }


/* TODO: Tax Deductions:
 >>>> Provident Fund (PF): 12% of Basic Pay
*/

    static double PFCalcualtion(double basePay) {
        double PF = basePay * 0.12;
        System.out.println("Deducted PF amount is ₹" + PF);
        return PF;
    }


/*  TODO >>>> Income Tax (IT): Based on applicable tax slabs.
 >>>> Income up to ₹2,50,000 → No tax
 >>>> ₹2,50,001 – ₹5,00,000 → 5% of taxable income
 >>>> ₹5,00,001 – ₹10,00,000 → 20% of taxable income
 >>>> Above ₹10,00,000 → 30% of taxable income
 */

    static double ITCalcualtion(double basePay) {
        double IT ;
        if (basePay <= 500000 && basePay >= 250001) {
            IT = basePay * 0.05;
            System.out.println("Deducted Income Tax amount is ₹" + IT);
            return IT;
        } else if (basePay <= 1000000 && basePay >= 500001) {
            IT = basePay * 0.2;
            System.out.println("Deducted Income Tax amount is ₹" + IT);
            return IT;
        } else {
            IT = basePay * 0.3;
            System.out.println("Deducted Income Tax amount is ₹" + IT);
            return IT;
        }}

}
