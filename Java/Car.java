package Activities;

	public class Car {
	    //Class Member Variables
	    String color;
	    String transmission;
	    int make;
	    int tyres = 4;
	    int doors = 4;
		
	    //Constructor
	   public Car(String color, String transmission, int make) {
		   this.color = color;
		   this.transmission = transmission;
		   this.make = make;
		
	   }

	    //Class Methods
	    public void displayCharacterstics(){
		System.out.println("Color of the Car: " + color);
		System.out.println("Make of the Car: " + make);
		System.out.println("Transmission of the Car: " + transmission);
		System.out.println("Number of doors on the car: " + doors);
	    	System.out.println("Number of tyres on the car: " + tyres);
	    }

	    public void accelerate() {
		System.out.println("Car is moving forward.");
	    }
		
	    public void brake() {
		System.out.println("Car has stopped.");
	    }
	}