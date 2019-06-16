import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mars {

    private List<List<String>> mars;
    int maxheightAndWidthOfMars = 2;
    int minHeightAndWidthOfMars = -2;

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

    public int wrapMars(int position) {
        if (position >= maxheightAndWidthOfMars) {
            return minHeightAndWidthOfMars;
        } else if (position <= minHeightAndWidthOfMars) {
            return maxheightAndWidthOfMars;
        }
        return position;
    }


    public boolean thereIsAnObstacleAtPosition(int positionX, int positionY) {
        if (mars.get(positionX).get(positionY) == "X") {
            return true;
        }
        return false;

    }


}
