/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interheritance2;

/**
 *
 * @author Arya Permana PY
 */
public class person {

    String id, name, address;

    public person() {
        id = null;
        name = null;
        address = null;
    }

    public person(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Setter
    public void id(String id) {
        this.id = id;
    }

    public void name(String name) {
        this.name = name;
    }

    public void address(String address) {
        this.address = address;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Custom

}