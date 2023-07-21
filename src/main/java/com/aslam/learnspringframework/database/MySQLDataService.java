package com.aslam.learnspringframework.database;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDataService implements DataService{
    public int[] retrieveData() {
        return new int[] {22,23,24};
    }
}
