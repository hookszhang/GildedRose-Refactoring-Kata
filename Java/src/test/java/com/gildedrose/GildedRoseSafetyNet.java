package com.gildedrose;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author hookszhang on 2019/10/28.
 */
public class GildedRoseSafetyNet {
    @Test
    public void should_always_align_with_baseline() throws IOException {
        String output = TextTestFixture.getBaseline();
        String baseline = Files.toString(new File("src/test/baseline.txt"), Charsets.UTF_8);
        assertThat(output, is(baseline));
    }
}
