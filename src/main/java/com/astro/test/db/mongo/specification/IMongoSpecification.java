package com.astro.test.db.mongo.specification;

import com.astro.test.db.ISpecification;
import org.bson.conversions.Bson;

/**
 * Created by Ajeya on 4/26/18.
 */
public interface IMongoSpecification extends ISpecification {

    Bson toMongoQuery();

}
