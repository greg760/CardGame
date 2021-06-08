package tools;

import java.util.Collections;
import java.util.List;

public class Tools {

    public <V> List<V> shuffleList(List<V> list) {

        Collections.shuffle(list);

        return list;

    }
}
