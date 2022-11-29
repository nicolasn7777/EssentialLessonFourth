package task_abstract_handler;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("DOC opened");
    }

    @Override
    void create() {
        System.out.println("DOC created");
    }

    @Override
    void change() {
        System.out.println("DOC changed");
    }

    @Override
    void save() {
        System.out.println("DOC saved");
    }
}
