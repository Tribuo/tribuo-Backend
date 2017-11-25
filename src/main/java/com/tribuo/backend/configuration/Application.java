/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.configuration;

import org.pac4j.core.client.Client;
import org.pac4j.core.client.Clients;
import org.pac4j.core.config.Config;
import org.pac4j.core.context.J2EContext;
import org.pac4j.core.context.WebContext;
import org.pac4j.core.exception.HttpAction;
import org.pac4j.core.profile.CommonProfile;
import org.pac4j.core.profile.ProfileManager;
import org.pac4j.springframework.web.LogoutController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Camilo
 */
//@Controller
public class Application {

    @Value("${pac4j.centralLogout.defaultUrl:#{null}}")
    private String defaultUrl;

    @Value("${pac4j.centralLogout.logoutUrlPattern:#{null}}")
    private String logoutUrlPattern;

    private LogoutController logoutController;

    @Value("${salt}")
    private String salt;

    @Autowired
    private Config config;

    @PostConstruct
    protected void afterPropertiesSet() {
        logoutController = new LogoutController();
        logoutController.setDefaultUrl(defaultUrl);
        logoutController.setLogoutUrlPattern(logoutUrlPattern);
        logoutController.setLocalLogout(false);
        logoutController.setCentralLogout(true);
        logoutController.setConfig(config);
        logoutController.setDestroySession(false);
    }

    @RequestMapping("/")
    public String root(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) throws HttpAction {
        return index(request, response, map);
    }

    @RequestMapping("/index.html")
    public String index(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) throws HttpAction {
        final WebContext context = new J2EContext(request, response);
        map.put("profiles", getProfiles(context));
        map.put("sessionId", context.getSessionIdentifier());
        return "index";
    }

    private List<CommonProfile> getProfiles(final WebContext context) {
        final ProfileManager manager = new ProfileManager(context);
        return manager.getAll(true);
    }

    @RequestMapping("/oidc/index.html")
    public String oidc(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
        return protectedIndex(request, response, map);
    }

    @RequestMapping("/forceLogin")
    public String forceLogin(HttpServletRequest request, HttpServletResponse response) {

        final J2EContext context = new J2EContext(request, response);
        final Client client = config.getClients().findClient(request.getParameter(Clients.DEFAULT_CLIENT_NAME_PARAMETER));
        try {
            client.redirect(context);
        } catch (final HttpAction e) {
        }
        return null;
    }

    protected String protectedIndex(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map) {
        final WebContext context = new J2EContext(request, response);
        map.put("profiles", getProfiles(context));
        return "protectedIndex";
    }

    @RequestMapping("/centralLogout")
    public void centralLogout(HttpServletRequest request, HttpServletResponse response) {
        logoutController.logout(request, response);
    }
}
