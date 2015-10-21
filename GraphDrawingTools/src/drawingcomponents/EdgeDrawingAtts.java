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
public class EdgeDrawingAtts {

    private final float DEFAULT_WIDTH=1.0f;

    double r;
    double g;
    double b;

    float width;

    public EdgeDrawingAtts () {
        this.r = 0.7;
        this.g = 0.2;
        this.b = 0.8;
        this.width = DEFAULT_WIDTH;
    }

    public EdgeDrawingAtts(double a, double b, double c) {
        this.r = a;
        this.g = b;
        this.b = c;
        this.width = DEFAULT_WIDTH;
    }

    public EdgeDrawingAtts(double a, double b, double c, float w) {
        this.r = a;
        this.g = b;
        this.b = c;
        this.width = w;
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

    public float getWidth() {
        return width;
    }

    public void setWidth (float w) {
        width=w;
    }
}
