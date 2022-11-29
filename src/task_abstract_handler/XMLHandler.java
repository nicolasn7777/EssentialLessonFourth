package task_abstract_handler;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("XML opened");
    }

    @Override
    void create() {
        System.out.println("XML created");
    }

    @Override
    void change() {
        System.out.println("XML changed");
    }

    @Override
    void save() {
        System.out.println("XML saved");
    }
}
