public class Main
{
    public static void main(String[] args)
    {
        Robot myRobot = new Robot();
        myRobot.move();                     // Make the robot move
        myRobot.checkBatteryLevel();        // Check the battery level
        myRobot.stop();                     // Stop the robot
        myRobot.chargeBattery();            // Charge the robot's battery
        System.out.println();
        myRobot.displayInfo();
    }
}