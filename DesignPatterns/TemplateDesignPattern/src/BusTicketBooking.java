
public class BusTicketBooking extends VehicleTicketBooking {

	@Override
	public void modeOfTransport() 
	{
		this.transportMode = "Bus";
		System.out.println("Mode of transport selected is "+ this.transportMode);
		
	}

}