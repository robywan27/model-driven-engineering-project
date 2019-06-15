/*
 * 
 */
package fashion.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import fashion.diagram.edit.commands.SpatioTemporalDescriptorCreateCommand;
import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class FashionStyleFashionStyleDescriptorsCompartmentItemSemanticEditPolicy
		extends FashionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FashionStyleFashionStyleDescriptorsCompartmentItemSemanticEditPolicy() {
		super(FashionElementTypes.FashionStyle_2021);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FashionElementTypes.SpatioTemporalDescriptor_3003 == req
				.getElementType()) {
			return getGEFWrapper(new SpatioTemporalDescriptorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
