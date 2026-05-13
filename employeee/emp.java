package employe;

public class emp
{
    // Data members
    String name;
    int empid;
    String category;
    double basicpay, hra, da, allowance;
    double grosspay, pf, incometax, netpay;

    // Method to assign values
    public void getData(String n, int id, String c, double bp)
    {
        name = n;
        empid = id;
        category = c;
        basicpay = bp;
    }

    // Method to calculate salary
    public void calculate()
    {
        hra = basicpay * 0.20;
        da = basicpay * 0.10;
        allowance = basicpay * 0.05;

        grosspay = basicpay + hra + da + allowance;

        pf = basicpay * 0.12;
        incometax = grosspay * 0.10;

        netpay = grosspay - pf - incometax;
    }

    // Method to display details
    public void display()
    {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + empid);
        System.out.println("Category : " + category);
        System.out.println("Basic Pay : " + basicpay);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Allowance : " + allowance);
        System.out.println("Gross Pay : " + grosspay);
        System.out.println("Provident Fund : " + pf);
        System.out.println("Income Tax : " + incometax);
        System.out.println("Net Pay : " + netpay);
    }
}
