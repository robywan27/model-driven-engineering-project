/*
 * 
 */
package fashion.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import fashion.diagram.edit.commands.ArticleCreateCommand;
import fashion.diagram.edit.commands.TVProgramCreateCommand;
import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class InfluencerInfluencerReportsCompartmentItemSemanticEditPolicy
		extends FashionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InfluencerInfluencerReportsCompartmentItemSemanticEditPolicy() {
		super(FashionElementTypes.Influencer_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FashionElementTypes.Article_3001 == req.getElementType()) {
			return getGEFWrapper(new ArticleCreateCommand(req));
		}
		if (FashionElementTypes.TVProgram_3002 == req.getElementType()) {
			return getGEFWrapper(new TVProgramCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
