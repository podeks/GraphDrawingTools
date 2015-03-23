package drawingapi;

import directededge.DirectedEdge;
import drawingcomponents.EdgeDrawingAtts;
import api.NeighborGraph;

/**
 *
 * @author pdokos
 */
public interface EdgeDrawingAttsLabelling<S> {
    
    public NeighborGraph<S> getGraph();
    
    public EdgeDrawingAtts getDrawingAtts(DirectedEdge<S> e);
}
