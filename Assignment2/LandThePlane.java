
import java.util.*;
import java.io.*;

public class LandThePlane {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter input file name >> ");
        String fileName = keyboard.nextLine();
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        final double DENSITY = 1.2; //p
        final double GRAVITY = 9.8;
        final int TIME = 5;
        double heightFactor = 0.0;
        double v;
        double mass = inputFile.nextDouble();
        double L = mass * GRAVITY;
        double s = inputFile.nextDouble(); //Surface Area
        double cl = inputFile.nextDouble(); //Lift Coefficient
        int height = inputFile.nextInt();
        int distance = inputFile.nextInt();
        final double STALLSPEED = inputFile.nextDouble();
        final double MAXSPEED = inputFile.nextDouble();
        boolean isGearUp = true; // !isGearUp means gear down
        boolean areFlapsUp = true; // !areFlapsUp means flaps down
        boolean isHookUp = true; // !isHookUp means hook down
        String inputCommand;
        v = Math.sqrt(2 * L / (DENSITY * s * cl));
        System.out.printf("Initial speed = %.2f m/s\n", v);
        /*String status = "Ejected"; it could be used to set a different conditions that plane might encounter.
		* and later could be used to output appropriate message using swich case instead of printing inside.
        */
        boolean needUpdate = true;
        boolean isValidCommand = true;
        //System.out.printf("\n%f\n%f\n%f\n%f\n%d\n%d\n%f\n%f\n", mass, L, s, cl, height, distance, STALLSPEED, MAXSPEED);
        do {
            System.out.println("\t\tLANDING CONSOLE\nAvailable commands");
            System.out.println("\tmaintain settings");
            System.out.println("\tflaps down\n\tflaps up");
            System.out.println("\tgear down\n\tgear up");
            System.out.println("\thook down\n\thook up");
            System.out.println("\tthrottle up\n\tthrottle down");
            System.out.println("\teject");
            System.out.print("\nEnter Command >> ");
            inputCommand = keyboard.nextLine().toLowerCase();
            switch (inputCommand) {
                case "maintain settings":
                    //do nothing
                    break;
                case "flaps down":
                    if (!areFlapsUp) {
                        System.out.println("Flaps are already down");
                        continue;
                    } else {
                        cl += 0.5;
                        heightFactor += 0.2;
                        areFlapsUp = false;
                    }
                    break;
                case "flaps up":
                    if (areFlapsUp) {
                        System.out.println("Flaps are already up");
                        continue;
                    } else {
                        cl -= 0.5;
                        heightFactor -= 0.2;
                        areFlapsUp = true;
                    }
                    break;
                case "gear down":
                    if (!isGearUp) {
                        System.out.println("Gear is already down");
                        continue;
                    } else {
                        cl += 0.5;
                        heightFactor += 0.2;
                        isGearUp = false;
                    }
                    break;
                case "gear up":
                    if (isGearUp) {
                        System.out.println("Gear is already up");
                        continue;
                    } else {
                        cl -= 0.5;
                        heightFactor -= 0.2;
                        isGearUp = true;
                    }
                    break;
                case "hook down":
                    if (!isHookUp) {
                        System.out.println("Hook is already down");
                        continue;
                    } else {
                        cl += 0.1;
                        isHookUp = false;
                    }
                    break;
                case "hook up":
                    if (isHookUp) {
                        System.out.println("Hook is already up");
                        continue;
                    } else {
                        cl += 0.1;
                        isHookUp = true;
                    }
                    break;
                case "throttle down":
                    cl = 1.1 * cl;
                    heightFactor += 0.1;
                    break;
                case "throttle up":
                    cl = 0.9 * cl;
                    heightFactor -= 0.1;
                    break;
                case "eject":
                    needUpdate = false;
                    break;
                default:
                    isValidCommand = false;
                    System.out.println("Invalid Command");
                    break;
            }
            if (isValidCommand) {
                System.out.println(inputCommand);
                v = Math.sqrt(2 * L / (DENSITY * s * cl));
                //distance -= (int) (v * TIME);
                distance = (int)((double)distance - v * TIME);
                height = (int) (height * (1 - heightFactor));
                System.out.printf("New Speed = %.2f m/s\n", v);
                System.out.printf("Distance is now %d metres\n", distance);
                System.out.printf("Height is now %d metres\n", height);
                if (v < STALLSPEED || height < 0) {
                    System.out.println("STALL!! Sorry you crashed!");
                    System.out.println("Have a nice day");
                    needUpdate = false;
                } else if (distance < -200) {
                    System.out.println(" OVERSHOOT!!! You missed the deck!");
                    System.out.println("Try again next time");
                    needUpdate = false;
                } else if (height >= 0 && height <= 50 && distance >= -200 && distance <= 10 && v > STALLSPEED && v < MAXSPEED) {
                    needUpdate = false;
                    if (isGearUp) {
                        System.out.println("STALL!! Sorry you crashed!");
                        System.out.println("Have a nice day");
                    } else if (isHookUp) {
                        System.out.println(" OVERSHOOT!!! You missed the deck!");
                        System.out.println(" Try again next time");
                    } else {
                        System.out.println("Congratulations!!!\nSuccessful landing!!!");
                        System.out.println("You have the right stuff.");
                    }
                }

            }
            isValidCommand = true;
        } while (needUpdate);
        System.out.println("\nHave a brandit day");
    }
}
