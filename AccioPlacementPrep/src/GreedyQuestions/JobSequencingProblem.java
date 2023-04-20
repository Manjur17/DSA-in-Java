package GreedyQuestions;

import java.util.Arrays;

class Job {
    int id, profit, deadline;

    Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

public class JobSequencingProblem {
    int[] JobScheduling(Job[] arr, int n) {
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));

        int maxDay = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].deadline > maxDay) {
                maxDay = arr[i].deadline;
            }
        }

        int[] result = new int[maxDay + 1];

        Arrays.fill(result, -1);

        int countJobs = 0, totalProfit = 0;

        for (int i = 0; i < n; i++) {
            //try performing the job from last
            for (int j = arr[i].deadline; j > 0; j--) {

                // Free slot found
                if (result[j] == -1) {
                    result[j] = arr[i].id; //or 'i' depending upon the question
                    countJobs++;
                    totalProfit += arr[i].profit;
                    break;
                }
            }
        }


        return new int[]{countJobs, totalProfit};

    }
}
