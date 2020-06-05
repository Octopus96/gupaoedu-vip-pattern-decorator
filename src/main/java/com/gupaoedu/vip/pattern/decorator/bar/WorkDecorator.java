package com.gupaoedu.vip.pattern.decorator.bar;

/**
 * @Author: Octoopus
 * @Date: 2020/6/5
 */
public class WorkDecorator extends AbsDecorator {
    public WorkDecorator(IBar iBar) {
        super(iBar);
    }

    @Override
    public String showBar() {
        return iBar.showBar()+"--作业";
    }
}
