import java.util.Scanner;

public class TravelTicketManager {

	public static void main(String[] args) {

		String username;
		String password;
		String source;
		String destination;
		int payment;
		int choice = -1;
		System.out.println("**********WELCOME**********");
		
		VehicleTicketBooking ticket =null;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter User Name: ");
		username = in.next();
		System.out.println("Enter Password: ");
		password = in.next();
		System.out.println("Enter Boarding Place :");
		source = in.next();
		System.out.println("Enter Destination Place:");
		destination = in.next();
		while(choice<1 || choice >7) {
		System.out.println("Select Mode of Transport: \n1.Bus\n2.Car\n3.Mini Van\n4.Train\n5.Ferry\n6.Plane");
		choice = in.nextInt();
		}
		switch(choice)
		{
		case 1:
		{
			ticket = new BusTicketBooking();
			break;
		}
		case 2:
		{
			ticket = new CarTicketBooking();
			break;
		}
		case 3:
		{
			ticket = new MiniVanTicketBooking();
			break;
		}
		case 4:
		{
			ticket = new TrainTicketBooking();
			break;
		}
		case 5:
		{
			ticket = new FerryTicketBooking();
			break;
		}
		case 6 :
		{
			ticket = new PlaneTicketBooking();
			break;
		}
		default:
		{
			System.out.println("Invalid Choice!");
		}
		}
		choice = -1;
		while(choice<1 || choice >4) {
			System.out.println("Select mode of payment:\n1.Debit/Credit card\n2.Net Banking\n3.Google Pay\n4.PayTm");
            choice = in.nextInt();
			}
		payment = choice;
		ticket.processTicketBooking(username, password,source,destination,payment);
	
		
	}

}
