/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpweek7day1.exercice2;

/**
 *
 * @author ezekielkouassi
 */
public class Point3D extends Point2D{
    private float z = 0.0f;
    
    public Point3D() {
        super();
    }
    
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    
    public float getZ() {
        return this.z;
    }
    
    public void setZ(float z) {
        this.z = z;
    }
    
    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }
    
    public float[] getXYZ() {
        return new float[] {getX(), getY(), this.z};
    }
    
    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+this.z+")";
    }
}
