package org.mytests.tests.example;

import org.junit.jupiter.api.Test;

import static org.mytests.tests.states.States.shouldBeLoggedOut;
import static org.mytests.uiobjects.example.entities.Defaults.DEFAULT_USER;
import static org.mytests.uiobjects.example.site.SiteJdi.*;

public class VisibleTest {

    @Test
    void visibleTest() {
        login.setText("Roman");
        password.setText("1234");
    }
}
