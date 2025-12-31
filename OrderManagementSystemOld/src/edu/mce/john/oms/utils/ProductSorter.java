package edu.mce.john.oms.utils;

import java.util.Comparator;

import edu.mce.john.oms.model.Product;

public class ProductSorter {
    public static Comparator<Product> byName() {
        return Comparator.comparing(p -> p.toString());
    }
}
