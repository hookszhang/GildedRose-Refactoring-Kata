package com.gildedrose.items;

import com.gildedrose.Item;

/**
 * @author hookszhang on 2019/11/3.
 */
public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    protected void updateSellInDays() {
        // do nothing
    }

    @Override
    protected void updateQualityAfterExpiration() {
        // do nothing
    }

    @Override
    protected void updateQuality() {
        // do nothing
    }
}
