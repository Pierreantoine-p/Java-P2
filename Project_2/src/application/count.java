package application;

import java.util.*;

public class count {

    public void countSymptoms(List list) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0 ; i< list.length ; i ++){
            if(map.containsKey(list.get(i))){
                map.replace(list[i],map.get(list[i])+1);
            }else{
                map.put(list[i],1);
            }
        }
        }

    }
// convertir list en array pour faire un une .length dessus

// chaque symptoms = 0
    //à chaque ligne il regarde si le symptom existe
    //si le symptom existe => +1
    //si le symptom existe pas => il le crée et ajoute +1
    //écrire dans le doc de sortie le total des symptom
}
