package dsa.algos.greedy.activitySelectionProblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Activity {
    int start;
    int finish;
    public Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
}
public class ActivitySelection {
    // Comparator to sort the activities according to finish time
    static class ActivityCompare implements Comparator<Activity>{
        public int compare(Activity a1, Activity a2){
            // Sort according to finish time
            return a1.finish - a2.finish; // Ascending Order
            // return a2.finish - a1.finish; // Descending Order
        }
    }
    static void printMaxActivities(List<Activity> activities){
        // Sort the activities according to their finish time
        activities.sort(new ActivityCompare());
        // We always select the activity that finishes earliest
        int lastSelected = 0; // Starts at index 0
        // (1,4)(5,7)(8,9)
        System.out.print("(" + activities.get(lastSelected).start + ","
        + activities.get(lastSelected).finish + ")");
        // Traverse the list & select other activities based on the rule
        // The start time of the next activity should be greater than or
        // equal to the finish time of the last activity
        for (int i=1; i<activities.size(); i++){
            if(activities.get(i).start >= activities.get(lastSelected).finish){
                // Print that activity
                System.out.print("(" + activities.get(i).start + ","
                        + activities.get(i).finish + ")");
                // Now the last selected index will shift to i
                lastSelected = i; // Update the index
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
                new Activity(5,7),
                new Activity(8,9),
                new Activity(1,4),
                new Activity(5,9),
                new Activity(0,6),
                new Activity(3,5)
        );
        printMaxActivities(activities);
    }
}
