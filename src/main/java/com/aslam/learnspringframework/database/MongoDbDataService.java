package com.aslam.learnspringframework.database;

import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements DataService {
    public int[] retrieveData() {
        return new int[] {11,12,13};
    }
}
