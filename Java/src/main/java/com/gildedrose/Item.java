package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    boolean isBackstagePass() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    boolean isSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    boolean isAgedBrie() {
        return name.equals("Aged Brie");
    }
}
