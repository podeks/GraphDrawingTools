package drawingapi;

import api.NeighborGraph;
import drawingcomponents.CartesianPoint3D;

/**
 *
 * @author pdokos
 */
public interface VertexPositionLabelling<S> {
    
    public NeighborGraph<S> getGraph();
    
    public CartesianPoint3D getPosition(S s);
    
    public double getDiameter();
    
}
