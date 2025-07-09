import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Aurelio","19");
        logininfo.put("Ricardo","23");
        logininfo.put("Gabriel","18");
        logininfo.put("Arthur","MonteNego");
        logininfo.put("Caleb","innerBanana");
    }

    protected HashMap getLogininfo() {
        return logininfo;
    }
}
