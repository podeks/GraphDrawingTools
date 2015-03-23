package directededge;

/**
 *
 * @param <S> 
 * @author pdokos
 * 
 * This is the edge-object type that the graphs in the module 'Graphs' are built 
 * upon.
 */
public class DirectedEdge<S> {

    private S source;
    private S target;

    public DirectedEdge(S src, S tgt) {
        source = src;
        target = tgt;
    }

    public S getSource() {
        return source;
    }

    public S getTarget() {
        return target;
    }
}
