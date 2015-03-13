package de.lynorics.eclipse.jangaroo.scoping;
 
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import de.lynorics.eclipse.jangaroo.aS3.Method;
 
public class AS3QualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider{
 
	public QualifiedName getFullyQualifiedName(org.eclipse.emf.ecore.EObject obj) {
		QualifiedName result = super.getFullyQualifiedName(obj);
//		System.out.println("getFullyQualifiedName="+ result + " for " + obj);
		return result;
	};
	
//    QualifiedName qualifiedName(de.lynorics.eclipse.jangaroo.aS3.Package pack) {
//    	String fqn = pack.getName();
//    	if (fqn == null ||
//    		"".equals(fqn)) {
//    		System.out.println("default");
//    		return QualifiedName.create("default");
//    	}
//    	String[] splitted = fqn.split(".");
//		QualifiedName name = QualifiedName.create(fqn);
//		System.out.println(name.toString());
//        return name;
//    }
// 
//    protected QualifiedName qualifiedName(Method meth) {
//    	// TODO Auto-generated method stub
//    	QualifiedName name = QualifiedName.create(meth.getName());
//		System.out.println(name);
//
//    	return name;
//    }
}
