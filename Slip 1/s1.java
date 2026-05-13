class s1 {
public static void main(String args[]) {
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
System.out.println("Sum = " + (a + b));
if(a > b)
System.out.println("Largest = " + a);
else
System.out.println("Largest = " + b);
if(a % 2 == 0)
System.out.println(a + " is Even");
else
System.out.println(a + " is Odd");
if(b % 2 == 0)
System.out.println(b + " is Even");
else
System.out.println(b + " is Odd");
}
}
