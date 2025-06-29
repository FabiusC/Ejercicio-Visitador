package creacional;

/**
 *
 * @author Fabio - Diego
 */
public class UIDirector {

    private UIBuilder builder;

    public UIDirector(UIBuilder bldr) {
        builder = bldr;
    }

    public void build() {
        builder.addUIControls();
        builder.initialize();
    }

}
