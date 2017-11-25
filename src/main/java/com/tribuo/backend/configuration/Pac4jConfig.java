/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.configuration;

import com.nimbusds.jose.JWSAlgorithm;
import org.pac4j.core.authorization.authorizer.RequireAnyRoleAuthorizer;
import org.pac4j.core.client.Clients;
import org.pac4j.core.config.Config;
import org.pac4j.oidc.client.GoogleOidcClient;
import org.pac4j.oidc.config.OidcConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Camilo
 */
//@Configuration
public class Pac4jConfig {

    @Value("${salt}")
    private String salt;

    @Bean
    public Config config() {

        final OidcConfiguration oidcConfiguration = new OidcConfiguration();
        oidcConfiguration.setClientId("447773533098-fkurjbo93b3iog4au0kbcu3atf5isb78.apps.googleusercontent.com");
        oidcConfiguration.setSecret("UH3QXsmgXLg2SEb2vC-ybRjq");
        oidcConfiguration.setPreferredJwsAlgorithm(JWSAlgorithm.PS384);
        oidcConfiguration.addCustomParam("prompt", "consent");
        final GoogleOidcClient oidcClient = new GoogleOidcClient(oidcConfiguration);
        oidcClient.setAuthorizationGenerator((ctx, profile) -> {
            profile.addRole("ROLE_ADMIN");
            return profile;
        });

        final Clients clients = new Clients("http://localhost:8080/callback", oidcClient);

        final Config config = new Config(clients);
        config.addAuthorizer("admin", new RequireAnyRoleAuthorizer("ROLE_ADMIN"));
        config.addAuthorizer("custom", new CustomAuthorizer());
        return config;

    }

}
