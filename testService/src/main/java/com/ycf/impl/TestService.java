package com.ycf.impl;

import com.ycf.inter.ITestDAO;
import com.ycf.inter.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sniper on 16-8-10.
 */
@Service
public class TestService implements ITestService {
    @Autowired
    private ITestDAO testDAO;

    public String getInit(String initName){
        return testDAO.getResult(initName);
    }
}
