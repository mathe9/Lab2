package db;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;


public class Db
{
    private Statement statement;
        
    public Db() {
        try
        {
            Class.forName(Values.DRIVER_MYSQL).newInstance();     //����JDBC����
            //System.out.println("Driver Load Success.");

            java.sql.Connection connection = DriverManager.getConnection(Values.URL);    //�������ݿ����Ӷ���
            statement = (Statement) connection.createStatement();       //����Statement����
        } catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        init();
        
    }
    
    private void init() {
		// TODO Auto-generated method stub
    	String sql = "create table if not exists book("
        		+ "ISBN char(30) primary key,"
        		+ "Title char(30),"
        		+ "AuthorID char(20),"
        		+ "Publisher char(30),"
        		+ "PublishDate char(30),"
        		+ "Price char(10)"
        		+ ")default charset=utf8";
        executeSql(sql);
        
        sql = "create table if not exists author("
        		+ "AuthorID char(20) primary key,"
        		+ "Name char(20),"
        		+ "Age char(10),"
        		+ "Country char(20)"
        		+ ")default charset=utf8";
        executeSql(sql);
        
        sql = "alter table book add index idx_AuthorID(AuthorID)";
        executeSql(sql);
        
        sql = "alter table author add index idx_AuthorID2(AuthorID)";
        executeSql(sql);
        
        sql = "alter table book add constraint fk_AuthorID "
        		+ "foreign(idx_AuthorID) "
        		+ "references author(idx_AuthorID2)";
        executeSql(sql);
        
	}



	/*
     * ����sql��ѯ���ݿ⣬����һ�������
     * ��    ��:SQL���
     * ����ֵ:ResultSet ��ѯ���
     */
    public ResultSet query(String sql) {
        ResultSet result = null;

        try
        {
            result = statement.executeQuery(sql);
        } catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result;
    }

    /*
     * ִ�����ݲ���
     * ��    ��:SQL���
     * ����ֵ:��
     */
    public void executeSql(String sql) {
        try
        {
            statement.execute(sql);
        } catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
