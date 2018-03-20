/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.HashSet;
import java.util.Set;
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
public class AgregaEmpresa {
    
    private int idempresa;
    private String nombre;
    private String oficinas;    
    private Integer numeroempleados;
    private String contacto;
    private String presidente;
    private Set vacantes = new HashSet(0);
    
    
    public String guardaEmpresa(){
        Empresa emp = new Empresa();
        emp.setNombre(nombre);
        emp.setOficinas(oficinas);
        emp.setNumeroempleados(numeroempleados);
        emp.setContacto(contacto);
        emp.setPresidente(presidente);
        emp.setVacantes(vacantes);
        EmpresaDAO empdao = new EmpresaDAO();
        empdao.guarda(emp);
        
        return "inicio";
    }
    
}
