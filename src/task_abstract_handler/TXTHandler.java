package task_abstract_handler;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("TXT opened");
    }

    @Override
    void create() {
        System.out.println("TXT created");
    }

    @Override
    void change() {
        System.out.println("TXT changed");
    }

    @Override
    void save() {
        System.out.println("TXT saved");
    }
}
