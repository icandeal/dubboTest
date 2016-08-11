package com.ycf.impl;

import com.ycf.inter.ITestDAO;
import org.springframework.stereotype.Component;

/**
 * Created by sniper on 16-8-10.
 */
@Component
public class TestDAO implements ITestDAO {
    public String getResult(String initName){
        return ("init name is : "+initName);
    }
}
