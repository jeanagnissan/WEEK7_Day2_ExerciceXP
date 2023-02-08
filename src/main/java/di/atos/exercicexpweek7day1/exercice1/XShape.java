/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpweek7day1.exercice1;

/**
 *
 * @author ezekielkouassi
 */
public class XShape extends Shape {

    private String name;

    public XShape(String name) { // Default Constructor
        super();
        this.name = name;
    }

    @Override
    public String getName() {
        return super.getName() + this.name;
    }

}
