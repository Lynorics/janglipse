package de.lynorics.eclipse.jangaroo.scoping;
 
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import de.lynorics.eclipse.jangaroo.aS3.Method;
 
public class AS3QualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider{
 
    QualifiedName qualifiedName(de.lynorics.eclipse.jangaroo.aS3.Package pack) {
    	String fqn = pack.getName();
    	if (fqn == null ||
    		"".equals(fqn)) {
    		return QualifiedName.create("default");
    	}
    	String[] splitted = fqn.split(".");
        return QualifiedName.create(splitted);
    }
 
    protected QualifiedName qualifiedName(Method meth) {
    	// TODO Auto-generated method stub
    	QualifiedName name = super.qualifiedName(meth);
    	return name;
    }
}
