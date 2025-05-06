package application;

import db.*;

import java.sql.*;

import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        PreparedStatement pSt = null;

        //resgatando dados
        try{
            conn = DB.getConnection();
            st = conn.createStatement();

            rs = st.executeQuery("select * from department");

            while (rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("name") );
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }

        try{
//            deletar
//            pSt = conn.prepareStatement("DELETE FROM department "
//                    + "WHERE "
//                    +"id = ?"
//                    );
//
//            pSt.setInt(1, 5);int rowsAffected =  pSt.executeUpdate();
//            if(rowsAffected > 0){
//                System.out.println("Done!" + " linha foi alterada");
//            }

            //update
//            pSt = conn.prepareStatement("UPDATE seller " +
//                    "SET base_salary = base_salary + ?" +
//                    " WHERE " +
//                    "departmentId = ?");
//
//            pSt.setDouble(1,200);
//            pSt.setInt(2,2);
//
//            int rowsAffected =  pSt.executeUpdate();
//            if(rowsAffected > 0){
//                System.out.println("Done!" + " linha foi alterada");
//            }


            //inserindo na tabela
//            pSt = conn.prepareStatement(" INSERT INTO seller "
//            +"(name, email, birthdate, base_salary, departmentId) "
//                    + "VALUES "
//                    +"(?,?,?,?,?)",
//                    Statement.RETURN_GENERATED_KEYS);
//
//            pSt.setString(1, "Cailaina");
//            pSt.setString(2, "cailania@cailebes.com");
//            pSt.setDate(3, new java.sql.Date(sdf.parse("22/04/1990").getTime()));
//            pSt.setDouble(4,  3000.0);
//            pSt.setInt(5, 1);

//            pSt = conn.prepareStatement("insert into department (name) values ('D1'),('D2')",
//                    Statement.RETURN_GENERATED_KEYS);
//
//            int rowsAffected =  pSt.executeUpdate();
//
//            if(rowsAffected > 0 ){
//                ResultSet result = pSt.getGeneratedKeys();
//
//                while(result.next()){
//                    int id = result.getInt(1);
//                    System.out.println("Done! Id = " + id);
//                }
//
//            }else{
//                System.out.println("No row affected");
//            }

        }
         finally {
            DB.closeStatement(pSt);
            DB.closeConnection();
        }
    }
}
