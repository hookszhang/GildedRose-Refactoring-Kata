package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public static Item createNormalItem(String name, int sellIn, int quality) {
        return new Item(name, sellIn, quality);
    }

    protected Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    protected boolean isBackstagePass() {
        return false;
    }

    protected boolean isSulfuras() {
        return false;
    }

    protected boolean isAgedBrie() {
        return false;
    }

    void passOneDay() {
        updateSellInDays();
        updateQuality();

        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    private void updateQuality() {
        if (!isAgedBrie()
                && !isBackstagePass()) {
            if (quality > 0) {
                if (!isSulfuras()) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (isBackstagePass()) {
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
    }

    private void updateQualityAfterExpiration() {
        if (!isAgedBrie()) {
            if (!isBackstagePass()) {
                if (quality > 0) {
                    if (!isSulfuras()) {
                        quality = quality - 1;
                    }
                }
            } else {
                quality = 0;
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    private void updateSellInDays() {
        if (!isSulfuras()) {
            sellIn = sellIn - 1;
        }
    }
}
