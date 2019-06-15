/*
 * 
 */
package fashion.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import fashion.diagram.part.FashionVisualIDRegistry;

/**
 * @generated
 */
public class FashionEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (FashionVisualIDRegistry.getVisualID(view)) {

			case FashionDomainEditPart.VISUAL_ID:
				return new FashionDomainEditPart(view);

			case BloggerEditPart.VISUAL_ID:
				return new BloggerEditPart(view);

			case BloggerNameEditPart.VISUAL_ID:
				return new BloggerNameEditPart(view);

			case CriticEditPart.VISUAL_ID:
				return new CriticEditPart(view);

			case CriticNameEditPart.VISUAL_ID:
				return new CriticNameEditPart(view);

			case InfluencerEditPart.VISUAL_ID:
				return new InfluencerEditPart(view);

			case InfluencerNameEditPart.VISUAL_ID:
				return new InfluencerNameEditPart(view);

			case FamousBrandEditPart.VISUAL_ID:
				return new FamousBrandEditPart(view);

			case FamousBrandNameEditPart.VISUAL_ID:
				return new FamousBrandNameEditPart(view);

			case EmergingBrandEditPart.VISUAL_ID:
				return new EmergingBrandEditPart(view);

			case EmergingBrandNameEditPart.VISUAL_ID:
				return new EmergingBrandNameEditPart(view);

			case LocalBrandEditPart.VISUAL_ID:
				return new LocalBrandEditPart(view);

			case LocalBrandNameEditPart.VISUAL_ID:
				return new LocalBrandNameEditPart(view);

			case MacroEventEditPart.VISUAL_ID:
				return new MacroEventEditPart(view);

			case MacroEventNameYearMonthCityEditPart.VISUAL_ID:
				return new MacroEventNameYearMonthCityEditPart(view);

			case SingleBrandEventEditPart.VISUAL_ID:
				return new SingleBrandEventEditPart(view);

			case SingleBrandEventNameYearMonthDayHourMinEditPart.VISUAL_ID:
				return new SingleBrandEventNameYearMonthDayHourMinEditPart(view);

			case PhotoEditPart.VISUAL_ID:
				return new PhotoEditPart(view);

			case PhotoIdEditPart.VISUAL_ID:
				return new PhotoIdEditPart(view);

			case DescriptionEditPart.VISUAL_ID:
				return new DescriptionEditPart(view);

			case DescriptionIdEditPart.VISUAL_ID:
				return new DescriptionIdEditPart(view);

			case CommentEditPart.VISUAL_ID:
				return new CommentEditPart(view);

			case CommentIdEditPart.VISUAL_ID:
				return new CommentIdEditPart(view);

			case DesignerEditPart.VISUAL_ID:
				return new DesignerEditPart(view);

			case DesignerNameEditPart.VISUAL_ID:
				return new DesignerNameEditPart(view);

			case ModelEditPart.VISUAL_ID:
				return new ModelEditPart(view);

			case ModelNameEditPart.VISUAL_ID:
				return new ModelNameEditPart(view);

			case PresenterEditPart.VISUAL_ID:
				return new PresenterEditPart(view);

			case PresenterNameEditPart.VISUAL_ID:
				return new PresenterNameEditPart(view);

			case ChoreographerEditPart.VISUAL_ID:
				return new ChoreographerEditPart(view);

			case ChoreographerNameEditPart.VISUAL_ID:
				return new ChoreographerNameEditPart(view);

			case PhotographerEditPart.VISUAL_ID:
				return new PhotographerEditPart(view);

			case PhotographerNameEditPart.VISUAL_ID:
				return new PhotographerNameEditPart(view);

			case AdvertisingCampaignEditPart.VISUAL_ID:
				return new AdvertisingCampaignEditPart(view);

			case AdvertisingCampaignNameEditPart.VISUAL_ID:
				return new AdvertisingCampaignNameEditPart(view);

			case AdvertisingProductEditPart.VISUAL_ID:
				return new AdvertisingProductEditPart(view);

			case AdvertisingProductNameTypeEditPart.VISUAL_ID:
				return new AdvertisingProductNameTypeEditPart(view);

			case ProductLineEditPart.VISUAL_ID:
				return new ProductLineEditPart(view);

			case ProductLineNameEditPart.VISUAL_ID:
				return new ProductLineNameEditPart(view);

			case ProductStyleEditPart.VISUAL_ID:
				return new ProductStyleEditPart(view);

			case ProductStyleNameEditPart.VISUAL_ID:
				return new ProductStyleNameEditPart(view);

			case ProductEditPart.VISUAL_ID:
				return new ProductEditPart(view);

			case ProductNameEditPart.VISUAL_ID:
				return new ProductNameEditPart(view);

			case FashionStyleEditPart.VISUAL_ID:
				return new FashionStyleEditPart(view);

			case FashionStyleNameEditPart.VISUAL_ID:
				return new FashionStyleNameEditPart(view);

			case ArticleEditPart.VISUAL_ID:
				return new ArticleEditPart(view);

			case ArticleTypeTitleEditPart.VISUAL_ID:
				return new ArticleTypeTitleEditPart(view);

			case TVProgramEditPart.VISUAL_ID:
				return new TVProgramEditPart(view);

			case TVProgramTypeNameEditPart.VISUAL_ID:
				return new TVProgramTypeNameEditPart(view);

			case SingleBrandEvent2EditPart.VISUAL_ID:
				return new SingleBrandEvent2EditPart(view);

			case SingleBrandEventNameYearMonthDayHourMin2EditPart.VISUAL_ID:
				return new SingleBrandEventNameYearMonthDayHourMin2EditPart(
						view);

			case AdvertisingProduct2EditPart.VISUAL_ID:
				return new AdvertisingProduct2EditPart(view);

			case AdvertisingProductNameType2EditPart.VISUAL_ID:
				return new AdvertisingProductNameType2EditPart(view);

			case ProductStyle2EditPart.VISUAL_ID:
				return new ProductStyle2EditPart(view);

			case ProductStyleName2EditPart.VISUAL_ID:
				return new ProductStyleName2EditPart(view);

			case Product2EditPart.VISUAL_ID:
				return new Product2EditPart(view);

			case ProductName2EditPart.VISUAL_ID:
				return new ProductName2EditPart(view);

			case SpatioTemporalDescriptorEditPart.VISUAL_ID:
				return new SpatioTemporalDescriptorEditPart(view);

			case SpatioTemporalDescriptorPeriodLocationEditPart.VISUAL_ID:
				return new SpatioTemporalDescriptorPeriodLocationEditPart(view);

			case BloggerBloggerReportsCompartmentEditPart.VISUAL_ID:
				return new BloggerBloggerReportsCompartmentEditPart(view);

			case CriticCriticReportsCompartmentEditPart.VISUAL_ID:
				return new CriticCriticReportsCompartmentEditPart(view);

			case InfluencerInfluencerReportsCompartmentEditPart.VISUAL_ID:
				return new InfluencerInfluencerReportsCompartmentEditPart(view);

			case FamousBrandFamousBrandReportsCompartmentEditPart.VISUAL_ID:
				return new FamousBrandFamousBrandReportsCompartmentEditPart(
						view);

			case EmergingBrandEmergingBrandReportsCompartmentEditPart.VISUAL_ID:
				return new EmergingBrandEmergingBrandReportsCompartmentEditPart(
						view);

			case LocalBrandLocalBrandReportsCompartmentEditPart.VISUAL_ID:
				return new LocalBrandLocalBrandReportsCompartmentEditPart(view);

			case MacroEventMacroEventReportsCompartmentEditPart.VISUAL_ID:
				return new MacroEventMacroEventReportsCompartmentEditPart(view);

			case MacroEventMacroEventSingleBrandEventsCompartmentEditPart.VISUAL_ID:
				return new MacroEventMacroEventSingleBrandEventsCompartmentEditPart(
						view);

			case SingleBrandEventSingleBrandEventReportsCompartmentEditPart.VISUAL_ID:
				return new SingleBrandEventSingleBrandEventReportsCompartmentEditPart(
						view);

			case SingleBrandEventSingleBrandEventReportsCompartment2EditPart.VISUAL_ID:
				return new SingleBrandEventSingleBrandEventReportsCompartment2EditPart(
						view);

			case PhotoPhotoReportsCompartmentEditPart.VISUAL_ID:
				return new PhotoPhotoReportsCompartmentEditPart(view);

			case DescriptionDescriptionReportsCompartmentEditPart.VISUAL_ID:
				return new DescriptionDescriptionReportsCompartmentEditPart(
						view);

			case CommentCommentReportsCompartmentEditPart.VISUAL_ID:
				return new CommentCommentReportsCompartmentEditPart(view);

			case DesignerDesignerReportsCompartmentEditPart.VISUAL_ID:
				return new DesignerDesignerReportsCompartmentEditPart(view);

			case ModelModelReportsCompartmentEditPart.VISUAL_ID:
				return new ModelModelReportsCompartmentEditPart(view);

			case PresenterPresenterReportsCompartmentEditPart.VISUAL_ID:
				return new PresenterPresenterReportsCompartmentEditPart(view);

			case ChoreographerChoreographerReportsCompartmentEditPart.VISUAL_ID:
				return new ChoreographerChoreographerReportsCompartmentEditPart(
						view);

			case PhotographerPhotographerReportsCompartmentEditPart.VISUAL_ID:
				return new PhotographerPhotographerReportsCompartmentEditPart(
						view);

			case AdvertisingCampaignAdvertisingCampaignReportsCompartmentEditPart.VISUAL_ID:
				return new AdvertisingCampaignAdvertisingCampaignReportsCompartmentEditPart(
						view);

			case AdvertisingCampaignAdvertisingCampaignProductsCompartmentEditPart.VISUAL_ID:
				return new AdvertisingCampaignAdvertisingCampaignProductsCompartmentEditPart(
						view);

			case AdvertisingProductAdvertisingProductReportsCompartmentEditPart.VISUAL_ID:
				return new AdvertisingProductAdvertisingProductReportsCompartmentEditPart(
						view);

			case AdvertisingProductAdvertisingProductReportsCompartment2EditPart.VISUAL_ID:
				return new AdvertisingProductAdvertisingProductReportsCompartment2EditPart(
						view);

			case ProductLineProductLineReportsCompartmentEditPart.VISUAL_ID:
				return new ProductLineProductLineReportsCompartmentEditPart(
						view);

			case ProductLineProductLineProductStylesCompartmentEditPart.VISUAL_ID:
				return new ProductLineProductLineProductStylesCompartmentEditPart(
						view);

			case ProductLineProductLineProductsCompartmentEditPart.VISUAL_ID:
				return new ProductLineProductLineProductsCompartmentEditPart(
						view);

			case ProductStyleProductStyleReportsCompartmentEditPart.VISUAL_ID:
				return new ProductStyleProductStyleReportsCompartmentEditPart(
						view);

			case ProductProductReportsCompartmentEditPart.VISUAL_ID:
				return new ProductProductReportsCompartmentEditPart(view);

			case ProductStyleProductStyleReportsCompartment2EditPart.VISUAL_ID:
				return new ProductStyleProductStyleReportsCompartment2EditPart(
						view);

			case ProductProductReportsCompartment2EditPart.VISUAL_ID:
				return new ProductProductReportsCompartment2EditPart(view);

			case FashionStyleFashionStyleDescriptorsCompartmentEditPart.VISUAL_ID:
				return new FashionStyleFashionStyleDescriptorsCompartmentEditPart(
						view);

			case FashionElementStylesEditPart.VISUAL_ID:
				return new FashionElementStylesEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case NewsReportElementsEditPart.VISUAL_ID:
				return new NewsReportElementsEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case FashionStyleElementsEditPart.VISUAL_ID:
				return new FashionStyleElementsEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			case BrandCampaignsEditPart.VISUAL_ID:
				return new BrandCampaignsEditPart(view);

			case WrappingLabel4EditPart.VISUAL_ID:
				return new WrappingLabel4EditPart(view);

			case BrandProductLinesEditPart.VISUAL_ID:
				return new BrandProductLinesEditPart(view);

			case WrappingLabel5EditPart.VISUAL_ID:
				return new WrappingLabel5EditPart(view);

			case BrandDesignersEditPart.VISUAL_ID:
				return new BrandDesignersEditPart(view);

			case WrappingLabel6EditPart.VISUAL_ID:
				return new WrappingLabel6EditPart(view);

			case AdvertisingCampaignBrandEditPart.VISUAL_ID:
				return new AdvertisingCampaignBrandEditPart(view);

			case WrappingLabel7EditPart.VISUAL_ID:
				return new WrappingLabel7EditPart(view);

			case EventRolesEditPart.VISUAL_ID:
				return new EventRolesEditPart(view);

			case WrappingLabel8EditPart.VISUAL_ID:
				return new WrappingLabel8EditPart(view);

			case SingleBrandEventBrandEditPart.VISUAL_ID:
				return new SingleBrandEventBrandEditPart(view);

			case WrappingLabel9EditPart.VISUAL_ID:
				return new WrappingLabel9EditPart(view);

			case ProductLineBrandEditPart.VISUAL_ID:
				return new ProductLineBrandEditPart(view);

			case WrappingLabel10EditPart.VISUAL_ID:
				return new WrappingLabel10EditPart(view);

			case ProductReviewsEditPart.VISUAL_ID:
				return new ProductReviewsEditPart(view);

			case WrappingLabel11EditPart.VISUAL_ID:
				return new WrappingLabel11EditPart(view);

			case ReviewProductEditPart.VISUAL_ID:
				return new ReviewProductEditPart(view);

			case WrappingLabel12EditPart.VISUAL_ID:
				return new WrappingLabel12EditPart(view);

			case ReviewReviewerEditPart.VISUAL_ID:
				return new ReviewReviewerEditPart(view);

			case WrappingLabel13EditPart.VISUAL_ID:
				return new WrappingLabel13EditPart(view);

			case RoleEventsEditPart.VISUAL_ID:
				return new RoleEventsEditPart(view);

			case WrappingLabel14EditPart.VISUAL_ID:
				return new WrappingLabel14EditPart(view);

			case DesignerBrandEditPart.VISUAL_ID:
				return new DesignerBrandEditPart(view);

			case WrappingLabel15EditPart.VISUAL_ID:
				return new WrappingLabel15EditPart(view);

			case ReviewerReviewsEditPart.VISUAL_ID:
				return new ReviewerReviewsEditPart(view);

			case WrappingLabel16EditPart.VISUAL_ID:
				return new WrappingLabel16EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
