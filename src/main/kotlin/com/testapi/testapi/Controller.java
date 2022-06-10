package com.testapi.testapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Handles endpoints for Users
 */

@RestController
public class Controller {

    List<Integer> test = new ArrayList<Integer>();

    @Autowired
    public Controller() {
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Integer>> getUser() {

        if(test.isEmpty()){
            for(int i=0; i<20; i++){
                test.add(i);
            }
        } else {
            test.add(1);
        }
        return new ResponseEntity<>(test, HttpStatus.OK);
    }
}