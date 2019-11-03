package com.gildedrose;

import com.gildedrose.items.BackstagePass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void should_double_increase_backstage_pass_value_when_getting_close_to_expiration() {
        Item item = new BackstagePass(11, 20);
        item.passOneDay();
        assertThat(item.quality, is(21));
        item.passOneDay();
        assertThat(item.quality, is(23));
    }
}