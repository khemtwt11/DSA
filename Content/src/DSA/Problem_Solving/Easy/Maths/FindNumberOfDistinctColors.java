package DSA.Problem_Solving.Easy.Maths;

import java.util.Arrays;
import java.util.HashMap;

/*
You are given an integer limit and a 2D array queries of size n x 2.

There are limit + 1 balls with distinct labels in the range [0, limit]. Initially, all balls are uncolored. For every query in queries that is of the form [x, y], you mark ball x with the color y. After each query, you need to find the number of distinct colors among the balls.

Return an array result of length n, where result[i] denotes the number of distinct colors after ith query.

Note that when answering a query, lack of a color will not be considered as a color.
 */



public class FindNumberOfDistinctColors {
    public static void main(String[] args) {
        int limit = 4;
        int[][] queries = {{1,4},{2,5},{1,3},{3,4},{2,3}};
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[queries.length];  // Should be queries.length, not limit

        // Use a HashMap to track unique colors
        HashMap<Integer,Integer> colorCount = new HashMap<>();

        for(int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];

            // If ball was previously colored, remove that color's count
            if(map.containsKey(ball)) {
//                System.out.println(map);
                int oldColor = map.get(ball);
//                System.out.println(colorCount.get(oldColor));
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                if(colorCount.get(oldColor) == 0) {
                    colorCount.remove(oldColor);
                }
            }

            // Add new color
            map.put(ball, newColor);
            colorCount.put(newColor, colorCount.getOrDefault(newColor, 0) + 1);
            System.out.println(map);
            System.out.println("color" + colorCount);
            result[i] = colorCount.size();
        }
        System.out.println(Arrays.toString(result));
    }
}

