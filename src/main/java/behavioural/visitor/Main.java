package behavioural.visitor;

//The Visitor pattern is great to separate the algorithm from the classes on which it operates. Besides that, it makes adding new operation more easily, just by providing a new implementation of the Visitor.
//Furthermore, we don't depend on components interfaces, and if they are different, that's fine, since we have a separate algorithm for processing per concrete element.
//Moreover, the Visitor can eventually aggregate data based on the element it traverses.

public class Main {
    public static void main(String[] args) {
        IRouterVisitor visitor = new MacConfigurator();

        DlinkRouter dlinkRouter1 = new DlinkRouter();
        dlinkRouter1.accept(visitor);

        TPLinkRouter tpLinkRouter1 = new TPLinkRouter();
        tpLinkRouter1.accept(visitor);

        visitor = new LinuxConfigurator();


        DlinkRouter dlinkRouter2 = new DlinkRouter();
        dlinkRouter2.accept(visitor);

        TPLinkRouter tpLinkRouter2 = new TPLinkRouter();
        tpLinkRouter2.accept(visitor);

    }
}
