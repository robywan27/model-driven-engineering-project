/*
 * 
 */
package fashion.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import fashion.diagram.edit.commands.Product2CreateCommand;
import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class ProductLineProductLineProductsCompartmentItemSemanticEditPolicy
		extends FashionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProductLineProductLineProductsCompartmentItemSemanticEditPolicy() {
		super(FashionElementTypes.ProductLine_2018);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FashionElementTypes.Product_3007 == req.getElementType()) {
			return getGEFWrapper(new Product2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
