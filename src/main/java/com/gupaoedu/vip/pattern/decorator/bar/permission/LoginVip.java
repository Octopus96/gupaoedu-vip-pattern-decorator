package com.gupaoedu.vip.pattern.decorator.bar.permission;

import com.gupaoedu.vip.pattern.decorator.bar.CommBar;
import com.gupaoedu.vip.pattern.decorator.bar.GrowWallDecorator;
import com.gupaoedu.vip.pattern.decorator.bar.WorkDecorator;

/**
 * @Author: Octoopus
 * @Date: 2020/6/5
 */
public class LoginVip implements IPermission {
    @Override
    public String showPermBar() {
        return new GrowWallDecorator(new WorkDecorator(new CommBar())).showBar();
    }
}
