import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

/**
 * Created by NikonovAA on 18.12.2015.
 */
@XmlType(name = "user", propOrder = {"name", "age", "sex", "fruits"})
public class User {
    String name;
    int age;
    String sex;
ArrayList<Fruit> fruits = new ArrayList<Fruit>();

    User(){};
    @XmlElement(name = "fruits")
    public ArrayList<Fruit> getFruits() {
        return fruits;
    }


    public User(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
