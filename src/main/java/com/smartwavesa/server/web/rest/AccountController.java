package com.smartwavesa.server.web.rest;

import com.smartwavesa.server.domain.Account;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jroux on 14.03.2016.
 */
@RestController
public class AccountController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    private final List<Account> accounts = new ArrayList<Account>();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        LOGGER.debug("GET /");
        return "Welcome to the MBaaS test";
    }

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public Collection<Account> getAll() {
        LOGGER.debug("GET /accounts");
        return accounts;
    }

    @RequestMapping(value = "/accounts/{count}", method = RequestMethod.GET)
    public String loadData(@PathVariable int count) {
        LOGGER.debug("GET /accounts/{}", count);
        for(int i = 0; i < count; i++) {
            accounts.add(createAccount());
        }

        return "Accounts created: " + count;
    }

    @RequestMapping(value = "/clear", method = RequestMethod.GET)
    public String clearData() {
        LOGGER.debug("GET /clear");
        accounts.clear();
        return "Accounts cleared";
    }

    private Account createAccount() {
        Account account = new Account();
        account.setFirstname(RandomStringUtils.random(10, true, false));
        account.setLastname(RandomStringUtils.random(10, true, false));
        account.setOccupation(RandomStringUtils.random(10, true, false));
        return account;
    }
}
