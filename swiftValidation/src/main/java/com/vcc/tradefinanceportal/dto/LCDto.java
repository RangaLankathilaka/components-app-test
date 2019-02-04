package com.vcc.tradefinanceportal.dto;

import com.vcc.tradefinanceportal.validation.annotation.SwiftLength;
import com.vcc.tradefinanceportal.validation.annotation.SwiftType;
import com.vcc.tradefinanceportal.validation.annotation.TFAPDate;


import javax.validation.constraints.Size;
import java.util.Arrays;
import java.util.List;

public class LCDto
{
    @SwiftLength(length = 1)
    @SwiftType(type = "x")
    private String id;

    @SwiftLength(length = 16)
    @SwiftType(type = "z")
    private  String name;

    @TFAPDate
    private String date;


    @Size(max = 3 ,min = 1)
    private List<@SwiftType(type = "x") String> address;
//    @ValidCurrencyCode
//    private String countrycode;

    public LCDto() {
    }

    public LCDto(@SwiftLength(length = 1) @SwiftType(type = "x") String id, @SwiftLength(length = 16) @SwiftType(type = "z") String name, @TFAPDate String date, String[] address) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = Arrays.asList(address);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "LCDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", address=" + address +
                '}';
    }
}
