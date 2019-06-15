/*
 * 
 */
package fashion.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import fashion.AdvertisingCampaign;
import fashion.AdvertisingProduct;
import fashion.Article;
import fashion.Blogger;
import fashion.Brand;
import fashion.Choreographer;
import fashion.Comment;
import fashion.Critic;
import fashion.Description;
import fashion.Designer;
import fashion.EmergingBrand;
import fashion.Event;
import fashion.FamousBrand;
import fashion.FashionDomain;
import fashion.FashionElement;
import fashion.FashionPackage;
import fashion.FashionStyle;
import fashion.Influencer;
import fashion.LocalBrand;
import fashion.MacroEvent;
import fashion.Model;
import fashion.NewsReport;
import fashion.Photo;
import fashion.Photographer;
import fashion.Presenter;
import fashion.Product;
import fashion.ProductLine;
import fashion.ProductStyle;
import fashion.Review;
import fashion.Reviewer;
import fashion.Role;
import fashion.SingleBrandEvent;
import fashion.SpatioTemporalDescriptor;
import fashion.TVProgram;
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
import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class FashionDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getSemanticChildren(View view) {
		switch (FashionVisualIDRegistry.getVisualID(view)) {
		case FashionDomainEditPart.VISUAL_ID:
			return getFashionDomain_1000SemanticChildren(view);
		case BloggerBloggerReportsCompartmentEditPart.VISUAL_ID:
			return getBloggerBloggerReportsCompartment_7001SemanticChildren(view);
		case CriticCriticReportsCompartmentEditPart.VISUAL_ID:
			return getCriticCriticReportsCompartment_7002SemanticChildren(view);
		case InfluencerInfluencerReportsCompartmentEditPart.VISUAL_ID:
			return getInfluencerInfluencerReportsCompartment_7003SemanticChildren(view);
		case FamousBrandFamousBrandReportsCompartmentEditPart.VISUAL_ID:
			return getFamousBrandFamousBrandReportsCompartment_7004SemanticChildren(view);
		case EmergingBrandEmergingBrandReportsCompartmentEditPart.VISUAL_ID:
			return getEmergingBrandEmergingBrandReportsCompartment_7005SemanticChildren(view);
		case LocalBrandLocalBrandReportsCompartmentEditPart.VISUAL_ID:
			return getLocalBrandLocalBrandReportsCompartment_7006SemanticChildren(view);
		case MacroEventMacroEventReportsCompartmentEditPart.VISUAL_ID:
			return getMacroEventMacroEventReportsCompartment_7007SemanticChildren(view);
		case MacroEventMacroEventSingleBrandEventsCompartmentEditPart.VISUAL_ID:
			return getMacroEventMacroEventSingleBrandEventsCompartment_7023SemanticChildren(view);
		case SingleBrandEventSingleBrandEventReportsCompartmentEditPart.VISUAL_ID:
			return getSingleBrandEventSingleBrandEventReportsCompartment_7024SemanticChildren(view);
		case SingleBrandEventSingleBrandEventReportsCompartment2EditPart.VISUAL_ID:
			return getSingleBrandEventSingleBrandEventReportsCompartment_7008SemanticChildren(view);
		case PhotoPhotoReportsCompartmentEditPart.VISUAL_ID:
			return getPhotoPhotoReportsCompartment_7009SemanticChildren(view);
		case DescriptionDescriptionReportsCompartmentEditPart.VISUAL_ID:
			return getDescriptionDescriptionReportsCompartment_7010SemanticChildren(view);
		case CommentCommentReportsCompartmentEditPart.VISUAL_ID:
			return getCommentCommentReportsCompartment_7011SemanticChildren(view);
		case DesignerDesignerReportsCompartmentEditPart.VISUAL_ID:
			return getDesignerDesignerReportsCompartment_7012SemanticChildren(view);
		case ModelModelReportsCompartmentEditPart.VISUAL_ID:
			return getModelModelReportsCompartment_7013SemanticChildren(view);
		case PresenterPresenterReportsCompartmentEditPart.VISUAL_ID:
			return getPresenterPresenterReportsCompartment_7014SemanticChildren(view);
		case ChoreographerChoreographerReportsCompartmentEditPart.VISUAL_ID:
			return getChoreographerChoreographerReportsCompartment_7015SemanticChildren(view);
		case PhotographerPhotographerReportsCompartmentEditPart.VISUAL_ID:
			return getPhotographerPhotographerReportsCompartment_7016SemanticChildren(view);
		case AdvertisingCampaignAdvertisingCampaignReportsCompartmentEditPart.VISUAL_ID:
			return getAdvertisingCampaignAdvertisingCampaignReportsCompartment_7017SemanticChildren(view);
		case AdvertisingCampaignAdvertisingCampaignProductsCompartmentEditPart.VISUAL_ID:
			return getAdvertisingCampaignAdvertisingCampaignProductsCompartment_7022SemanticChildren(view);
		case AdvertisingProductAdvertisingProductReportsCompartmentEditPart.VISUAL_ID:
			return getAdvertisingProductAdvertisingProductReportsCompartment_7025SemanticChildren(view);
		case AdvertisingProductAdvertisingProductReportsCompartment2EditPart.VISUAL_ID:
			return getAdvertisingProductAdvertisingProductReportsCompartment_7026SemanticChildren(view);
		case ProductLineProductLineReportsCompartmentEditPart.VISUAL_ID:
			return getProductLineProductLineReportsCompartment_7018SemanticChildren(view);
		case ProductLineProductLineProductStylesCompartmentEditPart.VISUAL_ID:
			return getProductLineProductLineProductStylesCompartment_7027SemanticChildren(view);
		case ProductLineProductLineProductsCompartmentEditPart.VISUAL_ID:
			return getProductLineProductLineProductsCompartment_7028SemanticChildren(view);
		case ProductStyleProductStyleReportsCompartmentEditPart.VISUAL_ID:
			return getProductStyleProductStyleReportsCompartment_7029SemanticChildren(view);
		case ProductProductReportsCompartmentEditPart.VISUAL_ID:
			return getProductProductReportsCompartment_7030SemanticChildren(view);
		case ProductStyleProductStyleReportsCompartment2EditPart.VISUAL_ID:
			return getProductStyleProductStyleReportsCompartment_7019SemanticChildren(view);
		case ProductProductReportsCompartment2EditPart.VISUAL_ID:
			return getProductProductReportsCompartment_7020SemanticChildren(view);
		case FashionStyleFashionStyleDescriptorsCompartmentEditPart.VISUAL_ID:
			return getFashionStyleFashionStyleDescriptorsCompartment_7021SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getFashionDomain_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		FashionDomain modelElement = (FashionDomain) view.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			FashionElement childElement = (FashionElement) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == BloggerEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CriticEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InfluencerEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FamousBrandEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EmergingBrandEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LocalBrandEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MacroEventEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleBrandEventEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PhotoEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DescriptionEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CommentEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DesignerEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ModelEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PresenterEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ChoreographerEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PhotographerEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdvertisingCampaignEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AdvertisingProductEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProductLineEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProductStyleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ProductEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStyles().iterator(); it.hasNext();) {
			FashionStyle childElement = (FashionStyle) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == FashionStyleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getBloggerBloggerReportsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Blogger modelElement = (Blogger) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getCriticCriticReportsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Critic modelElement = (Critic) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getInfluencerInfluencerReportsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Influencer modelElement = (Influencer) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getFamousBrandFamousBrandReportsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		FamousBrand modelElement = (FamousBrand) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getEmergingBrandEmergingBrandReportsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		EmergingBrand modelElement = (EmergingBrand) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getLocalBrandLocalBrandReportsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		LocalBrand modelElement = (LocalBrand) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getMacroEventMacroEventReportsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MacroEvent modelElement = (MacroEvent) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getMacroEventMacroEventSingleBrandEventsCompartment_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MacroEvent modelElement = (MacroEvent) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleBrandEvents().iterator(); it
				.hasNext();) {
			SingleBrandEvent childElement = (SingleBrandEvent) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleBrandEvent2EditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getSingleBrandEventSingleBrandEventReportsCompartment_7024SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleBrandEvent modelElement = (SingleBrandEvent) containerView
				.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getSingleBrandEventSingleBrandEventReportsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleBrandEvent modelElement = (SingleBrandEvent) containerView
				.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getPhotoPhotoReportsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Photo modelElement = (Photo) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getDescriptionDescriptionReportsCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Description modelElement = (Description) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getCommentCommentReportsCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Comment modelElement = (Comment) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getDesignerDesignerReportsCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Designer modelElement = (Designer) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getModelModelReportsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Model modelElement = (Model) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getPresenterPresenterReportsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Presenter modelElement = (Presenter) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getChoreographerChoreographerReportsCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Choreographer modelElement = (Choreographer) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getPhotographerPhotographerReportsCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Photographer modelElement = (Photographer) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getAdvertisingCampaignAdvertisingCampaignReportsCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdvertisingCampaign modelElement = (AdvertisingCampaign) containerView
				.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getAdvertisingCampaignAdvertisingCampaignProductsCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdvertisingCampaign modelElement = (AdvertisingCampaign) containerView
				.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProducts().iterator(); it
				.hasNext();) {
			AdvertisingProduct childElement = (AdvertisingProduct) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AdvertisingProduct2EditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getAdvertisingProductAdvertisingProductReportsCompartment_7025SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdvertisingProduct modelElement = (AdvertisingProduct) containerView
				.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getAdvertisingProductAdvertisingProductReportsCompartment_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AdvertisingProduct modelElement = (AdvertisingProduct) containerView
				.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getProductLineProductLineReportsCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ProductLine modelElement = (ProductLine) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getProductLineProductLineProductStylesCompartment_7027SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ProductLine modelElement = (ProductLine) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProductStyles().iterator(); it
				.hasNext();) {
			ProductStyle childElement = (ProductStyle) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProductStyle2EditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getProductLineProductLineProductsCompartment_7028SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ProductLine modelElement = (ProductLine) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProducts().iterator(); it
				.hasNext();) {
			Product childElement = (Product) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Product2EditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getProductStyleProductStyleReportsCompartment_7029SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ProductStyle modelElement = (ProductStyle) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getProductProductReportsCompartment_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Product modelElement = (Product) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getProductStyleProductStyleReportsCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ProductStyle modelElement = (ProductStyle) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getProductProductReportsCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Product modelElement = (Product) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getReports().iterator(); it
				.hasNext();) {
			NewsReport childElement = (NewsReport) it.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArticleEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TVProgramEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionNodeDescriptor> getFashionStyleFashionStyleDescriptorsCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		FashionStyle modelElement = (FashionStyle) containerView.getElement();
		LinkedList<FashionNodeDescriptor> result = new LinkedList<FashionNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDescriptors().iterator(); it
				.hasNext();) {
			SpatioTemporalDescriptor childElement = (SpatioTemporalDescriptor) it
					.next();
			int visualID = FashionVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SpatioTemporalDescriptorEditPart.VISUAL_ID) {
				result.add(new FashionNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getContainedLinks(View view) {
		switch (FashionVisualIDRegistry.getVisualID(view)) {
		case FashionDomainEditPart.VISUAL_ID:
			return getFashionDomain_1000ContainedLinks(view);
		case BloggerEditPart.VISUAL_ID:
			return getBlogger_2001ContainedLinks(view);
		case CriticEditPart.VISUAL_ID:
			return getCritic_2002ContainedLinks(view);
		case InfluencerEditPart.VISUAL_ID:
			return getInfluencer_2003ContainedLinks(view);
		case FamousBrandEditPart.VISUAL_ID:
			return getFamousBrand_2004ContainedLinks(view);
		case EmergingBrandEditPart.VISUAL_ID:
			return getEmergingBrand_2005ContainedLinks(view);
		case LocalBrandEditPart.VISUAL_ID:
			return getLocalBrand_2006ContainedLinks(view);
		case MacroEventEditPart.VISUAL_ID:
			return getMacroEvent_2007ContainedLinks(view);
		case SingleBrandEventEditPart.VISUAL_ID:
			return getSingleBrandEvent_2008ContainedLinks(view);
		case PhotoEditPart.VISUAL_ID:
			return getPhoto_2009ContainedLinks(view);
		case DescriptionEditPart.VISUAL_ID:
			return getDescription_2010ContainedLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2011ContainedLinks(view);
		case DesignerEditPart.VISUAL_ID:
			return getDesigner_2012ContainedLinks(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2013ContainedLinks(view);
		case PresenterEditPart.VISUAL_ID:
			return getPresenter_2014ContainedLinks(view);
		case ChoreographerEditPart.VISUAL_ID:
			return getChoreographer_2015ContainedLinks(view);
		case PhotographerEditPart.VISUAL_ID:
			return getPhotographer_2016ContainedLinks(view);
		case AdvertisingCampaignEditPart.VISUAL_ID:
			return getAdvertisingCampaign_2017ContainedLinks(view);
		case AdvertisingProductEditPart.VISUAL_ID:
			return getAdvertisingProduct_2022ContainedLinks(view);
		case ProductLineEditPart.VISUAL_ID:
			return getProductLine_2018ContainedLinks(view);
		case ProductStyleEditPart.VISUAL_ID:
			return getProductStyle_2019ContainedLinks(view);
		case ProductEditPart.VISUAL_ID:
			return getProduct_2020ContainedLinks(view);
		case FashionStyleEditPart.VISUAL_ID:
			return getFashionStyle_2021ContainedLinks(view);
		case ArticleEditPart.VISUAL_ID:
			return getArticle_3001ContainedLinks(view);
		case TVProgramEditPart.VISUAL_ID:
			return getTVProgram_3002ContainedLinks(view);
		case SingleBrandEvent2EditPart.VISUAL_ID:
			return getSingleBrandEvent_3005ContainedLinks(view);
		case AdvertisingProduct2EditPart.VISUAL_ID:
			return getAdvertisingProduct_3004ContainedLinks(view);
		case ProductStyle2EditPart.VISUAL_ID:
			return getProductStyle_3006ContainedLinks(view);
		case Product2EditPart.VISUAL_ID:
			return getProduct_3007ContainedLinks(view);
		case SpatioTemporalDescriptorEditPart.VISUAL_ID:
			return getSpatioTemporalDescriptor_3003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getIncomingLinks(View view) {
		switch (FashionVisualIDRegistry.getVisualID(view)) {
		case BloggerEditPart.VISUAL_ID:
			return getBlogger_2001IncomingLinks(view);
		case CriticEditPart.VISUAL_ID:
			return getCritic_2002IncomingLinks(view);
		case InfluencerEditPart.VISUAL_ID:
			return getInfluencer_2003IncomingLinks(view);
		case FamousBrandEditPart.VISUAL_ID:
			return getFamousBrand_2004IncomingLinks(view);
		case EmergingBrandEditPart.VISUAL_ID:
			return getEmergingBrand_2005IncomingLinks(view);
		case LocalBrandEditPart.VISUAL_ID:
			return getLocalBrand_2006IncomingLinks(view);
		case MacroEventEditPart.VISUAL_ID:
			return getMacroEvent_2007IncomingLinks(view);
		case SingleBrandEventEditPart.VISUAL_ID:
			return getSingleBrandEvent_2008IncomingLinks(view);
		case PhotoEditPart.VISUAL_ID:
			return getPhoto_2009IncomingLinks(view);
		case DescriptionEditPart.VISUAL_ID:
			return getDescription_2010IncomingLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2011IncomingLinks(view);
		case DesignerEditPart.VISUAL_ID:
			return getDesigner_2012IncomingLinks(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2013IncomingLinks(view);
		case PresenterEditPart.VISUAL_ID:
			return getPresenter_2014IncomingLinks(view);
		case ChoreographerEditPart.VISUAL_ID:
			return getChoreographer_2015IncomingLinks(view);
		case PhotographerEditPart.VISUAL_ID:
			return getPhotographer_2016IncomingLinks(view);
		case AdvertisingCampaignEditPart.VISUAL_ID:
			return getAdvertisingCampaign_2017IncomingLinks(view);
		case AdvertisingProductEditPart.VISUAL_ID:
			return getAdvertisingProduct_2022IncomingLinks(view);
		case ProductLineEditPart.VISUAL_ID:
			return getProductLine_2018IncomingLinks(view);
		case ProductStyleEditPart.VISUAL_ID:
			return getProductStyle_2019IncomingLinks(view);
		case ProductEditPart.VISUAL_ID:
			return getProduct_2020IncomingLinks(view);
		case FashionStyleEditPart.VISUAL_ID:
			return getFashionStyle_2021IncomingLinks(view);
		case ArticleEditPart.VISUAL_ID:
			return getArticle_3001IncomingLinks(view);
		case TVProgramEditPart.VISUAL_ID:
			return getTVProgram_3002IncomingLinks(view);
		case SingleBrandEvent2EditPart.VISUAL_ID:
			return getSingleBrandEvent_3005IncomingLinks(view);
		case AdvertisingProduct2EditPart.VISUAL_ID:
			return getAdvertisingProduct_3004IncomingLinks(view);
		case ProductStyle2EditPart.VISUAL_ID:
			return getProductStyle_3006IncomingLinks(view);
		case Product2EditPart.VISUAL_ID:
			return getProduct_3007IncomingLinks(view);
		case SpatioTemporalDescriptorEditPart.VISUAL_ID:
			return getSpatioTemporalDescriptor_3003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getOutgoingLinks(View view) {
		switch (FashionVisualIDRegistry.getVisualID(view)) {
		case BloggerEditPart.VISUAL_ID:
			return getBlogger_2001OutgoingLinks(view);
		case CriticEditPart.VISUAL_ID:
			return getCritic_2002OutgoingLinks(view);
		case InfluencerEditPart.VISUAL_ID:
			return getInfluencer_2003OutgoingLinks(view);
		case FamousBrandEditPart.VISUAL_ID:
			return getFamousBrand_2004OutgoingLinks(view);
		case EmergingBrandEditPart.VISUAL_ID:
			return getEmergingBrand_2005OutgoingLinks(view);
		case LocalBrandEditPart.VISUAL_ID:
			return getLocalBrand_2006OutgoingLinks(view);
		case MacroEventEditPart.VISUAL_ID:
			return getMacroEvent_2007OutgoingLinks(view);
		case SingleBrandEventEditPart.VISUAL_ID:
			return getSingleBrandEvent_2008OutgoingLinks(view);
		case PhotoEditPart.VISUAL_ID:
			return getPhoto_2009OutgoingLinks(view);
		case DescriptionEditPart.VISUAL_ID:
			return getDescription_2010OutgoingLinks(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2011OutgoingLinks(view);
		case DesignerEditPart.VISUAL_ID:
			return getDesigner_2012OutgoingLinks(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2013OutgoingLinks(view);
		case PresenterEditPart.VISUAL_ID:
			return getPresenter_2014OutgoingLinks(view);
		case ChoreographerEditPart.VISUAL_ID:
			return getChoreographer_2015OutgoingLinks(view);
		case PhotographerEditPart.VISUAL_ID:
			return getPhotographer_2016OutgoingLinks(view);
		case AdvertisingCampaignEditPart.VISUAL_ID:
			return getAdvertisingCampaign_2017OutgoingLinks(view);
		case AdvertisingProductEditPart.VISUAL_ID:
			return getAdvertisingProduct_2022OutgoingLinks(view);
		case ProductLineEditPart.VISUAL_ID:
			return getProductLine_2018OutgoingLinks(view);
		case ProductStyleEditPart.VISUAL_ID:
			return getProductStyle_2019OutgoingLinks(view);
		case ProductEditPart.VISUAL_ID:
			return getProduct_2020OutgoingLinks(view);
		case FashionStyleEditPart.VISUAL_ID:
			return getFashionStyle_2021OutgoingLinks(view);
		case ArticleEditPart.VISUAL_ID:
			return getArticle_3001OutgoingLinks(view);
		case TVProgramEditPart.VISUAL_ID:
			return getTVProgram_3002OutgoingLinks(view);
		case SingleBrandEvent2EditPart.VISUAL_ID:
			return getSingleBrandEvent_3005OutgoingLinks(view);
		case AdvertisingProduct2EditPart.VISUAL_ID:
			return getAdvertisingProduct_3004OutgoingLinks(view);
		case ProductStyle2EditPart.VISUAL_ID:
			return getProductStyle_3006OutgoingLinks(view);
		case Product2EditPart.VISUAL_ID:
			return getProduct_3007OutgoingLinks(view);
		case SpatioTemporalDescriptorEditPart.VISUAL_ID:
			return getSpatioTemporalDescriptor_3003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getFashionDomain_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getBlogger_2001ContainedLinks(
			View view) {
		Blogger modelElement = (Blogger) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Reviewer_Reviews_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getCritic_2002ContainedLinks(
			View view) {
		Critic modelElement = (Critic) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Reviewer_Reviews_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getInfluencer_2003ContainedLinks(
			View view) {
		Influencer modelElement = (Influencer) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Reviewer_Reviews_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getFamousBrand_2004ContainedLinks(
			View view) {
		FamousBrand modelElement = (FamousBrand) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Campaigns_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_ProductLines_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Designers_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getEmergingBrand_2005ContainedLinks(
			View view) {
		EmergingBrand modelElement = (EmergingBrand) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Campaigns_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_ProductLines_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Designers_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getLocalBrand_2006ContainedLinks(
			View view) {
		LocalBrand modelElement = (LocalBrand) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Campaigns_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_ProductLines_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Designers_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getMacroEvent_2007ContainedLinks(
			View view) {
		MacroEvent modelElement = (MacroEvent) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Roles_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getSingleBrandEvent_2008ContainedLinks(
			View view) {
		SingleBrandEvent modelElement = (SingleBrandEvent) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Roles_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_SingleBrandEvent_Brand_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getPhoto_2009ContainedLinks(
			View view) {
		Photo modelElement = (Photo) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Product_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Reviewer_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getDescription_2010ContainedLinks(
			View view) {
		Description modelElement = (Description) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Product_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Reviewer_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getComment_2011ContainedLinks(
			View view) {
		Comment modelElement = (Comment) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Product_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Reviewer_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getDesigner_2012ContainedLinks(
			View view) {
		Designer modelElement = (Designer) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Designer_Brand_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getModel_2013ContainedLinks(
			View view) {
		Model modelElement = (Model) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getPresenter_2014ContainedLinks(
			View view) {
		Presenter modelElement = (Presenter) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getChoreographer_2015ContainedLinks(
			View view) {
		Choreographer modelElement = (Choreographer) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getPhotographer_2016ContainedLinks(
			View view) {
		Photographer modelElement = (Photographer) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getAdvertisingCampaign_2017ContainedLinks(
			View view) {
		AdvertisingCampaign modelElement = (AdvertisingCampaign) view
				.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AdvertisingCampaign_Brand_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getAdvertisingProduct_2022ContainedLinks(
			View view) {
		AdvertisingProduct modelElement = (AdvertisingProduct) view
				.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProductLine_2018ContainedLinks(
			View view) {
		ProductLine modelElement = (ProductLine) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ProductLine_Brand_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProductStyle_2019ContainedLinks(
			View view) {
		ProductStyle modelElement = (ProductStyle) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProduct_2020ContainedLinks(
			View view) {
		Product modelElement = (Product) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Product_Reviews_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getFashionStyle_2021ContainedLinks(
			View view) {
		FashionStyle modelElement = (FashionStyle) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionStyle_Elements_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getArticle_3001ContainedLinks(
			View view) {
		Article modelElement = (Article) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_NewsReport_Elements_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getTVProgram_3002ContainedLinks(
			View view) {
		TVProgram modelElement = (TVProgram) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_NewsReport_Elements_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getSingleBrandEvent_3005ContainedLinks(
			View view) {
		SingleBrandEvent modelElement = (SingleBrandEvent) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Roles_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_SingleBrandEvent_Brand_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getAdvertisingProduct_3004ContainedLinks(
			View view) {
		AdvertisingProduct modelElement = (AdvertisingProduct) view
				.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProductStyle_3006ContainedLinks(
			View view) {
		ProductStyle modelElement = (ProductStyle) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProduct_3007ContainedLinks(
			View view) {
		Product modelElement = (Product) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Product_Reviews_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getSpatioTemporalDescriptor_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getBlogger_2001IncomingLinks(
			View view) {
		Blogger modelElement = (Blogger) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Event_Roles_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Review_Reviewer_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getCritic_2002IncomingLinks(
			View view) {
		Critic modelElement = (Critic) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Event_Roles_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Review_Reviewer_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getInfluencer_2003IncomingLinks(
			View view) {
		Influencer modelElement = (Influencer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Event_Roles_4008(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Review_Reviewer_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getFamousBrand_2004IncomingLinks(
			View view) {
		FamousBrand modelElement = (FamousBrand) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AdvertisingCampaign_Brand_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SingleBrandEvent_Brand_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ProductLine_Brand_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Designer_Brand_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getEmergingBrand_2005IncomingLinks(
			View view) {
		EmergingBrand modelElement = (EmergingBrand) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AdvertisingCampaign_Brand_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SingleBrandEvent_Brand_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ProductLine_Brand_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Designer_Brand_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getLocalBrand_2006IncomingLinks(
			View view) {
		LocalBrand modelElement = (LocalBrand) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AdvertisingCampaign_Brand_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SingleBrandEvent_Brand_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ProductLine_Brand_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Designer_Brand_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getMacroEvent_2007IncomingLinks(
			View view) {
		MacroEvent modelElement = (MacroEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Events_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getSingleBrandEvent_2008IncomingLinks(
			View view) {
		SingleBrandEvent modelElement = (SingleBrandEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Events_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getPhoto_2009IncomingLinks(
			View view) {
		Photo modelElement = (Photo) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Product_Reviews_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Reviewer_Reviews_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getDescription_2010IncomingLinks(
			View view) {
		Description modelElement = (Description) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Product_Reviews_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Reviewer_Reviews_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getComment_2011IncomingLinks(
			View view) {
		Comment modelElement = (Comment) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Product_Reviews_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Reviewer_Reviews_4016(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getDesigner_2012IncomingLinks(
			View view) {
		Designer modelElement = (Designer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Brand_Designers_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Event_Roles_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getModel_2013IncomingLinks(
			View view) {
		Model modelElement = (Model) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Event_Roles_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getPresenter_2014IncomingLinks(
			View view) {
		Presenter modelElement = (Presenter) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Event_Roles_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getChoreographer_2015IncomingLinks(
			View view) {
		Choreographer modelElement = (Choreographer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Event_Roles_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getPhotographer_2016IncomingLinks(
			View view) {
		Photographer modelElement = (Photographer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Event_Roles_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getAdvertisingCampaign_2017IncomingLinks(
			View view) {
		AdvertisingCampaign modelElement = (AdvertisingCampaign) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Brand_Campaigns_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getAdvertisingProduct_2022IncomingLinks(
			View view) {
		AdvertisingProduct modelElement = (AdvertisingProduct) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProductLine_2018IncomingLinks(
			View view) {
		ProductLine modelElement = (ProductLine) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Brand_ProductLines_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProductStyle_2019IncomingLinks(
			View view) {
		ProductStyle modelElement = (ProductStyle) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProduct_2020IncomingLinks(
			View view) {
		Product modelElement = (Product) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Review_Product_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getFashionStyle_2021IncomingLinks(
			View view) {
		FashionStyle modelElement = (FashionStyle) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_FashionElement_Styles_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getArticle_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getTVProgram_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getSingleBrandEvent_3005IncomingLinks(
			View view) {
		SingleBrandEvent modelElement = (SingleBrandEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Events_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getAdvertisingProduct_3004IncomingLinks(
			View view) {
		AdvertisingProduct modelElement = (AdvertisingProduct) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProductStyle_3006IncomingLinks(
			View view) {
		ProductStyle modelElement = (ProductStyle) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProduct_3007IncomingLinks(
			View view) {
		Product modelElement = (Product) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Review_Product_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getSpatioTemporalDescriptor_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getBlogger_2001OutgoingLinks(
			View view) {
		Blogger modelElement = (Blogger) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Reviewer_Reviews_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getCritic_2002OutgoingLinks(
			View view) {
		Critic modelElement = (Critic) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Reviewer_Reviews_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getInfluencer_2003OutgoingLinks(
			View view) {
		Influencer modelElement = (Influencer) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Reviewer_Reviews_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getFamousBrand_2004OutgoingLinks(
			View view) {
		FamousBrand modelElement = (FamousBrand) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Campaigns_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_ProductLines_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Designers_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getEmergingBrand_2005OutgoingLinks(
			View view) {
		EmergingBrand modelElement = (EmergingBrand) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Campaigns_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_ProductLines_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Designers_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getLocalBrand_2006OutgoingLinks(
			View view) {
		LocalBrand modelElement = (LocalBrand) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Campaigns_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_ProductLines_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Brand_Designers_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getMacroEvent_2007OutgoingLinks(
			View view) {
		MacroEvent modelElement = (MacroEvent) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Roles_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getSingleBrandEvent_2008OutgoingLinks(
			View view) {
		SingleBrandEvent modelElement = (SingleBrandEvent) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Roles_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_SingleBrandEvent_Brand_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getPhoto_2009OutgoingLinks(
			View view) {
		Photo modelElement = (Photo) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Product_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Reviewer_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getDescription_2010OutgoingLinks(
			View view) {
		Description modelElement = (Description) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Product_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Reviewer_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getComment_2011OutgoingLinks(
			View view) {
		Comment modelElement = (Comment) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Product_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Review_Reviewer_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getDesigner_2012OutgoingLinks(
			View view) {
		Designer modelElement = (Designer) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Designer_Brand_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getModel_2013OutgoingLinks(
			View view) {
		Model modelElement = (Model) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getPresenter_2014OutgoingLinks(
			View view) {
		Presenter modelElement = (Presenter) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getChoreographer_2015OutgoingLinks(
			View view) {
		Choreographer modelElement = (Choreographer) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getPhotographer_2016OutgoingLinks(
			View view) {
		Photographer modelElement = (Photographer) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Events_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getAdvertisingCampaign_2017OutgoingLinks(
			View view) {
		AdvertisingCampaign modelElement = (AdvertisingCampaign) view
				.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AdvertisingCampaign_Brand_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getAdvertisingProduct_2022OutgoingLinks(
			View view) {
		AdvertisingProduct modelElement = (AdvertisingProduct) view
				.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProductLine_2018OutgoingLinks(
			View view) {
		ProductLine modelElement = (ProductLine) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ProductLine_Brand_4010(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProductStyle_2019OutgoingLinks(
			View view) {
		ProductStyle modelElement = (ProductStyle) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProduct_2020OutgoingLinks(
			View view) {
		Product modelElement = (Product) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Product_Reviews_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getFashionStyle_2021OutgoingLinks(
			View view) {
		FashionStyle modelElement = (FashionStyle) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionStyle_Elements_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getArticle_3001OutgoingLinks(
			View view) {
		Article modelElement = (Article) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_NewsReport_Elements_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getTVProgram_3002OutgoingLinks(
			View view) {
		TVProgram modelElement = (TVProgram) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_NewsReport_Elements_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getSingleBrandEvent_3005OutgoingLinks(
			View view) {
		SingleBrandEvent modelElement = (SingleBrandEvent) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Event_Roles_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_SingleBrandEvent_Brand_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getAdvertisingProduct_3004OutgoingLinks(
			View view) {
		AdvertisingProduct modelElement = (AdvertisingProduct) view
				.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProductStyle_3006OutgoingLinks(
			View view) {
		ProductStyle modelElement = (ProductStyle) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getProduct_3007OutgoingLinks(
			View view) {
		Product modelElement = (Product) view.getElement();
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Product_Reviews_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<FashionLinkDescriptor> getSpatioTemporalDescriptor_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_FashionElement_Styles_4001(
			FashionStyle target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getFashionElement_Styles()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.FashionElementStyles_4001,
						FashionElementStylesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_NewsReport_Elements_4002(
			FashionElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getNewsReport_Elements()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.NewsReportElements_4002,
						NewsReportElementsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_FashionStyle_Elements_4003(
			FashionElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getFashionStyle_Elements()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.FashionStyleElements_4003,
						FashionStyleElementsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_Brand_Campaigns_4004(
			AdvertisingCampaign target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getBrand_Campaigns()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.BrandCampaigns_4004,
						BrandCampaignsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_Brand_ProductLines_4005(
			ProductLine target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getBrand_ProductLines()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.BrandProductLines_4005,
						BrandProductLinesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_Brand_Designers_4006(
			Designer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getBrand_Designers()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.BrandDesigners_4006,
						BrandDesignersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_AdvertisingCampaign_Brand_4007(
			Brand target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getAdvertisingCampaign_Brand()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target,
						FashionElementTypes.AdvertisingCampaignBrand_4007,
						AdvertisingCampaignBrandEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_Event_Roles_4008(
			Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getEvent_Roles()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.EventRoles_4008,
						EventRolesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_SingleBrandEvent_Brand_4009(
			Brand target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getSingleBrandEvent_Brand()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.SingleBrandEventBrand_4009,
						SingleBrandEventBrandEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_ProductLine_Brand_4010(
			Brand target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getProductLine_Brand()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.ProductLineBrand_4010,
						ProductLineBrandEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_Product_Reviews_4011(
			Review target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getProduct_Reviews()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.ProductReviews_4011,
						ProductReviewsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_Review_Product_4012(
			Product target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getReview_Product()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.ReviewProduct_4012,
						ReviewProductEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_Review_Reviewer_4013(
			Reviewer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getReview_Reviewer()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.ReviewReviewer_4013,
						ReviewReviewerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_Role_Events_4014(
			Event target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getRole_Events()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.RoleEvents_4014,
						RoleEventsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_Designer_Brand_4015(
			Brand target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getDesigner_Brand()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.DesignerBrand_4015,
						DesignerBrandEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getIncomingFeatureModelFacetLinks_Reviewer_Reviews_4016(
			Review target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == FashionPackage.eINSTANCE
					.getReviewer_Reviews()) {
				result.add(new FashionLinkDescriptor(setting.getEObject(),
						target, FashionElementTypes.ReviewerReviews_4016,
						ReviewerReviewsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_FashionElement_Styles_4001(
			FashionElement source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		for (Iterator<?> destinations = source.getStyles().iterator(); destinations
				.hasNext();) {
			FashionStyle destination = (FashionStyle) destinations.next();
			result.add(new FashionLinkDescriptor(source, destination,
					FashionElementTypes.FashionElementStyles_4001,
					FashionElementStylesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_NewsReport_Elements_4002(
			NewsReport source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		for (Iterator<?> destinations = source.getElements().iterator(); destinations
				.hasNext();) {
			FashionElement destination = (FashionElement) destinations.next();
			result.add(new FashionLinkDescriptor(source, destination,
					FashionElementTypes.NewsReportElements_4002,
					NewsReportElementsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_FashionStyle_Elements_4003(
			FashionStyle source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		for (Iterator<?> destinations = source.getElements().iterator(); destinations
				.hasNext();) {
			FashionElement destination = (FashionElement) destinations.next();
			result.add(new FashionLinkDescriptor(source, destination,
					FashionElementTypes.FashionStyleElements_4003,
					FashionStyleElementsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Brand_Campaigns_4004(
			Brand source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		for (Iterator<?> destinations = source.getCampaigns().iterator(); destinations
				.hasNext();) {
			AdvertisingCampaign destination = (AdvertisingCampaign) destinations
					.next();
			result.add(new FashionLinkDescriptor(source, destination,
					FashionElementTypes.BrandCampaigns_4004,
					BrandCampaignsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Brand_ProductLines_4005(
			Brand source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		for (Iterator<?> destinations = source.getProductLines().iterator(); destinations
				.hasNext();) {
			ProductLine destination = (ProductLine) destinations.next();
			result.add(new FashionLinkDescriptor(source, destination,
					FashionElementTypes.BrandProductLines_4005,
					BrandProductLinesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Brand_Designers_4006(
			Brand source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		for (Iterator<?> destinations = source.getDesigners().iterator(); destinations
				.hasNext();) {
			Designer destination = (Designer) destinations.next();
			result.add(new FashionLinkDescriptor(source, destination,
					FashionElementTypes.BrandDesigners_4006,
					BrandDesignersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_AdvertisingCampaign_Brand_4007(
			AdvertisingCampaign source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Brand destination = source.getBrand();
		if (destination == null) {
			return result;
		}
		result.add(new FashionLinkDescriptor(source, destination,
				FashionElementTypes.AdvertisingCampaignBrand_4007,
				AdvertisingCampaignBrandEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Event_Roles_4008(
			Event source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		for (Iterator<?> destinations = source.getRoles().iterator(); destinations
				.hasNext();) {
			Role destination = (Role) destinations.next();
			result.add(new FashionLinkDescriptor(source, destination,
					FashionElementTypes.EventRoles_4008,
					EventRolesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_SingleBrandEvent_Brand_4009(
			SingleBrandEvent source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Brand destination = source.getBrand();
		if (destination == null) {
			return result;
		}
		result.add(new FashionLinkDescriptor(source, destination,
				FashionElementTypes.SingleBrandEventBrand_4009,
				SingleBrandEventBrandEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_ProductLine_Brand_4010(
			ProductLine source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Brand destination = source.getBrand();
		if (destination == null) {
			return result;
		}
		result.add(new FashionLinkDescriptor(source, destination,
				FashionElementTypes.ProductLineBrand_4010,
				ProductLineBrandEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Product_Reviews_4011(
			Product source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		for (Iterator<?> destinations = source.getReviews().iterator(); destinations
				.hasNext();) {
			Review destination = (Review) destinations.next();
			result.add(new FashionLinkDescriptor(source, destination,
					FashionElementTypes.ProductReviews_4011,
					ProductReviewsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Review_Product_4012(
			Review source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Product destination = source.getProduct();
		if (destination == null) {
			return result;
		}
		result.add(new FashionLinkDescriptor(source, destination,
				FashionElementTypes.ReviewProduct_4012,
				ReviewProductEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Review_Reviewer_4013(
			Review source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Reviewer destination = source.getReviewer();
		if (destination == null) {
			return result;
		}
		result.add(new FashionLinkDescriptor(source, destination,
				FashionElementTypes.ReviewReviewer_4013,
				ReviewReviewerEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Role_Events_4014(
			Role source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		for (Iterator<?> destinations = source.getEvents().iterator(); destinations
				.hasNext();) {
			Event destination = (Event) destinations.next();
			result.add(new FashionLinkDescriptor(source, destination,
					FashionElementTypes.RoleEvents_4014,
					RoleEventsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Designer_Brand_4015(
			Designer source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		Brand destination = source.getBrand();
		if (destination == null) {
			return result;
		}
		result.add(new FashionLinkDescriptor(source, destination,
				FashionElementTypes.DesignerBrand_4015,
				DesignerBrandEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<FashionLinkDescriptor> getOutgoingFeatureModelFacetLinks_Reviewer_Reviews_4016(
			Reviewer source) {
		LinkedList<FashionLinkDescriptor> result = new LinkedList<FashionLinkDescriptor>();
		for (Iterator<?> destinations = source.getReviews().iterator(); destinations
				.hasNext();) {
			Review destination = (Review) destinations.next();
			result.add(new FashionLinkDescriptor(source, destination,
					FashionElementTypes.ReviewerReviews_4016,
					ReviewerReviewsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<FashionNodeDescriptor> getSemanticChildren(View view) {
			return FashionDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FashionLinkDescriptor> getContainedLinks(View view) {
			return FashionDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FashionLinkDescriptor> getIncomingLinks(View view) {
			return FashionDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<FashionLinkDescriptor> getOutgoingLinks(View view) {
			return FashionDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
