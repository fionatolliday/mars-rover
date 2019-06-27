import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mars {

    private List<List<String>> mars;

    int getMaxHeightAndWidthOfMars() {
        return 2;
    }

    int getMinHeightAndWidthOfMars() {
        return 0;
    }

    Mars() {
        this.mars = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", "X");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", "X", " ");

        this.mars.add(row1);
        this.mars.add(row2);
        this.mars.add(row3);
    }

    boolean isAnObstacleFoundAtPosition(int positionX, int positionY) {
        return mars.get(positionX).get(positionY).equals("X");
    }


}
