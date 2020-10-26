package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import org.mytests.uiobjects.example.site.sections.ContactForm;

import static com.epam.jdi.light.elements.init.UIFactory.$;

@Url("/contacts.html") @Title("Contact Form")
public class ContactFormPage extends WebPage {
	@Css("form#contact-form") public static ContactForm contactForm;
	@XPath("//div[contains(@class, 'form-group')]//input") public static UIElement element;

	public void fillFirstInput() {
		//$("//div[contains(@class, 'form-group')]//input").setText("Roman");
		element.setText("Roman");
	}
}