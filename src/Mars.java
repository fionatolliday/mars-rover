import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mars implements Planet {

    public List<List<String>> getAreaMap() {
        return areaMap;
    }

    private List<List<String>> areaMap;

    public Mars() {
        this.areaMap = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", "X");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", "X", " ");

        this.areaMap.add(row1);
        this.areaMap.add(row2);
        this.areaMap.add(row3);
    }


}
