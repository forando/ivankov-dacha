package com.versiya.ivankov.spi;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.cmd.Query;
import io.swagger.api.ApiService;
import io.swagger.model.DachaEntity;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import static com.versiya.ivankov.service.OfyService.ofy;
import static com.versiya.ivankov.service.OfyService.factory;


public class DachaApiImpl<T extends DachaEntity> implements ApiService <T> {

    public  Response addEntity(T entity, Class<T> clazz, SecurityContext securityContext){
        final Key<T> key = factory().allocateId(clazz);
        entity.setId(key.getId());
        ofy().save().entity(entity).now();
        T newEntity = ofy().load().key(key).now();
        return Response.ok().entity(newEntity).build();
    }

    @Override
    public Response getEntity(Long startDate, Long endDate, Class<T> clazz, SecurityContext securityContext) {
        Query<T> query = ofy().load().type(clazz).order("timeStamp");
        query = query.filter("timeStamp >=", startDate);
        query = query.filter("timeStamp <=", endDate);
        return Response.ok().entity(query.list()).build();
    }
}
