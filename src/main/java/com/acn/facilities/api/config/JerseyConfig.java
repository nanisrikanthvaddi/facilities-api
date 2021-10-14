package com.acn.facilities.api.config;

import com.acn.facilities.api.controller.FacilitiesController;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

import static com.acn.facilities.api.config.SwaggerConfig.initSwagger;

@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        register(FacilitiesController.class);

        register(JacksonJaxbJsonProvider.class);
        initSwagger(
                "API Health - Open API Scheme", "Health Services",
                "API Health Support Team",
                "Company Licence - http://www.accenture.com/licenses.html",
                "https://www.accenture.com/terms-and-conditions",
                "Health API",
                "api",
                "https://api-intrant.com.sg",
                this);

    }

}
