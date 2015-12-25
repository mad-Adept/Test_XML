import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

/**
 * Created by NikonovAA on 18.12.2015.
 */
@XmlRootElement(name = "model")
@XmlType(propOrder = {"list"})
public class Model {
    ArrayList<User> list = new ArrayList<User>();

    Model(){};

    public ArrayList<User> getList() {
        return list;
    }

    public void setList(ArrayList<User> list) {
        this.list = list;
    }

    public void ptintList(){
       for (User u : list){
           System.out.println(u);
       }
   }
}

