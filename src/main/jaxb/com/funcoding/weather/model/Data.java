//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.06.03 à 04:58:55 PM CEST 
//


package com.funcoding.weather.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="current_condition"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="observation_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="temp_C" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="temp_F" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="weatherCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="weatherIconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="weatherDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="windspeedMiles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="windspeedKmph" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="winddirDegree" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="winddir16Point" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="precipMM" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="pressure" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="cloudcover" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="weather"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="tempMaxC" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="tempMaxF" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="tempMinC" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="tempMinF" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="windspeedMiles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="windspeedKmph" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="winddirection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="winddir16Point" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="winddirDegree" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="weatherCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="weatherIconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="weatherDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="precipMM" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "currentCondition",
    "weather"
})
@XmlRootElement(name = "data")
public class Data {

    @XmlElement(required = true)
    protected Data.Request request;
    @XmlElement(name = "current_condition", required = true)
    protected Data.CurrentCondition currentCondition;
    @XmlElement(required = true)
    protected Data.Weather weather;

    /**
     * Obtient la valeur de la propriété request.
     * 
     * @return
     *     possible object is
     *     {@link Data.Request }
     *     
     */
    public Data.Request getRequest() {
        return request;
    }

    /**
     * Définit la valeur de la propriété request.
     * 
     * @param value
     *     allowed object is
     *     {@link Data.Request }
     *     
     */
    public void setRequest(Data.Request value) {
        this.request = value;
    }

    /**
     * Obtient la valeur de la propriété currentCondition.
     * 
     * @return
     *     possible object is
     *     {@link Data.CurrentCondition }
     *     
     */
    public Data.CurrentCondition getCurrentCondition() {
        return currentCondition;
    }

    /**
     * Définit la valeur de la propriété currentCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link Data.CurrentCondition }
     *     
     */
    public void setCurrentCondition(Data.CurrentCondition value) {
        this.currentCondition = value;
    }

    /**
     * Obtient la valeur de la propriété weather.
     * 
     * @return
     *     possible object is
     *     {@link Data.Weather }
     *     
     */
    public Data.Weather getWeather() {
        return weather;
    }

    /**
     * Définit la valeur de la propriété weather.
     * 
     * @param value
     *     allowed object is
     *     {@link Data.Weather }
     *     
     */
    public void setWeather(Data.Weather value) {
        this.weather = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="observation_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="temp_C" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="temp_F" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="weatherCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="weatherIconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="weatherDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="windspeedMiles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="windspeedKmph" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="winddirDegree" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="winddir16Point" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="precipMM" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="humidity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="pressure" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="cloudcover" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "observationTime",
        "tempC",
        "tempF",
        "weatherCode",
        "weatherIconUrl",
        "weatherDesc",
        "windspeedMiles",
        "windspeedKmph",
        "winddirDegree",
        "winddir16Point",
        "precipMM",
        "humidity",
        "visibility",
        "pressure",
        "cloudcover"
    })
    public static class CurrentCondition {

        @XmlElement(name = "observation_time", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar observationTime;
        @XmlElement(name = "temp_C")
        protected int tempC;
        @XmlElement(name = "temp_F")
        protected int tempF;
        protected int weatherCode;
        @XmlElement(required = true)
        protected String weatherIconUrl;
        @XmlElement(required = true)
        protected String weatherDesc;
        protected int windspeedMiles;
        protected int windspeedKmph;
        protected int winddirDegree;
        @XmlElement(required = true)
        protected String winddir16Point;
        @XmlElement(required = true)
        protected BigDecimal precipMM;
        protected int humidity;
        protected int visibility;
        protected int pressure;
        protected int cloudcover;

        /**
         * Obtient la valeur de la propriété observationTime.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getObservationTime() {
            return observationTime;
        }

        /**
         * Définit la valeur de la propriété observationTime.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setObservationTime(XMLGregorianCalendar value) {
            this.observationTime = value;
        }

        /**
         * Obtient la valeur de la propriété tempC.
         * 
         */
        public int getTempC() {
            return tempC;
        }

        /**
         * Définit la valeur de la propriété tempC.
         * 
         */
        public void setTempC(int value) {
            this.tempC = value;
        }

        /**
         * Obtient la valeur de la propriété tempF.
         * 
         */
        public int getTempF() {
            return tempF;
        }

        /**
         * Définit la valeur de la propriété tempF.
         * 
         */
        public void setTempF(int value) {
            this.tempF = value;
        }

        /**
         * Obtient la valeur de la propriété weatherCode.
         * 
         */
        public int getWeatherCode() {
            return weatherCode;
        }

        /**
         * Définit la valeur de la propriété weatherCode.
         * 
         */
        public void setWeatherCode(int value) {
            this.weatherCode = value;
        }

        /**
         * Obtient la valeur de la propriété weatherIconUrl.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeatherIconUrl() {
            return weatherIconUrl;
        }

        /**
         * Définit la valeur de la propriété weatherIconUrl.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeatherIconUrl(String value) {
            this.weatherIconUrl = value;
        }

        /**
         * Obtient la valeur de la propriété weatherDesc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeatherDesc() {
            return weatherDesc;
        }

        /**
         * Définit la valeur de la propriété weatherDesc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeatherDesc(String value) {
            this.weatherDesc = value;
        }

        /**
         * Obtient la valeur de la propriété windspeedMiles.
         * 
         */
        public int getWindspeedMiles() {
            return windspeedMiles;
        }

        /**
         * Définit la valeur de la propriété windspeedMiles.
         * 
         */
        public void setWindspeedMiles(int value) {
            this.windspeedMiles = value;
        }

        /**
         * Obtient la valeur de la propriété windspeedKmph.
         * 
         */
        public int getWindspeedKmph() {
            return windspeedKmph;
        }

        /**
         * Définit la valeur de la propriété windspeedKmph.
         * 
         */
        public void setWindspeedKmph(int value) {
            this.windspeedKmph = value;
        }

        /**
         * Obtient la valeur de la propriété winddirDegree.
         * 
         */
        public int getWinddirDegree() {
            return winddirDegree;
        }

        /**
         * Définit la valeur de la propriété winddirDegree.
         * 
         */
        public void setWinddirDegree(int value) {
            this.winddirDegree = value;
        }

        /**
         * Obtient la valeur de la propriété winddir16Point.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWinddir16Point() {
            return winddir16Point;
        }

        /**
         * Définit la valeur de la propriété winddir16Point.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWinddir16Point(String value) {
            this.winddir16Point = value;
        }

        /**
         * Obtient la valeur de la propriété precipMM.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrecipMM() {
            return precipMM;
        }

        /**
         * Définit la valeur de la propriété precipMM.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPrecipMM(BigDecimal value) {
            this.precipMM = value;
        }

        /**
         * Obtient la valeur de la propriété humidity.
         * 
         */
        public int getHumidity() {
            return humidity;
        }

        /**
         * Définit la valeur de la propriété humidity.
         * 
         */
        public void setHumidity(int value) {
            this.humidity = value;
        }

        /**
         * Obtient la valeur de la propriété visibility.
         * 
         */
        public int getVisibility() {
            return visibility;
        }

        /**
         * Définit la valeur de la propriété visibility.
         * 
         */
        public void setVisibility(int value) {
            this.visibility = value;
        }

        /**
         * Obtient la valeur de la propriété pressure.
         * 
         */
        public int getPressure() {
            return pressure;
        }

        /**
         * Définit la valeur de la propriété pressure.
         * 
         */
        public void setPressure(int value) {
            this.pressure = value;
        }

        /**
         * Obtient la valeur de la propriété cloudcover.
         * 
         */
        public int getCloudcover() {
            return cloudcover;
        }

        /**
         * Définit la valeur de la propriété cloudcover.
         * 
         */
        public void setCloudcover(int value) {
            this.cloudcover = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "query"
    })
    public static class Request {

        @XmlElement(required = true)
        protected String type;
        @XmlElement(required = true)
        protected String query;

        /**
         * Obtient la valeur de la propriété type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Définit la valeur de la propriété type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Obtient la valeur de la propriété query.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuery() {
            return query;
        }

        /**
         * Définit la valeur de la propriété query.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuery(String value) {
            this.query = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="tempMaxC" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="tempMaxF" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="tempMinC" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="tempMinF" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="windspeedMiles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="windspeedKmph" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="winddirection" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="winddir16Point" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="winddirDegree" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="weatherCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="weatherIconUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="weatherDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="precipMM" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "date",
        "tempMaxC",
        "tempMaxF",
        "tempMinC",
        "tempMinF",
        "windspeedMiles",
        "windspeedKmph",
        "winddirection",
        "winddir16Point",
        "winddirDegree",
        "weatherCode",
        "weatherIconUrl",
        "weatherDesc",
        "precipMM"
    })
    public static class Weather {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        protected int tempMaxC;
        protected int tempMaxF;
        protected int tempMinC;
        protected int tempMinF;
        protected int windspeedMiles;
        protected int windspeedKmph;
        @XmlElement(required = true)
        protected String winddirection;
        @XmlElement(required = true)
        protected String winddir16Point;
        protected int winddirDegree;
        protected int weatherCode;
        @XmlElement(required = true)
        protected String weatherIconUrl;
        @XmlElement(required = true)
        protected String weatherDesc;
        @XmlElement(required = true)
        protected BigDecimal precipMM;

        /**
         * Obtient la valeur de la propriété date.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Définit la valeur de la propriété date.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Obtient la valeur de la propriété tempMaxC.
         * 
         */
        public int getTempMaxC() {
            return tempMaxC;
        }

        /**
         * Définit la valeur de la propriété tempMaxC.
         * 
         */
        public void setTempMaxC(int value) {
            this.tempMaxC = value;
        }

        /**
         * Obtient la valeur de la propriété tempMaxF.
         * 
         */
        public int getTempMaxF() {
            return tempMaxF;
        }

        /**
         * Définit la valeur de la propriété tempMaxF.
         * 
         */
        public void setTempMaxF(int value) {
            this.tempMaxF = value;
        }

        /**
         * Obtient la valeur de la propriété tempMinC.
         * 
         */
        public int getTempMinC() {
            return tempMinC;
        }

        /**
         * Définit la valeur de la propriété tempMinC.
         * 
         */
        public void setTempMinC(int value) {
            this.tempMinC = value;
        }

        /**
         * Obtient la valeur de la propriété tempMinF.
         * 
         */
        public int getTempMinF() {
            return tempMinF;
        }

        /**
         * Définit la valeur de la propriété tempMinF.
         * 
         */
        public void setTempMinF(int value) {
            this.tempMinF = value;
        }

        /**
         * Obtient la valeur de la propriété windspeedMiles.
         * 
         */
        public int getWindspeedMiles() {
            return windspeedMiles;
        }

        /**
         * Définit la valeur de la propriété windspeedMiles.
         * 
         */
        public void setWindspeedMiles(int value) {
            this.windspeedMiles = value;
        }

        /**
         * Obtient la valeur de la propriété windspeedKmph.
         * 
         */
        public int getWindspeedKmph() {
            return windspeedKmph;
        }

        /**
         * Définit la valeur de la propriété windspeedKmph.
         * 
         */
        public void setWindspeedKmph(int value) {
            this.windspeedKmph = value;
        }

        /**
         * Obtient la valeur de la propriété winddirection.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWinddirection() {
            return winddirection;
        }

        /**
         * Définit la valeur de la propriété winddirection.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWinddirection(String value) {
            this.winddirection = value;
        }

        /**
         * Obtient la valeur de la propriété winddir16Point.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWinddir16Point() {
            return winddir16Point;
        }

        /**
         * Définit la valeur de la propriété winddir16Point.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWinddir16Point(String value) {
            this.winddir16Point = value;
        }

        /**
         * Obtient la valeur de la propriété winddirDegree.
         * 
         */
        public int getWinddirDegree() {
            return winddirDegree;
        }

        /**
         * Définit la valeur de la propriété winddirDegree.
         * 
         */
        public void setWinddirDegree(int value) {
            this.winddirDegree = value;
        }

        /**
         * Obtient la valeur de la propriété weatherCode.
         * 
         */
        public int getWeatherCode() {
            return weatherCode;
        }

        /**
         * Définit la valeur de la propriété weatherCode.
         * 
         */
        public void setWeatherCode(int value) {
            this.weatherCode = value;
        }

        /**
         * Obtient la valeur de la propriété weatherIconUrl.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeatherIconUrl() {
            return weatherIconUrl;
        }

        /**
         * Définit la valeur de la propriété weatherIconUrl.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeatherIconUrl(String value) {
            this.weatherIconUrl = value;
        }

        /**
         * Obtient la valeur de la propriété weatherDesc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeatherDesc() {
            return weatherDesc;
        }

        /**
         * Définit la valeur de la propriété weatherDesc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeatherDesc(String value) {
            this.weatherDesc = value;
        }

        /**
         * Obtient la valeur de la propriété precipMM.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrecipMM() {
            return precipMM;
        }

        /**
         * Définit la valeur de la propriété precipMM.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPrecipMM(BigDecimal value) {
            this.precipMM = value;
        }

    }

}
