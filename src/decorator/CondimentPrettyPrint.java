package decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 16/9/12 下午12:45.
 */
public class CondimentPrettyPrint extends CondimentDecorator {
    Beverage beverage;

    public CondimentPrettyPrint(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override public String getDescription() {
        String description = beverage.getDescription();
        String[] des = description.split(",");
        Map<String, Integer> contMap = new HashMap<>();
        for (int i = 1; i < des.length; i++) {
            String s = des[i];
            if (contMap.containsKey(s)) {
                contMap.put(s, contMap.get(s) + 1);
            } else {
                contMap.put(s, 1);
            }

        }
        String result = "";
        for (Map.Entry entry : contMap.entrySet()) {
            String key = (String) entry.getKey();
            Integer value = (int) entry.getValue();
            result += String.format("%s %s, ", value, key);
        }
        return result.substring(0, result.length() - 2);
    }

    @Override public Double cost() {
        return beverage.cost();
    }
}
