import javax.swing.*;
import java.util.ArrayList;

public class University {

    private static University single_instanece=null;

    public String dasakheleba;
    public String sakhelmwipo;
    public ArrayList<String> pakultetebi=new ArrayList<String>();

    private University() {
        dasakheleba = "uni";
        sakhelmwipo = "ara";
        pakultetebi.add("java");
        pakultetebi.add("c++");
        pakultetebi.add("python");
    }



    public static University getInstance()
    {
        if (single_instanece==null) single_instanece=new University();

        return single_instanece;
    }


    @Override
    public String toString() {
        return this.dasakheleba+" "+this.sakhelmwipo+" "+this.pakultetebi;
    }
}
