package io.swagger.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 * Created by Andreylogoshko on 18.05.2016.
 */
public interface ApiService <T> {
    Response addEntity(T entity, Class<T> clazz, SecurityContext securityContext);
    Response getEntity(Long startDate, Long endDate, Class<T> clazz, SecurityContext securityContext);
}
