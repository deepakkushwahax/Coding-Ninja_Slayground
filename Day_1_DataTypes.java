import java.util.HashMap;

public class Day_1_DataTypes {
    public static int main(String type) {
        HashMap<String,Integer>map = new HashMap<>();
        map.put("Integer",4);
        map.put("Long",8);
        map.put("Float",4);
        map.put("Double",8);
        map.put("Character",1);

        return(int)map.get(type);

    }
}
