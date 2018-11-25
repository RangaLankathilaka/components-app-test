package lk.eyepax.unmarshalling;

import lk.eyepax.unmarshalling.dto.Shiporder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        File dir = new File("xml");

        for (File file : dir.listFiles()) {
            Scanner s = null;
            try {
                s = new Scanner(file);

                    JAXBContext jaxbContext = JAXBContext.newInstance(Shiporder.class);
                    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

                    Shiporder shiporder = (Shiporder) unmarshaller.unmarshal(file);



                System.out.println(shiporder);
                    System.out.println(shiporder.getItems().get(0).getNote());
                    System.out.println(shiporder.getShipto().getAddress());
                    System.out.println(shiporder.getOrderperson());




            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (JAXBException e) {
                e.printStackTrace();
            }

            s.close();
        }





    }











}
