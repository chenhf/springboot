package com.chenhf.test.controller;

import com.chenhf.test.bean.Account;
import com.chenhf.test.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chenhf on 2017/6/1.
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getAccounts(){
     return    accountService.findAccountList();
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Account  getAccountById(@PathVariable("id") int id){
        return accountService.findAccountbyId(id);
    }


}
