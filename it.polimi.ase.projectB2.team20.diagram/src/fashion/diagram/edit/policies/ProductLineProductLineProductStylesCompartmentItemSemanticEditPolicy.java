/*
 * 
 */
package fashion.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import fashion.diagram.edit.commands.ProductStyle2CreateCommand;
import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class ProductLineProductLineProductStylesCompartmentItemSemanticEditPolicy
		extends FashionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProductLineProductLineProductStylesCompartmentItemSemanticEditPolicy() {
		super(FashionElementTypes.ProductLine_2018);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FashionElementTypes.ProductStyle_3006 == req.getElementType()) {
			return getGEFWrapper(new ProductStyle2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
