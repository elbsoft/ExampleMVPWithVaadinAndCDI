package com.elbsoft.examplemvpwithvaadinandcdi.demoB;

import com.elbsoft.examplemvpwithvaadinandcdi.core.Presenter;
import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;

@CDIView("ViewDemoBImpl")
public class ViewDemoBImpl extends CustomComponent implements ViewDemoB {

    private Presenter presenter;

    @Override
    public void setPresenter(PresenterDemoB presenter) {
        this.presenter = presenter;
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        setCompositionRoot(new Label("DEMO VIEW B"));
    }
}
