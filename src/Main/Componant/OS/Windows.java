package Main.Componant.OS;

public class Windows extends OS{
    private String username ;
    public Windows(String userName){
        this.username = userName ;
    }

    public String getUsername() {
        return username;
    }

    @Override
    String RootUser() {
        return null;
    }

    @Override
    String getOsName() {
        return "Windows";
    }

    @Override
    String toStringMine() {
        return "||ROOT USER :"+RootUser()+"|| Operating System: "+
                getOsName()+" || Username : "+this.getUsername();
    }
}
