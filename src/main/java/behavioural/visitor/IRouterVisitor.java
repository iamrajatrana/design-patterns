package behavioural.visitor;

public interface IRouterVisitor {
    public void visit(DlinkRouter router);
    public void visit(TPLinkRouter router);
}
