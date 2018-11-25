package lk.eyepax.unmarshalling.dto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Shiporder {

    private String orderid;
    private String orderperson;
    private Shipto shipto;
   private ArrayList<Item> items;


    public Shiporder() {
    }


    public Shiporder(String orderid, String orderperson, Shipto shipto, ArrayList<Item> items) {
        this.orderid = orderid;
        this.orderperson = orderperson;
        this.shipto = shipto;
        this.items = items;
    }

    @XmlAttribute
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @XmlElement
    public String getOrderperson() {
        return orderperson;
    }

    public void setOrderperson(String orderperson) {
        this.orderperson = orderperson;
    }

    @XmlElement
    public Shipto getShipto() {
        return shipto;
    }

    public void setShipto(Shipto shipto) {
        this.shipto = shipto;
    }

    @XmlElement
    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }




    @Override
    public String toString() {
        return "Shiporder{" +
                "orderid='" + orderid + '\'' +
                ", orderperson='" + orderperson + '\'' +
                ", shipto=" + shipto +
                ", items=" + items +
                '}';
    }
}
