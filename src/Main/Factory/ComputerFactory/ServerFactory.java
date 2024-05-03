package Main.Factory.ComputerFactory;

import Main.Componant.Computer.Computer;
import Main.Componant.Computer.Server;

public class ServerFactory implements ComputerAbstractFactory {

    String  RAM,HDD,CPU;
    public ServerFactory(String RAM, String HDD, String CPU){
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;

    }

    @Override
    public Computer createComputer() {
        return new Server(RAM,HDD,CPU);
    }
}
