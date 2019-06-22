import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TemplateTester {

	
@Test
public void testTemplate()
{
	
	VehicleTicketBooking ticket1;
	VehicleTicketBooking ticket2;
	
	
	//Creating an instance for booking car tickets
	ticket1 = new CarTicketBooking();
	ticket1.modeOfTransport();
	//Asserting that mode of transport is Car
	assertEquals(true,ticket1.transportMode.equals("Car"));
	
	//Asserting that mode transport is not Bus
	assertEquals(false,ticket1.transportMode.equals("Bus"));
	
	
	//Creating an instance of for booking Train tickets
	ticket2 = new TrainTicketBooking();
	ticket2.modeOfTransport();
	
	//Asserting that mode of transport is not Plane or Bus
	assertEquals(false,ticket2.transportMode.equals("Plane"));
	assertEquals(false,ticket2.transportMode.equals("Bus"));
	
	
	
	//Creating an instance for booking Train tickets
	ticket1 = new TrainTicketBooking();
	ticket1.modeOfTransport();
	//Asserting tha mode of transport of both tickets is now Train
	assertEquals(true,ticket1.transportMode.equals(ticket2.transportMode));
	
}

}
