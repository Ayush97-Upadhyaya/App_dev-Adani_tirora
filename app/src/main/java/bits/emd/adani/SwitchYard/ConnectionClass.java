package bits.emd.adani.SwitchYard;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Surya on 18-06-2017.
 */

public class ConnectionClass extends AsyncTask<String,String,String>{

        @Override
        protected void onPreExecute () {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground (String...params){
            String query = params[0];
            //String database = params[1];

            this.connection(query);
            return null;
        }

        @Override
        protected void onPostExecute (String s){
        }

    private void connection(String query) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("java.sql.DriverManager");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.43.105:3306/dm"  , "root", "root");
            Statement stmt = (Statement) con.createStatement();
            stmt.executeUpdate(query);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}