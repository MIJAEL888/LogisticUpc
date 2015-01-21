/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.upc.logistic.bean;

import java.util.Date;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Convocatoria {
    
    public int id;
    public String name;
    public String dateStart;
    public String dateFin;
    public String dateProject;
    public PerfilPuesto[] perfilPuesto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getDateProject() {
        return dateProject;
    }

    public void setDateProject(String dateProject) {
        this.dateProject = dateProject;
    }

    public PerfilPuesto[] getPerfilPuesto() {
        return perfilPuesto;
    }

    public void setPerfilPuesto(PerfilPuesto[] perfilPuesto) {
        this.perfilPuesto = perfilPuesto;
    }

    
}
