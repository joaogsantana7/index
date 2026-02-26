/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

/**
 *
 * @author 232.001461
 */
public class ConnectionFactory {
    
    // Dados da conexão
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = 
            "jdbc:mysql://localhost:3306/estoue_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "cimatec";
    
    // Métodos
    
    public static connection getConnection(){
        connetion con = null;
        
        try {
            class.forName(DRIVER);
            con = DriverMeneger.getconnection(URL, USER, PASSWORD);
            System.out.println("banco de dados connection be true");
        } catch (Exception e) {
            System.out.println("banco de dados not connection");
            e.printStackTrace();
        }
    }
    
    return con;
}
