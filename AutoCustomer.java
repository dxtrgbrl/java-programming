
public class AutoCustomer {
	//instance variables
    String strName;
    double dInvoiceTotal;
    double dNewInvTotal;

    //default constructor
    public AutoCustomer()
    { 
        //setting default values
        strName = "John";
        dInvoiceTotal = 0;
        dNewInvTotal = 0;
    }

    //custom constructor
    public AutoCustomer(String name, double invoiceTotal, double newInvoiceTotal)
    {
        strName = name;
        dInvoiceTotal = invoiceTotal;
        dNewInvTotal = newInvoiceTotal;
    }

    public String getName()
    {        
        return this.strName;
    }
    
    public void setName(String value)
    {        
       this.strName = value;
    }

    public double getInvoiceTotal()
    {
        return this.dInvoiceTotal;
    }
    
    public void setInvoiceTotal(double value)
    {
        this.dInvoiceTotal = value;
    }

    public double getNewInvoiceTotal()
    {
    	return this.dNewInvTotal;
    }
    
    public void setNewInvoiceTotal(double value)
    {
        this.dNewInvTotal = value;
    }

    public void fnDiscountGiven()
    {
        if ((strName.charAt(0) >= 'A' && strName.charAt(0) <= 'G'))
            dNewInvTotal = dInvoiceTotal * 0.95;
        else if ((strName.charAt(0) >= 'H' && strName.charAt(0) <= 'P'))
            dNewInvTotal = dInvoiceTotal * 0.92;
        else if ((strName.charAt(0) >= 'Q' && strName.charAt(0) <= 'Z'))
            dNewInvTotal = dInvoiceTotal * 0.88;
    }
}
