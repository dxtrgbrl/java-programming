
public class AutoCustomerComposition {
	//instance variables - in this case it would be more appropriate to store values of a customer profile, 
	//separate from the invoices. We can use composition to combine to object oriented classes.
    String strName;
    Invoice inv;
    
    public AutoCustomerComposition(String name, double invoiceTotal, String customerType)
    {
        strName = name;      
        inv = new Invoice(invoiceTotal, customerType);
    }
    
    @Override 
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("\nsName = %s\n", this.strName));
		sb.append(this.inv.toString()); //include composite class' toString()
		return sb.toString();
	}
}
