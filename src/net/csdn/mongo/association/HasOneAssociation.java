package net.csdn.mongo.association;

import net.csdn.mongo.Document;

import java.util.Map;

/**
 * User: WilliamZhu
 * Date: 12-10-17
 * Time: 上午10:09
 */
public class HasOneAssociation implements  Association{
    private Class kclass;
    private Document parent;
    private Object foreignKey;

    public HasOneAssociation(String name,Options options) {
        kclass = options.kClass();

        foreignKey = options.foreignKey();
    }

    @Override
    public Association build(Map params) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Association remove(Document document) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Association doNotUseMePlease_newMe(Document document) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
