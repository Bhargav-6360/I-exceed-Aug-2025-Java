import java.util.ArrayList;  
import java.util.List;       
import java.util.Scanner;    
// S - Single Responsibility Principle
abstract class Task {
    private String title;        
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false; 
    }

    public String getTitle() { 
        return title; 
    }

    public boolean isCompleted() { 
        return completed; 
    }

    public void markCompleted() { 
        this.completed = true; 
    }

    public abstract void display();
}
// O - Open/Closed Principle
//pillars of oops applied here
class WorkTask extends Task {
    public WorkTask(String title) { 
        super(title); 
    }

    @Override
    public void display() {
        String status;
        if (isCompleted()) {
            status = " Done";
        } else {
            status = " Not Done";
        }
        System.out.println("[Work] " + getTitle() + status);
    }
}

class PersonalTask extends Task {
    public PersonalTask(String title) { 
        super(title); 
    }

    @Override
    public void display() {
        String status;
        if (isCompleted()) {
            status = " Done";
        } else {
            status = " Not Done";
        }
        System.out.println("[Personal] " + getTitle() + status);
    }
}


// I & D - Interface Segregation and Dependency Inversion
interface TaskStorage {
    void addTask(Task task);                
    List<Task> getAllTasks();               
    Task getTaskByIndex(int index);         
    void removeTask(int index);             
}


// S - Single Responsibility

class InMemoryTaskStorage implements TaskStorage {
    private List<Task> tasks = new ArrayList<>();

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public Task getTaskByIndex(int index) {
        if (index >= 0 && index < tasks.size()) {
            return tasks.get(index);
        }
        return null;
    }

    
    @Override
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }
}

// L - Liskov Substitution Principle
//Composition, Interface Usinh here

class ToDoListApp {
    private TaskStorage storage;

    public ToDoListApp(TaskStorage storage) {
        this.storage = storage;
    }

    public void addTask(Task task) {
        storage.addTask(task);
    }

    public void showTasks() {
        List<Task> allTasks = storage.getAllTasks();
        if (allTasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }
        for (int i = 0; i < allTasks.size(); i++) {
            System.out.print((i + 1) + ". "); 
            allTasks.get(i).display();       
        }
    }

    public void markTaskCompleted(int taskNumber) {
        Task task = storage.getTaskByIndex(taskNumber - 1);
        if (task != null) {
            task.markCompleted();
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number!");
        }
    }
    
    public void removeTask(int taskNumber) {
        if (storage.getTaskByIndex(taskNumber - 1) != null) {
            storage.removeTask(taskNumber - 1);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid task number!");
        }
    }
}
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TaskStorage storage = new InMemoryTaskStorage();
        ToDoListApp app = new ToDoListApp(storage);

        while (true) {
            System.out.println("\n  WELCOME TO TO-DO LIST MENU  ");
            System.out.println("1. Add Work Task");
            System.out.println("2. Add Personal Task");
            System.out.println("3. Show All Tasks");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. Remove Task"); 
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter work task: ");
                    String work = sc.nextLine();
                    app.addTask(new WorkTask(work)); 
                    System.out.println("  Task added successfully!");
                    break;
                case 2:
                    System.out.print("Enter personal task: ");
                    String personal = sc.nextLine();
                    app.addTask(new PersonalTask(personal)); 
                    System.out.println("Task added successfully!");
                    break;
                case 3:
                    app.showTasks(); 
                    break;
                case 4:
                    app.showTasks(); 
                    System.out.print("Enter task number to mark completed: ");
                    int num = sc.nextInt();
                    app.markTaskCompleted(num); 
                    break;
                case 5:
                    app.showTasks();
                    System.out.print("Enter task number to remove: ");
                    int removeNum = sc.nextInt();
                    app.removeTask(removeNum); 
                    break;
                case 6:
                    System.out.println("Exiting... I’m off to eat some tasty pizza! ");
                    sc.close(); 
                    return;     
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
