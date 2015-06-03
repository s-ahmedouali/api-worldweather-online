package com.funcoding.weather.service;

import com.funcoding.weather.model.Data;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by s.ahmedouali on 03/06/2015.
 */
public class WeatherImpl implements IWeather {
    @Override
    public Data getByQuery(String query) {
        Data data = null;
        try {
            URL url = new URL(URL + query);
            InputStream is = url.openStream();
            JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            data = (Data) jaxbUnmarshaller.unmarshal(is);
        } catch (Exception e) {
            //TODO
        }
        return data;
    }

    @Override
    public Data getByUrl(String str) {
        Data data = null;
        try {
            URL url = new URL(str);
            InputStream is = url.openStream();
            JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            data = (Data) jaxbUnmarshaller.unmarshal(is);
        } catch (Exception e) {
            //TODO
        }
        return data;
    }

    /**
     * @param query (rabat)
     * @return CurrentCondition
     */
    @Override
    public Data.CurrentCondition getCurrentConditionByQuery(String query) {
        Data.CurrentCondition data = null;
        try {
            URL url = new URL(URL + query);
            InputStream is = url.openStream();
            JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            data = ((Data) jaxbUnmarshaller.unmarshal(is)).getCurrentCondition();
        } catch (Exception e) {
            //TODO
        }
        return data;
    }
}
