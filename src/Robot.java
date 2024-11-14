/**
 * Creates a Robot object that has properties the user can affect and print out, such as speed, weight,
 * and battery level.
 */
public class Robot
{
    int batteryLevel = 100; // Battery level percentage (0 to 100)
    int speed = 0; // Current speed of the robot
    String name = "Robo"; // Name of the robot
    int weight = 160;


    /**
     * Simulates the robot moving forward.
     * The method affects the speed field to affect movement and prints a message.
     */
    public void move()
    {
        speed = 5;
        System.out.println(name + " is moving at speed: " + speed + " mph.");
    }

    /**
     * Simulates the robot stopping all movement.
     * The method affects the speed field to affect movement and prints a message.
     */
    public void stop()
    {
        speed = 0;
        System.out.println(name + " has stopped.");
    }

    /**
     * Simulates the robot getting a fully charged battery.
     * This method affects the batteryLevel field and prints a message of its state.
     */
    public void chargeBattery()
    {
        batteryLevel = 100;
        System.out.println(name + "'s is fully charged.");
    }

    /**
     * Checks the current level of the simulated battery of the robot.
     * This method checks the current batteryLevel field and prints a message of its state.
     */
    public void checkBatteryLevel() {
        System.out.println(name + "'s current battery level is: " + batteryLevel + "%");
    }

    /**
     * Check the current state of every field of the robot.
     * Gets and displays all field information and prints it.
     */
    public void displayInfo()
    {
        System.out.println("Name is: " + name);
        System.out.println("Speed is: " + speed);
        System.out.println("Batter level is: " + batteryLevel + "%");
        System.out.println("Weight is: " + weight + " lbs.");
    }
}
