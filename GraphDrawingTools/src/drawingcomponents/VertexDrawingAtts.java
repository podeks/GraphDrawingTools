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
public class VertexDrawingAtts {

    private final float DEFAULT_SIZE=(float) 2.0;

    private final double DEFAULT_R=1.0;
    private final double DEFAULT_G=0.1;
    private final double DEFAULT_B=0.2;

    double r;
    double g;
    double b;

    float size;

    public VertexDrawingAtts () {
        this.r = DEFAULT_R;
        this.g = DEFAULT_G;
        this.b = DEFAULT_B;
        size=DEFAULT_SIZE;
    }

    public VertexDrawingAtts(double a, double b, double c) {
        this.r = a;
        this.g = b;
        this.b = c;
        size=DEFAULT_SIZE;
    }

    public VertexDrawingAtts(double a, double b, double c, float s) {
        this.r = a;
        this.g = b;
        this.b = c;
        this.size = s;
    }

    public void setColor(double r, double g, double b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public double getR() {
        return r;
    }

    public double getG() {
        return g;
    }

    public double getB() {
        return b;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setG(double g) {
        this.g = g;
    }

    public void setB(double b) {
        this.b = b;
    }

    public float getSize() {
        return size;
    }

    public void setSize (float s) {
        size=s;
    }
}
