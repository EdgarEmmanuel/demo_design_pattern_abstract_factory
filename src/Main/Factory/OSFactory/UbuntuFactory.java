package Main.Factory.OSFactory;

import Main.Componant.OS.OS;
import Main.Componant.OS.Ubuntu;

public class UbuntuFactory implements OSAbstractFactory{

    String username ;
    public UbuntuFactory(String username){
        this.username = username ;
    }

    @Override
    public OS createOperatingSystem() {
        return new Ubuntu(this.username);
    }
}
