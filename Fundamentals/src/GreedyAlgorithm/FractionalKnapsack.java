package GreedyAlgorithm;

import java.util.Arrays;

class Items implements Comparable<Items> {
    int weight;
    int value;

    Items(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public int compareTo(Items i) {
        return this.weight * i.value - this.value * i.weight;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        Items[] arr = {
                new Items(10, 60),
                new Items(40, 40),
                new Items(20, 100),
                new Items(30, 120)
        };
        double maxValue = fractionalKnapsack(arr, 50);
        System.out.println(maxValue);
    }

    static double fractionalKnapsack(Items[] arr, int W) {
        Arrays.sort(arr);

        double finalvalue = 0.0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].weight <= W) {
                finalvalue += arr[i].value;
                W -= arr[i].weight;
            } else {
                finalvalue += arr[i].value * ((double) W / (double) arr[i].weight);
                break;
            }
        }
        return finalvalue;
    }
}
