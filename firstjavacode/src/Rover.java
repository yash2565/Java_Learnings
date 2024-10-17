////public class Rover {
////}
//
////Move the rover
////Yash Sanjay Musmade
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Rover rover = new Rover(0, 0, "N");//instance of a rover class
//        System.out.print("Enter commands (L, R, F, B) separated by space: ");
//        String[] commands = sc.nextLine().split("\\s+");
//
//        for (String command : commands) {
//            rover.move(command);
//
//        }
//        System.out.println("Current position facing: (" + rover.getX() + ", " + rover.getY() + ")");
//        System.out.println("Current direction of the rover: " + rover.getDirection());
//    }
//}
//
//class Rover {
//    private int x, y;
//    private String direction;
//
//    public Rover(int x, int y, String direction) {
//        this.x = x;
//        this.y = y;
//        this.direction = direction;
//    }
//
//    public void move(String instructions) {
//        for (int i = 0; i < instructions.length(); i++) {
//            char command = instructions.charAt(i);
//            if (command == 'L') {
//                this.turnLeft();// turn left
//            } else if (command == 'R') {
//                this.turnRight();// turn right
//            } else if (command == 'F') {
//                this.moveForward();// move one step forward
//            } else if (command == 'B') {
//                this.moveBackward();// move one step backward
//            }
//        }
//    }
//
//
//    public void turnLeft() {
//        if (direction.equals("N")) {
//            direction = "W";
//        } else if (direction.equals("W")) {
//            direction = "S";
//        } else if (direction.equals("S")) {
//            direction = "E";
//        } else if (direction.equals("E")) {
//            direction = "N";
//        }
//    }
//
//    public void turnRight() {
//        if (direction.equals("N")) {
//            direction = "E";
//        } else if (direction.equals("E")) {
//            direction = "S";
//        } else if (direction.equals("S")) {
//            direction = "W";
//        } else if (direction.equals("W")) {
//            direction = "N";
//        }
//    }
//
//    public void moveForward() {
//        if (direction.equals("N")) {
//            y++;
//        } else if (direction.equals("E")) {
//            x++;
//        } else if (direction.equals("S")) {
//            y--;
//        } else if (direction.equals("W")) {
//            x--;
//        }
//    }
//
//    public void moveBackward() {
//        if (direction.equals("N")) {
//            y--;
//        } else if (direction.equals("E")) {
//            x--;
//        } else if (direction.equals("S")) {
//            y++;
//        } else if (direction.equals("W")) {
//            x++;
//        }
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public String getDirection() {
//        return direction;
//    }
//}
//
//
