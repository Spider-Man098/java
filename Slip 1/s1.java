class slip1  {
	public static void main(String args[]) {
	int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
	System.out.println(" Sum = " + ( a + b ) );

       if(a > b ) {  
	System.out.println(" A is greater than B " );
	}
	else if ( a < b ) {
	System.out.println( " B is greater than A " );
	}
  if ( a % 2 == 0 ) {
	System.out.println( " A is even " ) ;
	}
	else {
	System.out.println( " A is odd " ) ;
	}
	if ( b % 2 == 0 ) {
	System.out.println( " B is even " ) ;
	}
	else {
	System.out.println( " B is odd " ) ;
	}
	try {
		int div = a/b;
		System.out.println("Division = " + div );
	}
		catch (ArithmeticException e ) {
		System.out.println("Cannot divide by zero");
	}

	}
}
