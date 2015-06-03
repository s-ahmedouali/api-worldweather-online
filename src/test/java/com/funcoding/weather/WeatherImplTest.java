package com.funcoding.weather;

import com.funcoding.weather.model.Data;
import com.funcoding.weather.service.IWeather;
import com.funcoding.weather.service.WeatherImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by s.ahmedouali on 03/06/2015.
 */

public class WeatherImplTest {

    @Test
    public void testRabatQuery() throws Exception {
        IWeather service = new WeatherImpl();
        Data data = service.getByQuery("rabat");
        System.out.println();
        System.out.println(data.getCurrentCondition().getTempC());
        System.out.println(data.getCurrentCondition().getWeatherIconUrl());
        System.out.println(data.getCurrentCondition().getWeatherDesc());
        System.out.println(data.getCurrentCondition().getWindspeedKmph());
        Assert.assertEquals(data.getRequest().getQuery(), "Rabat, Morocco");
    }

    @Test
    public void testRabatUrl() throws Exception {
        IWeather service = new WeatherImpl();
        Data data = service.getByUrl("http://api.worldweatheronline.com/free/v1/weather.ashx?key=qfjnns59vearux8euvuxbbrh&format=xml&q=rabat");
        Assert.assertEquals(data.getRequest().getQuery(), "Rabat, Morocco");
    }
}
