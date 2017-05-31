package com.cassiomolin.example.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    public static final String FEATURE_NORMALIZE_URI = "com.sun.jersey.config.feature.NormalizeURI";
    public static final String FEATURE_CANONICALIZE_URI_PATH = "com.sun.jersey.config.feature.CanonicalizeURIPath";
    public static final String FEATURE_REDIRECT = "com.sun.jersey.config.feature.Redirect";
    public static final String FEATURE_MATCH_MATRIX_PARAMS = "com.sun.jersey.config.feature.IgnoreMatrixParams";
    public static final String FEATURE_IMPLICIT_VIEWABLES = "com.sun.jersey.config.feature.ImplicitViewables";
    public static final String FEATURE_DISABLE_WADL = "com.sun.jersey.config.feature.DisableWADL";
    public static final String FEATURE_TRACE = "com.sun.jersey.config.feature.Trace";
    public static final String FEATURE_TRACE_PER_REQUEST = "com.sun.jersey.config.feature.TracePerRequest";
    public static final String PROPERTY_MEDIA_TYPE_MAPPINGS = "com.sun.jersey.config.property.MediaTypeMappings";
    public static final String PROPERTY_LANGUAGE_MAPPINGS = "com.sun.jersey.config.property.LanguageMappings";
    public static final String PROPERTY_DEFAULT_RESOURCE_COMPONENT_PROVIDER_FACTORY_CLASS = "com.sun.jersey.config.property.DefaultResourceComponentProviderFactoryClass";
    public static final String PROPERTY_CONTAINER_NOTIFIER = "com.sun.jersey.spi.container.ContainerNotifier";
    public static final String PROPERTY_CONTAINER_REQUEST_FILTERS = "com.sun.jersey.spi.container.ContainerRequestFilters";
    public static final String PROPERTY_CONTAINER_RESPONSE_FILTERS = "com.sun.jersey.spi.container.ContainerResponseFilters";
    public static final String PROPERTY_RESOURCE_FILTER_FACTORIES = "com.sun.jersey.spi.container.ResourceFilters";
    public static final String PROPERTY_WADL_GENERATOR_CONFIG = "com.sun.jersey.config.property.WadlGeneratorConfig";
    public static final String COMMON_DELIMITERS = " ,;\n";

    @PostConstruct
    private void init() {



//        ResourceConfig resourceConfig = new PackagesResourceConfig(BASE_PACKAGE.concat(".provider"),
//                specificPackage, "com.wordnik.swagger.jaxrs.listing");
//
  /*      resourceConfig.getProperties().put(ResourceConfig.PROPERTY_CONTAINER_RESPONSE_FILTERS,
                GenericResponseFilter.class);

        resourceConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);
        resourceConfig.getProperties().put(ResourceConfig.PROPERTY_RESOURCE_FILTER_FACTORIES,
                MymoFilterFactory.class);*/
//
//        Map<String, Object> params = new HashMap<String, Object>();
//
//        // parámetros de inicio como si fuesen de web.xml
//        // params.put("com.sun.jersey.config.property.WadlGeneratorConfig",
//        // "com.technoactivity.mymo.core.server.MymoWadlGeneratorConfig");
//
//        params.put("com.sun.jersey.config.feature.DisableWADL", "true");
//        params.put("com.sun.jersey.client.property.connectTimeout", "10000");
//        params.put("com.sun.jersey.client.property.readTimeout", "20000");




//        Map<String, Object> map= new HashMap<String, Object>();
//        map.put(PROPERTY_CONTAINER_RESPONSE_FILTERS,
//                AppConfiguration.class);
//        addProperties(map);

        packages("com.cassiomolin.example.api.resources");
//        registerClasses(GreetingResource.class);
    }
}