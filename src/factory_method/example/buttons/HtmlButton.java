package factory_method.example.buttons;

public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
