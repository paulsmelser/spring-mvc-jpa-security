package com.undologic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psmelser on 07/06/15.
 */
@RestController
@RequestMapping("rest/v1")
public class PageLoaderController {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html")
    public String get(){
        return "hellooooooo";
    }
}
