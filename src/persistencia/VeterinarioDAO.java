package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Veterinario;

public class VeterinarioDAO {
    
    private static Connection connection;
    private static PreparedStatement st;
    private static ResultSet rs;
    public static List <Veterinario> leTodos()throws Exception{
    List<Veterinario>listVeterinario = new ArrayList<Veterinario>();

try {

String sql = "SELECT * FROM VETERINARIO";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Veterinario veterinario = new Veterinario();

veterinario.setMatr(rs.getInt("matr"));

veterinario.setSalario(rs.getDouble("salario"));

veterinario.setAnimal(AnimalDAO.leUm(rs.getInt("Animal_idAnimal")));

veterinario.setNome(rs.getString("nome"));

veterinario.setCpf(rs.getString("cpf"));

listVeterinario.add(veterinario);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listVeterinario;

}

 

public static Veterinario leUm(int matr) throws Exception {

Veterinario veterinario = new Veterinario();

try {

String sql = "SELECT * FROM Veterinario WHERE matr = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, matr);

rs = st.executeQuery();

if (rs.next()) {

veterinario.setSalario(rs.getDouble("salario"));

veterinario.setAnimal(AnimalDAO.leUm(rs.getInt("Animal_idAnimal")));

veterinario.setNome(rs.getString("nome"));

veterinario.setCpf(rs.getString("cpf"));


}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return veterinario;

}


public static int grava(Veterinario Veterinario) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Veterinario (matr,salario,Animal_idAnimal,nome,cpf) VALUES (?, ?, ?,?,?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, Veterinario.getMatr());

st.setDouble(2, Veterinario.getSalario());

st.setInt(3, Veterinario.getAnimal().getIdAnimal());

st.setString(4, Veterinario.getNome());

st.setString(5, Veterinario.getCpf());

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}


public static int altera(Veterinario veterinario) throws Exception {

int ret = 0;

try {

String sql = "UPDATE Veterinario SET salario = ? WHERE matr = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setDouble(1, veterinario.getSalario());

st.setInt(2, veterinario.getMatr());

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}


public static int exclui(int matr) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM Veterinario WHERE matr = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1,matr);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}
    }
    


