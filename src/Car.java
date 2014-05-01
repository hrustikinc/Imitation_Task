class Car {
        public String brand;
            protected void setBrand (String brand) {
        	    this.brand = brand;
            }
            protected String getBrand () {
        	    return brand;
            }
        public String color;
            protected void setColor (String color) {
        	    this.color = color;
            } 
            protected String getColor () {
            	return color;
            }  
        public int wheels;
            protected void setWheels (int wheels) {
            	this.wheels = wheels;
            }
            protected int getWheels () {
            	return wheels;
            }
        public int engine;
            protected void setEngine (int engine) {
        	    this.engine = engine;
            }
            protected int getEngine () {
        	    return engine;
            }
        public String transmission;
            protected void setTransmission (String transmission) {
    	        this.transmission = transmission;
            }
            protected String getTransmission () {
        	    return transmission;
            }
        public int gears;
            protected void setGears (int gears) {
	            this.gears = gears;
            }
            protected int getGears () {
        	    return gears;
            }
        public int doors;
            protected void setDoors (int doors) {
	            this.doors = doors;
            }
            protected int getDoors () {
    	        return doors;
            }
        public String fuel;
            protected void setFuel (String fuel) {
    	        this.fuel = fuel;
            } 
            protected String getFuel () {
        	    return fuel;
            } 
        public String model;
            protected void setModel (String model) {
    	        this.model = color;
            } 
            protected String getModel () {
        	    return model;
            } 
        public int year;
            protected void setYear (int year) {
	            this.year = year;
            }
            protected int getYear () {
    	        return year;
            }
        public int length;
            protected void setLength (int length) {
	            this.length = length;
            }
            protected int getLength () {
    	        return length;
            }
}
class Bus extends Car {
	    public static void main (String[] args) {
	    	Bus bus = new Bus();
	    	bus.setBrand ("Mercedes");
	    	bus.setColor ("red");
	    	bus.setWheels (6);
	    	bus.setEngine (5);
	    	bus.setDoors (4);
	    	bus.setFuel ("diesel");
	    	bus.setLength (12);
	    	bus.setGears (5);
	    	bus.setTransmission ("mechanics");
	    	bus.setYear (2014);
	    	bus.setModel("Sky");	    	
	        System.out.println ("My Bus:\nBrand: " + bus.getBrand() + "\nColor: " + bus.getColor() + "\nWheels: " + bus.getWheels() + "\nEngine: " + bus.getFuel() + "\nLength: " + bus.getLength() + "\nGears: " + bus.getGears() + "\nTransmission: " + bus.getTransmission() + "\nDoors: " + bus.getDoors() + "\nModel: " + bus.getModel() + "\nYear: " + bus.getYear());
	    }
}
class Motorcycle extends Car {
	    public static void main (String[] args) {
	    	Motorcycle moto = new Motorcycle();
	    	moto.setBrand ("BMW");
	    	moto.setColor ("black");
	    	moto.setWheels (2);
	    	moto.setEngine (3);
	    	moto.setFuel ("gasoline");
	    	moto.setLength (2);
	    	moto.setGears (6);
	    	moto.setTransmission ("automat");
	    	moto.setYear (2013);
	    	moto.setModel ("M-POWER");
	    	System.out.println ("My Motorcycle:\nBrand: " + moto.getBrand() + "\nColor: " + moto.getColor() + "\nWheels: " + moto.getWheels() + "\nEngine: " + moto.getFuel() + "\nLength: " + moto.getLength() + "\nGears: " + moto.getGears() + "\nTransmission: " + moto.getTransmission() + "\nModel: " + moto.getModel() + "\nYear: " + moto.getYear());
	    }
}


