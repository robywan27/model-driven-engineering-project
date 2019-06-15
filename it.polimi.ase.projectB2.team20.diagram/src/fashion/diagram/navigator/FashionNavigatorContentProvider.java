/*
 * 
 */
package fashion.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import fashion.diagram.edit.parts.AdvertisingCampaignAdvertisingCampaignProductsCompartmentEditPart;
import fashion.diagram.edit.parts.AdvertisingCampaignAdvertisingCampaignReportsCompartmentEditPart;
import fashion.diagram.edit.parts.AdvertisingCampaignBrandEditPart;
import fashion.diagram.edit.parts.AdvertisingCampaignEditPart;
import fashion.diagram.edit.parts.AdvertisingProduct2EditPart;
import fashion.diagram.edit.parts.AdvertisingProductAdvertisingProductReportsCompartment2EditPart;
import fashion.diagram.edit.parts.AdvertisingProductAdvertisingProductReportsCompartmentEditPart;
import fashion.diagram.edit.parts.AdvertisingProductEditPart;
import fashion.diagram.edit.parts.ArticleEditPart;
import fashion.diagram.edit.parts.BloggerBloggerReportsCompartmentEditPart;
import fashion.diagram.edit.parts.BloggerEditPart;
import fashion.diagram.edit.parts.BrandCampaignsEditPart;
import fashion.diagram.edit.parts.BrandDesignersEditPart;
import fashion.diagram.edit.parts.BrandProductLinesEditPart;
import fashion.diagram.edit.parts.ChoreographerChoreographerReportsCompartmentEditPart;
import fashion.diagram.edit.parts.ChoreographerEditPart;
import fashion.diagram.edit.parts.CommentCommentReportsCompartmentEditPart;
import fashion.diagram.edit.parts.CommentEditPart;
import fashion.diagram.edit.parts.CriticCriticReportsCompartmentEditPart;
import fashion.diagram.edit.parts.CriticEditPart;
import fashion.diagram.edit.parts.DescriptionDescriptionReportsCompartmentEditPart;
import fashion.diagram.edit.parts.DescriptionEditPart;
import fashion.diagram.edit.parts.DesignerBrandEditPart;
import fashion.diagram.edit.parts.DesignerDesignerReportsCompartmentEditPart;
import fashion.diagram.edit.parts.DesignerEditPart;
import fashion.diagram.edit.parts.EmergingBrandEditPart;
import fashion.diagram.edit.parts.EmergingBrandEmergingBrandReportsCompartmentEditPart;
import fashion.diagram.edit.parts.EventRolesEditPart;
import fashion.diagram.edit.parts.FamousBrandEditPart;
import fashion.diagram.edit.parts.FamousBrandFamousBrandReportsCompartmentEditPart;
import fashion.diagram.edit.parts.FashionDomainEditPart;
import fashion.diagram.edit.parts.FashionElementStylesEditPart;
import fashion.diagram.edit.parts.FashionStyleEditPart;
import fashion.diagram.edit.parts.FashionStyleElementsEditPart;
import fashion.diagram.edit.parts.FashionStyleFashionStyleDescriptorsCompartmentEditPart;
import fashion.diagram.edit.parts.InfluencerEditPart;
import fashion.diagram.edit.parts.InfluencerInfluencerReportsCompartmentEditPart;
import fashion.diagram.edit.parts.LocalBrandEditPart;
import fashion.diagram.edit.parts.LocalBrandLocalBrandReportsCompartmentEditPart;
import fashion.diagram.edit.parts.MacroEventEditPart;
import fashion.diagram.edit.parts.MacroEventMacroEventReportsCompartmentEditPart;
import fashion.diagram.edit.parts.MacroEventMacroEventSingleBrandEventsCompartmentEditPart;
import fashion.diagram.edit.parts.ModelEditPart;
import fashion.diagram.edit.parts.ModelModelReportsCompartmentEditPart;
import fashion.diagram.edit.parts.NewsReportElementsEditPart;
import fashion.diagram.edit.parts.PhotoEditPart;
import fashion.diagram.edit.parts.PhotoPhotoReportsCompartmentEditPart;
import fashion.diagram.edit.parts.PhotographerEditPart;
import fashion.diagram.edit.parts.PhotographerPhotographerReportsCompartmentEditPart;
import fashion.diagram.edit.parts.PresenterEditPart;
import fashion.diagram.edit.parts.PresenterPresenterReportsCompartmentEditPart;
import fashion.diagram.edit.parts.Product2EditPart;
import fashion.diagram.edit.parts.ProductEditPart;
import fashion.diagram.edit.parts.ProductLineBrandEditPart;
import fashion.diagram.edit.parts.ProductLineEditPart;
import fashion.diagram.edit.parts.ProductLineProductLineProductStylesCompartmentEditPart;
import fashion.diagram.edit.parts.ProductLineProductLineProductsCompartmentEditPart;
import fashion.diagram.edit.parts.ProductLineProductLineReportsCompartmentEditPart;
import fashion.diagram.edit.parts.ProductProductReportsCompartment2EditPart;
import fashion.diagram.edit.parts.ProductProductReportsCompartmentEditPart;
import fashion.diagram.edit.parts.ProductReviewsEditPart;
import fashion.diagram.edit.parts.ProductStyle2EditPart;
import fashion.diagram.edit.parts.ProductStyleEditPart;
import fashion.diagram.edit.parts.ProductStyleProductStyleReportsCompartment2EditPart;
import fashion.diagram.edit.parts.ProductStyleProductStyleReportsCompartmentEditPart;
import fashion.diagram.edit.parts.ReviewProductEditPart;
import fashion.diagram.edit.parts.ReviewReviewerEditPart;
import fashion.diagram.edit.parts.ReviewerReviewsEditPart;
import fashion.diagram.edit.parts.RoleEventsEditPart;
import fashion.diagram.edit.parts.SingleBrandEvent2EditPart;
import fashion.diagram.edit.parts.SingleBrandEventBrandEditPart;
import fashion.diagram.edit.parts.SingleBrandEventEditPart;
import fashion.diagram.edit.parts.SingleBrandEventSingleBrandEventReportsCompartment2EditPart;
import fashion.diagram.edit.parts.SingleBrandEventSingleBrandEventReportsCompartmentEditPart;
import fashion.diagram.edit.parts.SpatioTemporalDescriptorEditPart;
import fashion.diagram.edit.parts.TVProgramEditPart;
import fashion.diagram.part.FashionVisualIDRegistry;
import fashion.diagram.part.Messages;

/**
 * @generated
 */
public class FashionNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public FashionNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<FashionNavigatorItem> result = new ArrayList<FashionNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, FashionDomainEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof FashionNavigatorGroup) {
			FashionNavigatorGroup group = (FashionNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof FashionNavigatorItem) {
			FashionNavigatorItem navigatorItem = (FashionNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (FashionVisualIDRegistry.getVisualID(view)) {

		case FashionDomainEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			FashionNavigatorGroup links = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_FashionDomain_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(BloggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CriticEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(InfluencerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(MacroEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(PhotoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DescriptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CommentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(DesignerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PresenterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ChoreographerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PhotographerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingProductEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductStyleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ProductEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandCampaignsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandProductLinesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandDesignersEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignBrandEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventBrandEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineBrandEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductReviewsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewProductEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewReviewerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DesignerBrandEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewerReviewsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case BloggerEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Blogger_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Blogger_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BloggerBloggerReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BloggerBloggerReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewReviewerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewerReviewsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CriticEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Critic_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Critic_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(CriticCriticReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(CriticCriticReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewReviewerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewerReviewsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case InfluencerEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Influencer_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Influencer_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(InfluencerInfluencerReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(InfluencerInfluencerReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewReviewerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewerReviewsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case FamousBrandEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_FamousBrand_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_FamousBrand_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandFamousBrandReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandFamousBrandReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandCampaignsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandProductLinesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandDesignersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DesignerBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case EmergingBrandEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_EmergingBrand_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_EmergingBrand_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEmergingBrandReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEmergingBrandReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandCampaignsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandProductLinesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandDesignersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DesignerBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case LocalBrandEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_LocalBrand_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_LocalBrand_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandLocalBrandReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandLocalBrandReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandCampaignsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandProductLinesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandDesignersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DesignerBrandEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case MacroEventEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_MacroEvent_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_MacroEvent_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(MacroEventMacroEventSingleBrandEventsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(SingleBrandEvent2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(MacroEventMacroEventReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(MacroEventMacroEventReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SingleBrandEventEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_SingleBrandEvent_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_SingleBrandEvent_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventSingleBrandEventReportsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventSingleBrandEventReportsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventBrandEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PhotoEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Photo_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Photo_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PhotoPhotoReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PhotoPhotoReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductReviewsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewProductEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewReviewerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewerReviewsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DescriptionEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Description_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Description_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DescriptionDescriptionReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DescriptionDescriptionReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductReviewsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewProductEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewReviewerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewerReviewsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case CommentEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Comment_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Comment_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(CommentCommentReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(CommentCommentReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductReviewsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewProductEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewReviewerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewerReviewsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case DesignerEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Designer_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Designer_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DesignerDesignerReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DesignerDesignerReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandDesignersEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DesignerBrandEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ModelEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Model_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Model_2013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ModelModelReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ModelModelReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PresenterEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Presenter_2014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Presenter_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PresenterPresenterReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PresenterPresenterReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ChoreographerEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Choreographer_2015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Choreographer_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ChoreographerChoreographerReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ChoreographerChoreographerReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PhotographerEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Photographer_2016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Photographer_2016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PhotographerPhotographerReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PhotographerPhotographerReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case AdvertisingCampaignEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_AdvertisingCampaign_2017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_AdvertisingCampaign_2017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignAdvertisingCampaignReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignAdvertisingCampaignReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignAdvertisingCampaignProductsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(AdvertisingProduct2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandCampaignsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignBrandEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ProductLineEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ProductLine_2018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ProductLine_2018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineProductLineReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineProductLineReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineProductLineProductStylesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(ProductStyle2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineProductLineProductsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(Product2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(BrandProductLinesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineBrandEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ProductStyleEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ProductStyle_2019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ProductStyle_2019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductStyleProductStyleReportsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductStyleProductStyleReportsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ProductEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Product_2020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Product_2020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductProductReportsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductProductReportsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductReviewsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewProductEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case FashionStyleEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_FashionStyle_2021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_FashionStyle_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleFashionStyleDescriptorsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					FashionVisualIDRegistry
							.getType(SpatioTemporalDescriptorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AdvertisingProductEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_AdvertisingProduct_2022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_AdvertisingProduct_2022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingProductAdvertisingProductReportsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingProductAdvertisingProductReportsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ArticleEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Article_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TVProgramEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_TVProgram_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AdvertisingProduct2EditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_AdvertisingProduct_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_AdvertisingProduct_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingProductAdvertisingProductReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingProductAdvertisingProductReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SingleBrandEvent2EditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_SingleBrandEvent_3005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_SingleBrandEvent_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventSingleBrandEventReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventSingleBrandEventReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EventRolesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventBrandEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(RoleEventsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ProductStyle2EditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ProductStyle_3006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ProductStyle_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductStyleProductStyleReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductStyleProductStyleReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Product2EditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Node sv = (Node) view;
			FashionNavigatorGroup outgoinglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Product_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup incominglinks = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_Product_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductProductReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductProductReportsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionElementStylesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(NewsReportElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleElementsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductReviewsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ReviewProductEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case FashionElementStylesEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_FashionElementStyles_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_FashionElementStyles_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(BloggerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CriticEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(InfluencerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(MacroEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(PhotoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DescriptionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CommentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(DesignerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PresenterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ChoreographerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PhotographerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingProductEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductStyleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ProductEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingProduct2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductStyle2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(Product2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case NewsReportElementsEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_NewsReportElements_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_NewsReportElements_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(BloggerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CriticEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(InfluencerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(MacroEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(PhotoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DescriptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CommentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(DesignerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PresenterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ChoreographerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PhotographerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingProductEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductStyleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ProductEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingProduct2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductStyle2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(Product2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ArticleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(TVProgramEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case FashionStyleElementsEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_FashionStyleElements_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_FashionStyleElements_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(BloggerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CriticEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(InfluencerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(MacroEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(PhotoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DescriptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CommentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(DesignerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PresenterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ChoreographerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PhotographerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingProductEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductStyleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ProductEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingProduct2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductStyle2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(Product2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FashionStyleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BrandCampaignsEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_BrandCampaigns_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_BrandCampaigns_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BrandProductLinesEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_BrandProductLines_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_BrandProductLines_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case BrandDesignersEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_BrandDesigners_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_BrandDesigners_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(DesignerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case AdvertisingCampaignBrandEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_AdvertisingCampaignBrand_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_AdvertisingCampaignBrand_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(AdvertisingCampaignEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EventRolesEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_EventRoles_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_EventRoles_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(BloggerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CriticEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(InfluencerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(DesignerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PresenterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ChoreographerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PhotographerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(MacroEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SingleBrandEventBrandEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_SingleBrandEventBrand_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_SingleBrandEventBrand_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEvent2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ProductLineBrandEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ProductLineBrand_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ProductLineBrand_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ProductLineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ProductReviewsEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ProductReviews_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ProductReviews_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(PhotoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DescriptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CommentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ProductEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(Product2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ReviewProductEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ReviewProduct_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ReviewProduct_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ProductEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(Product2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(PhotoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DescriptionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CommentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ReviewReviewerEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ReviewReviewer_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ReviewReviewer_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(BloggerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CriticEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(InfluencerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(PhotoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DescriptionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CommentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RoleEventsEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_RoleEvents_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_RoleEvents_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(MacroEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(SingleBrandEvent2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(BloggerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CriticEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(InfluencerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(DesignerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(ModelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PresenterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(ChoreographerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(PhotographerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DesignerBrandEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_DesignerBrand_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_DesignerBrand_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(FamousBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(EmergingBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(LocalBrandEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(DesignerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ReviewerReviewsEditPart.VISUAL_ID: {
			LinkedList<FashionAbstractNavigatorItem> result = new LinkedList<FashionAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			FashionNavigatorGroup target = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ReviewerReviews_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			FashionNavigatorGroup source = new FashionNavigatorGroup(
					Messages.NavigatorGroupName_ReviewerReviews_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(PhotoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(DescriptionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CommentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(BloggerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry.getType(CriticEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					FashionVisualIDRegistry
							.getType(InfluencerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return FashionDomainEditPart.MODEL_ID.equals(FashionVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<FashionNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<FashionNavigatorItem> result = new ArrayList<FashionNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new FashionNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<FashionNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof FashionAbstractNavigatorItem) {
			FashionAbstractNavigatorItem abstractNavigatorItem = (FashionAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
