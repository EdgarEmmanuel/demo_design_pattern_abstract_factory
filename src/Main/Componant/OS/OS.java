package Main.Componant.OS;

public abstract class OS {
    abstract String RootUser();
    abstract String getOsName();
    abstract String toStringMine();

    public String toString(){
        return "||ROOT USER :"+RootUser()+"|| Operating System: "+
                getOsName();
    }
}
