package db;


public class Values
{
	 public static String DRIVER_MYSQL = "com.mysql.jdbc.Driver";    //MySQL JDBC�����ַ���
	 public static String URL = "jdbc:mysql://pwjjsfgarkmh.rds.sae.sina.com.cn:10037"
	 		  +"/lab2?user=root&password=Aa123456&useUnicode=true&characterEncoding=UTF8";
	 //���ݿ�Url,������ʶҪ���ӵ����ݿ�
}

//String driver = "com.mysql.jdbc.Driver";
//String username = System.getenv("ACCESSKEY");
//String password = System.getenv("SECRETKEY");
////System.getenv("MYSQL_HOST_S"); Ϊ�ӿ⣬ֻ��
//String dbUrl = String.format("jdbc:mysql://%s:%s/%s", System.getenv("MYSQL_HOST"), System.getenv("MYSQL_PORT"), System.getenv("MYSQL_DB"));
//try {
//    Class.forName(driver).newInstance();
//    con = DriverManager.getConnection(dbUrl, username, password);
//    // ...
//} catch (Exception e) {
//    // ...
//}

//public class Values
//{
//  public static String DRIVER_MYSQL = "com.mysql.jdbc.Driver";    //MySQL JDBC�����ַ���
//  public static String URL = "jdbc:mysql://localhost:3306/lab2?"
//          + "user=root&password=Aa123456&useUnicode=true&characterEncoding=UTF8";
//  //���ݿ�Url,������ʶҪ���ӵ����ݿ�
//}