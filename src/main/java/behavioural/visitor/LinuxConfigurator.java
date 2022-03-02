package behavioural.visitor;

public class LinuxConfigurator implements IRouterVisitor{

    @Override
    public void visit(DlinkRouter router) {
        System.out.println("DLinkRouter Configuration for Linux complete !!");
    }

    @Override
    public void visit(TPLinkRouter router) {
        System.out.println("TPLinkRouter Configuration for Linux complete !!");
    }
}
