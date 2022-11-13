package application;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class count {
    public Map<String, Integer> countSymptoms(List<String> listToCount) {
        Map<String, Integer> resultCount = new TreeMap<>();


        /*for (String element : listToCount) {
            int count = resultCount.getOrDefault(element, 0);
            resultCount.put(element, count + 1);
            System.out.println(count + 1);
        try {
            listToCount.forEach(symptom -> {
                if (!resultCount.containsKey(symptom)) {
                    resultCount.put(symptom, Collections.frequency(listToCount, symptom));
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        try{
        for (String element : listToCount) {
            if (element != null) {
                if (!resultCount.containsKey(element)) {
                    resultCount.put(element, 1);
                } else {
                    resultCount.put(element, resultCount.get(element) + 1);
                }
            }
            resultCount.put(element, Collections.frequency(listToCount, element));

        }} catch (Exception e) {
            e.printStackTrace();
            System.out.println("e" + e);
        }
        /*
        try{
            listToCount.forEach( (element) -> {
                if (element != null) {
                    int number = resultCount.get(element);
                    resultCount.put(element, number + 1);

                }
            }
    );
        } catch (Exception e) {
        e.printStackTrace();
            System.out.println("e" + e);
        }
        listToCount.forEach(element -> {
                    if (element != null) {
                        int number = resultCount.get(element)?:0;
                        if (!resultCount.containsKey(element)) {
                            resultCount.put(element, 1);
                        } else {
                            resultCount.put(element, number + 1);
                        }
                    }

            if (!resultCount.containsKey(symptom)) {
                resultCount.put(symptom, Collections.frequency(list, symptom));
            }else{
                resultCount.replace(symptom, resultCount.get(symptom + 1));

            }
        });
        try {
            listToCount.forEach(symptom -> {
                //System.out.println( "symptom " + symptom);
                //System.out.println( "listToCount" + listToCount);

                if (!resultCount.containsKey(symptom)) {
                    resultCount.put(symptom, 1);
                    System.out.println("passe par là");
                   // System.out.println( "symptom " + symptom);

                } else {
                    resultCount.replace(symptom, resultCount.get(symptom + 1));
                    System.out.println("passe par ici");

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("e" + e);


        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i)" + list.get(i));
            if (map.containsKey(list.get(i))) {
                map.replace((String) list.get(i), map.get(list.get(i)) + 1);
                map.values(i);

            } else {
                map.put((String) list.get(i), 1);
            }
        }

        }

        try {
            for (int i=0; i>listToCount.length; )
                System.out.println( "symptom " + symptom);
                System.out.println( "listToCount" + listToCount);

                if (!resultCount.containsKey(symptom)) {
                    resultCount.put(symptom, 1);
                    System.out.println("passe par là");
                    // System.out.println( "symptom " + symptom);

                } else {
                    resultCount.replace(symptom, resultCount.get(symptom + 1));
                    System.out.println("passe par ici");

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("e" + e);


        }*/


        System.out.println("resultCount" + resultCount);

        return resultCount;
    }
}

/*
public Map<String ,Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> resultSymptoms = new TreeMap<>();
        symptoms.forEach(symptom -> {
            if (!resultSymptoms.containsKey(symptom)) {
                resultSymptoms.put(symptom, Collections.frequency(symptoms, symptom));
            }
        });
        return resultSymptoms;
    }
 */
