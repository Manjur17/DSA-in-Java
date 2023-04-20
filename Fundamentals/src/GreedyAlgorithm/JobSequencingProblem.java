package GreedyAlgorithm;

import java.util.Arrays;

class Job implements Comparable<Job> {
    char id; // Job I'd
    int deadline; // Deadline of job
    int profit; // Profit if job is over before or on deadline

    Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    // This function is used for sorting all jobs according to decreasing order of profit
    @Override
    public int compareTo(Job o) {
        if (this.profit < o.profit)
            return 1;
        return -1;
    }
}

public class JobSequencingProblem {
    static void printJobScheduling(Job[] arr, int n) {
        Arrays.sort(arr); // Sort all jobs according to decreasing order of profit
        int maxD = 0;
        for (int i = 0; i < n;  i++) {
            if (arr[i].deadline > maxD){
                maxD = arr[i].deadline;  //finding the maximum deadline
            }
        }
        int[] result = new int[maxD+1];  // To store result (Sequence of jobs)
        Arrays.fill(result, -1);
        char[] jobs = new char[maxD+1];  // To store result (Sequence of jobs)
        int countJobs = 0, maxProfit = 0;

        for (int i = 0; i < n; i++) {
            // Find a free slot for this job(Note that we start from the last possible slot)
            for (int j = arr[i].deadline ; j >= 1; j--) {
                // Free slot found
                if (result[j] == -1) {
                    result[j] = i; // Add this job to result
                    countJobs++;
                    maxProfit += arr[i].profit;
                    jobs[j] = arr[i].id;
                    break;
                }
            }
        }

        System.out.println(maxProfit + " " + countJobs);
        // Print the result
        // Print the sequence
        for (char jb : jobs) {
            if (jb != '\u0000') {
                System.out.print(jb + " ");
            }
        }
    }

    public static void main(String[] args) {
        Job[] arr = {new Job('a', 2, 100),
                new Job('b', 1, 50),
                new Job('c', 2, 20),
                new Job('d', 1, 20),
                new Job('e', 3, 30)};

        int n = arr.length;
        System.out.print("Following is maximum profit sequence of job : ");
        printJobScheduling(arr, n);
    }
}
