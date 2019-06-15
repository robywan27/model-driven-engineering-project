/*
 * 
 */
package fashion.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import fashion.diagram.edit.commands.AdvertisingProduct2CreateCommand;
import fashion.diagram.edit.commands.AdvertisingProductCreateCommand;
import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class AdvertisingCampaignAdvertisingCampaignProductsCompartmentItemSemanticEditPolicy
		extends FashionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AdvertisingCampaignAdvertisingCampaignProductsCompartmentItemSemanticEditPolicy() {
		super(FashionElementTypes.AdvertisingCampaign_2017);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FashionElementTypes.AdvertisingProduct_3004 == req.getElementType()) {
			return getGEFWrapper(new AdvertisingProduct2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
