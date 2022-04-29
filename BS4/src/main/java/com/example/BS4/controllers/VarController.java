package com.example.BS4.controllers;

import com.example.BS4.services.VarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VarController {

    @Autowired
    VarService varService;

    @GetMapping("valores")
    String getVar1Var2(){
        return "valor de var1 es:" + varService.getVar1() +
                "\nvalor de var2 es:" + varService.getVar2();
    }

    @GetMapping("var3")
    String getVar3(){
        return "valor de var3 es:" + varService.getVar3();
    }

}
