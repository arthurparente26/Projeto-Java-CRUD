package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Animal;

public class AnimalDAO {

private static Connection connection;

private static PreparedStatement st;

private static ResultSet rs;

public static List<Animal> leTodos() throws Exception{

List<Animal> listAnimals = new ArrayList<Animal>();

try {

String sql = "SELECT * FROM ANIMAL";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

rs = st.executeQuery();

while (rs.next()) {

Animal a = new Animal();

a.setPeso(rs.getDouble("peso"));

a.setRaca(rs.getString("raca"));

a.setGenero(rs.getString("genero"));

a.setIdAnimal(rs.getInt("idAnimal"));

listAnimals.add(a);

}

st.close();

} catch (Exception e) {

System.out.println(e.getMessage());

}

return listAnimals;

}

public static Animal leUm(int idAnimal) throws Exception {

Animal animal = new Animal();

 try {

String sql = "SELECT * FROM Animal WHERE idAnimal = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, idAnimal);

rs = st.executeQuery();

if (rs.next()) {

animal.setPeso(rs.getDouble("peso"));

animal.setRaca(rs.getString("raca"));

animal.setGenero(rs.getString("genero"));

animal.setIdAnimal(rs.getInt("idAnimal"));

}

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return animal;

}

public static int grava(Animal animal) throws Exception {

int ret = 0;

try {

String sql = "INSERT INTO Animal (peso,raca,genero,idAnimal) VALUES (?, ?,?,?)";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setDouble(1, animal.getPeso());

st.setString(2, animal.getRaca());

st.setString(3, animal.getGenero());

st.setInt(4, animal.getIdAnimal());

ret = st.executeUpdate();

 st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int altera(Double peso,String raca,String genero,int idAnimal) throws Exception {

int ret = 0;

try {

String sql = "UPDATE animal SET genero = ? WHERE idAnimal = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setString(1, genero);

st.setInt(2,idAnimal);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}

public static int exclui(int idAnimal) throws Exception {

int ret = 0;

try {

String sql = "DELETE FROM animal WHERE idAnimal = ?";

connection = GerenteDeConexao.getConnection();

st = connection.prepareStatement(sql);

st.setInt(1, idAnimal);

ret = st.executeUpdate();

st.close();

} catch (SQLException e) {

System.out.println(e.getMessage());

}

return ret;

}
    
}
