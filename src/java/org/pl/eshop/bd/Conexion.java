/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.bd;


import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import org.pl.eshop.general.Config;


public class Conexion {
 private static final String SERVIDOR = Config.SERVIDOR;

 
 private static final int PUERTO = Config.PUERTO;
 private static final String BD = Config.BD;
 private static final String NOMBRE_USUARIO = Config.NOMBRE_USUARIO;
 private static final String CONTRASENA_USUARIO =
Config.CONTRASENA_USUARIO;
  private static final String ZONA =
Config.ZONA;

 public static Connection getConexion() throws SQLException {
 MysqlDataSource ds = new MysqlDataSource();
 ds.setServerName(SERVIDOR);
 ds.setServerTimezone(ZONA);
 ds.setPortNumber(PUERTO);
 ds.setDatabaseName(BD);
 ds.setUser(NOMBRE_USUARIO);
 ds.setPassword(CONTRASENA_USUARIO);

 return ds.getConnection();
 }
}