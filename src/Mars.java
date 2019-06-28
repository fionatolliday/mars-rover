import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mars {

    public List<List<String>> getAreaMap() {
        return areaMap;
    }

    private List<List<String>> areaMap;

    int getMaxHeightAndWidthOfMars() {
        return 2;
    }

    int getMinHeightAndWidthOfMars() {
        return 0;
    }

    Mars() {
        this.areaMap = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", "X");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", "X", " ");

        this.areaMap.add(row1);
        this.areaMap.add(row2);
        this.areaMap.add(row3);
    }




}
