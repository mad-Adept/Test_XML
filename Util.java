import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by NikonovAA on 18.12.2015.
 */
public class Util {

    public void saveObject(Model model) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(model.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(model, new File("C:\\out.xml"));
    }

    public Model getObject(Model thisModel) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(thisModel.getClass());
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Model model =(Model) unmarshaller.unmarshal(new File("C:\\out.xml"));

            return model;
        }
    }

