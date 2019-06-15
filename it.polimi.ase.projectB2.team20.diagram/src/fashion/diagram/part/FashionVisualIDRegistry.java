/*
 * 
 */
package fashion.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import fashion.FashionDomain;
import fashion.FashionPackage;
import fashion.diagram.edit.parts.*;
import fashion.diagram.edit.parts.AdvertisingCampaignAdvertisingCampaignProductsCompartmentEditPart;
import fashion.diagram.edit.parts.AdvertisingCampaignAdvertisingCampaignReportsCompartmentEditPart;
import fashion.diagram.edit.parts.AdvertisingCampaignBrandEditPart;
import fashion.diagram.edit.parts.AdvertisingCampaignEditPart;
import fashion.diagram.edit.parts.AdvertisingCampaignNameEditPart;
import fashion.diagram.edit.parts.AdvertisingProductEditPart;
import fashion.diagram.edit.parts.AdvertisingProductNameTypeEditPart;
import fashion.diagram.edit.parts.ArticleEditPart;
import fashion.diagram.edit.parts.ArticleMagazineEditPart;
import fashion.diagram.edit.parts.BloggerBloggerReportsCompartmentEditPart;
import fashion.diagram.edit.parts.BloggerEditPart;
import fashion.diagram.edit.parts.BloggerNameEditPart;
import fashion.diagram.edit.parts.BrandCampaignsEditPart;
import fashion.diagram.edit.parts.BrandDesignersEditPart;
import fashion.diagram.edit.parts.BrandProductLinesEditPart;
import fashion.diagram.edit.parts.ChoreographerChoreographerReportsCompartmentEditPart;
import fashion.diagram.edit.parts.ChoreographerEditPart;
import fashion.diagram.edit.parts.ChoreographerNameEditPart;
import fashion.diagram.edit.parts.CommentCommentReportsCompartmentEditPart;
import fashion.diagram.edit.parts.CommentEditPart;
import fashion.diagram.edit.parts.CommentTextEditPart;
import fashion.diagram.edit.parts.CriticCriticReportsCompartmentEditPart;
import fashion.diagram.edit.parts.CriticEditPart;
import fashion.diagram.edit.parts.CriticNameEditPart;
import fashion.diagram.edit.parts.DescriptionDescriptionReportsCompartmentEditPart;
import fashion.diagram.edit.parts.DescriptionEditPart;
import fashion.diagram.edit.parts.DescriptionTextEditPart;
import fashion.diagram.edit.parts.DesignerDesignerReportsCompartmentEditPart;
import fashion.diagram.edit.parts.DesignerEditPart;
import fashion.diagram.edit.parts.DesignerNameEditPart;
import fashion.diagram.edit.parts.EmergingBrandCountriesEditPart;
import fashion.diagram.edit.parts.EmergingBrandEditPart;
import fashion.diagram.edit.parts.EmergingBrandEmergingBrandReportsCompartmentEditPart;
import fashion.diagram.edit.parts.EmergingBrandNameEditPart;
import fashion.diagram.edit.parts.FamousBrandCountriesEditPart;
import fashion.diagram.edit.parts.FamousBrandEditPart;
import fashion.diagram.edit.parts.FamousBrandFamousBrandReportsCompartmentEditPart;
import fashion.diagram.edit.parts.FamousBrandNameEditPart;
import fashion.diagram.edit.parts.FashionDomainEditPart;
import fashion.diagram.edit.parts.FashionElementStylesEditPart;
import fashion.diagram.edit.parts.FashionStyleEditPart;
import fashion.diagram.edit.parts.FashionStyleElementsEditPart;
import fashion.diagram.edit.parts.FashionStyleFashionStyleDescriptorsCompartmentEditPart;
import fashion.diagram.edit.parts.FashionStyleNameEditPart;
import fashion.diagram.edit.parts.InfluencerEditPart;
import fashion.diagram.edit.parts.InfluencerInfluencerReportsCompartmentEditPart;
import fashion.diagram.edit.parts.InfluencerNameEditPart;
import fashion.diagram.edit.parts.LocalBrandCountryEditPart;
import fashion.diagram.edit.parts.LocalBrandEditPart;
import fashion.diagram.edit.parts.LocalBrandLocalBrandReportsCompartmentEditPart;
import fashion.diagram.edit.parts.LocalBrandNameEditPart;
import fashion.diagram.edit.parts.MacroEventEditPart;
import fashion.diagram.edit.parts.MacroEventMacroEventReportsCompartmentEditPart;
import fashion.diagram.edit.parts.MacroEventNameEditPart;
import fashion.diagram.edit.parts.ModelEditPart;
import fashion.diagram.edit.parts.ModelModelReportsCompartmentEditPart;
import fashion.diagram.edit.parts.ModelNameEditPart;
import fashion.diagram.edit.parts.NewsReportElementsEditPart;
import fashion.diagram.edit.parts.PhotoEditPart;
import fashion.diagram.edit.parts.PhotoPhotoReportsCompartmentEditPart;
import fashion.diagram.edit.parts.PhotoTagsEditPart;
import fashion.diagram.edit.parts.PhotographerEditPart;
import fashion.diagram.edit.parts.PhotographerNameEditPart;
import fashion.diagram.edit.parts.PhotographerPhotographerReportsCompartmentEditPart;
import fashion.diagram.edit.parts.PresenterEditPart;
import fashion.diagram.edit.parts.PresenterNameEditPart;
import fashion.diagram.edit.parts.PresenterPresenterReportsCompartmentEditPart;
import fashion.diagram.edit.parts.ProductEditPart;
import fashion.diagram.edit.parts.ProductLineEditPart;
import fashion.diagram.edit.parts.ProductLineNameEditPart;
import fashion.diagram.edit.parts.ProductLineProductLineReportsCompartmentEditPart;
import fashion.diagram.edit.parts.ProductNameEditPart;
import fashion.diagram.edit.parts.ProductProductReportsCompartmentEditPart;
import fashion.diagram.edit.parts.ProductStyleEditPart;
import fashion.diagram.edit.parts.ProductStyleNameEditPart;
import fashion.diagram.edit.parts.ProductStyleProductStyleReportsCompartmentEditPart;
import fashion.diagram.edit.parts.SingleBrandEventEditPart;
import fashion.diagram.edit.parts.SingleBrandEventNameEditPart;
import fashion.diagram.edit.parts.SingleBrandEventSingleBrandEventReportsCompartmentEditPart;
import fashion.diagram.edit.parts.SpatioTemporalDescriptorEditPart;
import fashion.diagram.edit.parts.SpatioTemporalDescriptorPeriodLocationEditPart;
import fashion.diagram.edit.parts.TVProgramEditPart;
import fashion.diagram.edit.parts.TVProgramNameEditPart;
import fashion.diagram.edit.parts.WrappingLabel2EditPart;
import fashion.diagram.edit.parts.WrappingLabel3EditPart;
import fashion.diagram.edit.parts.WrappingLabel4EditPart;
import fashion.diagram.edit.parts.WrappingLabel5EditPart;
import fashion.diagram.edit.parts.WrappingLabel6EditPart;
import fashion.diagram.edit.parts.WrappingLabel7EditPart;
import fashion.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class FashionVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "it.polimi.ase.projectB2.team20.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (FashionDomainEditPart.MODEL_ID.equals(view.getType())) {
				return FashionDomainEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return fashion.diagram.part.FashionVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				FashionDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (FashionPackage.eINSTANCE.getFashionDomain().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((FashionDomain) domainElement)) {
			return FashionDomainEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = fashion.diagram.part.FashionVisualIDRegistry
				.getModelID(containerView);
		if (!FashionDomainEditPart.MODEL_ID.equals(containerModelID)
				&& !"fashion".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (FashionDomainEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = fashion.diagram.part.FashionVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FashionDomainEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case FashionDomainEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getBlogger().isSuperTypeOf(
					domainElement.eClass())) {
				return BloggerEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getCritic().isSuperTypeOf(
					domainElement.eClass())) {
				return CriticEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getInfluencer().isSuperTypeOf(
					domainElement.eClass())) {
				return InfluencerEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getFamousBrand().isSuperTypeOf(
					domainElement.eClass())) {
				return FamousBrandEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getEmergingBrand().isSuperTypeOf(
					domainElement.eClass())) {
				return EmergingBrandEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getLocalBrand().isSuperTypeOf(
					domainElement.eClass())) {
				return LocalBrandEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getMacroEvent().isSuperTypeOf(
					domainElement.eClass())) {
				return MacroEventEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getSingleBrandEvent().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleBrandEventEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getPhoto().isSuperTypeOf(
					domainElement.eClass())) {
				return PhotoEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getDescription().isSuperTypeOf(
					domainElement.eClass())) {
				return DescriptionEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getComment().isSuperTypeOf(
					domainElement.eClass())) {
				return CommentEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getDesigner().isSuperTypeOf(
					domainElement.eClass())) {
				return DesignerEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getModel().isSuperTypeOf(
					domainElement.eClass())) {
				return ModelEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getPresenter().isSuperTypeOf(
					domainElement.eClass())) {
				return PresenterEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getChoreographer().isSuperTypeOf(
					domainElement.eClass())) {
				return ChoreographerEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getPhotographer().isSuperTypeOf(
					domainElement.eClass())) {
				return PhotographerEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getAdvertisingCampaign()
					.isSuperTypeOf(domainElement.eClass())) {
				return AdvertisingCampaignEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getAdvertisingProduct().isSuperTypeOf(
					domainElement.eClass())) {
				return AdvertisingProductEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getProductLine().isSuperTypeOf(
					domainElement.eClass())) {
				return ProductLineEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getProductStyle().isSuperTypeOf(
					domainElement.eClass())) {
				return ProductStyleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getProduct().isSuperTypeOf(
					domainElement.eClass())) {
				return ProductEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getFashionStyle().isSuperTypeOf(
					domainElement.eClass())) {
				return FashionStyleEditPart.VISUAL_ID;
			}
			break;
		case BloggerBloggerReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case CriticCriticReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case InfluencerInfluencerReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case FamousBrandFamousBrandReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case EmergingBrandEmergingBrandReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case LocalBrandLocalBrandReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case MacroEventMacroEventReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case MacroEventMacroEventSingleBrandEventsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getSingleBrandEvent().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleBrandEvent2EditPart.VISUAL_ID;
			}
			break;
		case SingleBrandEventSingleBrandEventReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case SingleBrandEventSingleBrandEventReportsCompartment2EditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case PhotoPhotoReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case DescriptionDescriptionReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case CommentCommentReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case DesignerDesignerReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case ModelModelReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case PresenterPresenterReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case ChoreographerChoreographerReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case PhotographerPhotographerReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case AdvertisingCampaignAdvertisingCampaignReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case AdvertisingCampaignAdvertisingCampaignProductsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getAdvertisingProduct().isSuperTypeOf(
					domainElement.eClass())) {
				return AdvertisingProduct2EditPart.VISUAL_ID;
			}
			break;
		case AdvertisingProductAdvertisingProductReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case AdvertisingProductAdvertisingProductReportsCompartment2EditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case ProductLineProductLineReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case ProductLineProductLineProductStylesCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getProductStyle().isSuperTypeOf(
					domainElement.eClass())) {
				return ProductStyle2EditPart.VISUAL_ID;
			}
			break;
		case ProductLineProductLineProductsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getProduct().isSuperTypeOf(
					domainElement.eClass())) {
				return Product2EditPart.VISUAL_ID;
			}
			break;
		case ProductStyleProductStyleReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case ProductProductReportsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case ProductStyleProductStyleReportsCompartment2EditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case ProductProductReportsCompartment2EditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getArticle().isSuperTypeOf(
					domainElement.eClass())) {
				return ArticleEditPart.VISUAL_ID;
			}
			if (FashionPackage.eINSTANCE.getTVProgram().isSuperTypeOf(
					domainElement.eClass())) {
				return TVProgramEditPart.VISUAL_ID;
			}
			break;
		case FashionStyleFashionStyleDescriptorsCompartmentEditPart.VISUAL_ID:
			if (FashionPackage.eINSTANCE.getSpatioTemporalDescriptor()
					.isSuperTypeOf(domainElement.eClass())) {
				return SpatioTemporalDescriptorEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = fashion.diagram.part.FashionVisualIDRegistry
				.getModelID(containerView);
		if (!FashionDomainEditPart.MODEL_ID.equals(containerModelID)
				&& !"fashion".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (FashionDomainEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = fashion.diagram.part.FashionVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = FashionDomainEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case FashionDomainEditPart.VISUAL_ID:
			if (BloggerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CriticEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfluencerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FamousBrandEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmergingBrandEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocalBrandEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MacroEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleBrandEventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PhotoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DesignerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PresenterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoreographerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PhotographerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdvertisingCampaignEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdvertisingProductEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductLineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductStyleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FashionStyleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BloggerEditPart.VISUAL_ID:
			if (BloggerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BloggerBloggerReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CriticEditPart.VISUAL_ID:
			if (CriticNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CriticCriticReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfluencerEditPart.VISUAL_ID:
			if (InfluencerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfluencerInfluencerReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FamousBrandEditPart.VISUAL_ID:
			if (FamousBrandNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FamousBrandFamousBrandReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EmergingBrandEditPart.VISUAL_ID:
			if (EmergingBrandNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EmergingBrandEmergingBrandReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LocalBrandEditPart.VISUAL_ID:
			if (LocalBrandNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LocalBrandLocalBrandReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MacroEventEditPart.VISUAL_ID:
			if (MacroEventNameYearMonthCityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MacroEventMacroEventReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MacroEventMacroEventSingleBrandEventsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleBrandEventEditPart.VISUAL_ID:
			if (SingleBrandEventNameYearMonthDayHourMinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleBrandEventSingleBrandEventReportsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PhotoEditPart.VISUAL_ID:
			if (PhotoIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PhotoPhotoReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DescriptionEditPart.VISUAL_ID:
			if (DescriptionIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DescriptionDescriptionReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommentEditPart.VISUAL_ID:
			if (CommentIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CommentCommentReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DesignerEditPart.VISUAL_ID:
			if (DesignerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DesignerDesignerReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelEditPart.VISUAL_ID:
			if (ModelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModelModelReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PresenterEditPart.VISUAL_ID:
			if (PresenterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PresenterPresenterReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoreographerEditPart.VISUAL_ID:
			if (ChoreographerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ChoreographerChoreographerReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PhotographerEditPart.VISUAL_ID:
			if (PhotographerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PhotographerPhotographerReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdvertisingCampaignEditPart.VISUAL_ID:
			if (AdvertisingCampaignNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdvertisingCampaignAdvertisingCampaignReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdvertisingCampaignAdvertisingCampaignProductsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdvertisingProductEditPart.VISUAL_ID:
			if (AdvertisingProductNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdvertisingProductAdvertisingProductReportsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductLineEditPart.VISUAL_ID:
			if (ProductLineNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductLineProductLineReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductLineProductLineProductStylesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductLineProductLineProductsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductStyleEditPart.VISUAL_ID:
			if (ProductStyleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductStyleProductStyleReportsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductEditPart.VISUAL_ID:
			if (ProductNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductProductReportsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FashionStyleEditPart.VISUAL_ID:
			if (FashionStyleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FashionStyleFashionStyleDescriptorsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArticleEditPart.VISUAL_ID:
			if (ArticleTypeTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TVProgramEditPart.VISUAL_ID:
			if (TVProgramTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleBrandEvent2EditPart.VISUAL_ID:
			if (SingleBrandEventNameYearMonthDayHourMin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleBrandEventSingleBrandEventReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdvertisingProduct2EditPart.VISUAL_ID:
			if (AdvertisingProductNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AdvertisingProductAdvertisingProductReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductStyle2EditPart.VISUAL_ID:
			if (ProductStyleName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductStyleProductStyleReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Product2EditPart.VISUAL_ID:
			if (ProductName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProductProductReportsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SpatioTemporalDescriptorEditPart.VISUAL_ID:
			if (SpatioTemporalDescriptorPeriodLocationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BloggerBloggerReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CriticCriticReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfluencerInfluencerReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FamousBrandFamousBrandReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EmergingBrandEmergingBrandReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LocalBrandLocalBrandReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MacroEventMacroEventReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MacroEventMacroEventSingleBrandEventsCompartmentEditPart.VISUAL_ID:
			if (SingleBrandEvent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleBrandEventSingleBrandEventReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleBrandEventSingleBrandEventReportsCompartment2EditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PhotoPhotoReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DescriptionDescriptionReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CommentCommentReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DesignerDesignerReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelModelReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PresenterPresenterReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChoreographerChoreographerReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PhotographerPhotographerReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdvertisingCampaignAdvertisingCampaignReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdvertisingCampaignAdvertisingCampaignProductsCompartmentEditPart.VISUAL_ID:
			if (AdvertisingProduct2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdvertisingProductAdvertisingProductReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdvertisingProductAdvertisingProductReportsCompartment2EditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductLineProductLineReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductLineProductLineProductStylesCompartmentEditPart.VISUAL_ID:
			if (ProductStyle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductLineProductLineProductsCompartmentEditPart.VISUAL_ID:
			if (Product2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductStyleProductStyleReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductProductReportsCompartmentEditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductStyleProductStyleReportsCompartment2EditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductProductReportsCompartment2EditPart.VISUAL_ID:
			if (ArticleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TVProgramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FashionStyleFashionStyleDescriptorsCompartmentEditPart.VISUAL_ID:
			if (SpatioTemporalDescriptorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FashionElementStylesEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NewsReportElementsEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FashionStyleElementsEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BrandCampaignsEditPart.VISUAL_ID:
			if (WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BrandProductLinesEditPart.VISUAL_ID:
			if (WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BrandDesignersEditPart.VISUAL_ID:
			if (WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AdvertisingCampaignBrandEditPart.VISUAL_ID:
			if (WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventRolesEditPart.VISUAL_ID:
			if (WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleBrandEventBrandEditPart.VISUAL_ID:
			if (WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductLineBrandEditPart.VISUAL_ID:
			if (WrappingLabel10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProductReviewsEditPart.VISUAL_ID:
			if (WrappingLabel11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReviewProductEditPart.VISUAL_ID:
			if (WrappingLabel12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReviewReviewerEditPart.VISUAL_ID:
			if (WrappingLabel13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleEventsEditPart.VISUAL_ID:
			if (WrappingLabel14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DesignerBrandEditPart.VISUAL_ID:
			if (WrappingLabel15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReviewerReviewsEditPart.VISUAL_ID:
			if (WrappingLabel16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(FashionDomain element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case BloggerBloggerReportsCompartmentEditPart.VISUAL_ID:
		case CriticCriticReportsCompartmentEditPart.VISUAL_ID:
		case InfluencerInfluencerReportsCompartmentEditPart.VISUAL_ID:
		case FamousBrandFamousBrandReportsCompartmentEditPart.VISUAL_ID:
		case EmergingBrandEmergingBrandReportsCompartmentEditPart.VISUAL_ID:
		case LocalBrandLocalBrandReportsCompartmentEditPart.VISUAL_ID:
		case MacroEventMacroEventReportsCompartmentEditPart.VISUAL_ID:
		case MacroEventMacroEventSingleBrandEventsCompartmentEditPart.VISUAL_ID:
		case SingleBrandEventSingleBrandEventReportsCompartmentEditPart.VISUAL_ID:
		case SingleBrandEventSingleBrandEventReportsCompartment2EditPart.VISUAL_ID:
		case PhotoPhotoReportsCompartmentEditPart.VISUAL_ID:
		case DescriptionDescriptionReportsCompartmentEditPart.VISUAL_ID:
		case CommentCommentReportsCompartmentEditPart.VISUAL_ID:
		case DesignerDesignerReportsCompartmentEditPart.VISUAL_ID:
		case ModelModelReportsCompartmentEditPart.VISUAL_ID:
		case PresenterPresenterReportsCompartmentEditPart.VISUAL_ID:
		case ChoreographerChoreographerReportsCompartmentEditPart.VISUAL_ID:
		case PhotographerPhotographerReportsCompartmentEditPart.VISUAL_ID:
		case AdvertisingCampaignAdvertisingCampaignReportsCompartmentEditPart.VISUAL_ID:
		case AdvertisingCampaignAdvertisingCampaignProductsCompartmentEditPart.VISUAL_ID:
		case AdvertisingProductAdvertisingProductReportsCompartmentEditPart.VISUAL_ID:
		case AdvertisingProductAdvertisingProductReportsCompartment2EditPart.VISUAL_ID:
		case ProductLineProductLineReportsCompartmentEditPart.VISUAL_ID:
		case ProductLineProductLineProductStylesCompartmentEditPart.VISUAL_ID:
		case ProductLineProductLineProductsCompartmentEditPart.VISUAL_ID:
		case ProductStyleProductStyleReportsCompartmentEditPart.VISUAL_ID:
		case ProductProductReportsCompartmentEditPart.VISUAL_ID:
		case ProductStyleProductStyleReportsCompartment2EditPart.VISUAL_ID:
		case ProductProductReportsCompartment2EditPart.VISUAL_ID:
		case FashionStyleFashionStyleDescriptorsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case FashionDomainEditPart.VISUAL_ID:
			return false;
		case ArticleEditPart.VISUAL_ID:
		case TVProgramEditPart.VISUAL_ID:
		case SpatioTemporalDescriptorEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return fashion.diagram.part.FashionVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return fashion.diagram.part.FashionVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return fashion.diagram.part.FashionVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return fashion.diagram.part.FashionVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return fashion.diagram.part.FashionVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return fashion.diagram.part.FashionVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
