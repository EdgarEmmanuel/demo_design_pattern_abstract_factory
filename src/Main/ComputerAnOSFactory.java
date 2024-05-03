package Main;

import Main.Componant.Computer.Computer;
import Main.Factory.ComputerFactory.ComputerAbstractFactory;
import Main.Componant.OS.OS;
import Main.Factory.OSFactory.OSAbstractFactory;

public class ComputerAnOSFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }

    public static OS getOS(OSAbstractFactory factory){
        return factory.createOperatingSystem();
    }
}
