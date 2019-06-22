
public class MiniVanTicketBooking extends VehicleTicketBooking {

	@Override
	public void modeOfTransport()
	{
		this.transportMode = "Mini Van";
		System.out.println("Mode of transport selected is "+ this.transportMode);
		
	}

}