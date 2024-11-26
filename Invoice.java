
public class Invoice {
	public double invoiceTotal;
	public double newInvoiceTotal;
	public String customerType;
	
	public Invoice(double invoiceTotal, String customerType)
	{
		this.invoiceTotal = invoiceTotal;
		this.customerType = customerType;
		fnDiscountGiven();
	}
	
	private void fnDiscountGiven()
    {
        if (this.customerType.equals("manager"))
            newInvoiceTotal = invoiceTotal * Discount.MANAGER.getDiscount();//using enum
        else if (this.customerType.equals("employee"))
            newInvoiceTotal = invoiceTotal * Discount.EMPLOYEE.getDiscount();//using enum
    }
	
	@Override 
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("\nsTotal = $%.2f\n", this.invoiceTotal));
		sb.append(String.format("\nNew Total = $%.2f\n", this.newInvoiceTotal));
		return sb.toString();
	}
	
	public enum Discount{
		//enums are useful for setting constants in a single location. 
		//They help serve the purpose for smaller tasks when a database connection and manipulation is too much. 
		
		//List of constants, they use the constructor we create below, 
		//so we supply the constant value we want stored with that enum label.
		MANAGER (0.88),
		EMPLOYEE (0.92);
		
		private final double discount;
		private Discount(double discount){
			this.discount = discount;
		}
		
		public double getDiscount(){//accessor to the value of the enum label
			return this.discount;
		}
	}
}
