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

import fashion.diagram.edit.commands.BrandDesignersCreateCommand;
import fashion.diagram.edit.commands.BrandDesignersReorientCommand;
import fashion.diagram.edit.commands.DesignerBrandCreateCommand;
import fashion.diagram.edit.commands.DesignerBrandReorientCommand;
import fashion.diagram.edit.commands.EventRolesCreateCommand;
import fashion.diagram.edit.commands.EventRolesReorientCommand;
import fashion.diagram.edit.commands.FashionElementStylesCreateCommand;
import fashion.diagram.edit.commands.FashionElementStylesReorientCommand;
import fashion.diagram.edit.commands.FashionStyleElementsCreateCommand;
import fashion.diagram.edit.commands.FashionStyleElementsReorientCommand;
import fashion.diagram.edit.commands.NewsReportElementsCreateCommand;
import fashion.diagram.edit.commands.NewsReportElementsReorientCommand;
import fashion.diagram.edit.commands.RoleEventsCreateCommand;
import fashion.diagram.edit.commands.RoleEventsReorientCommand;
import fashion.diagram.edit.parts.ArticleEditPart;
import fashion.diagram.edit.parts.BrandDesignersEditPart;
import fashion.diagram.edit.parts.DesignerBrandEditPart;
import fashion.diagram.edit.parts.DesignerDesignerReportsCompartmentEditPart;
import fashion.diagram.edit.parts.EventRolesEditPart;
import fashion.diagram.edit.parts.FashionElementStylesEditPart;
import fashion.diagram.edit.parts.FashionStyleElementsEditPart;
import fashion.diagram.edit.parts.NewsReportElementsEditPart;
import fashion.diagram.edit.parts.RoleEventsEditPart;
import fashion.diagram.edit.parts.TVProgramEditPart;
import fashion.diagram.part.FashionVisualIDRegistry;
import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class DesignerItemSemanticEditPolicy extends
		FashionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DesignerItemSemanticEditPolicy() {
		super(FashionElementTypes.Designer_2012);
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
			if (FashionVisualIDRegistry.getVisualID(incomingLink) == BrandDesignersEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (FashionVisualIDRegistry.getVisualID(incomingLink) == EventRolesEditPart.VISUAL_ID) {
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
			if (FashionVisualIDRegistry.getVisualID(outgoingLink) == RoleEventsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (FashionVisualIDRegistry.getVisualID(outgoingLink) == DesignerBrandEditPart.VISUAL_ID) {
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
			case DesignerDesignerReportsCompartmentEditPart.VISUAL_ID:
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
		if (FashionElementTypes.BrandDesigners_4006 == req.getElementType()) {
			return null;
		}
		if (FashionElementTypes.EventRoles_4008 == req.getElementType()) {
			return null;
		}
		if (FashionElementTypes.RoleEvents_4014 == req.getElementType()) {
			return getGEFWrapper(new RoleEventsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.DesignerBrand_4015 == req.getElementType()) {
			return getGEFWrapper(new DesignerBrandCreateCommand(req,
					req.getSource(), req.getTarget()));
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
		if (FashionElementTypes.BrandDesigners_4006 == req.getElementType()) {
			return getGEFWrapper(new BrandDesignersCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.EventRoles_4008 == req.getElementType()) {
			return getGEFWrapper(new EventRolesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (FashionElementTypes.RoleEvents_4014 == req.getElementType()) {
			return null;
		}
		if (FashionElementTypes.DesignerBrand_4015 == req.getElementType()) {
			return null;
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
		case BrandDesignersEditPart.VISUAL_ID:
			return getGEFWrapper(new BrandDesignersReorientCommand(req));
		case EventRolesEditPart.VISUAL_ID:
			return getGEFWrapper(new EventRolesReorientCommand(req));
		case RoleEventsEditPart.VISUAL_ID:
			return getGEFWrapper(new RoleEventsReorientCommand(req));
		case DesignerBrandEditPart.VISUAL_ID:
			return getGEFWrapper(new DesignerBrandReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
