package com.elbsoft.examplemvpwithvaadinandcdi.core;

import com.vaadin.navigator.View;

public interface Presenter {

    public void init();

    public View getView();
}
