// Account class with a constructor to validate and
// initialize instance variable balance of type double
public class Account {
	private double balance;
	
    // constructor
	public Account( double initialBalance ) {
		if ( initialBalance > 0.0 )
			balance = initialBalance;
		
	} //end Account constructor
	
	// credit (add) an amount to the amount
	public void credit( double amount )
	{
		balance = balance + amount; // add amount to blance
	} // end credit method
	
	// return the amount balance
	public double getBalance()
	{
		return balance;
	}

}
