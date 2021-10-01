package model.dao;

import java.sql.ResultSet;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Carro;

public class CarroDAO {
    public void create(Carro c){// CRUED
        
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = com.prepareStatement("INSERT INTO estacionamentobd (marca, placa, cor, horaEntrada, horaSaida)VALUE(?, ?, ?, ?, ?)");
            stmt.setString(1, c.getMarca());
            stmt.setString(2, c.getPlaca());
            stmt.setString(3, c.getCor());
            stmt.setString(4, c.getHoraEntrada());
            stmt.setString(5, c.getHoraSaida());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ ex);
        } finally{ ConnectionFactory.closeConnection(com, stmt);}
        
    }
    
    public void update(Carro c){
        
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = com.prepareStatement("UPDATE estacionamentobd SET marca = ?,placa = ?,cor = ?,horaEntrada = ?,horaSaida = ? WHERE id = ?");
            stmt.setString(1, c.getMarca());
            stmt.setString(2, c.getPlaca());
            stmt.setString(3, c.getCor());
            stmt.setString(4, c.getHoraEntrada());
            stmt.setString(5, c.getHoraSaida());
            stmt.setInt(6, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ ex);
        } finally{ ConnectionFactory.closeConnection(com, stmt);}
        
    }
    public void delete(Carro c){
        
        Connection com = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = com.prepareStatement("DELETE FROM estacionamentobd WHERE id = ?");
            stmt.setInt(1, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: "+ ex);
        } finally{ ConnectionFactory.closeConnection(com, stmt);}
        
    }
    
    public List<Carro> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Carro> carros = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM estacionamentobd");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Carro carro = new Carro();
                
                carro.setId(rs.getInt("id"));
                carro.setMarca(rs.getString("marca"));
                carro.setPlaca(rs.getString("placa"));
                carro.setCor(rs.getString("cor"));
                carro.setHoraEntrada(rs.getString("horaEntrada"));
                carro.setHoraSaida(rs.getString("horaSaida"));
                carros.add(carro);
                
            }
                    
                    } catch (SQLException ex) {
            Logger.getLogger(CarroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{ConnectionFactory.closeConnection(con, stmt, rs);}
        
        return carros;
    }
}
