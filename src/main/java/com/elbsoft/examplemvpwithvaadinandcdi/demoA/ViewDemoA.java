package com.elbsoft.examplemvpwithvaadinandcdi.demoA;

import com.elbsoft.examplemvpwithvaadinandcdi.core.Presenter;
import com.elbsoft.examplemvpwithvaadinandcdi.core.ViewBase;

public interface ViewDemoA extends ViewBase<ViewDemoA.PresenterDemoA> {

    public interface PresenterDemoA extends Presenter {
    }
}
