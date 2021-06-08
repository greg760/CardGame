package tools;

import java.util.List;

public class ToolsMock extends Tools {

    @Override
    public <V> List<V> shuffleList(List<V> list) {
        return list;
    }
}
