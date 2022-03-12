
package ModeloVO;

public class EmpleadoVO {
    
    private String idEmpleado, nombres,apellidos,tipoDoc,numDoc
            ,telefono,email,estado,genero,direccion,idLugarExpd;

    public EmpleadoVO() {
    }

    public EmpleadoVO(String idEmpleado, String nombres, String apellidos, String tipoDoc, String numDoc, String telefono, String email, String estado, String genero, String direccion, String idLugarExpd) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
        this.genero = genero;
        this.direccion = direccion;
        this.idLugarExpd = idLugarExpd;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdLugarExpd() {
        return idLugarExpd;
    }

    public void setIdLugarExpd(String idLugarExpd) {
        this.idLugarExpd = idLugarExpd;
    }
    
    
}
