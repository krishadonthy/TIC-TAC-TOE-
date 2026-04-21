import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    // Method to take input from user
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();  // read integer input

        return slot; // return value to main
    }
}