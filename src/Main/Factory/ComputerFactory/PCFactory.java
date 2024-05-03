package Main.Factory.ComputerFactory;

import Main.Componant.Computer.Computer;
import Main.Componant.Computer.PC;

public class PCFactory implements ComputerAbstractFactory {
    String  RAM,HDD,CPU;
    public PCFactory(String RAM, String HDD, String CPU){
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;

    }
    @Override
    public Computer createComputer() {
        return new PC(RAM,HDD,CPU);
    }
}
