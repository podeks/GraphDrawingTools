/*
 * Copyright (C) 2015 Pericles Dokos
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package drawingcomponents;

/**
 *
 * @author pdokos
 */
public class CartesianPoint3D {
    private double x;
    private double y;
    private double z;

    public CartesianPoint3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public CartesianPoint3D(double a, double b, double c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }

    public void setPosition(double a, double b, double c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }

    public void setX(double a) {
        this.x = a;
    }

    public void setY(double a) {
        this.y = a;
    }

    public void setZ(double a) {
        this.z = a;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    
    public CartesianPoint3D negative() {
        return new CartesianPoint3D(-x, -y, -z);
    }

}
