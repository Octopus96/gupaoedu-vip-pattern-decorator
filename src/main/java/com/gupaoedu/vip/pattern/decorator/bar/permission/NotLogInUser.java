package com.gupaoedu.vip.pattern.decorator.bar.permission;

import com.gupaoedu.vip.pattern.decorator.bar.CommBar;

/**
 * @Author: Octoopus
 * @Date: 2020/6/5
 */
public class NotLogInUser implements IPermission {
    @Override
    public String showPermBar() {
        return new CommBar().showBar();
    }
}
