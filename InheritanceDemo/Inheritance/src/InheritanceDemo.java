import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Emily", "Smith", "001", "Ms.", 1991, 22.5));
        workers.add(new Worker("David", "Johnson", "002", "Mr.", 1987, 26.0));
        workers.add(new Worker("Olivia", "Brown", "003", "Miss", 1993, 24.0));
        workers.add(new SalaryWorker("Daniel", "Williams", "004", "Mr.", 1985, 18.0, 70000));
        workers.add(new SalaryWorker("Sophie", "Miller", "005", "Mrs.", 1980, 20.0, 90000));
        workers.add(new SalaryWorker("Logan", "Davis", "006", "Dr.", 1992, 16.0, 80000));

        int[] weeklyHours = {40, 50, 40};

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Pay:");
            for (Worker worker : workers) {
                double hoursWorked = weeklyHours[week - 1];
                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
            }
            System.out.println();
        }
    }
}
