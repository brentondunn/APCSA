import java.util.Scanner;  // added to allow keyboard input
class Main {
  public static void main(String[] args) {
    boolean again = true;
    while (again == true) {
      // Tell the user to enter a question
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to the Magic 8 Ball!");
      System.out.print("Enter your question and I will answer it: ");
      String question = scan.nextLine();
        
      // Get a random number from 1 to 8
      int rand = (int) (Math.random() * 8) + 1;
              
      // Use if statements to print out 1 of 8 responses`    
      switch (rand) {
        case 1:
          System.out.println("As I see it, yes.");
          break;
        case 2:
          System.out.println("Ask again later.");
          break;
        case 3:
          System.out.println("Better not tell you now.");
          break;
        case 4:
          System.out.println("Cannot predict now.");
          break;
        case 5:
          System.out.println("Concentrate and ask again.");
          break;
        case 6:
          System.out.println("Don’t count on it.");
          break;
        case 7:
          System.out.println("It is certain.");
          break;
        case 8:
          System.out.println("It is decidedly so.");
          break;
      } 
      boolean isValid = false;
      while (isValid == false) {
        System.out.print("Do you want to use the Magic 8 Ball again (y/n): ");
        String yn = scan.nextLine();
        if (yn.equals("y")) {
          again = true;
          isValid = true;
        } else if (yn.equals("n")) {
          again = false;
          isValid = true;
          System.out.print("Thank you for using the Magic 8 Ball!");
        } else {
          System.out.print("Please enter \'y\' or \'n\'. ");
        }
      }
    }
  }
}
