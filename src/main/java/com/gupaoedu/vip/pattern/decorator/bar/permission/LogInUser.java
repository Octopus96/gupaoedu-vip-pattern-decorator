package com.gupaoedu.vip.pattern.decorator.bar.permission;

import com.gupaoedu.vip.pattern.decorator.bar.CommBar;
import com.gupaoedu.vip.pattern.decorator.bar.QuestionDecorator;

/**
 * @Author: Octoopus
 * @Date: 2020/6/5
 */
public class LogInUser implements IPermission {
    @Override
    public String showPermBar() {
        return new QuestionDecorator(new CommBar()).showBar();
    }
}
