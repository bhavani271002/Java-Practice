import java.util.Scanner;
public class trafficLightSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the traffic light color (Green, Yellow, Red): ");
        String lightColor = scanner.nextLine().trim().toLowerCase();
        System.out.print("Is there an obstacle on the road? (yes/no): ");
        String obstacleInput = scanner.nextLine().trim().toLowerCase();
        boolean isObstacle = obstacleInput.equals("yes");
        if (isObstacle){
            System.out.print("Do not move. There is an obstacle.");
        } else if (lightColor.equals("green")) {
            System.out.print("Light is Green: Go.");            
        } else if (lightColor.equals("yellow")) {
            System.out.print("Light is Yellow: Slow Down.");          
        } else if (lightColor.equals("red")) {
            System.out.print("Light is Red: Stop.");
        } else {
            System.out.print("Invalid light color entered.");
        }
        scanner.close();        
    }
}