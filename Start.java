import javax.xml.bind.JAXBException;

/**
 * Created by NikonovAA on 18.12.2015.
 */
public class Start {

    public static void main(String[] args) throws JAXBException {

        Util u =  new Util();
        Model model = new Model();
/*        User user_1 = new User("Diman", "Muz", 25);
        User user_2 = new User("Pasha", "Muz", 20);
        User user_3 = new User("Knyaz", "Muz", 21);
        User user_4 = new User("Rita", "Zhen", 23);
        user_1.fruits.add(new Fruit("Orange"));
        user_1.fruits.add(new Fruit("Banana"));
        user_1.fruits.add(new Fruit("Mango"));
        user_2.fruits.add(new Fruit("Apple"));
        user_3.fruits.add(new Fruit("Tomato"));
        user_3.fruits.add(new Fruit("Cherry"));
        user_4.fruits.add(new Fruit("Potato"));
        model.getList().add(user_1);
        model.getList().add(user_2);
        model.getList().add(user_3);
        model.getList().add(user_4);
        u.saveObject(model);*/
        model = u.getObject(model);
        model.ptintList();

    }
}
