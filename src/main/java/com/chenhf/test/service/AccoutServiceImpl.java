package com.chenhf.test.service;

import com.chenhf.test.bean.Account;
import com.chenhf.test.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenhf on 2017/6/1.
 */
@Service
public class AccoutServiceImpl implements IAccountService {
    @Autowired
    IAccountDao accountDao;
    @Override
    public int add(Account account) {
        return accountDao.add(account);
    }

    @Override
    public int delete(int id) {
        return accountDao.delete(id);
    }

    @Override
    public int update(Account account) {
        return accountDao.update(account);
    }

    @Override
    public Account findAccountbyId(int id) {
        return accountDao.findAccountbyId(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountDao.findAccountList();
    }
}
