package com.ycf;

import com.ycf.inter.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sniper on 16-8-11.
 */
@Component
public class TestAPIImpl implements TestAPI {
    @Autowired
    ITestService testService;

    public String testThisAPI(String input) {
        return testService.getInit(input);
    }
}
