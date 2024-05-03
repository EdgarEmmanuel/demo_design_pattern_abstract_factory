package Main.Componant.OS;

public class Ubuntu extends OS{
    private String username ;
    public Ubuntu(String userName){
        this.username = userName ;
    }


    public String getUsername() {
        return username;
    }

    @Override
    String RootUser() {
        return "root";
    }

    @Override
    String getOsName() {
        return "Ubuntu";
    }

    @Override
    String toStringMine() {
        return "||ROOT USER :"+RootUser()+"|| Operating System: "+
                getOsName()+" || Username : "+this.getUsername();
    }
}
