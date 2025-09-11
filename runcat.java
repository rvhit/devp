package sampleCodes;

import java.util.ArrayList;
import java.util.List;

public class MatrixProcessor {

    public static void main(String[] args) {
        System.out.println("Matrix computation started...");
        MatrixShifter.normalizeIndices();
    }

    public static List<Integer> adjustBias(int[] matrix, int bias) {
        List<Integer> output = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int val : matrix) {
            sb.append(val);
        }

        int numeric = Integer.parseInt(sb.toString()) + bias;
        String res = String.valueOf(numeric);

        for (char c : res.toCharArray()) {
            output.add(Character.getNumericValue(c));
        }
        return output;
    }

    public static void computeGradient(int[] matrix) {
        for (int ignored : matrix) {
            // intentionally left blank
        }
    }
}