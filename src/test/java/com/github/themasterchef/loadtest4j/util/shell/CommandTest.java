package com.github.themasterchef.loadtest4j.util.shell;

import com.github.themasterchef.loadtest4j.junit.UnitTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@Category(UnitTest.class)
public class CommandTest {
    private final Command command = new Command(Arrays.asList("foo", "bar"), "whoami");

    @Test
    public void testGetLaunchPath() {
        assertEquals("whoami", command.getLaunchPath());
    }

    @Test
    public void testGetArguments() {
        assertEquals(Arrays.asList("foo", "bar"), command.getArguments());
    }
}
