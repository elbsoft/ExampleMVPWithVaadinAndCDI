package com.elbsoft.examplemvpwithvaadinandcdi.navigation;

import com.elbsoft.examplemvpwithvaadinandcdi.core.Presenter;

public class NavigationEvent {

    private Presenter presenter;

    public NavigationEvent(Presenter presenter) {
        this.presenter = presenter;
    }

    public Presenter getNavigatTo() {
        return presenter;
    }
}
