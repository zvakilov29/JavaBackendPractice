package lesson1;

public class Task3 {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean hasSubscription = false;

        if (isLoggedIn || hasSubscription) {
            System.out.println("The user's account is active");
        }

        if (isLoggedIn && hasSubscription) {
            System.out.println("The user can see the content");
        } else {
            System.out.println("User cannot see content (Missing subscription)");
        }
    }
}
