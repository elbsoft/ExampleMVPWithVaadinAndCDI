package com.elbsoft.examplemvpwithvaadinandcdi.menu;

import com.elbsoft.examplemvpwithvaadinandcdi.core.Presenter;
import com.elbsoft.examplemvpwithvaadinandcdi.core.ViewBase;

public interface ViewMenu extends ViewBase<ViewMenu.PresenterMenu> {

    interface PresenterMenu extends Presenter {

        public void openDemoViewA();

        public void openDemoViewB();
    }
}
