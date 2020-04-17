package kr.ac.jejunu.user;

import java.sql.*;


public class UserDao {
    public User get(Integer id) throws ClassNotFoundException, SQLException {
        //mysql
        //드라이버 로딩
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jeju?serverTimezone=Asia/Seoul"
                , "root", "1431");
        //query
        PreparedStatement preparedStatement =
                connection.prepareStatement("select id, name, password from userinfo where id = ?");
        preparedStatement.setInt(1, id);
        //실행
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        //매핑
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setPassword(resultSet.getString("password"));
        //해지
        resultSet.close();
        preparedStatement.close();
        connection.close();
        //결과리턴
        return user;
    }
}
