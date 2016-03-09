package com.elbsoft.examplemvpwithvaadinandcdi.menu;

import com.elbsoft.examplemvpwithvaadinandcdi.navigation.NavigationEvent;
import com.elbsoft.examplemvpwithvaadinandcdi.demoA.PresenterDemoAImpl;
import com.elbsoft.examplemvpwithvaadinandcdi.demoB.PresenterDemoBImpl;
import com.vaadin.navigator.View;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class PresenterMenuImpl implements ViewMenu.PresenterMenu {

    @Inject
    private ViewMenu viewMenu;

    @Inject
    private javax.enterprise.event.Event<NavigationEvent> navigationEvent;

    @Inject
    private PresenterDemoAImpl presenterDemoA;

    @Inject
    private PresenterDemoBImpl presenterDemoB;

    @PostConstruct
    @Override
    public void init() {
        viewMenu.setPresenter(this);
    }

    @Override
    public View getView() {
        return viewMenu;
    }

    @Override
    public void openDemoViewA() {
        navigationEvent.fire(new NavigationEvent(presenterDemoA));
    }

    @Override
    public void openDemoViewB() {
        navigationEvent.fire(new NavigationEvent(presenterDemoB));
    }
}
