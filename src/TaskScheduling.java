//Java program to find extra time of task completion overshooting deadline

package demo;

import java.util.*;

public class TaskScheduling {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tasks:");
        // Reading the number of tasks from the user
        int n = sc.nextInt();

        // Creating an array to hold the tasks
        Task[] tasks = new Task[n];

        System.out.println("Enter the deadlines and times for each task:");
        // Reading the deadline and time for each task from the user
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            int m = sc.nextInt();

            // Adding the task to the array
            tasks[i] = new Task(d, m);
        }

        // Sorting the tasks in descending order of time required to complete them
        Arrays.sort(tasks, (a, b) -> b.m - a.m);

        // Calculating the maximum overshoot of completion time for the tasks
        int maxOvershoot = 0;
        int time = 0;
        for (Task task : tasks) {
            // Adding the time required to complete the task to the total time
            time += task.m;
            // Calculating the overshoot for the task and update the maximum overshoot if necessary
            maxOvershoot = Math.max(maxOvershoot, time - task.d);
        }

        // Printing the maximum overshoot
        System.out.println("Maximum amount by which a task's completion time overshoots its deadline: " + maxOvershoot);

        // Closing the Scanner object
        sc.close();
    }

    // Defining a class to represent a task
    static class Task {
        int d; // The deadline for the task
        int m; // The time required to complete the task

        // Constructor for the Task class
        public Task(int d, int m) {
            this.d = d;
            this.m = m;
        }
    }
}
