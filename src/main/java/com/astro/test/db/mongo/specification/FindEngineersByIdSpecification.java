package com.astro.test.db.mongo.specification;

import com.mongodb.client.model.Filters;
import org.bson.conversions.Bson;

/**
 * Created by Ajeya on 4/26/18.
 */
public class FindEngineersByIdSpecification implements IMongoSpecification {

    private String id;

    public FindEngineersByIdSpecification(String  id) {
        this.id = id;
    }


    public Bson toMongoQuery() {
        Bson query = Filters.eq("id", id);
        return query;
    }
}
