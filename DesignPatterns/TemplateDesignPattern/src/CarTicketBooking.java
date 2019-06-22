
public class CarTicketBooking extends VehicleTicketBooking {

	@Override
	public void modeOfTransport()
	{
		this.transportMode = "Car";
		System.out.println("Mode of transport selected is "+ this.transportMode);
		
	}

}
