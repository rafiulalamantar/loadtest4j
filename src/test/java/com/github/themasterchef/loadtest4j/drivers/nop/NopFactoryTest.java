package com.github.themasterchef.loadtest4j.drivers.nop;

import com.github.themasterchef.loadtest4j.DriverFactory;
import com.github.themasterchef.loadtest4j.DriverFactoryTest;
import com.github.themasterchef.loadtest4j.Driver;
import com.github.themasterchef.loadtest4j.junit.UnitTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

@Category(UnitTest.class)
public class NopFactoryTest extends DriverFactoryTest {

    @Override
    protected DriverFactory sut() {
        return new NopFactory();
    }

    @Test
    public void testGetMandatoryProperties() {
        final DriverFactory sut = sut();

        assertEquals(Collections.emptySet(), sut.getMandatoryProperties());
    }

    @Test
    public void testCreate() {
        final DriverFactory sut = sut();

        final Driver driver = sut.create(Collections.emptyMap());

        assertEquals(Nop.class, driver.getClass());
    }
}
