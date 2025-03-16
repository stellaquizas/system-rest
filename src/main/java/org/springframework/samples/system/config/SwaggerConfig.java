/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.system.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * Java config for springdoc-openapi API documentation library
 *
 * @author Vitaliy Fedoriv
 */
@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
            .components(new Components())
            .info(new Info()
                .title("REST System backend API documentation")
                .version("1.0")
                .termsOfService("https://github.com/spring-petclinic/spring-petclinic-rest/blob/master/terms.txt")
                .description(
                    "This is the REST API documentation of the Spring System backend. " +
                        "If authentication is enabled, use admin/admin when calling the APIs")
                .license(swaggerLicense())
                .contact(swaggerContact()));
    }

    private Contact swaggerContact() {
        Contact systemContact = new Contact();
        systemContact.setName("Vitaliy Fedoriv");
        systemContact.setEmail("vitaliy.fedoriv@gmail.com");
        systemContact.setUrl("https://github.com/spring-petclinic/spring-petclinic-rest");
        return systemContact;
    }

    private License swaggerLicense() {
        License systemLicense = new License();
        systemLicense.setName("Apache 2.0");
        systemLicense.setUrl("http://www.apache.org/licenses/LICENSE-2.0");
        systemLicense.setExtensions(Collections.emptyMap());
        return systemLicense;
    }

} 