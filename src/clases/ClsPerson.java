/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author mayko
 */
public class ClsPerson {
    
    private String name;
    private String phone;
    private String address;
    private String gender;

    public ClsPerson(String name, String phone, String address, String gender) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void talk(){
        System.out.println(this.name + " esta hablando.");
        
    }
    public void eat(){
        System.out.println(this.name + " esta comiendo.");
        
    }
    public void buy(){
        System.out.println(this.name + " esta comprando.");
    }
    
    public void goHome(){
        System.out.println(this.name + " se dirije a casa: " + this.address);
    } 

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
}
