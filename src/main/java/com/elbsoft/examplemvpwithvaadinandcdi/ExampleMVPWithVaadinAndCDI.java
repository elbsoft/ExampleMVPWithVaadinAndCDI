package com.elbsoft.examplemvpwithvaadinandcdi;

import com.elbsoft.examplemvpwithvaadinandcdi.navigation.NavigationEvent;
import com.elbsoft.examplemvpwithvaadinandcdi.demoA.PresenterDemoAImpl;
import com.vaadin.annotations.Theme;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import javax.inject.Inject;

/**
 * Startpunkt der Anwendung (@CDIUI)
 *
 * @author elbsoft
 */
@CDIUI
@Theme("valo")
public class ExampleMVPWithVaadinAndCDI extends UI {

    @Inject
    private javax.enterprise.event.Event<NavigationEvent> navigationEvent;

    @Inject
    private PresenterDemoAImpl presenterDemoA;

    @Override
    protected void init(VaadinRequest request) {
        navigationEvent.fire(new NavigationEvent(presenterDemoA));
    }
}
