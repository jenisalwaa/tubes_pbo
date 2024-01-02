/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author aguswahyudi
 */
public class Admin extends User implements Loginable{
    private int idAdmin;

    public Admin(String nama,String email,int idAdmin) {
       super(nama,email); 
       this.idAdmin = idAdmin; 
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
    @Override
    public void login(String un){
        nama=un;
        
    }
    
}
