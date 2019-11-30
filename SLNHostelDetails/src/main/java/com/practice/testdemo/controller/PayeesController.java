package com.practice.testdemo.controller;

import com.practice.testdemo.model.Payees;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PayeesController {

    @GetMapping("/payees")
    public ResponseEntity<List<Payees>> getBillerList() {

        Payees payees = new Payees("#####","Credit Card","http://localhost:8080");
        Payees payees1 = new Payees("#####","Credit Card","http://localhost:8080");
        Payees payees2 = new Payees("###","Credit Card","http://localhost:8080");
        List<Payees> filteredPayees = null;

        List<Payees> payeesList = new ArrayList<>();
        payeesList.add(payees);
        payeesList.add(payees1);
        payeesList.add(payees2);
        try {
             filteredPayees = payeesList.stream().filter(p -> p.getPayeeId().equals("###")).collect(Collectors.toList());
        } catch(Exception e) {
            //payees.setLogoURI(e.getMessage());
        }
        ResponseEntity<List<Payees>> entity = new ResponseEntity(filteredPayees, HttpStatus.ACCEPTED);
        return entity;
    }
}
