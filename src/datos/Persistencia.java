/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author user
 */
public class Persistencia {

    private static final String URL = "jdbc:postgresql://localhost:5432/sitravi";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1193585023Bn*";
    
    public void guardarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (nombre, correo, telefono) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getCorreo());
            stmt.setString(3, cliente.getTelefono());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Cliente agregado correctamente.");
            }
        } catch (SQLException e) {
            System.out.println(" " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void guardarPrestador(Prestador prestador) {
        String sql = "INSERT INTO prestador (nombre, correo, telefono, saldo, tipo ) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, prestador.getNombre());
            stmt.setString(2, prestador.getCorreo());
            stmt.setString(3, prestador.getTelefono());
            stmt.setFloat(4, prestador.getSaldo());
            stmt.setString(5, prestador.getTipo());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Prestador agregado correctamente.");
            }
        } catch (SQLException e) {
            System.out.println(" " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void guardarVehiculo(Vehiculo vehiculo) {
        String sql = "INSERT INTO vehiculo (matricula, marca, color, modelo, codigo_prestador, capacidad, condicion ) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, vehiculo.getMatricula()); 
            stmt.setString(2, vehiculo.getMarca());
            stmt.setString(3, vehiculo.getColor());
            stmt.setString(4, vehiculo.getModelo());
            stmt.setInt(5, vehiculo.getCodigoPrestador());
            stmt.setInt(6, vehiculo.getCapacidad());
            stmt.setString(7, vehiculo.getCondicion());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("vehiculo agregado correctamente.");
            }
        } catch (SQLException e) {
            System.out.println(" " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void listarClientes() {
        String sql = "SELECT * FROM cliente"; 
        StringBuilder clientesInfo = new StringBuilder();
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) { 
            if (!rs.isBeforeFirst()) { 
                System.out.println("No se encontraron clientes.");
            } else {
                while (rs.next()) {
                    int codigo = rs.getInt("codigo");  
                    String nombre = rs.getString("nombre");
                    String correo = rs.getString("correo");
                    String telefono = rs.getString("telefono");
                    clientesInfo.append("Codigo: ").append(codigo).append(", ");
                    clientesInfo.append("Nombre: ").append(nombre).append(", ");
                    clientesInfo.append("Correo: ").append(correo).append(", ");
                    clientesInfo.append("Teléfono: ").append(telefono).append("\n");
                }
                JOptionPane.showMessageDialog(null, clientesInfo);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void listarVehiculos() {
        String sql = "SELECT * FROM vehiculo"; 
        StringBuilder vehiculoinfo = new StringBuilder();
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) { 
            if (!rs.isBeforeFirst()) { 
                System.out.println("No se encontraron vehiculos.");
            } else {
                while (rs.next()) {
                    int codigo = rs.getInt("codigo");  
                    String matricula = rs.getString("matricula");
                    String marca = rs.getString("marca");
                    String color = rs.getString("color");
                    String modelo = rs.getString("modelo");
                    int codigo_prestador = rs.getInt("codigo_prestador");
                    int capacidad = rs.getInt("capacidad");
                    String condicion = rs.getString("condicion");
                    vehiculoinfo.append("Codigo: ").append(codigo).append(", ");
                    vehiculoinfo.append("Nombre: ").append(matricula).append(", ");
                    vehiculoinfo.append("Correo: ").append(marca).append(", ");
                    vehiculoinfo.append("Correo: ").append(color).append(", ");
                    vehiculoinfo.append("Correo: ").append(modelo).append(", ");
                    vehiculoinfo.append("Correo: ").append(codigo_prestador).append(", ");
                    vehiculoinfo.append("Correo: ").append(capacidad).append(", ");
                    vehiculoinfo.append("Correo: ").append(condicion).append(", ");
                    vehiculoinfo.append("Teléfono: ").append(color).append("\n");
                }
                JOptionPane.showMessageDialog(null, vehiculoinfo);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar vehiculos: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void listarPrestadores() {
        String sql = "SELECT * FROM prestador"; 
        StringBuilder prestadoresInfo = new StringBuilder();
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) { 
            if (!rs.isBeforeFirst()) { 
                System.out.println("No se encontraron prestadores.");
            } else {
                while (rs.next()) {
                    int codigo = rs.getInt("codigo");  
                    String nombre = rs.getString("nombre");
                    String correo = rs.getString("correo");
                    String telefono = rs.getString("telefono");
                    float saldo = rs.getFloat("saldo");
                    String tipo = rs.getString("tipo");
                    prestadoresInfo.append("Codigo: ").append(codigo).append(", ");
                    prestadoresInfo.append("Nombre: ").append(nombre).append(", ");
                    prestadoresInfo.append("Correo: ").append(correo).append(", ");
                    prestadoresInfo.append("saldo: ").append(saldo).append(", ");
                    prestadoresInfo.append("tipo ").append(tipo).append("\n");
                }
                JOptionPane.showMessageDialog(null, prestadoresInfo);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar prestadores: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public Cliente consultarClienteCodigo(int codigo) {
        String sql = "SELECT * FROM cliente WHERE codigo = ?";
        Cliente cliente = null;
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Crear un objeto Cliente con los datos obtenidos de la base de datos
                    String nombre = rs.getString("nombre");
                    String correo = rs.getString("correo");
                    String telefono = rs.getString("telefono");
                    cliente = new Cliente(nombre, correo, telefono);
                    
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar cliente: " + e.getMessage());
            e.printStackTrace();
        }
        return cliente;
    }
    
    public void consultarClientePorNombre(String nombreBuscado) {
        String sql = "SELECT * FROM cliente WHERE nombre LIKE ?";
        StringBuilder clientesInfo = new StringBuilder();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombreBuscado + "%" ); 

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int codigo = rs.getInt("codigo");
                    String nombre = rs.getString("nombre");
                    String correo = rs.getString("correo");
                    String telefono = rs.getString("telefono");

                    clientesInfo.append("Codigo: ").append(codigo).append(", ");
                    clientesInfo.append("Nombre: ").append(nombre).append(", ");
                    clientesInfo.append("Correo: ").append(correo).append(", ");
                    clientesInfo.append("Teléfono: ").append(telefono).append("\n");
                }
                JOptionPane.showMessageDialog(null, clientesInfo);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public Prestador consultarPrestadorCodigo(int codigo) {
        String sql = "SELECT * FROM prestador WHERE codigo = ?";
        Prestador prestador = null;
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, codigo);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String correo = rs.getString("correo");
                    String telefono = rs.getString("telefono");
                    float saldo = rs.getFloat("saldo");
                    String tipo = rs.getString("tipo");
                    prestador = new Prestador(nombre, correo, telefono, tipo, saldo);
                    
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar prestador: " + e.getMessage());
            e.printStackTrace();
        }
        return prestador;
    }
    
    public void consultarPrestadorPorNombre(String nombreBuscado) {
        String sql = "SELECT * FROM prestador WHERE nombre LIKE ?";
        StringBuilder prestadorInfo = new StringBuilder();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombreBuscado + "%" ); 

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int codigo = rs.getInt("codigo");
                    String nombre = rs.getString("nombre");
                    String correo = rs.getString("correo");
                    String telefono = rs.getString("telefono");
                    String tipo = rs.getString("tipo");
                    float saldo = rs.getFloat("saldo");
                    prestadorInfo .append("Codigo: ").append(codigo).append(", ");
                    prestadorInfo .append("Nombre: ").append(nombre).append(", ");
                    prestadorInfo .append("Correo: ").append(correo).append(", ");
                    prestadorInfo .append("Tipo: ").append(correo).append(", ");
                    prestadorInfo .append("Saldo: ").append(correo).append(", ");
                    prestadorInfo .append("Teléfono: ").append(telefono).append("\n");
                }
                JOptionPane.showMessageDialog(null, prestadorInfo );
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar prestador: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
