package sql.connection;

import java.sql.*;

/**
 *  加载多个数据库驱动，运行时怎么选择的
 * Created by yangyuan on 8/2/18.
 */
public class ConnectionChoice {
    public static void main(String[] args) throws SQLException {
        Connection coon = DriverManager.getConnection("jdbc:mysql://192.168.104.83:3358/cn_appoint?characterEncoding=utf-8",//
                "cn_appoint",
                "cn_appoint");

        PreparedStatement statement = coon.prepareStatement("select * from appoint_product limit 0,3");
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString(3));
        }
    }
}
