import java.io.*;
import java.util.*;

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
class WorkTask extends Task {
    public WorkTask(String title) {
        super(title);
    }

    @Override
    public void display() {
        String status = isCompleted() ? " Done" : " Not Done";
        System.out.println("[Work] " + getTitle() + status);
    }
}

class PersonalTask extends Task {
    public PersonalTask(String title) {
        super(title);
    }

    @Override
    public void display() {
        String status = isCompleted() ? " Done" : " Not Done";
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

// In-memory storage (clears on exit)
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

// File storage (saves in tasks.txt in readable format)
class FileTaskStorage implements TaskStorage {
    private String filename;
    private List<Task> tasks = new ArrayList<>();

    public FileTaskStorage(String filename) {
        this.filename = filename;
        loadTasks();
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
        saveTasks();
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
            saveTasks();
        }
    }

    private void saveTasks() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (Task t : tasks) {
                String type = (t instanceof WorkTask) ? "Work" : "Personal";
                String status = t.isCompleted() ? "Done" : "NotDone";
                pw.println(type + "," + t.getTitle() + "," + status);
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    private void loadTasks() {
        tasks.clear();
        File file = new File(filename);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",", 3);
                if (parts.length == 3) {
                    Task t;
                    if (parts[0].equals("Work")) {
                        t = new WorkTask(parts[1]);
                    } else {
                        t = new PersonalTask(parts[1]);
                    }
                    if (parts[2].equals("Done")) {
                        t.markCompleted();
                    }
                    tasks.add(t);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }
}

// L - Liskov Substitution Principle
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
        showSummary();
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

    public void showSummary() {
        List<Task> allTasks = storage.getAllTasks();
        int done = 0, notDone = 0;

        for (Task t : allTasks) {
            if (t.isCompleted()) {
                done++;
            } else {
                notDone++;
            }
        }
        System.out.println("Task Summary: " + done + " Completed, " + notDone + " Not Completed");
    }

    //mark all tasks as completed
    public void markAllTasksCompleted() {
        List<Task> allTasks = storage.getAllTasks();
        if (allTasks.isEmpty()) {
            System.out.println("No tasks to mark as completed.");
            return;
        }
        for (Task t : allTasks) {
            t.markCompleted();
        }
        System.out.println("All tasks have been marked as completed!");
    }
}

public class Mainto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Login with username and password
        System.out.println("Welcome to the To-Do List Application!");
        String username = "Bhargav";
        String password = "2002";

        System.out.println(".....LOGIN REQUIRED.....");

        while (true) {
            System.out.print("Enter username: ");
            String inputUser = sc.nextLine();
            System.out.print("Enter password: ");
            String inputPass = sc.nextLine();

            if (inputUser.equals(username) && inputPass.equals(password)) {
                System.out.println("Login successful! Welcome " + inputUser + "\n");
                break;
            } else {
                System.out.println("Wrong username or password! Please try again.\n");
            }
        }

        // Choose storage type
        System.out.println("Choose storage type:");
        System.out.println("1. In-Memory (temporary)");
        System.out.println("2. File-Based (permanent)");
        System.out.print("Enter choice: ");
        int storageChoice = sc.nextInt();
        sc.nextLine();

        TaskStorage storage;
        if (storageChoice == 2) {
            storage = new FileTaskStorage("tasks.txt");
            System.out.println("Great!You choose File-Based Storage. Your tasks will be saved permanently.");
        } else {
            storage = new InMemoryTaskStorage();
            System.out.println("You choose InMemory-Based Storage. Your tasks will be saved temporarily.");
        }

        ToDoListApp app = new ToDoListApp(storage);

        while (true) {
            System.out.println("\n  WELCOME TO TO-DO LIST MENU  ");
            System.out.println("1. Add Work Task");
            System.out.println("2. Add Personal Task");
            System.out.println("3. Show All Tasks");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. Remove Task");
            System.out.println("6. Exit");
            System.out.println("7. Show Task Summary");
            System.out.println("8. Mark All Tasks as Completed");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter work task: ");
                    String work = sc.nextLine();
                    app.addTask(new WorkTask(work));
                    System.out.println("Task added successfully!");
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
                    System.out.println("Goodbye! Thank you visit again!:");
                    sc.close();
                    return;
                case 7:
                    app.showSummary();
                    break;
                case 8:
                    app.markAllTasksCompleted();
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
