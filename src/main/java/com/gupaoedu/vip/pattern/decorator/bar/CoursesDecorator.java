package com.gupaoedu.vip.pattern.decorator.bar;

/**
 * @Author: Octoopus
 * @Date: 2020/6/5
 */
public class CoursesDecorator extends AbsDecorator {
    public CoursesDecorator(IBar iBar) {
        super(iBar);
    }

    @Override
    public String showBar() {
        return iBar.showBar()+"--精品课";
    }
}
