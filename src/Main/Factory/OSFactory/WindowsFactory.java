package Main.Factory.OSFactory;

import Main.Componant.OS.OS;
import Main.Componant.OS.Windows;

public class WindowsFactory implements OSAbstractFactory{

    String username ;
    public WindowsFactory(String username){
        this.username = username ;
    }



    @Override
    public OS createOperatingSystem() {
        return new Windows(this.username);
    }
}
