package com.chenhf.test.service;

import com.chenhf.test.bean.Account;

import java.util.List;

/**
 * Created by chenhf on 2017/6/1.
 */
public interface IAccountService {
    int add(Account account);
    int delete(int id);
    int update(Account account);
    Account findAccountbyId(int id);
    List<Account> findAccountList();
}
