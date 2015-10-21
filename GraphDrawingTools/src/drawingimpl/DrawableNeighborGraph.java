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
package drawingimpl;

import api.NeighborGraph;
import drawingapi.EdgeDrawingAttsLabelling;
import drawingapi.VertexDrawingAttsLabelling;
import drawingapi.VertexPositionLabelling;

/**
 *
 * @author pdokos
 */
public class DrawableNeighborGraph<S> {
    
    protected NeighborGraph<S> graph;
    protected VertexPositionLabelling<S> embedding;
    protected EdgeDrawingAttsLabelling<S> edgeAtts;
    protected VertexDrawingAttsLabelling<S> vertAtts;
    
    double dimension;
    
    public DrawableNeighborGraph(NeighborGraph<S> graph) {
        this.graph = graph;
    }
    
    public NeighborGraph<S> getGraph() {
        return graph;
    }
    
    public double getDimension() {
        return dimension;
    }
    
    public void setDimension(double dim) {
        dimension = dim;
    }
    
    public void setEmbedding(VertexPositionLabelling<S> vPosLbl) {
        if (vPosLbl != null && vPosLbl.getGraph().equals(graph))
        embedding = vPosLbl;
    }
    
    public VertexPositionLabelling<S> getEmbedding() {
        return embedding;
    }
    
    public void setVertDrawingAtts(VertexDrawingAttsLabelling<S> vAtts) {
        if (vAtts != null && vAtts.getGraph().equals(graph))
        vertAtts = vAtts;
    }
    
    public VertexDrawingAttsLabelling<S> getVertDrawingAtts() {
        return vertAtts;
    }
    
    public void setEdgeDrawingAtts(EdgeDrawingAttsLabelling<S> eAtts) {
        if (eAtts != null && eAtts.getGraph().equals(graph))
        edgeAtts = eAtts;
    }
    
    public EdgeDrawingAttsLabelling<S> getEdgeDrawingAtts() {
        return edgeAtts;
    }
    
}

