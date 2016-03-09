package com.elbsoft.examplemvpwithvaadinandcdi.demoB;

import com.vaadin.navigator.View;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class PresenterDemoBImpl implements ViewDemoB.PresenterDemoB {

    @Inject
    private ViewDemoB viewDemoB;

    @PostConstruct
    @Override
    public void init() {
        viewDemoB.setPresenter(this);
    }

    @Override
    public View getView() {
        return this.viewDemoB;
    }
}
