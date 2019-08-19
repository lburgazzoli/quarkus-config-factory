package io.github.lburgazzoli.examples;

import java.util.Collections;

import org.eclipse.microprofile.config.spi.ConfigSource;
import org.eclipse.microprofile.config.spi.ConfigSourceProvider;
import org.slf4j.LoggerFactory;

public class ApplicationConfigSourceProvider implements ConfigSourceProvider {
    @Override
    public Iterable<ConfigSource> getConfigSources(ClassLoader forClassLoader) {
        LoggerFactory.getLogger(getClass()).info("ApplicationConfigSourceProvider::getConfigSources");
        return Collections.emptyList();
    }
}
