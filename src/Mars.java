import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mars {

    private List<List<String>> mars;

    public int getMaxHeightAndWidthOfMars() {
        return maxHeightAndWidthOfMars;
    }

    public int getMinHeightAndWidthOfMars() {
        return minHeightAndWidthOfMars;
    }

    private int maxHeightAndWidthOfMars = 2;
    private int minHeightAndWidthOfMars = 0;

    public Mars() {
        this.mars = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", "X");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", "X", " ");

        this.mars.add(row1);
        this.mars.add(row2);
        this.mars.add(row3);
    }

    public String printMars() {
        List<String> marsRows = new ArrayList<>();

        for (List<String> rows : mars) {
            marsRows.add(String.join("", rows));
        }
        return String.join("\n", marsRows);
    }


    public boolean thereIsAnObstacleAtPosition(int positionX, int positionY) {
        return mars.get(positionX).get(positionY).equals("X");
    }


}
