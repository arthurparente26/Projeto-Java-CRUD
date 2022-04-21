package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Funcionario;

public class FuncionarioDAO {
    
    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;
    public static List <Funcionario> leTodos()throws Exception{
    List<Funcionario>listFuncionario = new ArrayList<Funcionario>();

try {

String sql = "SELECT * FROM CLIENTE";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Funcionario funcionario = new Funcionario();

funcionario.setCarteiraTrabalho(rs.getInt("carteiratrabalho"));

funcionario.setEndereco(rs.getString("endereco"));

funcionario.setCargaHoraria(rs.getInt("cargaHoraria"));

funcionario.setCliente(ClienteDAO.leUm(rs.getInt("Cliente_ingresso")));

listFuncionario.add(funcionario);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listFuncionario;

}

 

public static Funcionario leUm(int carteiraTrabalho) throws Exception {

Funcionario funcionario = new Funcionario();

try {

String sql = "SELECT * FROM Funcionario WHERE carteiraTrabalho = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, carteiraTrabalho);

rs = st.executeQuery();

if (rs.next()) {

funcionario.setEndereco(rs.getString("endereco"));

funcionario.setCargaHoraria(rs.getInt("cargaHoraria"));

funcionario.setNome(rs.getString("nome"));

funcionario.setNome(rs.getString("cpf"));

funcionario.setCliente(ClienteDAO.leUm(rs.getInt("Cliente_ingresso")));

}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return funcionario;

}


public static int grava(Funcionario Funcionario) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Funcionario (carteiraTrabalho,endereco,cargaHoraria,Cliente_ingresso,nome,cpf) VALUES (?, ?, ?, ?,?,?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, Funcionario.getCarteiraTrabalho());

st.setString(2, Funcionario.getEndereco());

st.setInt(3, Funcionario.getCargaHoraria());

st.setInt(4, Funcionario.getCliente().getIngresso());

st.setString(5, Funcionario.getNome());

st.setString(6, Funcionario.getCpf());

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}


public static int altera(Funcionario funcionario) throws Exception {

int ret = 0;

try {

String sql = "UPDATE Funcionario SET endereco = ?  WHERE carteiraTrabalho = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, funcionario.getEndereco());

st.setInt(2, funcionario.getCarteiraTrabalho());

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}


public static int exclui(int carteiraTrabalho) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM Funcionario WHERE carteiraTrabalho = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1,carteiraTrabalho);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}
    }
    



