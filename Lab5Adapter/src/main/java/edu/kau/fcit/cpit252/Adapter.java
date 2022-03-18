/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;

/**
 *
 * @author wmoge
 */
public class Adapter implements WeatherGeo{
    private WeatherCity weatherCity;
    private GeoLocation geoLocation;
    
     public Adapter (WeatherCity weatherCity, GeoLocation geoLocation){
        this.weatherCity = weatherCity;
        this.geoLocation = geoLocation;
    }

    Adapter(WeatherCity wCity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    @Override
    public String getWeatherInfo(double latitude, double longitude) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}

