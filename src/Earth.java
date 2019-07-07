import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Earth implements Planet{

    public List<List<String>> getAreaMap() {
        return areaMap;
    }

    private List<List<String>> areaMap;

    public Earth() {
        this.areaMap = new ArrayList<>();
        List<String> row1 = Arrays.asList(" ", " ", " ");
        List<String> row2 = Arrays.asList(" ", " ", " ");
        List<String> row3 = Arrays.asList(" ", " ", " ");
        List<String> row4 = Arrays.asList(" ", " ", " ");

        this.areaMap.add(row1);
        this.areaMap.add(row2);
        this.areaMap.add(row3);
        this.areaMap.add(row4);
    }

}
