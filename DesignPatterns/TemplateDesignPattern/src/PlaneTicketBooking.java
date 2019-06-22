
public class PlaneTicketBooking extends VehicleTicketBooking {

	@Override
	public void modeOfTransport() 
	{
		this.transportMode = "Plane";
		System.out.println("Mode of transport selected is "+ this.transportMode);
		
	}

}