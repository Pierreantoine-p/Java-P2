package application;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class count {
    public Map<String, Integer> countSymptoms(List<String> listToCount) {
        Map<String, Integer> resultCount = new TreeMap<>();
        try{
        for (String element : listToCount) {
            if (element != null) {
                if (!resultCount.containsKey(element)) {
                    resultCount.put(element, 1);
                } else {
                    resultCount.put(element, resultCount.get(element) + 1);
                }
            }
        }} catch (Exception e) {
            e.printStackTrace();
            System.out.println("e" + e);
        }
        return resultCount;
    }
}