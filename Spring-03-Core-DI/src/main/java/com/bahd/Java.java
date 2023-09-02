package com.bahd;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

//    //Field injection -- not recommended
//    @Autowired
//    OfficeHours officeHours;

    OfficeHours officeHours;

    //Constructor Injection
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " + (20 +officeHours.getHours()));
    }
}
