//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.03.02 às 09:10:51 PM BRT 
//


package com.testeapigoodreads.testeapigoodreads.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="authentication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="search">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="results-start" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="results-end" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="total-results" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="query-time-seconds" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="results">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="work" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="id">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="books_count">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ratings_count">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="text_reviews_count">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="original_publication_year">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="original_publication_month">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="original_publication_day">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="average_rating" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="best_book">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="id">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *                                                         &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="author">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="id">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *                                                                   &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="small_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "search"
})
@XmlRootElement(name = "GoodreadsResponse")
public class GoodreadsResponse {

    @XmlElement(name = "Request", required = true)
    protected GoodreadsResponse.Request request;
    @XmlElement(required = true)
    protected GoodreadsResponse.Search search;

    /**
     * Obtém o valor da propriedade request.
     * 
     * @return
     *     possible object is
     *     {@link GoodreadsResponse.Request }
     *     
     */
    public GoodreadsResponse.Request getRequest() {
        return request;
    }

    /**
     * Define o valor da propriedade request.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodreadsResponse.Request }
     *     
     */
    public void setRequest(GoodreadsResponse.Request value) {
        this.request = value;
    }

    /**
     * Obtém o valor da propriedade search.
     * 
     * @return
     *     possible object is
     *     {@link GoodreadsResponse.Search }
     *     
     */
    public GoodreadsResponse.Search getSearch() {
        return search;
    }

    /**
     * Define o valor da propriedade search.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodreadsResponse.Search }
     *     
     */
    public void setSearch(GoodreadsResponse.Search value) {
        this.search = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="authentication" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "authentication",
        "key",
        "method"
    })
    public static class Request {

        @XmlElement(required = true)
        protected String authentication;
        @XmlElement(required = true)
        protected String key;
        @XmlElement(required = true)
        protected String method;

        /**
         * Obtém o valor da propriedade authentication.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthentication() {
            return authentication;
        }

        /**
         * Define o valor da propriedade authentication.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthentication(String value) {
            this.authentication = value;
        }

        /**
         * Obtém o valor da propriedade key.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Obtém o valor da propriedade method.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMethod() {
            return method;
        }

        /**
         * Define o valor da propriedade method.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMethod(String value) {
            this.method = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="results-start" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="results-end" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="total-results" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="query-time-seconds" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="results">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="work" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="id">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="books_count">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ratings_count">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="text_reviews_count">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="original_publication_year">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="original_publication_month">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="original_publication_day">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="average_rating" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="best_book">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="id">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
     *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="author">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="id">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
     *                                                         &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="small_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "query",
        "resultsStart",
        "resultsEnd",
        "totalResults",
        "source",
        "queryTimeSeconds",
        "results"
    })
    public static class Search {

        @XmlElement(required = true)
        protected String query;
        @XmlElement(name = "results-start")
        protected byte resultsStart;
        @XmlElement(name = "results-end")
        protected byte resultsEnd;
        @XmlElement(name = "total-results")
        protected short totalResults;
        @XmlElement(required = true)
        protected String source;
        @XmlElement(name = "query-time-seconds")
        protected float queryTimeSeconds;
        @XmlElement(required = true)
        protected GoodreadsResponse.Search.Results results;

        /**
         * Obtém o valor da propriedade query.
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
         * Define o valor da propriedade query.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuery(String value) {
            this.query = value;
        }

        /**
         * Obtém o valor da propriedade resultsStart.
         * 
         */
        public byte getResultsStart() {
            return resultsStart;
        }

        /**
         * Define o valor da propriedade resultsStart.
         * 
         */
        public void setResultsStart(byte value) {
            this.resultsStart = value;
        }

        /**
         * Obtém o valor da propriedade resultsEnd.
         * 
         */
        public byte getResultsEnd() {
            return resultsEnd;
        }

        /**
         * Define o valor da propriedade resultsEnd.
         * 
         */
        public void setResultsEnd(byte value) {
            this.resultsEnd = value;
        }

        /**
         * Obtém o valor da propriedade totalResults.
         * 
         */
        public short getTotalResults() {
            return totalResults;
        }

        /**
         * Define o valor da propriedade totalResults.
         * 
         */
        public void setTotalResults(short value) {
            this.totalResults = value;
        }

        /**
         * Obtém o valor da propriedade source.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Define o valor da propriedade source.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Obtém o valor da propriedade queryTimeSeconds.
         * 
         */
        public float getQueryTimeSeconds() {
            return queryTimeSeconds;
        }

        /**
         * Define o valor da propriedade queryTimeSeconds.
         * 
         */
        public void setQueryTimeSeconds(float value) {
            this.queryTimeSeconds = value;
        }

        /**
         * Obtém o valor da propriedade results.
         * 
         * @return
         *     possible object is
         *     {@link GoodreadsResponse.Search.Results }
         *     
         */
        public GoodreadsResponse.Search.Results getResults() {
            return results;
        }

        /**
         * Define o valor da propriedade results.
         * 
         * @param value
         *     allowed object is
         *     {@link GoodreadsResponse.Search.Results }
         *     
         */
        public void setResults(GoodreadsResponse.Search.Results value) {
            this.results = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="work" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="id">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="books_count">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ratings_count">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="text_reviews_count">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="original_publication_year">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="original_publication_month">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="original_publication_day">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="average_rating" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="best_book">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="id">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
         *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="author">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="id">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
         *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="small_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "work"
        })
        public static class Results {

            protected List<GoodreadsResponse.Search.Results.Work> work;

            /**
             * Gets the value of the work property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the work property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getWork().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GoodreadsResponse.Search.Results.Work }
             * 
             * 
             */
            public List<GoodreadsResponse.Search.Results.Work> getWork() {
                if (work == null) {
                    work = new ArrayList<GoodreadsResponse.Search.Results.Work>();
                }
                return this.work;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="id">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="books_count">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ratings_count">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="text_reviews_count">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="original_publication_year">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="original_publication_month">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="original_publication_day">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="average_rating" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="best_book">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="id">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
             *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="author">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="id">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
             *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="small_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "booksCount",
                "ratingsCount",
                "textReviewsCount",
                "originalPublicationYear",
                "originalPublicationMonth",
                "originalPublicationDay",
                "averageRating",
                "bestBook"
            })
            public static class Work {

                @XmlElement(required = true)
                protected GoodreadsResponse.Search.Results.Work.Id id;
                @XmlElement(name = "books_count", required = true)
                protected GoodreadsResponse.Search.Results.Work.BooksCount booksCount;
                @XmlElement(name = "ratings_count", required = true)
                protected GoodreadsResponse.Search.Results.Work.RatingsCount ratingsCount;
                @XmlElement(name = "text_reviews_count", required = true)
                protected GoodreadsResponse.Search.Results.Work.TextReviewsCount textReviewsCount;
                @XmlElement(name = "original_publication_year", required = true)
                protected GoodreadsResponse.Search.Results.Work.OriginalPublicationYear originalPublicationYear;
                @XmlElement(name = "original_publication_month", required = true)
                protected GoodreadsResponse.Search.Results.Work.OriginalPublicationMonth originalPublicationMonth;
                @XmlElement(name = "original_publication_day", required = true)
                protected GoodreadsResponse.Search.Results.Work.OriginalPublicationDay originalPublicationDay;
                @XmlElement(name = "average_rating")
                protected float averageRating;
                @XmlElement(name = "best_book", required = true)
                protected GoodreadsResponse.Search.Results.Work.BestBook bestBook;

                /**
                 * Obtém o valor da propriedade id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodreadsResponse.Search.Results.Work.Id }
                 *     
                 */
                public GoodreadsResponse.Search.Results.Work.Id getId() {
                    return id;
                }

                /**
                 * Define o valor da propriedade id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodreadsResponse.Search.Results.Work.Id }
                 *     
                 */
                public void setId(GoodreadsResponse.Search.Results.Work.Id value) {
                    this.id = value;
                }

                /**
                 * Obtém o valor da propriedade booksCount.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodreadsResponse.Search.Results.Work.BooksCount }
                 *     
                 */
                public GoodreadsResponse.Search.Results.Work.BooksCount getBooksCount() {
                    return booksCount;
                }

                /**
                 * Define o valor da propriedade booksCount.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodreadsResponse.Search.Results.Work.BooksCount }
                 *     
                 */
                public void setBooksCount(GoodreadsResponse.Search.Results.Work.BooksCount value) {
                    this.booksCount = value;
                }

                /**
                 * Obtém o valor da propriedade ratingsCount.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodreadsResponse.Search.Results.Work.RatingsCount }
                 *     
                 */
                public GoodreadsResponse.Search.Results.Work.RatingsCount getRatingsCount() {
                    return ratingsCount;
                }

                /**
                 * Define o valor da propriedade ratingsCount.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodreadsResponse.Search.Results.Work.RatingsCount }
                 *     
                 */
                public void setRatingsCount(GoodreadsResponse.Search.Results.Work.RatingsCount value) {
                    this.ratingsCount = value;
                }

                /**
                 * Obtém o valor da propriedade textReviewsCount.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodreadsResponse.Search.Results.Work.TextReviewsCount }
                 *     
                 */
                public GoodreadsResponse.Search.Results.Work.TextReviewsCount getTextReviewsCount() {
                    return textReviewsCount;
                }

                /**
                 * Define o valor da propriedade textReviewsCount.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodreadsResponse.Search.Results.Work.TextReviewsCount }
                 *     
                 */
                public void setTextReviewsCount(GoodreadsResponse.Search.Results.Work.TextReviewsCount value) {
                    this.textReviewsCount = value;
                }

                /**
                 * Obtém o valor da propriedade originalPublicationYear.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodreadsResponse.Search.Results.Work.OriginalPublicationYear }
                 *     
                 */
                public GoodreadsResponse.Search.Results.Work.OriginalPublicationYear getOriginalPublicationYear() {
                    return originalPublicationYear;
                }

                /**
                 * Define o valor da propriedade originalPublicationYear.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodreadsResponse.Search.Results.Work.OriginalPublicationYear }
                 *     
                 */
                public void setOriginalPublicationYear(GoodreadsResponse.Search.Results.Work.OriginalPublicationYear value) {
                    this.originalPublicationYear = value;
                }

                /**
                 * Obtém o valor da propriedade originalPublicationMonth.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodreadsResponse.Search.Results.Work.OriginalPublicationMonth }
                 *     
                 */
                public GoodreadsResponse.Search.Results.Work.OriginalPublicationMonth getOriginalPublicationMonth() {
                    return originalPublicationMonth;
                }

                /**
                 * Define o valor da propriedade originalPublicationMonth.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodreadsResponse.Search.Results.Work.OriginalPublicationMonth }
                 *     
                 */
                public void setOriginalPublicationMonth(GoodreadsResponse.Search.Results.Work.OriginalPublicationMonth value) {
                    this.originalPublicationMonth = value;
                }

                /**
                 * Obtém o valor da propriedade originalPublicationDay.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodreadsResponse.Search.Results.Work.OriginalPublicationDay }
                 *     
                 */
                public GoodreadsResponse.Search.Results.Work.OriginalPublicationDay getOriginalPublicationDay() {
                    return originalPublicationDay;
                }

                /**
                 * Define o valor da propriedade originalPublicationDay.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodreadsResponse.Search.Results.Work.OriginalPublicationDay }
                 *     
                 */
                public void setOriginalPublicationDay(GoodreadsResponse.Search.Results.Work.OriginalPublicationDay value) {
                    this.originalPublicationDay = value;
                }

                /**
                 * Obtém o valor da propriedade averageRating.
                 * 
                 */
                public float getAverageRating() {
                    return averageRating;
                }

                /**
                 * Define o valor da propriedade averageRating.
                 * 
                 */
                public void setAverageRating(float value) {
                    this.averageRating = value;
                }

                /**
                 * Obtém o valor da propriedade bestBook.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GoodreadsResponse.Search.Results.Work.BestBook }
                 *     
                 */
                public GoodreadsResponse.Search.Results.Work.BestBook getBestBook() {
                    return bestBook;
                }

                /**
                 * Define o valor da propriedade bestBook.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GoodreadsResponse.Search.Results.Work.BestBook }
                 *     
                 */
                public void setBestBook(GoodreadsResponse.Search.Results.Work.BestBook value) {
                    this.bestBook = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="id">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
                 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="author">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="id">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
                 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="small_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "id",
                    "title",
                    "author",
                    "imageUrl",
                    "smallImageUrl"
                })
                public static class BestBook {

                    @XmlElement(required = true)
                    protected GoodreadsResponse.Search.Results.Work.BestBook.Id id;
                    @XmlElement(required = true)
                    protected String title;
                    @XmlElement(required = true)
                    protected GoodreadsResponse.Search.Results.Work.BestBook.Author author;
                    @XmlElement(name = "image_url", required = true)
                    protected String imageUrl;
                    @XmlElement(name = "small_image_url", required = true)
                    protected String smallImageUrl;
                    @XmlAttribute(name = "type")
                    protected String type;

                    /**
                     * Obtém o valor da propriedade id.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GoodreadsResponse.Search.Results.Work.BestBook.Id }
                     *     
                     */
                    public GoodreadsResponse.Search.Results.Work.BestBook.Id getId() {
                        return id;
                    }

                    /**
                     * Define o valor da propriedade id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GoodreadsResponse.Search.Results.Work.BestBook.Id }
                     *     
                     */
                    public void setId(GoodreadsResponse.Search.Results.Work.BestBook.Id value) {
                        this.id = value;
                    }

                    /**
                     * Obtém o valor da propriedade title.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTitle() {
                        return title;
                    }

                    /**
                     * Define o valor da propriedade title.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTitle(String value) {
                        this.title = value;
                    }

                    /**
                     * Obtém o valor da propriedade author.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GoodreadsResponse.Search.Results.Work.BestBook.Author }
                     *     
                     */
                    public GoodreadsResponse.Search.Results.Work.BestBook.Author getAuthor() {
                        return author;
                    }

                    /**
                     * Define o valor da propriedade author.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GoodreadsResponse.Search.Results.Work.BestBook.Author }
                     *     
                     */
                    public void setAuthor(GoodreadsResponse.Search.Results.Work.BestBook.Author value) {
                        this.author = value;
                    }

                    /**
                     * Obtém o valor da propriedade imageUrl.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getImageUrl() {
                        return imageUrl;
                    }

                    /**
                     * Define o valor da propriedade imageUrl.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setImageUrl(String value) {
                        this.imageUrl = value;
                    }

                    /**
                     * Obtém o valor da propriedade smallImageUrl.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSmallImageUrl() {
                        return smallImageUrl;
                    }

                    /**
                     * Define o valor da propriedade smallImageUrl.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSmallImageUrl(String value) {
                        this.smallImageUrl = value;
                    }

                    /**
                     * Obtém o valor da propriedade type.
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
                     * Define o valor da propriedade type.
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
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="id">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
                     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "id",
                        "name"
                    })
                    public static class Author {

                        @XmlElement(required = true)
                        protected GoodreadsResponse.Search.Results.Work.BestBook.Author.Id id;
                        @XmlElement(required = true)
                        protected String name;

                        /**
                         * Obtém o valor da propriedade id.
                         * 
                         * @return
                         *     possible object is
                         *     {@link GoodreadsResponse.Search.Results.Work.BestBook.Author.Id }
                         *     
                         */
                        public GoodreadsResponse.Search.Results.Work.BestBook.Author.Id getId() {
                            return id;
                        }

                        /**
                         * Define o valor da propriedade id.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link GoodreadsResponse.Search.Results.Work.BestBook.Author.Id }
                         *     
                         */
                        public void setId(GoodreadsResponse.Search.Results.Work.BestBook.Author.Id value) {
                            this.id = value;
                        }

                        /**
                         * Obtém o valor da propriedade name.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * Define o valor da propriedade name.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setName(String value) {
                            this.name = value;
                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
                         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Id {

                            @XmlValue
                            protected int value;
                            @XmlAttribute(name = "type")
                            protected String type;

                            /**
                             * Obtém o valor da propriedade value.
                             * 
                             */
                            public int getValue() {
                                return value;
                            }

                            /**
                             * Define o valor da propriedade value.
                             * 
                             */
                            public void setValue(int value) {
                                this.value = value;
                            }

                            /**
                             * Obtém o valor da propriedade type.
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
                             * Define o valor da propriedade type.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setType(String value) {
                                this.type = value;
                            }

                        }

                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
                     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Id {

                        @XmlValue
                        protected int value;
                        @XmlAttribute(name = "type")
                        protected String type;

                        /**
                         * Obtém o valor da propriedade value.
                         * 
                         */
                        public int getValue() {
                            return value;
                        }

                        /**
                         * Define o valor da propriedade value.
                         * 
                         */
                        public void setValue(int value) {
                            this.value = value;
                        }

                        /**
                         * Obtém o valor da propriedade type.
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
                         * Define o valor da propriedade type.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setType(String value) {
                            this.type = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class BooksCount {

                    @XmlValue
                    protected short value;
                    @XmlAttribute(name = "type")
                    protected String type;

                    /**
                     * Obtém o valor da propriedade value.
                     * 
                     */
                    public short getValue() {
                        return value;
                    }

                    /**
                     * Define o valor da propriedade value.
                     * 
                     */
                    public void setValue(short value) {
                        this.value = value;
                    }

                    /**
                     * Obtém o valor da propriedade type.
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
                     * Define o valor da propriedade type.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Id {

                    @XmlValue
                    protected int value;
                    @XmlAttribute(name = "type")
                    protected String type;

                    /**
                     * Obtém o valor da propriedade value.
                     * 
                     */
                    public int getValue() {
                        return value;
                    }

                    /**
                     * Define o valor da propriedade value.
                     * 
                     */
                    public void setValue(int value) {
                        this.value = value;
                    }

                    /**
                     * Obtém o valor da propriedade type.
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
                     * Define o valor da propriedade type.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class OriginalPublicationDay {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "type")
                    protected String type;
                    @XmlAttribute(name = "nil")
                    protected String nil;

                    /**
                     * Obtém o valor da propriedade value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Define o valor da propriedade value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtém o valor da propriedade type.
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
                     * Define o valor da propriedade type.
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
                     * Obtém o valor da propriedade nil.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNil() {
                        return nil;
                    }

                    /**
                     * Define o valor da propriedade nil.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNil(String value) {
                        this.nil = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="nil" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class OriginalPublicationMonth {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "type")
                    protected String type;
                    @XmlAttribute(name = "nil")
                    protected String nil;

                    /**
                     * Obtém o valor da propriedade value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Define o valor da propriedade value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtém o valor da propriedade type.
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
                     * Define o valor da propriedade type.
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
                     * Obtém o valor da propriedade nil.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNil() {
                        return nil;
                    }

                    /**
                     * Define o valor da propriedade nil.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNil(String value) {
                        this.nil = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class OriginalPublicationYear {

                    @XmlValue
                    protected short value;
                    @XmlAttribute(name = "type")
                    protected String type;

                    /**
                     * Obtém o valor da propriedade value.
                     * 
                     */
                    public short getValue() {
                        return value;
                    }

                    /**
                     * Define o valor da propriedade value.
                     * 
                     */
                    public void setValue(short value) {
                        this.value = value;
                    }

                    /**
                     * Obtém o valor da propriedade type.
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
                     * Define o valor da propriedade type.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class RatingsCount {

                    @XmlValue
                    protected int value;
                    @XmlAttribute(name = "type")
                    protected String type;

                    /**
                     * Obtém o valor da propriedade value.
                     * 
                     */
                    public int getValue() {
                        return value;
                    }

                    /**
                     * Define o valor da propriedade value.
                     * 
                     */
                    public void setValue(int value) {
                        this.value = value;
                    }

                    /**
                     * Obtém o valor da propriedade type.
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
                     * Define o valor da propriedade type.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class TextReviewsCount {

                    @XmlValue
                    protected int value;
                    @XmlAttribute(name = "type")
                    protected String type;

                    /**
                     * Obtém o valor da propriedade value.
                     * 
                     */
                    public int getValue() {
                        return value;
                    }

                    /**
                     * Define o valor da propriedade value.
                     * 
                     */
                    public void setValue(int value) {
                        this.value = value;
                    }

                    /**
                     * Obtém o valor da propriedade type.
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
                     * Define o valor da propriedade type.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                }

            }

        }

    }

}
