/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interheritance2;

/**
 *
 * @author Arya Permana PY
 */
public class employee extends person {

    // Attributes
    String department, title;

    public employee(String id, String name, String address) {
        super(id, name, address);
        department = null;
        title = null;
    }

    public employee(String id, String name, String address, String department, String title) {
        super(id, name, address);
        this.department = "IT";
        this.title = title;
    }

    // Setter

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }

    // Custom

    public void getData() {
        System.out.print(super.getId() + " " + super.getName() + " " + super.getAddress() + " " + getDepartment() + " "
                + getTitle());
    }

    public void getDataRows() {
        System.out.println("ID\t\t: " + super.getId());
        System.out.println("Name\t\t: " + super.getName());
        System.out.println("Address\t\t: " + super.getAddress());
        System.out.println("Department\t: " + getDepartment());
        System.out.println("Title\t\t: " + getTitle());
    }

}