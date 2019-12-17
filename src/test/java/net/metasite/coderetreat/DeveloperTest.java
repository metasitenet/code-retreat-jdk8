package net.metasite.coderetreat;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DeveloperTest {

    @Test
    public void developerWhoWritesTestsIsASaint() {
        assertThat(new Developer(true).isSaint(), is(true));
    }
}
