package game;

import java.util.ArrayList;

public class FinalLimitList<T> extends ArrayList<T> {

    private final int limit;

    public FinalLimitList(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean add(T t) {
        if (size() < limit) {
            super.add(t);
            return true;
        }
        return false;
    }
}
