package io.github.lburgazzoli.examples;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.Config;

@ApplicationScoped
public class Application {
    @Inject
    Config config;
}