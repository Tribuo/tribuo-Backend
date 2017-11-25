/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribuo.backend.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Camilo
 */
//@Controller
//@RequestMapping({"${server.error.path:${error.path:/error}}"})
public class MyErrorController extends BasicErrorController {

    @Autowired
    public MyErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes, new ErrorProperties());
    }

    @RequestMapping(
            produces = {"text/html"}
    )
    @Override
    public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response) {
        final HttpStatus status = getStatus(request);
        if (null == status) {
            return new ModelAndView("error500");
        } else switch (status) {
            case UNAUTHORIZED:
                return new ModelAndView("error401");
            case FORBIDDEN:
                return new ModelAndView("error403");
            default:
                return new ModelAndView("error500");
        }
    }
}
