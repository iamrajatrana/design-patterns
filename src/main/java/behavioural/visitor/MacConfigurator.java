package behavioural.visitor;

public class MacConfigurator implements IRouterVisitor {

    @Override
    public void visit(DlinkRouter router) {
        System.out.println("DLinkRouter Configuration for Mac complete !!");
    }

    @Override
    public void visit(TPLinkRouter router) {
        System.out.println("TPLinkRouter Configuration for Mac complete !!");
    }
}
