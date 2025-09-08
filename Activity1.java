package Activities;

public class Activity1 {

	public static void main(String[] args) {
		
		// create object of car 
		Car tata = new Car("red", "Automatic", 2020);

       // print details of the car 
		tata.displayCharacterstics();
		
		//move the car 
		tata.accelerate();
		
		// stop the car 
		tata.brake();
		
	}
}
