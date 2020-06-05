package com.gupaoedu.vip.pattern.decorator.bar;

import com.gupaoedu.vip.pattern.decorator.bar.permission.IPermission;
import com.gupaoedu.vip.pattern.decorator.bar.permission.LogInUser;
import com.gupaoedu.vip.pattern.decorator.bar.permission.LoginVip;
import com.gupaoedu.vip.pattern.decorator.bar.permission.NotLogInUser;

/**
 * @Author: Octoopus
 * @Date: 2020/6/5
 */
public class Cilent {
    public static void main(String[] args) {
        IPermission notLogInUser = new NotLogInUser();
        System.out.println("未登录用户导航条：");
        System.out.println(notLogInUser.showPermBar());
        System.out.println("===========================");

        IPermission logInUser = new LogInUser();
        System.out.println("已登录用户导航条：");
        System.out.println(logInUser.showPermBar());
        System.out.println("===========================");

        IPermission logInVip = new LoginVip();
        System.out.println("已登录会员导航条：");
        System.out.println(logInVip.showPermBar());
        System.out.println("===========================");

    }
}
