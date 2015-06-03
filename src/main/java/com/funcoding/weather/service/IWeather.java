package com.funcoding.weather.service;

import com.funcoding.weather.model.Data;

/**
 * Created by s.ahmedouali on 03/06/2015.
 */
public interface IWeather {

    String URL = "http://api.worldweatheronline.com/free/v1/weather.ashx?key=qfjnns59vearux8euvuxbbrh&format=xml&q=";

    /**
     * @param query (rabat)
     * @return
     */
    Data getByQuery(String query);

    /**
     * http://api.worldweatheronline.com/free/v1/weather.ashx?key=qfjnns59vearux8euvuxbbrh&format=xml&q=rabat
     *
     * @param url
     * @return
     */
    Data getByUrl(String url);

    /**
     * @param query (rabat)
     * @return CurrentCondition
     */
    Data.CurrentCondition getCurrentConditionByQuery(String query);


}
