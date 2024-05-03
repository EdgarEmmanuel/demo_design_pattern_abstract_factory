package Main;

import Main.Componant.Computer.Computer;
import Main.Factory.ComputerFactory.PCFactory;
import Main.Factory.ComputerFactory.ServerFactory;
import Main.Componant.OS.OS;

public class Main {

    public static void main(String[] args) {
        Computer computer;
        OS os;
        int STUDENT = 1;
        int ORGANIZATION = 2;
        int type_client = STUDENT;

        if(type_client == 1){
            computer = ComputerAnOSFactory.getComputer(new PCFactory("2GB","1TB","i7"));
           // os = ComputerFactory.getOS(new WindowsFactory("immanuwel"));
        } else {
            computer = ComputerAnOSFactory.getComputer(new ServerFactory("32GB","50TB","i9"));
            //os = ComputerFactory.getOS(new UbuntuFactory("david"));
        }

        System.out.println(computer);
        //System.out.println(os);
    }
}
