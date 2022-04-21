package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ClienteDAO {
    
    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;
    public static List <Cliente> leTodos()throws Exception{
    List<Cliente>listCliente = new ArrayList<Cliente>();

try {

String sql = "SELECT * FROM CLIENTE";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Cliente cliente = new Cliente();

cliente.setIngresso(rs.getInt("ingresso"));

cliente.setIdade(rs.getInt("idade"));

cliente.setAnimal(AnimalDAO.leUm(rs.getInt("Animal_idAnimal")));

listCliente.add(cliente);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listCliente;

}

 

public static Cliente leUm(int ingresso) throws Exception {

Cliente cliente = new Cliente();

try {

String sql = "SELECT * FROM Cliente WHERE ingresso = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, ingresso);

rs = st.executeQuery();

if (rs.next()) {

cliente.setIngresso(rs.getInt("ingresso"));

cliente.setIdade(rs.getInt("idade"));

cliente.setAnimal(AnimalDAO.leUm(rs.getInt("Animal_idAnimal")));

}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return cliente;

}


public static int grava(Cliente Cliente) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Cliente (ingresso,idade,nome,cpf,Animal_idAnimal) VALUES (?, ?, ?,?,?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, Cliente.getIngresso());

st.setInt(2, Cliente.getIdade());

st.setString(3, Cliente.getNome());

st.setString(4, Cliente.getCpf());

st.setInt(5, Cliente.getAnimal().getIdAnimal());


ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}


public static int altera(Cliente cliente) throws Exception {

int ret = 0;

try {

String sql = "UPDATE Cliente SET idade = ? WHERE ingresso = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, cliente.getIdade());

st.setInt(2, cliente.getIngresso());

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}


public static int exclui(int ingresso) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM Cliente WHERE ingresso = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1,ingresso);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}
    }
    


