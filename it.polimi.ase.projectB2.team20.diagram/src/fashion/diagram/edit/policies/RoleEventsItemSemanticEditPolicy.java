/*
 * 
 */
package fashion.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class RoleEventsItemSemanticEditPolicy extends
		FashionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RoleEventsItemSemanticEditPolicy() {
		super(FashionElementTypes.RoleEvents_4014);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
