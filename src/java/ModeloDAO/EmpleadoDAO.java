package ModeloDAO;

import ModeloVO.EmpleadoVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;
import java.util.logging.Level;

public class EmpleadoDAO extends Conexion implements Crud {

    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    private boolean op = false;
    private String sql;

    private String idEmpleado = "", nombres = "", apellidos = "",
            tipoDoc = "", numDoc = "", telefono = "", email = "",
            estado = "", genero = "", direccion = "", idLugarExpd = "";

    public EmpleadoDAO(EmpleadoVO empVO) {
        super();

        try {

            cnx = this.conectar();

            idEmpleado = empVO.getIdEmpleado();
            nombres = empVO.getNombres();
            apellidos = empVO.getApellidos();
            tipoDoc = empVO.getTipoDoc();
            numDoc = empVO.getNumDoc();
            telefono = empVO.getTelefono();
            email = empVO.getEmail();
            estado = empVO.getEstado();
            genero = empVO.getGenero();
            direccion = empVO.getDireccion();
            idLugarExpd = empVO.getIdLugarExpd();

        } catch (Exception ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean addRegister() {
        try {

            sql = " insert into empleados (nombres,apellidos,tipoDoc"
                    + "numDoc,telefono"
                    + "email,estado,genero,direccion,idLugarExpd) "
                    + "values (?,?,?,?,?,?,?,?,?,?,?)";

            ps = cnx.prepareStatement(sql);

            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, tipoDoc);
            ps.setString(4, numDoc);
            ps.setString(5, telefono);
            ps.setString(6, email);
            ps.setString(7, estado);
            ps.setString(8, genero);
            ps.setString(9, direccion);
            ps.setString(10, idLugarExpd);

            ps.executeUpdate();
            op = true;
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                this.cerrar();
            } catch (Exception ex) {
                Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        return op;
    }

    @Override
    public boolean updateRegister() {
        try {
            sql = "update empleados set nombres =?,apellidos=?,tipoDoc=?"
                    + "numDoc=?,telefono=?"
                    + "email=?,estado=?,genero=?,direccion=?,idLugarExpd=? where idEmpleado = ?";

            ps = cnx.prepareStatement(sql);

            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, tipoDoc);
            ps.setString(4, numDoc);
            ps.setString(5, telefono);
            ps.setString(6, email);
            ps.setString(7, estado);
            ps.setString(8, genero);
            ps.setString(9, direccion);
            ps.setString(10, idLugarExpd);
            ps.setString(11, idEmpleado);

            op = true;

        } catch (Exception ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                this.cerrar();
            } catch (Exception ex) {
                Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        return op;
    }
}
