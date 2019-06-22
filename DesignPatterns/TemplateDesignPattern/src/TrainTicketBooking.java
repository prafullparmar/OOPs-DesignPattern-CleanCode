
public class TrainTicketBooking extends VehicleTicketBooking {

	@Override
	public void modeOfTransport() 
	{
		this.transportMode = "Train";
		System.out.println("Mode of transport selected is "+ this.transportMode);
		
	}

}