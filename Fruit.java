import javax.xml.bind.annotation.XmlType;

/**
 * Created by NikonovAA on 18.12.2015.
 */
@XmlType(name = "fruit", propOrder = "nameFruit")
public class Fruit {
    String nameFruit;

    public Fruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public Fruit() {
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }
}
