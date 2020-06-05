package com.gupaoedu.vip.pattern.decorator.bar;

/**
 * @Author: Octoopus
 * @Date: 2020/6/5
 */
public class CommBar implements IBar {
    @Override
    public String showBar() {
        return "问答--文章--精品课--冒泡--商城";
    }
}
