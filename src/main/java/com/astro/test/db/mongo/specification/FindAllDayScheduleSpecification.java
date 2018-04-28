package com.astro.test.db.mongo.specification;

import org.bson.Document;
import org.bson.conversions.Bson;

/**
 * Created by Ajeya on 4/26/18.
 */
public class FindAllDayScheduleSpecification implements IMongoSpecification {

    public Bson toMongoQuery() {
        return new Document();
    }

}
