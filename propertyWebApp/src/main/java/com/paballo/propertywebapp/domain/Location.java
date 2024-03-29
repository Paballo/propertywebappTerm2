/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author donkey
 */
@Entity
public class Location implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String city;
    private String province;
   
    
    public Location()
    {
        
    }
    
    private Location(Builder builder)
    {
        id       = builder.id;
        city     = builder.city;
        province = builder.province;
       
        
    }
    
    public static class Builder
    {
        private Long id;
        private String city;
        private String province;
        
        
        public Builder()
        {
        
        }
        
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder city(String value)
        {
            city = value;
            return this;
        }
        public Builder province(String value)
        {
            province = value;
            return this;
        }
       
        public Builder Location(Location location)
        {
            id       = location.getId();
            city     = location.getCity();
            province = location.getProvince();
           
            return this;
        }
        
        public Location build()
        {
            return new Location(this);
        }
        
    }
            
            

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    
    public Long getId() {
        return id;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.propertywebapp.domain.Location[ id=" + id + " ]";
    }
    
}
