package com.github.loadtest4j.loadtest4j.factory;

import com.github.loadtest4j.loadtest4j.reporter.Reporter;
import com.github.loadtest4j.loadtest4j.reporter.LoggingReporter;
import com.github.loadtest4j.loadtest4j.reporter.NopReporter;
import com.github.loadtest4j.loadtest4j.junit.UnitTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.Collections;

import static org.junit.Assert.assertTrue;

@Category(UnitTest.class)
public class ReporterFactoryTest {

    @Test
    public void testCreate() {
        // Given
        final ReporterFactory factory = new ReporterFactory();

        // When
        final Reporter reporter = factory.create(Collections.singletonMap("enabled", "true"));

        // Then
        assertTrue(reporter instanceof LoggingReporter);
    }

    @Test
    public void testCreateWithNoConfig() {
        // Given
        final ReporterFactory factory = new ReporterFactory();

        // When
        final Reporter reporter = factory.create(Collections.emptyMap());

        // Then
        assertTrue(reporter instanceof NopReporter);
    }

    @Test
    public void testCreateWithInvalidConfig() {
        // Given
        final ReporterFactory factory = new ReporterFactory();

        // When
        final Reporter reporter = factory.create(Collections.singletonMap("enabled", "foo"));

        // Then
        assertTrue(reporter instanceof NopReporter);
    }
}