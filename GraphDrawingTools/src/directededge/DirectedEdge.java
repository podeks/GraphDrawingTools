package directededge;

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
