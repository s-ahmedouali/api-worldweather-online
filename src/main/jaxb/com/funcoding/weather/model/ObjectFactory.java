//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2015.06.03 � 04:58:55 PM CEST 
//


package com.funcoding.weather.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.funcoding.weather.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.funcoding.weather.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link Data.Request }
     * 
     */
    public Data.Request createDataRequest() {
        return new Data.Request();
    }

    /**
     * Create an instance of {@link Data.CurrentCondition }
     * 
     */
    public Data.CurrentCondition createDataCurrentCondition() {
        return new Data.CurrentCondition();
    }

    /**
     * Create an instance of {@link Data.Weather }
     * 
     */
    public Data.Weather createDataWeather() {
        return new Data.Weather();
    }

}
