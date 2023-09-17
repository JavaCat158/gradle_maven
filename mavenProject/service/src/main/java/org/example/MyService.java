package org.example;

import java.util.UUID;

public class MyService {
    private DbSettings dbSettings = new DbSettings("name", "password");
    private String name = "myService";
    private Db db = new Db(dbSettings);

    public  String getName() {
        return name;
    }

    public MyEntity setMyEntity(MyEntity myEntity) {
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }
}
