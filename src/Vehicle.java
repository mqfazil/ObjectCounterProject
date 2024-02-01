public class Vehicle {
    private int vehicleVIN;
    private String vehicleModel;
    public static int objectCounter = 0;
    Vehicle(){
        vehicleVIN = 0;
        vehicleModel = "Honda";
        objectCounter++;
    }
    public void setVehicleVIN(int vehicleVIN){ //method
        this.vehicleVIN = vehicleVIN;
    }
    public void setVehicleModel(String vehicleModel){ //method
        this.vehicleModel = vehicleModel;
    }
    public void printObjectCounter(){ //method
        System.out.println("The Current Object Counter = " + objectCounter);
    }
}
