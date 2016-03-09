package com.elbsoft.examplemvpwithvaadinandcdi.demoA;

import com.vaadin.navigator.View;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class PresenterDemoAImpl implements ViewDemoA.PresenterDemoA {

    @Inject
    private ViewDemoA viewDemoA;

    @PostConstruct
    @Override
    public void init() {
        viewDemoA.setPresenter(this);
    }

    @Override
    public View getView() {
        return this.viewDemoA;
    }
}
