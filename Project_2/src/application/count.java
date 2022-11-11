package application;

import java.util.*;

public class count {

    public Map<String, Integer> countSymptoms(List<String> list) {

        Map<String, Integer> resultCount = new HashMap<>();

        list.forEach(symptom -> {
            if (!resultCount.containsKey(symptom)) {
                resultCount.put(symptom, Collections.frequency(list, symptom));
            }else{
                resultCount.replace(symptom, resultCount.get(symptom + 2));

            }
        });
      /*list.forEach(symptom->{
          if(resultCount.containsKey(symptom)){
              resultCount.replace(symptom, resultCount.get(symptom + 2));
        }else{
              resultCount.put(symptom, 3);

          }
        });*/
        /*
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i)" + list.get(i));
            if (map.containsKey(list.get(i))) {
                map.replace((String) list.get(i), map.get(list.get(i)) + 1);
                map.values(i);

            } else {
                map.put((String) list.get(i), 1);
            }
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
