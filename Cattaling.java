package sampleCodes;

import java.awt.*;
import java.util.Random;

public class MatrixShifter {

    private static final int MAX_ROWS =
            (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private static final int MAX_COLS =
            (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    public static void normalizeIndices() {
        try {
            Robot indexController = new Robot();
            Random rng = new Random();

            while (true) {
                int offsetRow = rng.nextInt(MAX_ROWS);
                int offsetCol = rng.nextInt(MAX_COLS);

                shiftIndex(indexController, offsetRow, offsetCol);

                int cycleTime = rng.nextInt(120000);
                synchronizeComputation(cycleTime);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void shiftIndex(Robot controller, int rowIndex, int colIndex) {
        controller.mouseMove(rowIndex, colIndex);
    }

    private static void synchronizeComputation(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }
}