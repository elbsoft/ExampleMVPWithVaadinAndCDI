package com.elbsoft.examplemvpwithvaadinandcdi.menu;

import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.BaseTheme;

public class ViewMenuImpl extends CustomComponent implements ViewMenu {

    private ViewMenu.PresenterMenu presenterMenu;

    private VerticalLayout layout = new VerticalLayout();

    private Button buttonOpenDemoViewA;
    private Button buttonOpenDemoViewB;

    @Override
    public void attach() {
        buttonOpenDemoViewA = new Button("Demo View A");
        buttonOpenDemoViewA.setStyleName(BaseTheme.BUTTON_LINK);
        buttonOpenDemoViewA.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(Button.ClickEvent event) {
                presenterMenu.openDemoViewA();
            }
        });

        buttonOpenDemoViewB = new Button("Demo View B");
        buttonOpenDemoViewB.setStyleName(BaseTheme.BUTTON_LINK);
        buttonOpenDemoViewB.addClickListener(new Button.ClickListener() {

            @Override
            public void buttonClick(Button.ClickEvent event) {
                presenterMenu.openDemoViewB();
            }
        });

        layout.addComponent(buttonOpenDemoViewA);
        layout.addComponent(buttonOpenDemoViewB);

        this.setCompositionRoot(layout);
    }

    @Override
    public void setPresenter(PresenterMenu presenterMenu) {
        this.presenterMenu = presenterMenu;
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        /**
         * Die Methode wird nicht bentuzt, da der View nicht über den Navigator
         * verwaltet / aufgerufen wird (Keine Annotation @CDIView)
         */
    }
}
