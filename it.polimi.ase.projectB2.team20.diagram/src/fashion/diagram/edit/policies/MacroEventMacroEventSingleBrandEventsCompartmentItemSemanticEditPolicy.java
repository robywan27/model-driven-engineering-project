/*
 * 
 */
package fashion.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import fashion.diagram.edit.commands.SingleBrandEvent2CreateCommand;
import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class MacroEventMacroEventSingleBrandEventsCompartmentItemSemanticEditPolicy
		extends FashionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MacroEventMacroEventSingleBrandEventsCompartmentItemSemanticEditPolicy() {
		super(FashionElementTypes.MacroEvent_2007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FashionElementTypes.SingleBrandEvent_3005 == req.getElementType()) {
			return getGEFWrapper(new SingleBrandEvent2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
