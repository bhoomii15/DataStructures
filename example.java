package com.bhoomi;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class example {
    public static int getMinTime(List<Integer> taskMemory, List<Integer> taskType, int maxMemory) {
        Map<Integer, List<Integer>> tasksByType = new HashMap<>();
        for (int i = 0; i < taskMemory.size(); i++) {
            int type = taskType.get(i);
            tasksByType.putIfAbsent(type, new ArrayList<>());
            tasksByType.get(type).add(taskMemory.get(i));
        }

        int totalProcessingTime = 0;

        for (List<Integer> tasks : tasksByType.values()) {
            Collections.sort(tasks);
            int left = 0;
            int right = tasks.size() - 1;

            while (left <= right) {
                if (tasks.get(left) + tasks.get(right) <= maxMemory) {
                    left++;
                    right--;
                } else {
                    right--;
                }
                totalProcessingTime++;
            }
        }

        return totalProcessingTime;
    }

    public static void main(String[] args) {
        List<Integer> taskMemory = Arrays.asList(1, 2, 3, 4, 2);
        List<Integer> taskType = Arrays.asList(1, 2, 1, 2, 3);
        int maxMemory = 4;

        int result = getMinTime(taskMemory, taskType, maxMemory);
        System.out.println("Output: " + result);
    }
}



