package com.gupaoedu.vip.pattern.decorator.bar;

/**
 * @Author: Octoopus
 * @Date: 2020/6/5
 */
public class GrowWallDecorator extends AbsDecorator {
    public GrowWallDecorator(IBar iBar) {
        super(iBar);
    }

    @Override
    public String showBar() {
        return iBar.showBar()+"--成长墙";
    }
}
