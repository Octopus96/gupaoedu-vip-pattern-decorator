package com.gupaoedu.vip.pattern.decorator.bar;

/**
 * @Author: Octoopus
 * @Date: 2020/6/5
 */
public class QuestionDecorator extends AbsDecorator {
    public QuestionDecorator(IBar iBar) {
        super(iBar);
    }

    @Override
    public String showBar() {
        return iBar.showBar()+"--题库";
    }
}
