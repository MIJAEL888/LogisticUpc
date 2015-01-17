/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.upc.logistic.service;

import org.springframework.stereotype.Service;
import org.upc.logistic.bean.User;

/**
 *
 * @author USUARIO
 */
@Service("loginService")
public class LoginService {
    
    public boolean validLogin(User user){
        if (user.getUsername().equals("mijael@upc.com") && user.getPassword().equals("123456")) {
            return true;
        }else return false;            
    }
}
