import java.util.Scanner; // Import the Scanner class to allow user input from the console

public class usersInfo {

    public static void main(String[] args) {

        // Declare variables for the user's information
        String name, gender, address, week; // name, gender, address, and day of the week
        int age; // age

        // Create a Scanner object to capture input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user for their name and store it in the 'name' variable
        System.out.print("\n\nEnter your name: ");
        name = sc.nextLine(); // Reads a line of text for the name

        // Prompt the user for their age and store it in the 'age' variable
        System.out.print("Enter your age: ");
        age = sc.nextInt(); // Reads an integer for age

        // Clear the newline character left in the buffer by sc.nextInt() 
        // to avoid issues with reading subsequent string inputs
        sc.nextLine();

        // Prompt the user for their gender and store it in the 'gender' variable
        System.out.print("Enter your gender: ");
        gender = sc.nextLine(); // Reads a line of text for the gender

        // Prompt the user for their address and store it in the 'address' variable
        System.out.print("Enter your address: ");
        address = sc.nextLine(); // Reads a line of text for the address

        // Prompt the user for the day of the week and store it in the 'week' variable
        System.out.print("Enter the day of the week: ");
        week = sc.nextLine(); // Reads a line of text for the day of the week

        // Close the Scanner to release the associated resources since no more input is needed
        sc.close();

        // Display a message based on the day of the week entered
        // The switch statement converts the input to lowercase to make it case-insensitive
        switch (week.toLowerCase()) {
            case "monday":
                System.out.println("\nHappy Monday, " + name + "!");
                break;
            case "tuesday":
                System.out.println("\nHappy Tuesday, " + name + "!");
                break;
            case "wednesday":
                System.out.println("\nHappy Wednesday, " + name + "!");
                break;
            case "thursday":
                System.out.println("\nHappy Thursday, " + name + "!");
                break;
            case "friday":
                System.out.println("\nHappy Friday, " + name + "!");
                break;
            case "saturday":
                System.out.println("\nHappy Saturday, " + name + "!");
                break;
            case "sunday":
                System.out.println("\nHappy Sunday, " + name + "!");
                break;
            default:
                System.out.println("\nInvalid day of the week input!"); // Handles invalid input
                break;
        }

        // Display the user's entered information
        System.out.println("\n\nUser Information: \n");
        System.out.println("Name: " + name); // Output the name
        System.out.println("Age: " + age); // Output the age
        System.out.println("Gender: " + gender); // Output the gender
        System.out.println("Address: " + address); // Output the address
        System.out.println("Day of the week: " + week); // Output the day of the week

        // Initialize the discount variable to hold the percentage of discount applicable
        double discount = 0; // Initialize the discount with a value of 0

        // Convert the address to lowercase for case-insensitive comparison
        String lowerCaseAddress = address.toLowerCase();

        // Determine the discount based on the user's address and age
        if (lowerCaseAddress.contains("tarlac") && age <= 20) {
            discount += 40; // If the user is from Tarlac and 20 or younger, apply a 40% discount
        } 

        else if (age <= 20) {
            discount += 30; // If the user is 20 or younger, apply a 30% discount
        } 

        else if (lowerCaseAddress.contains("tarlac")) {
            discount += 10; // If the user is from Tarlac (but older than 20), apply a 10% discount
        }

        // Check if a discount has been applied and display the appropriate message
        if (discount == 40 || discount == 30 || discount == 10) {
            System.out.println("\nDiscount: " + discount + "%"); // Output the discount if any was applied
        } 

        else {
            System.out.println("\nNo discount available."); // Output message when no discount is applicable
        }
    }
}
