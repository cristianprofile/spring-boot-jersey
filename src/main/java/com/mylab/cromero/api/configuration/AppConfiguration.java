package com.mylab.cromero.api.configuration;

import com.mylab.cromero.api.JerseyConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cromero on 30/05/2017.
 */


@Configuration
@ComponentScan(basePackageClasses = JerseyConfig.class)
public class AppConfiguration {
}
