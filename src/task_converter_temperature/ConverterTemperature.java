package task_converter_temperature;

public class ConverterTemperature implements IConverterTemperature{
    void convert(double a){
        System.out.println("Градусів за Кельвіном: " + (K + a));
        System.out.println("Градусів за Фаренгейтом: " + (F * a + F2));

    }
}
