import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
    static ArrayList<String> listService = new ArrayList<>();

    protected static int getInput(Scanner input) {
        int output = input.nextInt();
        input.nextLine();
        return output;
    }

    protected static void InputHandler() {
        System.out.print("Input your command: ");
        Scanner input = new Scanner(System.in);
        int command = getInput(input);

        switch (command) {
            case 1:
                Read();
                break;
            case 2:
                System.out.print("Please input new service name: ");
                Add(input.nextLine());
                break;
            case 3:
                System.out.print("Please input the service id: ");
                int serviceId = getInput(input);

                System.out.print("Please input new service name: ");
                Update(serviceId, input.nextLine());
                break;
            case 4:
                System.out.print("Please input the service id to delete: ");
                Delete(getInput(input));
                break;
            case 5:
                Exit();
                break;
            default:
                System.out.println("Wrong command");
        }
    }

    protected static void ShowMenu() {
        System.out.println("\n== Service Management ==");
        System.out.println("List command:");
        String[] option = {
                "Read all service",
                "Add new service",
                "Update a service",
                "Delete a service",
                "Exit"
        };

        for (int i = 1; i <= option.length; i++) {
            System.out.printf("[%d] %s\n", i, option[(i - 1)]);
        }

        InputHandler();
    }

    protected static void Read() {
        System.out.printf("\nShowing list service data, with count %d:\n", listService.size());

        if (listService.size() == 0) {
            System.out.println("No data available");
            return;
        }

        System.out.println(" [id]: service name");
        for (int i = 0; i < listService.size(); i++) {
            String service = listService.get(i);
            System.out.printf(" [%d]: %s\n", i, service);
        }
    }

    protected static void Add(String newData) {
        listService.add(newData);
        System.out.println("Add data success.");
    }

    protected static void Update(int id, String newData) {
        listService.set(id, newData);
        System.out.println("Update data success.");
    }

    protected static void Delete(int id) {
        listService.remove(id);
        System.out.println("Delete data success.");
    }

    protected static void Exit() {
        quit = true;
        System.out.println("Have a nice day");
    }

    protected static boolean quit = false;

    public static void main(String[] args) {
        try {
            do {
                ShowMenu();
            } while (!quit);
        } catch (Exception e) {
            System.out.println("System crash:");
            System.out.println(e.getMessage());
        }
    }
}
