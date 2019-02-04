package com.vcc.tradefinanceportal.models.domain;

import com.vcc.tradefinanceportal.dto.LCIssuanceDTO;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        File dir = new File("xml");
        File[] var2 = dir.listFiles();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            File file = var2[var4];
            Scanner s = null;

            try {
                s = new Scanner(file);
                JAXBContext jaxbContext = JAXBContext.newInstance(BankMsg.class);
                Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
                BankMsg bankMsg = (BankMsg) unmarshaller.unmarshal(file);

                System.out.println(bankMsg.getAppStatus().banksComment);
//
//                bankMsg.header.setVersionNo(BigInteger.valueOf(5));
//                File file1 = new File("F:\\file.xml]");
//                JAXBContext jaxbContext1 = JAXBContext.newInstance(BankMsg.class);
//                Marshaller jaxbMarshaller = jaxbContext1.createMarshaller();
//
//                // output pretty printed
//                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//                jaxbMarshaller.marshal(bankMsg, file1);
//                jaxbMarshaller.marshal(bankMsg, System.out);



            } catch (FileNotFoundException var10) {
                var10.printStackTrace();
            } catch (JAXBException var11) {
                var11.printStackTrace();
            }

            s.close();
        }
//marshaller

//        BankMsg bankMsg = new BankMsg();
//
//        BankMsg.Header header = new BankMsg.Header();
//
//
//
//        header.setVersionNo(BigInteger.valueOf(5));
//
//        bankMsg.setHeader(header);
//
//
//
//
//
//
//        try {
//
//            File file = new File("F:\\file.xml]");
//            JAXBContext jaxbContext = JAXBContext.newInstance(BankMsg.class);
//            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//            // output pretty printed
//            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//            jaxbMarshaller.marshal(bankMsg, file);
//            jaxbMarshaller.marshal(bankMsg, System.out);
//
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }


//New App



        AppMsg appMsg = new AppMsg();

        AppMsg.NewApp newApp = new AppMsg.NewApp();

        System.out.println(newApp.getAppRelatedAppXMLDetails());

        LCIssuanceDTO lcIssuanceDTO = new LCIssuanceDTO();
        lcIssuanceDTO.setCompanyOwnRefNo("gjhygk");
        lcIssuanceDTO.setUniqueTFApplicationIdentifier("jgfkgk");
        newApp.getAppRelatedAppXMLDetails().setLcIssuance(lcIssuanceDTO);
        //newApp.appRelatedAppXMLDetails.setAPPL_COY_REF_NO("76968968968");





        appMsg.setNewApp(newApp);

        try {

            File file = new File("F:\\file.xml]");
            JAXBContext jaxbContext = JAXBContext.newInstance(AppMsg.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(appMsg, file);
            jaxbMarshaller.marshal(appMsg, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }





    }
}
