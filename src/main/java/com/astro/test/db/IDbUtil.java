package com.astro.test.db;

/**
 * Created by Ajeya on 4/26/18.
 */
public interface IDbUtil<T> {

    T getDbInstance();

    T getDbInstance(String databaseName);

}
