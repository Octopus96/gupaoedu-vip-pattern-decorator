package com.gupaoedu.vip.pattern.decorator.bar;

/**
 * @Author: Octoopus
 * @Date: 2020/6/5
 */
public abstract class AbsDecorator implements IBar {
    protected IBar iBar;

    public AbsDecorator(IBar iBar) {
        this.iBar = iBar;
    }

    @Override
    public abstract String showBar();
}
