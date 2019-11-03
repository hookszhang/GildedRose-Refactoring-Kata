package com.gildedrose.items;

import com.gildedrose.Item;

/**
 * @author hookszhang on 2019/11/3.
 */
public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected boolean isBackstagePass() {
        return true;
    }
}
