package com.elbsoft.examplemvpwithvaadinandcdi.core;

import com.vaadin.ui.CssLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;

/**
 * Zuständig für die Bereitstellung von (Platzhalter) Komponenten für die
 * Anzeige von Menü und Inhalt
 *
 * @author elbsoft
 */
public class ApplicationStructure extends CustomComponent {

    private CssLayout content = new CssLayout();
    private CssLayout menu = new CssLayout();

    @Override
    public void attach() {
        this.setSizeFull();

        HorizontalLayout layout = new HorizontalLayout();
        layout.setSizeFull();
        content.setSizeFull();

        layout.addComponent(menu);
        layout.addComponent(content);
        layout.setExpandRatio(content, 24f);

        this.setCompositionRoot(layout);
    }

    public CssLayout getContent() {
        return content;
    }

    public CssLayout getMenu() {
        return menu;
    }
}
