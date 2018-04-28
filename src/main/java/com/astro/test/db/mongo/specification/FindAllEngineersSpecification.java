package com.astro.test.db.mongo.specification;

import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 * Created by Ajeya on 4/26/18.
 */
public class FindAllEngineersSpecification implements IMongoSpecification {
    public Bson toMongoQuery() {
        Bson query = new Document();
        return query;
    }
}
