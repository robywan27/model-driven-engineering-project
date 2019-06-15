/*
 * 
 */
package fashion.diagram.edit.policies;

import java.util.Iterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import fashion.diagram.edit.commands.AdvertisingCampaignBrandCreateCommand;
import fashion.diagram.edit.commands.AdvertisingCampaignBrandReorientCommand;
import fashion.diagram.edit.commands.BrandCampaignsCreateCommand;
import fashion.diagram.edit.commands.BrandCampaignsReorientCommand;
import fashion.diagram.edit.commands.BrandDesignersCreateCommand;
import fashion.diagram.edit.commands.BrandDesignersReorientCommand;
import fashion.diagram.edit.commands.BrandProductLinesCreateCommand;
import fashion.diagram.edit.commands.BrandProductLinesReorientCommand;
import fashion.diagram.edit.commands.DesignerBrandCreateCommand;
import fashion.diagram.edit.commands.DesignerBrandReorientCommand;
import fashion.diagram.edit.commands.FashionElementStylesCreateCommand;
import fashion.diagram.edit.commands.FashionElementStylesReorientCommand;
import fashion.diagram.edit.commands.FashionStyleElementsCreateCommand;
import fashion.diagram.edit.commands.FashionStyleElementsReorientCommand;
import fashion.diagram.edit.commands.NewsReportElementsCreateCommand;
import fashion.diagram.edit.commands.NewsReportElementsReorientCommand;
import fashion.diagram.edit.commands.ProductLineBrandCreateCommand;
import fashion.diagram.edit.commands.ProductLineBrandReorientCommand;
import fashion.diagram.edit.commands.SingleBrandEventBrandCreateCommand;
import fashion.diagram.edit.commands.SingleBrandEventBrandReorientCommand;
import fashion.diagram.edit.parts.AdvertisingCampaignBrandEditPart;
import fashion.diagram.edit.parts.ArticleEditPart;
import fashion.diagram.edit.parts.BrandCampaignsEditPart;
import fashion.diagram.edit.parts.BrandDesignersEditPart;
import fashion.diagram.edit.parts.BrandProductLinesEditPart;
import fashion.diagram.edit.parts.DesignerBrandEditPart;
import fashion.diagram.edit.parts.FamousBrandFamousBrandReportsCompartmentEditPart;
import fashion.diagram.edit.parts.FashionElementStylesEditPart;
import fashion.diagram.edit.parts.FashionStyleElementsEditPart;
import fashion.diagram.edit.parts.NewsReportElementsEditPart;
import fashion.diagram.edit.parts.ProductLineBrandEditPart;
import fashion.diagram.edit.parts.SingleBrandEventBrandEditPart;
import fashion.diagram.edit.parts.TVProgramEditPart;
import fashion.diagram.part.FashionVisualIDRegistry;
import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class FamousBrandItemSemanticEditPolicy extends
		FashionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FamousBrandItemSemanticEditPolicy() {
		super(FashionElementTypes.FamousBrand_2004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (FashionVisualIDRegistry.getVisualID(incomingLink) == NewsReportElementsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FashionVisualIDRegistry.getVisualID(incomingLink) == FashionStyleElementsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FashionVisualIDRegistry.getVisualID(incomingLink) == AdvertisingCampaignBrandEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FashionVisualIDRegistry.getVisualID(incomingLink) == SingleBrandEventBrandEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FashionVisualIDRegistry.getVisualID(incomingLink) == ProductLineBrandEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FashionVisualIDRegistry.getVisualID(incomingLink) == DesignerBrandEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (FashionVisualIDRegistry.getVisualID(outgoingLink) == FashionElementStylesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FashionVisualIDRegistry.getVisualID(outgoingLink) == BrandCampaignsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FashionVisualIDRegistry.getVisualID(outgoingLink) == BrandProductLinesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FashionVisualIDRegistry.getVisualID(outgoingLink) == BrandDesignersEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (FashionVisualIDRegistry.getVisualID(node)) {
			case FamousBrandFamousBrandReportsCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (FashionVisualIDRegistry.getVisualID(cnode)) {
					case ArticleEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (FashionVisualIDRegistry
									.getVisualID(outgoingLink) == NewsReportElementsEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(),
										null, outgoingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case TVProgramEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (FashionVisualIDRegistry
									.getVisualID(outgoingLink) == NewsReportElementsEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(),
										null, outgoingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (FashionElementTypes.FashionElementStyles_4001 == req
				.getElementType()) {
			return getGEFWrapper(new FashionElementStylesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.NewsReportElements_4002 == req.getElementType()) {
			return null;
		}
		if (FashionElementTypes.FashionStyleElements_4003 == req
				.getElementType()) {
			return null;
		}
		if (FashionElementTypes.BrandCampaigns_4004 == req.getElementType()) {
			return getGEFWrapper(new BrandCampaignsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.BrandProductLines_4005 == req.getElementType()) {
			return getGEFWrapper(new BrandProductLinesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.BrandDesigners_4006 == req.getElementType()) {
			return getGEFWrapper(new BrandDesignersCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.AdvertisingCampaignBrand_4007 == req
				.getElementType()) {
			return null;
		}
		if (FashionElementTypes.SingleBrandEventBrand_4009 == req
				.getElementType()) {
			return null;
		}
		if (FashionElementTypes.ProductLineBrand_4010 == req.getElementType()) {
			return null;
		}
		if (FashionElementTypes.DesignerBrand_4015 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (FashionElementTypes.FashionElementStyles_4001 == req
				.getElementType()) {
			return null;
		}
		if (FashionElementTypes.NewsReportElements_4002 == req.getElementType()) {
			return getGEFWrapper(new NewsReportElementsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.FashionStyleElements_4003 == req
				.getElementType()) {
			return getGEFWrapper(new FashionStyleElementsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.BrandCampaigns_4004 == req.getElementType()) {
			return null;
		}
		if (FashionElementTypes.BrandProductLines_4005 == req.getElementType()) {
			return null;
		}
		if (FashionElementTypes.BrandDesigners_4006 == req.getElementType()) {
			return null;
		}
		if (FashionElementTypes.AdvertisingCampaignBrand_4007 == req
				.getElementType()) {
			return getGEFWrapper(new AdvertisingCampaignBrandCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.SingleBrandEventBrand_4009 == req
				.getElementType()) {
			return getGEFWrapper(new SingleBrandEventBrandCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.ProductLineBrand_4010 == req.getElementType()) {
			return getGEFWrapper(new ProductLineBrandCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.DesignerBrand_4015 == req.getElementType()) {
			return getGEFWrapper(new DesignerBrandCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case FashionElementStylesEditPart.VISUAL_ID:
			return getGEFWrapper(new FashionElementStylesReorientCommand(req));
		case NewsReportElementsEditPart.VISUAL_ID:
			return getGEFWrapper(new NewsReportElementsReorientCommand(req));
		case FashionStyleElementsEditPart.VISUAL_ID:
			return getGEFWrapper(new FashionStyleElementsReorientCommand(req));
		case BrandCampaignsEditPart.VISUAL_ID:
			return getGEFWrapper(new BrandCampaignsReorientCommand(req));
		case BrandProductLinesEditPart.VISUAL_ID:
			return getGEFWrapper(new BrandProductLinesReorientCommand(req));
		case BrandDesignersEditPart.VISUAL_ID:
			return getGEFWrapper(new BrandDesignersReorientCommand(req));
		case AdvertisingCampaignBrandEditPart.VISUAL_ID:
			return getGEFWrapper(new AdvertisingCampaignBrandReorientCommand(
					req));
		case SingleBrandEventBrandEditPart.VISUAL_ID:
			return getGEFWrapper(new SingleBrandEventBrandReorientCommand(req));
		case ProductLineBrandEditPart.VISUAL_ID:
			return getGEFWrapper(new ProductLineBrandReorientCommand(req));
		case DesignerBrandEditPart.VISUAL_ID:
			return getGEFWrapper(new DesignerBrandReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
