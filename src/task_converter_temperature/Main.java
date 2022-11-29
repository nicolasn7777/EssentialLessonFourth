package task_converter_temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть число градусів Цельсію для конвертації в Кельвіни та Фаренгейти:");
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();

        ConverterTemperature number = new ConverterTemperature();

        number.convert(temperature);
    }
}
