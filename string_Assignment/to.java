import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String title;
    private boolean isCompleted;

    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[✔] " : "[ ] ") + title;
    }
}

class ToDoList {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(title));
        System.out.println("Task added successfully!");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet!");
            return;
        }
        System.out.println("\nYour Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void completeTask(int index) {
        if (index < 1 || index > tasks.size()) {
            System.out.println("Invalid task number!");
            return;
        }
        tasks.get(index - 1).markCompleted();
        System.out.println("Task marked as completed!");
    }

    public void deleteTask(int index) {
        if (index < 1 || index > tasks.size()) {
            System.out.println("Invalid task number!");
            return;
        }
        tasks.remove(index - 1);
        System.out.println("Task deleted!");
    }
}

public class to{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDoList list = new ToDoList();
        int choice;

        do {
            System.out.println("\n=== TO-DO LIST MENU ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    list.addTask(title);
                    break;
                case 2:
                    list.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to complete: ");
                    int cnum = sc.nextInt();
                    list.completeTask(cnum);
                    break;
                case 4:
                    System.out.print("Enter task number to delete: ");
                    int dnum = sc.nextInt();
                    list.deleteTask(dnum);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}

