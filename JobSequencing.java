import java.util.Scanner;
class Job {
    int id, deadline, profit;
    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class JobSequencing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of jobs: ");
        int n = sc.nextInt();
        Job[] jobs = new Job[n];
        System.out.println("Enter job details (ID, Deadline, Profit):");
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            jobs[i] = new Job(id, deadline, profit);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (jobs[j].profit < jobs[j + 1].profit) {
                    Job temp = jobs[j];
                    jobs[j] = jobs[j + 1];
                    jobs[j + 1] = temp;
                }
            }
        }
        boolean[] slots = new boolean[n];
        int totalProfit = 0;
        System.out.println("Selected jobs for maximum profit:");
        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
                if (!slots[j]) { 
                    slots[j] = true; 
                    totalProfit += jobs[i].profit;
                    System.out.println("Job " + jobs[i].id + " with profit " + jobs[i].profit);
                    break;
                }
            }
        }
        System.out.println("Total profit: " + totalProfit);
        sc.close();
    }
}
