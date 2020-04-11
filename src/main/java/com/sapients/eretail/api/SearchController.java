package com.sapients.eretail.api;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class SearchController {
    @GetMapping(path = "search")
    public ResponseEntity<Object> search(@RequestParam String query) {

        return new ResponseEntity<Object>("Hello World "+ query, new HttpHeaders(), HttpStatus.OK);
    }
}
