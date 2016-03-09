package com.elbsoft.examplemvpwithvaadinandcdi.demoA;

import com.elbsoft.examplemvpwithvaadinandcdi.core.Presenter;
import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;

@CDIView("ViewDemoAImpl")
public class ViewDemoAImpl extends CustomComponent implements ViewDemoA {

    private Presenter presenter;

    @Override
    public void setPresenter(PresenterDemoA presenter) {
        this.presenter = presenter;
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        setCompositionRoot(new Label("DEMO VIEW A"));
    }
}
