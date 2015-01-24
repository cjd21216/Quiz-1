import java.util.Scanner;

public class Quiz1 {

public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);

String user, password, x;
System.out.println("Enter your username: ");
user = keyboard.next();
x = keyboard.nextLine();
System.out.println("Enter your password: ");
password = keyboard.next();

System.out.println("Hello " + user + ", welcome to CSC200 class! Your password is " + password);

}

}