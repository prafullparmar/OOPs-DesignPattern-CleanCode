
public class FerryTicketBooking extends VehicleTicketBooking {

	@Override
	public void modeOfTransport() 
	{
		this.transportMode = "Ferry";
		System.out.println("Mode of transport selected is "+ this.transportMode);
		
	}

}