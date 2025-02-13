package com.enriqueforte.emisiones_co2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "emisiones")
public class Emission {

    @Id
    private String id;
    
    private String country;
    private String date;
    private String sector;
    
    // Aquí usamos @Field para asegurar que el campo se mapea como "MtCO2perday"
    @Field("MtCO2perday")
    private Double mtCO2perday;

    public Emission() {
    }

    public Emission(String country, String date, String sector, Double mtCO2perday) {
        this.country = country;
        this.date = date;
        this.sector = sector;
        this.mtCO2perday = mtCO2perday;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public Double getMtCO2perday() {
        return mtCO2perday;
    }
    public void setMtCO2perday(Double mtCO2perday) {
        this.mtCO2perday = mtCO2perday;
    }
}
