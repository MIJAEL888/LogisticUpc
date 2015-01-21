/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.upc.logistic.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.upc.logistic.bean.Area;
import org.upc.logistic.bean.Convocatoria;
import org.upc.logistic.bean.PerfilPuesto;
import org.upc.logistic.bean.User;

/**
 *
 * @author USUARIO
 */
@Service("convocatoriaService")
public class ConvocatoriaService {
    
    public boolean register(Convocatoria c){
        if (c.dateStart.equalsIgnoreCase("")) {
            return false;
        }else return true;            
    }
    
    public List<Area> listArea(){
         List<Area> l = new ArrayList<Area>();
         Area a=  new Area();
         a.setId(1);
         a.setName("Sistemas");
         Area a2=  new Area();
         a2.setId(2);
         a2.setName("Logistica");
         l.add(a);
          l.add(a2);
         return l;
    }
    public List<PerfilPuesto> listPuestos(){
         List<PerfilPuesto> l = new ArrayList<PerfilPuesto>();
         PerfilPuesto p = new PerfilPuesto();
         p.setId(1);
         p.setName("Programador 1 ");
         PerfilPuesto p1 = new PerfilPuesto();
         p1.setId(1);
         p1.setName("Programador 2 ");
         PerfilPuesto p2 = new PerfilPuesto();
         p2.setId(1);
         p2.setName("Administrador 1 ");
         l.add(p);
         l.add(p1);
         l.add(p2);
         return l;
    }
}
