import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Record System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Roll No: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Branch: ");
                    String branch = sc.nextLine();
                    System.out.print("Marks: ");
                    int marks = sc.nextInt();
                    Student s = new Student(r, name, branch, marks);
                    dao.insert(s);
                    break;

                case 2:
                    dao.showAll();
                    break;

                case 3:
                    System.out.print("Enter roll no to update: ");
                    int roll = sc.nextInt();
                    System.out.print("New marks: ");
                    int newMarks = sc.nextInt();
                    dao.updateMarks(roll, newMarks);
                    break;

                case 4:
                    System.out.print("Enter roll no to delete: ");
                    int delRoll = sc.nextInt();
                    dao.delete(delRoll);
                    break;

                case 5:
                    System.out.println("👋 Exiting... Goodbye!");
                    return;
            }
        }
    }
}