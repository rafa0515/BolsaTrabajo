/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Empresa;
import modelo.EmpresaDAO;

/**
 *
 * @author Rafael
 */
@ManagedBean
@ViewScoped
public class EliminaEmpresa {
    
        public String eliminaEmpresa(){
        EmpresaDAO empdao = new EmpresaDAO();
        
        return "inicio";
    }
    
}
