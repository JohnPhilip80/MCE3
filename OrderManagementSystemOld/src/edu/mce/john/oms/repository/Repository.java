package edu.mce.john.oms.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repository<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }

    public Optional<T> find(int index) {
        if (index >= 0 && index < items.size()) {
            return Optional.of(items.get(index));
        }
        return Optional.empty();
    }
}
