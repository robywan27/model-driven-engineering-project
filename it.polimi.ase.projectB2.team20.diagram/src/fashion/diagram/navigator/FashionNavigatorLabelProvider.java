/*
 * 
 */
package fashion.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import fashion.diagram.edit.parts.AdvertisingCampaignBrandEditPart;
import fashion.diagram.edit.parts.AdvertisingCampaignEditPart;
import fashion.diagram.edit.parts.AdvertisingCampaignNameEditPart;
import fashion.diagram.edit.parts.AdvertisingProduct2EditPart;
import fashion.diagram.edit.parts.AdvertisingProductEditPart;
import fashion.diagram.edit.parts.AdvertisingProductNameType2EditPart;
import fashion.diagram.edit.parts.AdvertisingProductNameTypeEditPart;
import fashion.diagram.edit.parts.ArticleEditPart;
import fashion.diagram.edit.parts.ArticleMagazineEditPart;
import fashion.diagram.edit.parts.ArticleTypeMagazineEditPart;
import fashion.diagram.edit.parts.ArticleTypeTitleEditPart;
import fashion.diagram.edit.parts.BloggerEditPart;
import fashion.diagram.edit.parts.BloggerNameEditPart;
import fashion.diagram.edit.parts.BrandCampaignsEditPart;
import fashion.diagram.edit.parts.BrandDesignersEditPart;
import fashion.diagram.edit.parts.BrandProductLinesEditPart;
import fashion.diagram.edit.parts.ChoreographerEditPart;
import fashion.diagram.edit.parts.ChoreographerNameEditPart;
import fashion.diagram.edit.parts.CommentEditPart;
import fashion.diagram.edit.parts.CommentIdEditPart;
import fashion.diagram.edit.parts.CommentTextEditPart;
import fashion.diagram.edit.parts.CriticEditPart;
import fashion.diagram.edit.parts.CriticNameEditPart;
import fashion.diagram.edit.parts.DescriptionEditPart;
import fashion.diagram.edit.parts.DescriptionIdEditPart;
import fashion.diagram.edit.parts.DescriptionTextEditPart;
import fashion.diagram.edit.parts.DesignerBrandEditPart;
import fashion.diagram.edit.parts.DesignerEditPart;
import fashion.diagram.edit.parts.DesignerNameEditPart;
import fashion.diagram.edit.parts.EmergingBrandCountriesEditPart;
import fashion.diagram.edit.parts.EmergingBrandEditPart;
import fashion.diagram.edit.parts.EmergingBrandNameEditPart;
import fashion.diagram.edit.parts.EventRolesEditPart;
import fashion.diagram.edit.parts.FamousBrandCountriesEditPart;
import fashion.diagram.edit.parts.FamousBrandEditPart;
import fashion.diagram.edit.parts.FamousBrandNameEditPart;
import fashion.diagram.edit.parts.FashionDomainEditPart;
import fashion.diagram.edit.parts.FashionElementStylesEditPart;
import fashion.diagram.edit.parts.FashionStyleEditPart;
import fashion.diagram.edit.parts.FashionStyleElementsEditPart;
import fashion.diagram.edit.parts.FashionStyleNameEditPart;
import fashion.diagram.edit.parts.InfluencerEditPart;
import fashion.diagram.edit.parts.InfluencerNameEditPart;
import fashion.diagram.edit.parts.LocalBrandCountryEditPart;
import fashion.diagram.edit.parts.LocalBrandEditPart;
import fashion.diagram.edit.parts.LocalBrandNameEditPart;
import fashion.diagram.edit.parts.MacroEventCityEditPart;
import fashion.diagram.edit.parts.MacroEventEditPart;
import fashion.diagram.edit.parts.MacroEventNameEditPart;
import fashion.diagram.edit.parts.MacroEventNameYearMonthCityEditPart;
import fashion.diagram.edit.parts.ModelEditPart;
import fashion.diagram.edit.parts.ModelNameEditPart;
import fashion.diagram.edit.parts.NewsReportElementsEditPart;
import fashion.diagram.edit.parts.PhotoEditPart;
import fashion.diagram.edit.parts.PhotoIdEditPart;
import fashion.diagram.edit.parts.PhotoTagsEditPart;
import fashion.diagram.edit.parts.PhotographerEditPart;
import fashion.diagram.edit.parts.PhotographerNameEditPart;
import fashion.diagram.edit.parts.PresenterEditPart;
import fashion.diagram.edit.parts.PresenterNameEditPart;
import fashion.diagram.edit.parts.Product2EditPart;
import fashion.diagram.edit.parts.ProductEditPart;
import fashion.diagram.edit.parts.ProductLineBrandEditPart;
import fashion.diagram.edit.parts.ProductLineEditPart;
import fashion.diagram.edit.parts.ProductLineNameEditPart;
import fashion.diagram.edit.parts.ProductName2EditPart;
import fashion.diagram.edit.parts.ProductNameEditPart;
import fashion.diagram.edit.parts.ProductReviewsEditPart;
import fashion.diagram.edit.parts.ProductStyle2EditPart;
import fashion.diagram.edit.parts.ProductStyleEditPart;
import fashion.diagram.edit.parts.ProductStyleName2EditPart;
import fashion.diagram.edit.parts.ProductStyleNameEditPart;
import fashion.diagram.edit.parts.ReviewProductEditPart;
import fashion.diagram.edit.parts.ReviewReviewerEditPart;
import fashion.diagram.edit.parts.ReviewerReviewsEditPart;
import fashion.diagram.edit.parts.RoleEventsEditPart;
import fashion.diagram.edit.parts.SingleBrandEvent2EditPart;
import fashion.diagram.edit.parts.SingleBrandEventBrandEditPart;
import fashion.diagram.edit.parts.SingleBrandEventDayHourMinute2EditPart;
import fashion.diagram.edit.parts.SingleBrandEventDayHourMinuteEditPart;
import fashion.diagram.edit.parts.SingleBrandEventEditPart;
import fashion.diagram.edit.parts.SingleBrandEventNameEditPart;
import fashion.diagram.edit.parts.SingleBrandEventNameYearMonthDayHourMin2EditPart;
import fashion.diagram.edit.parts.SingleBrandEventNameYearMonthDayHourMinEditPart;
import fashion.diagram.edit.parts.SpatioTemporalDescriptorEditPart;
import fashion.diagram.edit.parts.SpatioTemporalDescriptorPeriodLocationEditPart;
import fashion.diagram.edit.parts.TVProgramEditPart;
import fashion.diagram.edit.parts.TVProgramNameEditPart;
import fashion.diagram.edit.parts.TVProgramTypeNameEditPart;
import fashion.diagram.part.FashionDiagramEditorPlugin;
import fashion.diagram.part.FashionVisualIDRegistry;
import fashion.diagram.providers.FashionElementTypes;
import fashion.diagram.providers.FashionParserProvider;

/**
 * @generated
 */
public class FashionNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		FashionDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		FashionDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof FashionNavigatorItem
				&& !isOwnView(((FashionNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof FashionNavigatorGroup) {
			FashionNavigatorGroup group = (FashionNavigatorGroup) element;
			return FashionDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof FashionNavigatorItem) {
			FashionNavigatorItem navigatorItem = (FashionNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (FashionVisualIDRegistry.getVisualID(view)) {
		case FashionDomainEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://fashion.it?FashionDomain", FashionElementTypes.FashionDomain_1000); //$NON-NLS-1$
		case BloggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Blogger", FashionElementTypes.Blogger_2001); //$NON-NLS-1$
		case CriticEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Critic", FashionElementTypes.Critic_2002); //$NON-NLS-1$
		case InfluencerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Influencer", FashionElementTypes.Influencer_2003); //$NON-NLS-1$
		case FamousBrandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?FamousBrand", FashionElementTypes.FamousBrand_2004); //$NON-NLS-1$
		case EmergingBrandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?EmergingBrand", FashionElementTypes.EmergingBrand_2005); //$NON-NLS-1$
		case LocalBrandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?LocalBrand", FashionElementTypes.LocalBrand_2006); //$NON-NLS-1$
		case MacroEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?MacroEvent", FashionElementTypes.MacroEvent_2007); //$NON-NLS-1$
		case SingleBrandEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?SingleBrandEvent", FashionElementTypes.SingleBrandEvent_2008); //$NON-NLS-1$
		case PhotoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Photo", FashionElementTypes.Photo_2009); //$NON-NLS-1$
		case DescriptionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Description", FashionElementTypes.Description_2010); //$NON-NLS-1$
		case CommentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Comment", FashionElementTypes.Comment_2011); //$NON-NLS-1$
		case DesignerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Designer", FashionElementTypes.Designer_2012); //$NON-NLS-1$
		case ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Model", FashionElementTypes.Model_2013); //$NON-NLS-1$
		case PresenterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Presenter", FashionElementTypes.Presenter_2014); //$NON-NLS-1$
		case ChoreographerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Choreographer", FashionElementTypes.Choreographer_2015); //$NON-NLS-1$
		case PhotographerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Photographer", FashionElementTypes.Photographer_2016); //$NON-NLS-1$
		case AdvertisingCampaignEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?AdvertisingCampaign", FashionElementTypes.AdvertisingCampaign_2017); //$NON-NLS-1$
		case ProductLineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?ProductLine", FashionElementTypes.ProductLine_2018); //$NON-NLS-1$
		case ProductStyleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?ProductStyle", FashionElementTypes.ProductStyle_2019); //$NON-NLS-1$
		case ProductEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?Product", FashionElementTypes.Product_2020); //$NON-NLS-1$
		case FashionStyleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?FashionStyle", FashionElementTypes.FashionStyle_2021); //$NON-NLS-1$
		case AdvertisingProductEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://fashion.it?AdvertisingProduct", FashionElementTypes.AdvertisingProduct_2022); //$NON-NLS-1$
		case ArticleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://fashion.it?Article", FashionElementTypes.Article_3001); //$NON-NLS-1$
		case TVProgramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://fashion.it?TVProgram", FashionElementTypes.TVProgram_3002); //$NON-NLS-1$
		case SpatioTemporalDescriptorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://fashion.it?SpatioTemporalDescriptor", FashionElementTypes.SpatioTemporalDescriptor_3003); //$NON-NLS-1$
		case AdvertisingProduct2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://fashion.it?AdvertisingProduct", FashionElementTypes.AdvertisingProduct_3004); //$NON-NLS-1$
		case SingleBrandEvent2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://fashion.it?SingleBrandEvent", FashionElementTypes.SingleBrandEvent_3005); //$NON-NLS-1$
		case ProductStyle2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://fashion.it?ProductStyle", FashionElementTypes.ProductStyle_3006); //$NON-NLS-1$
		case Product2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://fashion.it?Product", FashionElementTypes.Product_3007); //$NON-NLS-1$
		case FashionElementStylesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?FashionElement?styles", FashionElementTypes.FashionElementStyles_4001); //$NON-NLS-1$
		case NewsReportElementsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?NewsReport?elements", FashionElementTypes.NewsReportElements_4002); //$NON-NLS-1$
		case FashionStyleElementsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?FashionStyle?elements", FashionElementTypes.FashionStyleElements_4003); //$NON-NLS-1$
		case BrandCampaignsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?Brand?campaigns", FashionElementTypes.BrandCampaigns_4004); //$NON-NLS-1$
		case BrandProductLinesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?Brand?productLines", FashionElementTypes.BrandProductLines_4005); //$NON-NLS-1$
		case BrandDesignersEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?Brand?designers", FashionElementTypes.BrandDesigners_4006); //$NON-NLS-1$
		case AdvertisingCampaignBrandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?AdvertisingCampaign?brand", FashionElementTypes.AdvertisingCampaignBrand_4007); //$NON-NLS-1$
		case EventRolesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?Event?roles", FashionElementTypes.EventRoles_4008); //$NON-NLS-1$
		case SingleBrandEventBrandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?SingleBrandEvent?brand", FashionElementTypes.SingleBrandEventBrand_4009); //$NON-NLS-1$
		case ProductLineBrandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?ProductLine?brand", FashionElementTypes.ProductLineBrand_4010); //$NON-NLS-1$
		case ProductReviewsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?Product?reviews", FashionElementTypes.ProductReviews_4011); //$NON-NLS-1$
		case ReviewProductEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?Review?product", FashionElementTypes.ReviewProduct_4012); //$NON-NLS-1$
		case ReviewReviewerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?Review?reviewer", FashionElementTypes.ReviewReviewer_4013); //$NON-NLS-1$
		case RoleEventsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?Role?events", FashionElementTypes.RoleEvents_4014); //$NON-NLS-1$
		case DesignerBrandEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?Designer?brand", FashionElementTypes.DesignerBrand_4015); //$NON-NLS-1$
		case ReviewerReviewsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://fashion.it?Reviewer?reviews", FashionElementTypes.ReviewerReviews_4016); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = FashionDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& FashionElementTypes.isKnownElementType(elementType)) {
			image = FashionElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof FashionNavigatorGroup) {
			FashionNavigatorGroup group = (FashionNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof FashionNavigatorItem) {
			FashionNavigatorItem navigatorItem = (FashionNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (FashionVisualIDRegistry.getVisualID(view)) {
		case FashionDomainEditPart.VISUAL_ID:
			return getFashionDomain_1000Text(view);
		case BloggerEditPart.VISUAL_ID:
			return getBlogger_2001Text(view);
		case CriticEditPart.VISUAL_ID:
			return getCritic_2002Text(view);
		case InfluencerEditPart.VISUAL_ID:
			return getInfluencer_2003Text(view);
		case FamousBrandEditPart.VISUAL_ID:
			return getFamousBrand_2004Text(view);
		case EmergingBrandEditPart.VISUAL_ID:
			return getEmergingBrand_2005Text(view);
		case LocalBrandEditPart.VISUAL_ID:
			return getLocalBrand_2006Text(view);
		case MacroEventEditPart.VISUAL_ID:
			return getMacroEvent_2007Text(view);
		case SingleBrandEventEditPart.VISUAL_ID:
			return getSingleBrandEvent_2008Text(view);
		case PhotoEditPart.VISUAL_ID:
			return getPhoto_2009Text(view);
		case DescriptionEditPart.VISUAL_ID:
			return getDescription_2010Text(view);
		case CommentEditPart.VISUAL_ID:
			return getComment_2011Text(view);
		case DesignerEditPart.VISUAL_ID:
			return getDesigner_2012Text(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_2013Text(view);
		case PresenterEditPart.VISUAL_ID:
			return getPresenter_2014Text(view);
		case ChoreographerEditPart.VISUAL_ID:
			return getChoreographer_2015Text(view);
		case PhotographerEditPart.VISUAL_ID:
			return getPhotographer_2016Text(view);
		case AdvertisingCampaignEditPart.VISUAL_ID:
			return getAdvertisingCampaign_2017Text(view);
		case ProductLineEditPart.VISUAL_ID:
			return getProductLine_2018Text(view);
		case ProductStyleEditPart.VISUAL_ID:
			return getProductStyle_2019Text(view);
		case ProductEditPart.VISUAL_ID:
			return getProduct_2020Text(view);
		case FashionStyleEditPart.VISUAL_ID:
			return getFashionStyle_2021Text(view);
		case AdvertisingProductEditPart.VISUAL_ID:
			return getAdvertisingProduct_2022Text(view);
		case ArticleEditPart.VISUAL_ID:
			return getArticle_3001Text(view);
		case TVProgramEditPart.VISUAL_ID:
			return getTVProgram_3002Text(view);
		case SpatioTemporalDescriptorEditPart.VISUAL_ID:
			return getSpatioTemporalDescriptor_3003Text(view);
		case AdvertisingProduct2EditPart.VISUAL_ID:
			return getAdvertisingProduct_3004Text(view);
		case SingleBrandEvent2EditPart.VISUAL_ID:
			return getSingleBrandEvent_3005Text(view);
		case ProductStyle2EditPart.VISUAL_ID:
			return getProductStyle_3006Text(view);
		case Product2EditPart.VISUAL_ID:
			return getProduct_3007Text(view);
		case FashionElementStylesEditPart.VISUAL_ID:
			return getFashionElementStyles_4001Text(view);
		case NewsReportElementsEditPart.VISUAL_ID:
			return getNewsReportElements_4002Text(view);
		case FashionStyleElementsEditPart.VISUAL_ID:
			return getFashionStyleElements_4003Text(view);
		case BrandCampaignsEditPart.VISUAL_ID:
			return getBrandCampaigns_4004Text(view);
		case BrandProductLinesEditPart.VISUAL_ID:
			return getBrandProductLines_4005Text(view);
		case BrandDesignersEditPart.VISUAL_ID:
			return getBrandDesigners_4006Text(view);
		case AdvertisingCampaignBrandEditPart.VISUAL_ID:
			return getAdvertisingCampaignBrand_4007Text(view);
		case EventRolesEditPart.VISUAL_ID:
			return getEventRoles_4008Text(view);
		case SingleBrandEventBrandEditPart.VISUAL_ID:
			return getSingleBrandEventBrand_4009Text(view);
		case ProductLineBrandEditPart.VISUAL_ID:
			return getProductLineBrand_4010Text(view);
		case ProductReviewsEditPart.VISUAL_ID:
			return getProductReviews_4011Text(view);
		case ReviewProductEditPart.VISUAL_ID:
			return getReviewProduct_4012Text(view);
		case ReviewReviewerEditPart.VISUAL_ID:
			return getReviewReviewer_4013Text(view);
		case RoleEventsEditPart.VISUAL_ID:
			return getRoleEvents_4014Text(view);
		case DesignerBrandEditPart.VISUAL_ID:
			return getDesignerBrand_4015Text(view);
		case ReviewerReviewsEditPart.VISUAL_ID:
			return getReviewerReviews_4016Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getFashionDomain_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBlogger_2001Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Blogger_2001,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry.getType(BloggerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCritic_2002Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Critic_2002,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry.getType(CriticNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfluencer_2003Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Influencer_2003,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(InfluencerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFamousBrand_2004Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.FamousBrand_2004,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(FamousBrandNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEmergingBrand_2005Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.EmergingBrand_2005,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(EmergingBrandNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLocalBrand_2006Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.LocalBrand_2006,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(LocalBrandNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMacroEvent_2007Text(View view) {
		IParser parser = FashionParserProvider
				.getParser(
						FashionElementTypes.MacroEvent_2007,
						view.getElement() != null ? view.getElement() : view,
						FashionVisualIDRegistry
								.getType(MacroEventNameYearMonthCityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleBrandEvent_2008Text(View view) {
		IParser parser = FashionParserProvider
				.getParser(
						FashionElementTypes.SingleBrandEvent_2008,
						view.getElement() != null ? view.getElement() : view,
						FashionVisualIDRegistry
								.getType(SingleBrandEventNameYearMonthDayHourMinEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPhoto_2009Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Photo_2009,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry.getType(PhotoIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDescription_2010Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Description_2010,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(DescriptionIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComment_2011Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Comment_2011,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry.getType(CommentIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDesigner_2012Text(View view) {
		IParser parser = FashionParserProvider
				.getParser(FashionElementTypes.Designer_2012,
						view.getElement() != null ? view.getElement() : view,
						FashionVisualIDRegistry
								.getType(DesignerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModel_2013Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Model_2013,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry.getType(ModelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPresenter_2014Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Presenter_2014,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(PresenterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChoreographer_2015Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Choreographer_2015,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(ChoreographerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPhotographer_2016Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Photographer_2016,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(PhotographerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAdvertisingCampaign_2017Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.AdvertisingCampaign_2017,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(AdvertisingCampaignNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProductLine_2018Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.ProductLine_2018,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(ProductLineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProductStyle_2019Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.ProductStyle_2019,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(ProductStyleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProduct_2020Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Product_2020,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry.getType(ProductNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFashionStyle_2021Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.FashionStyle_2021,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(FashionStyleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAdvertisingProduct_2022Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.AdvertisingProduct_2022,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(AdvertisingProductNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArticle_3001Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.Article_3001,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(ArticleTypeTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTVProgram_3002Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.TVProgram_3002,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(TVProgramTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpatioTemporalDescriptor_3003Text(View view) {
		IParser parser = FashionParserProvider
				.getParser(
						FashionElementTypes.SpatioTemporalDescriptor_3003,
						view.getElement() != null ? view.getElement() : view,
						FashionVisualIDRegistry
								.getType(SpatioTemporalDescriptorPeriodLocationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAdvertisingProduct_3004Text(View view) {
		IParser parser = FashionParserProvider
				.getParser(
						FashionElementTypes.AdvertisingProduct_3004,
						view.getElement() != null ? view.getElement() : view,
						FashionVisualIDRegistry
								.getType(AdvertisingProductNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleBrandEvent_3005Text(View view) {
		IParser parser = FashionParserProvider
				.getParser(
						FashionElementTypes.SingleBrandEvent_3005,
						view.getElement() != null ? view.getElement() : view,
						FashionVisualIDRegistry
								.getType(SingleBrandEventNameYearMonthDayHourMin2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProductStyle_3006Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.ProductStyle_3006,
				view.getElement() != null ? view.getElement() : view,
				FashionVisualIDRegistry
						.getType(ProductStyleName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProduct_3007Text(View view) {
		IParser parser = FashionParserProvider
				.getParser(FashionElementTypes.Product_3007,
						view.getElement() != null ? view.getElement() : view,
						FashionVisualIDRegistry
								.getType(ProductName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFashionElementStyles_4001Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.FashionElementStyles_4001,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNewsReportElements_4002Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.NewsReportElements_4002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFashionStyleElements_4003Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.FashionStyleElements_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBrandCampaigns_4004Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.BrandCampaigns_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBrandProductLines_4005Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.BrandProductLines_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBrandDesigners_4006Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.BrandDesigners_4006,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAdvertisingCampaignBrand_4007Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.AdvertisingCampaignBrand_4007,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventRoles_4008Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.EventRoles_4008,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleBrandEventBrand_4009Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.SingleBrandEventBrand_4009,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProductLineBrand_4010Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.ProductLineBrand_4010,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProductReviews_4011Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.ProductReviews_4011,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReviewProduct_4012Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.ReviewProduct_4012,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReviewReviewer_4013Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.ReviewReviewer_4013,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRoleEvents_4014Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.RoleEvents_4014,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDesignerBrand_4015Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.DesignerBrand_4015,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReviewerReviews_4016Text(View view) {
		IParser parser = FashionParserProvider.getParser(
				FashionElementTypes.ReviewerReviews_4016,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			FashionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return FashionDomainEditPart.MODEL_ID.equals(FashionVisualIDRegistry
				.getModelID(view));
	}

}
