/*
 * 
 */
package fashion.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import fashion.AdvertisingCampaign;
import fashion.Brand;
import fashion.Designer;
import fashion.Event;
import fashion.FashionElement;
import fashion.FashionStyle;
import fashion.NewsReport;
import fashion.Product;
import fashion.ProductLine;
import fashion.Review;
import fashion.Reviewer;
import fashion.Role;
import fashion.SingleBrandEvent;
import fashion.diagram.part.FashionDiagramEditorPlugin;
import fashion.diagram.part.FashionVisualIDRegistry;
import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class FashionBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected FashionBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						FashionVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = FashionElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = FashionDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			FashionDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateFashionElementStyles_4001(
				FashionElement source, FashionStyle target) {
			if (source != null) {
				if (source.getStyles().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getElements().contains(target))) {
				return false;
			}

			return canExistFashionElementStyles_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNewsReportElements_4002(NewsReport source,
				FashionElement target) {
			if (source != null) {
				if (source.getElements().contains(target)) {
					return false;
				}
			}

			return canExistNewsReportElements_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateFashionStyleElements_4003(FashionStyle source,
				FashionElement target) {
			if (source != null) {
				if (source.getElements().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getStyles().contains(target))) {
				return false;
			}

			return canExistFashionStyleElements_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBrandCampaigns_4004(Brand source,
				AdvertisingCampaign target) {
			if (source != null) {
				if (source.getCampaigns().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getBrand() != null)) {
				return false;
			}

			return canExistBrandCampaigns_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBrandProductLines_4005(Brand source,
				ProductLine target) {
			if (source != null) {
				if (source.getProductLines().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getBrand() != null)) {
				return false;
			}

			return canExistBrandProductLines_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBrandDesigners_4006(Brand source,
				Designer target) {
			if (source != null) {
				if (source.getDesigners().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getBrand() != null)) {
				return false;
			}

			return canExistBrandDesigners_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAdvertisingCampaignBrand_4007(
				AdvertisingCampaign source, Brand target) {
			if (source != null) {
				if (source.getBrand() != null) {
					return false;
				}
			}
			if (target != null && (target.getCampaigns().contains(target))) {
				return false;
			}

			return canExistAdvertisingCampaignBrand_4007(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEventRoles_4008(Event source, Role target) {
			if (source != null) {
				if (source.getRoles().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getEvents().contains(target))) {
				return false;
			}

			return canExistEventRoles_4008(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSingleBrandEventBrand_4009(
				SingleBrandEvent source, Brand target) {
			if (source != null) {
				if (source.getBrand() != null) {
					return false;
				}
			}

			return canExistSingleBrandEventBrand_4009(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateProductLineBrand_4010(ProductLine source,
				Brand target) {
			if (source != null) {
				if (source.getBrand() != null) {
					return false;
				}
			}
			if (target != null && (target.getProductLines().contains(target))) {
				return false;
			}

			return canExistProductLineBrand_4010(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateProductReviews_4011(Product source,
				Review target) {
			if (source != null) {
				if (source.getReviews().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getProduct() != null)) {
				return false;
			}

			return canExistProductReviews_4011(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateReviewProduct_4012(Review source, Product target) {
			if (source != null) {
				if (source.getProduct() != null) {
					return false;
				}
			}
			if (target != null && (target.getReviews().contains(target))) {
				return false;
			}

			return canExistReviewProduct_4012(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateReviewReviewer_4013(Review source,
				Reviewer target) {
			if (source != null) {
				if (source.getReviewer() != null) {
					return false;
				}
			}
			if (target != null && (target.getReviews().contains(target))) {
				return false;
			}

			return canExistReviewReviewer_4013(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRoleEvents_4014(Role source, Event target) {
			if (source != null) {
				if (source.getEvents().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getRoles().contains(target))) {
				return false;
			}

			return canExistRoleEvents_4014(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDesignerBrand_4015(Designer source, Brand target) {
			if (source != null) {
				if (source.getBrand() != null) {
					return false;
				}
			}
			if (target != null && (target.getDesigners().contains(target))) {
				return false;
			}

			return canExistDesignerBrand_4015(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateReviewerReviews_4016(Reviewer source,
				Review target) {
			if (source != null) {
				if (source.getReviews().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getReviewer() != null)) {
				return false;
			}

			return canExistReviewerReviews_4016(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistFashionElementStyles_4001(FashionElement source,
				FashionStyle target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNewsReportElements_4002(NewsReport source,
				FashionElement target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistFashionStyleElements_4003(FashionStyle source,
				FashionElement target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistBrandCampaigns_4004(Brand source,
				AdvertisingCampaign target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistBrandProductLines_4005(Brand source,
				ProductLine target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistBrandDesigners_4006(Brand source, Designer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAdvertisingCampaignBrand_4007(
				AdvertisingCampaign source, Brand target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistEventRoles_4008(Event source, Role target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSingleBrandEventBrand_4009(
				SingleBrandEvent source, Brand target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistProductLineBrand_4010(ProductLine source,
				Brand target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistProductReviews_4011(Product source, Review target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistReviewProduct_4012(Review source, Product target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistReviewReviewer_4013(Review source,
				Reviewer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRoleEvents_4014(Role source, Event target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistDesignerBrand_4015(Designer source, Brand target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistReviewerReviews_4016(Reviewer source,
				Review target) {
			return true;
		}
	}

}
