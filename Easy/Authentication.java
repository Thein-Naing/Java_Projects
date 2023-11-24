import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

    class User{
        private String username;
        private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
}
    public  String getUsername() {
        return username;
}
    public  String getPassword() {
        return password;
    }
}
    public class Authetication {
        private LinkedList<User>userList;
        public Authetication(){                      // Create constructor
           userList = new LinkedList<>();            // everytime create a user in LinkedList, these users will be stored in userList.
        }

        public void register(String username, String password) {                        // Create method for userList.
          User  newUser = new User(username, password);                                 // Create newUser
            userList.add(newUser);                                                      // Add newUser to userList.
            System.out.println("User Registered Successfully");
        }
       public boolean login(String username, String password) {
            for (User user: userList) {
                if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
            return true;
                }
            }
            return false;
       }

      public static void main(String[] args) {

   Authetication authSystem = new Authetication();   // Instantiating object.
   Scanner scanner = new Scanner(System.in);         // For user input
        boolean loggedIn = false;                    // For default;

        while(!loggedIn) {                           // Use While Loop
            System.out.println("Choose an option");
            System.out.println("1. Register");
            System.out.println("2. Sign In");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();         // User input
            scanner.nextLine();                     // interface show.

            switch(choice) {
                case 1:
                    System.out.println("Enter a username:");
                    String regUsername = scanner.nextLine();
                    System.out.println("Enter a password:");
                    String regPassword = scanner.nextLine();
                    authSystem.register(regUsername, regPassword);
                    break;

                case 2:
                    System.out.println("Enter your username:");
                    String loginUsername = scanner.nextLine();
                    System.out.println("Enter your password:");
                    String loginPassword = scanner.nextLine();

                    if (authSystem.login(loginUsername, loginPassword)) {
                        loggedIn = true;
                        System.out.println("Login successfully...");
                    } else {
                        System.out.println("Login failed...");
                    }
                    break;

                case 3:
                    System.out.println("Existing...");
                    loggedIn = true;
                    break;

                default:
                    System.out.println("Invalid choice, try again...");
            }
        }
                scanner.close();
    }
}
