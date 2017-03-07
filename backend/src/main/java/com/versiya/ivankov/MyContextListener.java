package com.versiya.ivankov;

import com.versiya.ivankov.spi.DachaApiImpl;
import com.versiya.ivankov.spi.*;
import io.swagger.api.factories.*;
import io.swagger.model.*;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Some inits on the first request
 */
public class MyContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        IndoorApiServiceFactory.setIndoorApi(new DachaApiImpl<Indoor>());
        BasementApiServiceFactory.setBasementApi(new DachaApiImpl<Basement>());
        OutdoorApiServiceFactory.setOutdoorApi(new DachaApiImpl<Outdoor>());
        BoilerApiServiceFactory.setBoilerApi(new DachaApiImpl<Boiler>());
        PumpApiServiceFactory.setPumpApi(new DachaApiImpl<Pump>());
        BoilercontrollerApiServiceFactory.setBoilercontrollerApi(new BoilercontrollerApiServiceImpl());
        PumpcontrollerApiServiceFactory.setPumpcontrollerApi(new PumpcontrollerApiServiceImpl());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
