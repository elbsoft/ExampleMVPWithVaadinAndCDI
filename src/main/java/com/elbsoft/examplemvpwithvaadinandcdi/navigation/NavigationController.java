package com.elbsoft.examplemvpwithvaadinandcdi.navigation;

import com.elbsoft.examplemvpwithvaadinandcdi.core.ApplicationStructure;
import com.elbsoft.examplemvpwithvaadinandcdi.menu.PresenterMenuImpl;
import com.vaadin.cdi.CDIViewProvider;
import com.vaadin.navigator.Navigator;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import javax.annotation.PostConstruct;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

/**
 * Zuständig für die Steuerung der Navigation über CDI (Firing Events) Link:
 * http://docs.oracle.com/javaee/6/tutorial/doc/gkhic.html
 *
 * @author elbsoft
 */
public class NavigationController {

    @Inject
    UI ui;

    @Inject
    CDIViewProvider viewProvider;

    @Inject
    private PresenterMenuImpl presenterMenu;

    @Inject
    private ApplicationStructure applicationStructure;

    /**
     * Registierung vom Navigator bei der UI und setzen der Anwendungsstruktur
     */
    @PostConstruct
    public void init() {
        if (ui.getNavigator() == null) {
            Navigator navigator = new Navigator(ui, applicationStructure.getContent());
            navigator.addProvider(viewProvider);
            ui.setContent(applicationStructure);
        }
    }

    /**
     * Sobald ein NavigationEvent in der Anwendung über ein Event gefeuert wird,
     * wird die Methode ausgeführt. Die eigentliche Navigation wird über den
     * Vaadin Navigator durchgeführt.
     *
     * @param navigationEvent
     */
    public void onNavigationEvent(@Observes NavigationEvent navigationEvent) {
        ui.getNavigator().navigateTo(navigationEvent.getNavigatTo().getView().getClass().getSimpleName());
        applicationStructure.getMenu().addComponent((Component) presenterMenu.getView());
    }
}
