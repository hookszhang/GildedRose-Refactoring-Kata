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
    protected void updateQualityAfterExpiration() {
        quality = 0;
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;

            if (sellIn < 10) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

            if (sellIn < 5) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }
}
