import java.util.*;
class Activity {
    int start, end;

    Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class ActivitySelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of activities: ");
        int n = sc.nextInt();
        Activity[] activities = new Activity[n];

        System.out.println("Enter start and end times of each activity:");
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            activities[i] = new Activity(start, end);
        }
        Arrays.sort(activities, (a, b) -> a.end - b.end);
        int count = 1; // Select the first activity
        int lastEndTime = activities[0].end;

        System.out.println("Selected activities:");
        System.out.println("Activity with start time " + activities[0].start + " and end time " + activities[0].end);
        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastEndTime) { 
                System.out.println("Activity with start time " + activities[i].start + " and end time " + activities[i].end);
                count++;
                lastEndTime = activities[i].end;
            }
        }
        System.out.println("Total number of selected activities: " + count);
        sc.close();
    }
}
