package ie.shark;

import ie.shark.stuff.Application;
import ie.shark.stuff.ClubStaff;
import ie.shark.stuff.CoachStaff;
import ie.shark.stuff.SwimmingGroup;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static void showMessage() {
        System.out.println("What would you like to do?");
        System.out.println("List all Staff (L), List all Staff by category (C), List all Groups (G), Exit (E)");
    }

    public static void main(String[] args) {
        Application app = new Application();
        Scanner sc = new Scanner(System.in);
        showMessage();
        while (sc.hasNext()) {
            String command = sc.nextLine();
            switch (command.toLowerCase(Locale.ROOT)) {
                case "l" :
                    System.out.println(app.listAllStaffs());
                    showMessage();
                    break;
                case "c":
                    System.out.println("Which category? (Receptionist, Cleaner, Caretaker, Admin)");
                    String category = sc.nextLine();
                    System.out.println(app.listAllStaffsByCategory(category));
                    showMessage();
                    break;
                case "g":
                    System.out.println(app.listAllGroups());
                    showMessage();
                    break;
                case "e":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Command not found, press E for exit");
            }
        }
    }
}
