package com.elbsoft.examplemvpwithvaadinandcdi.core;

import com.vaadin.navigator.View;

public interface ViewBase<T> extends View {

    public void setPresenter(T presenter);
}
