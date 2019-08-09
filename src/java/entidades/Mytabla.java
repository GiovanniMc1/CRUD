/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author 1022967487
 */
@Entity
@Table(name = "MYTABLA")
@NamedQueries({
    @NamedQuery(name = "Mytabla.findAll", query = "SELECT m FROM Mytabla m")
    , @NamedQuery(name = "Mytabla.findById", query = "SELECT m FROM Mytabla m WHERE m.id = :id")
    , @NamedQuery(name = "Mytabla.findByName", query = "SELECT m FROM Mytabla m WHERE m.name = :name")
    , @NamedQuery(name = "Mytabla.findByApellido", query = "SELECT m FROM Mytabla m WHERE m.apellido = :apellido")})
public class Mytabla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "APELLIDO")
    private String apellido;

    public Mytabla() {
    }

    public Mytabla(Integer id) {
        this.id = id;
    }

    public Mytabla(Integer id, String name, String apellido) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        if (!(object instanceof Mytabla)) {
            return false;
        }
        Mytabla other = (Mytabla) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Mytabla[ id=" + id + " ]";
    }
    
}
