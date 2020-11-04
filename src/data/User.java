/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author RYP
 */
public class User {
    private String userName;
    private String password;
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName,String parPassword){
        
        if(("RizkiAdam".equals(parUserName))&&("terbaikselalu".equals(parPassword))){
             statusAkun = true;
        }else {
             statusAkun = false;
        }
        return statusAkun;
        
    }

    private void hasilLogin(boolean status, String parUserName){
        if (statusAkun == true){
            System.out.println("******HALLO "+parUserName+"******");
            System.out.println("Selamat Datang Di Aplikasi Ini");
        }else {
            System.out.println("OOOOPS, Username atau Password anda salah");
        }
    }
    
    public void pengecekanLogin(String parUserName, String parPassword){
        cekAkun(parUserName, parPassword);
        hasilLogin (statusAkun, parUserName);
        
        
    }
}
