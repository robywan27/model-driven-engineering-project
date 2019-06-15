/*
 * 
 */
package fashion.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import fashion.diagram.edit.commands.AdvertisingCampaignCreateCommand;
import fashion.diagram.edit.commands.AdvertisingProductCreateCommand;
import fashion.diagram.edit.commands.BloggerCreateCommand;
import fashion.diagram.edit.commands.ChoreographerCreateCommand;
import fashion.diagram.edit.commands.CommentCreateCommand;
import fashion.diagram.edit.commands.CriticCreateCommand;
import fashion.diagram.edit.commands.DescriptionCreateCommand;
import fashion.diagram.edit.commands.DesignerCreateCommand;
import fashion.diagram.edit.commands.EmergingBrandCreateCommand;
import fashion.diagram.edit.commands.FamousBrandCreateCommand;
import fashion.diagram.edit.commands.FashionStyleCreateCommand;
import fashion.diagram.edit.commands.InfluencerCreateCommand;
import fashion.diagram.edit.commands.LocalBrandCreateCommand;
import fashion.diagram.edit.commands.MacroEventCreateCommand;
import fashion.diagram.edit.commands.ModelCreateCommand;
import fashion.diagram.edit.commands.PhotoCreateCommand;
import fashion.diagram.edit.commands.PhotographerCreateCommand;
import fashion.diagram.edit.commands.PresenterCreateCommand;
import fashion.diagram.edit.commands.ProductCreateCommand;
import fashion.diagram.edit.commands.ProductLineCreateCommand;
import fashion.diagram.edit.commands.ProductStyleCreateCommand;
import fashion.diagram.edit.commands.SingleBrandEventCreateCommand;
import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class FashionDomainItemSemanticEditPolicy extends
		FashionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FashionDomainItemSemanticEditPolicy() {
		super(FashionElementTypes.FashionDomain_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FashionElementTypes.Blogger_2001 == req.getElementType()) {
			return getGEFWrapper(new BloggerCreateCommand(req));
		}
		if (FashionElementTypes.Critic_2002 == req.getElementType()) {
			return getGEFWrapper(new CriticCreateCommand(req));
		}
		if (FashionElementTypes.Influencer_2003 == req.getElementType()) {
			return getGEFWrapper(new InfluencerCreateCommand(req));
		}
		if (FashionElementTypes.FamousBrand_2004 == req.getElementType()) {
			return getGEFWrapper(new FamousBrandCreateCommand(req));
		}
		if (FashionElementTypes.EmergingBrand_2005 == req.getElementType()) {
			return getGEFWrapper(new EmergingBrandCreateCommand(req));
		}
		if (FashionElementTypes.LocalBrand_2006 == req.getElementType()) {
			return getGEFWrapper(new LocalBrandCreateCommand(req));
		}
		if (FashionElementTypes.MacroEvent_2007 == req.getElementType()) {
			return getGEFWrapper(new MacroEventCreateCommand(req));
		}
		if (FashionElementTypes.SingleBrandEvent_2008 == req.getElementType()) {
			return getGEFWrapper(new SingleBrandEventCreateCommand(req));
		}
		if (FashionElementTypes.Photo_2009 == req.getElementType()) {
			return getGEFWrapper(new PhotoCreateCommand(req));
		}
		if (FashionElementTypes.Description_2010 == req.getElementType()) {
			return getGEFWrapper(new DescriptionCreateCommand(req));
		}
		if (FashionElementTypes.Comment_2011 == req.getElementType()) {
			return getGEFWrapper(new CommentCreateCommand(req));
		}
		if (FashionElementTypes.Designer_2012 == req.getElementType()) {
			return getGEFWrapper(new DesignerCreateCommand(req));
		}
		if (FashionElementTypes.Model_2013 == req.getElementType()) {
			return getGEFWrapper(new ModelCreateCommand(req));
		}
		if (FashionElementTypes.Presenter_2014 == req.getElementType()) {
			return getGEFWrapper(new PresenterCreateCommand(req));
		}
		if (FashionElementTypes.Choreographer_2015 == req.getElementType()) {
			return getGEFWrapper(new ChoreographerCreateCommand(req));
		}
		if (FashionElementTypes.Photographer_2016 == req.getElementType()) {
			return getGEFWrapper(new PhotographerCreateCommand(req));
		}
		if (FashionElementTypes.AdvertisingCampaign_2017 == req
				.getElementType()) {
			return getGEFWrapper(new AdvertisingCampaignCreateCommand(req));
		}
		if (FashionElementTypes.AdvertisingProduct_2022 == req.getElementType()) {
			return getGEFWrapper(new AdvertisingProductCreateCommand(req));
		}
		if (FashionElementTypes.ProductLine_2018 == req.getElementType()) {
			return getGEFWrapper(new ProductLineCreateCommand(req));
		}
		if (FashionElementTypes.ProductStyle_2019 == req.getElementType()) {
			return getGEFWrapper(new ProductStyleCreateCommand(req));
		}
		if (FashionElementTypes.Product_2020 == req.getElementType()) {
			return getGEFWrapper(new ProductCreateCommand(req));
		}
		if (FashionElementTypes.FashionStyle_2021 == req.getElementType()) {
			return getGEFWrapper(new FashionStyleCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
