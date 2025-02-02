package interfaceGarage;

import java.util.*;

public class MainGarage {

    private static GarageDB garageDB;

    public static void start() {
        garageDB = new GarageDB();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Main Screen");

        while (true) {
            System.out.println("Enter 1 for Motorcycle, 2 for Car, or 3 for Truck (or 0 to finish):");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break;
            }

            System.out.println("Enter the name of the vehicle:");
            String name = scanner.nextLine();

            Vehicle vehicle;
            switch (choice) {
                case 1:
                    garageDB.build(1, name);
                    break;
                case 2:
                    garageDB.build(2, name);
                    break;
                case 3:
                    garageDB.build(3, name);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            System.out.println("Vehicle added: " + name);
        }

        Garage garage = new Garage(protocolGarage);
        garage.startWork(new ArrayList<>(garageDB.getVehicles()));


        stackCreate();
    }



    private static Protocol_Garage protocolGarage = new Protocol_Garage() {
        @Override
        public void fixed() {
            System.out.println("$$$$");
        }
    };

    private static void queueExample() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        final int SIZE = queue.size();

        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(queue.size());
    }

    private static void stackCreate() {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.size());
    }
}