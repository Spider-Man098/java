package slip2_1;
/* Create a hierarchy of Employee, Manager, Sales Manager, they should have the
following functionality:
A. Employee: Display name, date of birth and id of Employee.
B. Manager: Display all above information with salary drawn.
C. Sales Manager: Display all above information and commission if applicable. */


package Slip2_1;

class Emp{
    String name;
    String dob;
    int id;
    Emp(String name,String dob,int id){
        this.name=name;
        this.dob=dob;
        this.id=id;
    }
    void display()
    {
        System.out.println("Employee name is:"+name);
        System.out.println("Employee birth date:"+dob);
        System.out.println("Employee id is:"+id);
    }
}

class Manager extends Emp
{
    double salary;
    Manager(String name,String dob,int id,double salary)
    {
        super(name,dob,id);
        this.salary=salary;
    }
    void display()
    {
        super.display();
        System.out.println("salary is:"+salary);
    }
}
class SalesManager extends Manager
{
    double commission;
    SalesManager(String name,String dob,int id,double salary,double commission)
    {
        super(name,dob,id,salary);
        this.commission=commission;
    }
    void display()
    {
        super.display();
        System.out.println("Commission is:"+commission);
    }
}

public class Employee
{
    public static void main(String[] args)
    {
        System.out.println("Employee details are");
        Emp emp=new Emp("Sk","18-5-2004",1);
        emp.display();

        System.out.println("Manager details are");
        Manager mrg=new Manager("Ak","19-4-2004",2,50000);
        mrg.display();

        System.out.println("Sales Manager details are");
        SalesManager sm=new SalesManager("Pk","20-6-2004",3,60000,5000);
        sm.display();
    }
    
}

