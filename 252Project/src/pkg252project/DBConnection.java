
package pkg252project;

public class DBConnection {
    private String host;
    private int port;
    private static DBConnection db;
    
    private DBConnection(String host, int port){
        this.host = host;
        this.port = port;
    }
    
    public DBConnection getInstance(String host, int port){
        if(db == null){
            db = new DBConnection(host, port);
        } return db;
    }
    
}
