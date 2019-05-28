package org.vaadin.ronny;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

	public MainView() {

		Div red = new Div();
		red.getElement().getStyle().set("background-color", "red");
		red.setWidth("200px");
		red.setHeight("100px");
		Div green = new Div();
		green.getElement().getStyle().set("background-color", "green");
		green.setWidth("200px");
		green.setHeight("100px");

		Div yellow = new Div();
		yellow.getElement().getStyle().set("background-color", "yellow");
		yellow.setWidth("500px");
		yellow.setHeight("50px");

		Button button = new Button("Click me");
		AbsoluteLayout absoluteLayout = new AbsoluteLayout();
		final Html html = new Html("<h1><i>Hello</i> <b>world</b></h1>");
		button.addClickListener( e -> absoluteLayout.moveTo(html,324, 100));
		button.addClickListener( e -> absoluteLayout.replace(red, green));
		
		absoluteLayout.add(html, 250,180);
		absoluteLayout.add(button);

		absoluteLayout.add(red,50,100);
		absoluteLayout.add(green,75,120);
		absoluteLayout.add(yellow,60, 60);

		//absoluteLayout.remove(red);
		//absoluteLayout.addComponentAtIndex(3, red);
		
		add(absoluteLayout);

    }
	
}
