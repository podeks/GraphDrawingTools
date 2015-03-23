package drawingapi;

import drawingcomponents.VertexDrawingAtts;
import api.NeighborGraph;

/**
 *
 * @author pdokos
 */
public interface VertexDrawingAttsLabelling<S> {
    
    public NeighborGraph<S> getGraph();
    
    public VertexDrawingAtts getDrawingAtts(S s);
}
