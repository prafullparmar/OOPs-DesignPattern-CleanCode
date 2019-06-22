
public abstract class VehicleTicketBooking {
public String username;
public String password;
public String source;
public String destination;
public String paymentMode;
public String transportMode;

public final void doLogin(String username,String password)
{
	this.username = username;
	this.password = password;
}
public final void setSource(String src)
{
	this.source= src;
}
public final void setDestinaton(String dest)
{
	this.destination = dest;
}
public abstract void modeOfTransport();

public void doPayment(int type)
{
	switch(type)
	{
	case 1 :
	{
		System.out.println("Payment done through Debit/Credit card!");
		this.paymentMode = "Debit/Credit card";
		break;
	}
	case 2 :
	{
		System.out.println("Payment done through Net Banking!");
		this.paymentMode = "Net Banking";
		break;
	}
	case 3 :
	{
		System.out.println("Payment done through Google Pay!");
		this.paymentMode = "Google Pay";
		break;
	}
	case 4 :
	{
		System.out.println("Payment done through PayTm!");
		this.paymentMode = "PayTm";
		break;
	}
	default :
	{
		System.out.println("Invalid Payment option!");
	}
	}

}
public final void displayDetails()
{
	System.out.println("\n*****Ticket Booking Details*****");
	System.out.println("UserName: " +this.username);
	System.out.println("Boarding Place: "+ this.source);
	System.out.println("Destination Place: "+ this.destination);
	System.out.println("Payment Mode: "+ this.paymentMode);
	System.out.println("Transport Mode: "+ this.transportMode);
}
public final void doConfirmBooking()
{
	//Some other code for the confirmation of the booking.....
	
	System.out.println("Tickets have been booked successfully!");
}

public final void processTicketBooking(String username,String password,String src,String dest,int type) 
{ 
   
   this.doLogin(username, password);
   this.setSource(src);
   this.setDestinaton(dest);
   this.modeOfTransport();
   this.doPayment(type);
   this.displayDetails();
   this.doConfirmBooking(); 
   
}}