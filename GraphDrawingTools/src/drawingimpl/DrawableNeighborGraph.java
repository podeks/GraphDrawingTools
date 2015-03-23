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

