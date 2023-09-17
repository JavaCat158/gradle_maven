package org.example;

import java.util.UUID;

public class Db {
    private DbSettings dbSettings;
    private MyEntity myEntity;

    public Db(DbSettings dbSettings) {
        this.dbSettings = dbSettings;
        myEntity = new MyEntity("first");
        myEntity.setId(UUID.randomUUID());
    }

    public DbSettings getDbSettings() {
        return dbSettings;
    }

    public MyEntity getMyEntity() {
        return myEntity;
    }

    public void setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
    }
}
