package org.mytests.tests.example;

import org.junit.jupiter.api.Test;

import static org.mytests.tests.states.States.shouldBeLoggedIn;
import static org.mytests.uiobjects.example.site.SiteJdi.contactFormPage;

public class SearchStrategyTest {
    @Test
    void testSoftStrategy() {
        shouldBeLoggedIn();
        contactFormPage.shouldBeOpened();
        contactFormPage.fillFirstInput();
    }
}
