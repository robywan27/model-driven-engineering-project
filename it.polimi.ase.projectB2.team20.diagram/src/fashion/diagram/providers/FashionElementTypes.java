/*
 * 
 */
package fashion.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import fashion.FashionPackage;
import fashion.diagram.edit.parts.AdvertisingCampaignBrandEditPart;
import fashion.diagram.edit.parts.AdvertisingCampaignEditPart;
import fashion.diagram.edit.parts.AdvertisingProduct2EditPart;
import fashion.diagram.edit.parts.AdvertisingProductEditPart;
import fashion.diagram.edit.parts.ArticleEditPart;
import fashion.diagram.edit.parts.BloggerEditPart;
import fashion.diagram.edit.parts.BrandCampaignsEditPart;
import fashion.diagram.edit.parts.BrandDesignersEditPart;
import fashion.diagram.edit.parts.BrandProductLinesEditPart;
import fashion.diagram.edit.parts.ChoreographerEditPart;
import fashion.diagram.edit.parts.CommentEditPart;
import fashion.diagram.edit.parts.CriticEditPart;
import fashion.diagram.edit.parts.DescriptionEditPart;
import fashion.diagram.edit.parts.DesignerBrandEditPart;
import fashion.diagram.edit.parts.DesignerEditPart;
import fashion.diagram.edit.parts.EmergingBrandEditPart;
import fashion.diagram.edit.parts.EventRolesEditPart;
import fashion.diagram.edit.parts.FamousBrandEditPart;
import fashion.diagram.edit.parts.FashionDomainEditPart;
import fashion.diagram.edit.parts.FashionElementStylesEditPart;
import fashion.diagram.edit.parts.FashionStyleEditPart;
import fashion.diagram.edit.parts.FashionStyleElementsEditPart;
import fashion.diagram.edit.parts.InfluencerEditPart;
import fashion.diagram.edit.parts.LocalBrandEditPart;
import fashion.diagram.edit.parts.MacroEventEditPart;
import fashion.diagram.edit.parts.ModelEditPart;
import fashion.diagram.edit.parts.NewsReportElementsEditPart;
import fashion.diagram.edit.parts.PhotoEditPart;
import fashion.diagram.edit.parts.PhotographerEditPart;
import fashion.diagram.edit.parts.PresenterEditPart;
import fashion.diagram.edit.parts.Product2EditPart;
import fashion.diagram.edit.parts.ProductEditPart;
import fashion.diagram.edit.parts.ProductLineBrandEditPart;
import fashion.diagram.edit.parts.ProductLineEditPart;
import fashion.diagram.edit.parts.ProductReviewsEditPart;
import fashion.diagram.edit.parts.ProductStyle2EditPart;
import fashion.diagram.edit.parts.ProductStyleEditPart;
import fashion.diagram.edit.parts.ReviewProductEditPart;
import fashion.diagram.edit.parts.ReviewReviewerEditPart;
import fashion.diagram.edit.parts.ReviewerReviewsEditPart;
import fashion.diagram.edit.parts.RoleEventsEditPart;
import fashion.diagram.edit.parts.SingleBrandEvent2EditPart;
import fashion.diagram.edit.parts.SingleBrandEventBrandEditPart;
import fashion.diagram.edit.parts.SingleBrandEventEditPart;
import fashion.diagram.edit.parts.SpatioTemporalDescriptorEditPart;
import fashion.diagram.edit.parts.TVProgramEditPart;
import fashion.diagram.part.FashionDiagramEditorPlugin;

/**
 * @generated
 */
public class FashionElementTypes {

	/**
	 * @generated
	 */
	private FashionElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			FashionDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType FashionDomain_1000 = getElementType("it.polimi.ase.projectB2.team20.diagram.FashionDomain_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Blogger_2001 = getElementType("it.polimi.ase.projectB2.team20.diagram.Blogger_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Critic_2002 = getElementType("it.polimi.ase.projectB2.team20.diagram.Critic_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Influencer_2003 = getElementType("it.polimi.ase.projectB2.team20.diagram.Influencer_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FamousBrand_2004 = getElementType("it.polimi.ase.projectB2.team20.diagram.FamousBrand_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EmergingBrand_2005 = getElementType("it.polimi.ase.projectB2.team20.diagram.EmergingBrand_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LocalBrand_2006 = getElementType("it.polimi.ase.projectB2.team20.diagram.LocalBrand_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MacroEvent_2007 = getElementType("it.polimi.ase.projectB2.team20.diagram.MacroEvent_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleBrandEvent_2008 = getElementType("it.polimi.ase.projectB2.team20.diagram.SingleBrandEvent_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Photo_2009 = getElementType("it.polimi.ase.projectB2.team20.diagram.Photo_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Description_2010 = getElementType("it.polimi.ase.projectB2.team20.diagram.Description_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Comment_2011 = getElementType("it.polimi.ase.projectB2.team20.diagram.Comment_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Designer_2012 = getElementType("it.polimi.ase.projectB2.team20.diagram.Designer_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Model_2013 = getElementType("it.polimi.ase.projectB2.team20.diagram.Model_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Presenter_2014 = getElementType("it.polimi.ase.projectB2.team20.diagram.Presenter_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Choreographer_2015 = getElementType("it.polimi.ase.projectB2.team20.diagram.Choreographer_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Photographer_2016 = getElementType("it.polimi.ase.projectB2.team20.diagram.Photographer_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AdvertisingCampaign_2017 = getElementType("it.polimi.ase.projectB2.team20.diagram.AdvertisingCampaign_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AdvertisingProduct_2022 = getElementType("it.polimi.ase.projectB2.team20.diagram.AdvertisingProduct_2022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProductLine_2018 = getElementType("it.polimi.ase.projectB2.team20.diagram.ProductLine_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProductStyle_2019 = getElementType("it.polimi.ase.projectB2.team20.diagram.ProductStyle_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Product_2020 = getElementType("it.polimi.ase.projectB2.team20.diagram.Product_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FashionStyle_2021 = getElementType("it.polimi.ase.projectB2.team20.diagram.FashionStyle_2021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Article_3001 = getElementType("it.polimi.ase.projectB2.team20.diagram.Article_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TVProgram_3002 = getElementType("it.polimi.ase.projectB2.team20.diagram.TVProgram_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SingleBrandEvent_3005 = getElementType("it.polimi.ase.projectB2.team20.diagram.SingleBrandEvent_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AdvertisingProduct_3004 = getElementType("it.polimi.ase.projectB2.team20.diagram.AdvertisingProduct_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProductStyle_3006 = getElementType("it.polimi.ase.projectB2.team20.diagram.ProductStyle_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Product_3007 = getElementType("it.polimi.ase.projectB2.team20.diagram.Product_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpatioTemporalDescriptor_3003 = getElementType("it.polimi.ase.projectB2.team20.diagram.SpatioTemporalDescriptor_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FashionElementStyles_4001 = getElementType("it.polimi.ase.projectB2.team20.diagram.FashionElementStyles_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NewsReportElements_4002 = getElementType("it.polimi.ase.projectB2.team20.diagram.NewsReportElements_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FashionStyleElements_4003 = getElementType("it.polimi.ase.projectB2.team20.diagram.FashionStyleElements_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BrandCampaigns_4004 = getElementType("it.polimi.ase.projectB2.team20.diagram.BrandCampaigns_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BrandProductLines_4005 = getElementType("it.polimi.ase.projectB2.team20.diagram.BrandProductLines_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BrandDesigners_4006 = getElementType("it.polimi.ase.projectB2.team20.diagram.BrandDesigners_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AdvertisingCampaignBrand_4007 = getElementType("it.polimi.ase.projectB2.team20.diagram.AdvertisingCampaignBrand_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventRoles_4008 = getElementType("it.polimi.ase.projectB2.team20.diagram.EventRoles_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SingleBrandEventBrand_4009 = getElementType("it.polimi.ase.projectB2.team20.diagram.SingleBrandEventBrand_4009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProductLineBrand_4010 = getElementType("it.polimi.ase.projectB2.team20.diagram.ProductLineBrand_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProductReviews_4011 = getElementType("it.polimi.ase.projectB2.team20.diagram.ProductReviews_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ReviewProduct_4012 = getElementType("it.polimi.ase.projectB2.team20.diagram.ReviewProduct_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ReviewReviewer_4013 = getElementType("it.polimi.ase.projectB2.team20.diagram.ReviewReviewer_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RoleEvents_4014 = getElementType("it.polimi.ase.projectB2.team20.diagram.RoleEvents_4014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DesignerBrand_4015 = getElementType("it.polimi.ase.projectB2.team20.diagram.DesignerBrand_4015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ReviewerReviews_4016 = getElementType("it.polimi.ase.projectB2.team20.diagram.ReviewerReviews_4016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(FashionDomain_1000,
					FashionPackage.eINSTANCE.getFashionDomain());

			elements.put(Blogger_2001, FashionPackage.eINSTANCE.getBlogger());

			elements.put(Critic_2002, FashionPackage.eINSTANCE.getCritic());

			elements.put(Influencer_2003,
					FashionPackage.eINSTANCE.getInfluencer());

			elements.put(FamousBrand_2004,
					FashionPackage.eINSTANCE.getFamousBrand());

			elements.put(EmergingBrand_2005,
					FashionPackage.eINSTANCE.getEmergingBrand());

			elements.put(LocalBrand_2006,
					FashionPackage.eINSTANCE.getLocalBrand());

			elements.put(MacroEvent_2007,
					FashionPackage.eINSTANCE.getMacroEvent());

			elements.put(SingleBrandEvent_2008,
					FashionPackage.eINSTANCE.getSingleBrandEvent());

			elements.put(Photo_2009, FashionPackage.eINSTANCE.getPhoto());

			elements.put(Description_2010,
					FashionPackage.eINSTANCE.getDescription());

			elements.put(Comment_2011, FashionPackage.eINSTANCE.getComment());

			elements.put(Designer_2012, FashionPackage.eINSTANCE.getDesigner());

			elements.put(Model_2013, FashionPackage.eINSTANCE.getModel());

			elements.put(Presenter_2014,
					FashionPackage.eINSTANCE.getPresenter());

			elements.put(Choreographer_2015,
					FashionPackage.eINSTANCE.getChoreographer());

			elements.put(Photographer_2016,
					FashionPackage.eINSTANCE.getPhotographer());

			elements.put(AdvertisingCampaign_2017,
					FashionPackage.eINSTANCE.getAdvertisingCampaign());

			elements.put(AdvertisingProduct_2022,
					FashionPackage.eINSTANCE.getAdvertisingProduct());

			elements.put(ProductLine_2018,
					FashionPackage.eINSTANCE.getProductLine());

			elements.put(ProductStyle_2019,
					FashionPackage.eINSTANCE.getProductStyle());

			elements.put(Product_2020, FashionPackage.eINSTANCE.getProduct());

			elements.put(FashionStyle_2021,
					FashionPackage.eINSTANCE.getFashionStyle());

			elements.put(Article_3001, FashionPackage.eINSTANCE.getArticle());

			elements.put(TVProgram_3002,
					FashionPackage.eINSTANCE.getTVProgram());

			elements.put(SingleBrandEvent_3005,
					FashionPackage.eINSTANCE.getSingleBrandEvent());

			elements.put(AdvertisingProduct_3004,
					FashionPackage.eINSTANCE.getAdvertisingProduct());

			elements.put(ProductStyle_3006,
					FashionPackage.eINSTANCE.getProductStyle());

			elements.put(Product_3007, FashionPackage.eINSTANCE.getProduct());

			elements.put(SpatioTemporalDescriptor_3003,
					FashionPackage.eINSTANCE.getSpatioTemporalDescriptor());

			elements.put(FashionElementStyles_4001,
					FashionPackage.eINSTANCE.getFashionElement_Styles());

			elements.put(NewsReportElements_4002,
					FashionPackage.eINSTANCE.getNewsReport_Elements());

			elements.put(FashionStyleElements_4003,
					FashionPackage.eINSTANCE.getFashionStyle_Elements());

			elements.put(BrandCampaigns_4004,
					FashionPackage.eINSTANCE.getBrand_Campaigns());

			elements.put(BrandProductLines_4005,
					FashionPackage.eINSTANCE.getBrand_ProductLines());

			elements.put(BrandDesigners_4006,
					FashionPackage.eINSTANCE.getBrand_Designers());

			elements.put(AdvertisingCampaignBrand_4007,
					FashionPackage.eINSTANCE.getAdvertisingCampaign_Brand());

			elements.put(EventRoles_4008,
					FashionPackage.eINSTANCE.getEvent_Roles());

			elements.put(SingleBrandEventBrand_4009,
					FashionPackage.eINSTANCE.getSingleBrandEvent_Brand());

			elements.put(ProductLineBrand_4010,
					FashionPackage.eINSTANCE.getProductLine_Brand());

			elements.put(ProductReviews_4011,
					FashionPackage.eINSTANCE.getProduct_Reviews());

			elements.put(ReviewProduct_4012,
					FashionPackage.eINSTANCE.getReview_Product());

			elements.put(ReviewReviewer_4013,
					FashionPackage.eINSTANCE.getReview_Reviewer());

			elements.put(RoleEvents_4014,
					FashionPackage.eINSTANCE.getRole_Events());

			elements.put(DesignerBrand_4015,
					FashionPackage.eINSTANCE.getDesigner_Brand());

			elements.put(ReviewerReviews_4016,
					FashionPackage.eINSTANCE.getReviewer_Reviews());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(FashionDomain_1000);
			KNOWN_ELEMENT_TYPES.add(Blogger_2001);
			KNOWN_ELEMENT_TYPES.add(Critic_2002);
			KNOWN_ELEMENT_TYPES.add(Influencer_2003);
			KNOWN_ELEMENT_TYPES.add(FamousBrand_2004);
			KNOWN_ELEMENT_TYPES.add(EmergingBrand_2005);
			KNOWN_ELEMENT_TYPES.add(LocalBrand_2006);
			KNOWN_ELEMENT_TYPES.add(MacroEvent_2007);
			KNOWN_ELEMENT_TYPES.add(SingleBrandEvent_2008);
			KNOWN_ELEMENT_TYPES.add(Photo_2009);
			KNOWN_ELEMENT_TYPES.add(Description_2010);
			KNOWN_ELEMENT_TYPES.add(Comment_2011);
			KNOWN_ELEMENT_TYPES.add(Designer_2012);
			KNOWN_ELEMENT_TYPES.add(Model_2013);
			KNOWN_ELEMENT_TYPES.add(Presenter_2014);
			KNOWN_ELEMENT_TYPES.add(Choreographer_2015);
			KNOWN_ELEMENT_TYPES.add(Photographer_2016);
			KNOWN_ELEMENT_TYPES.add(AdvertisingCampaign_2017);
			KNOWN_ELEMENT_TYPES.add(AdvertisingProduct_2022);
			KNOWN_ELEMENT_TYPES.add(ProductLine_2018);
			KNOWN_ELEMENT_TYPES.add(ProductStyle_2019);
			KNOWN_ELEMENT_TYPES.add(Product_2020);
			KNOWN_ELEMENT_TYPES.add(FashionStyle_2021);
			KNOWN_ELEMENT_TYPES.add(Article_3001);
			KNOWN_ELEMENT_TYPES.add(TVProgram_3002);
			KNOWN_ELEMENT_TYPES.add(SingleBrandEvent_3005);
			KNOWN_ELEMENT_TYPES.add(AdvertisingProduct_3004);
			KNOWN_ELEMENT_TYPES.add(ProductStyle_3006);
			KNOWN_ELEMENT_TYPES.add(Product_3007);
			KNOWN_ELEMENT_TYPES.add(SpatioTemporalDescriptor_3003);
			KNOWN_ELEMENT_TYPES.add(FashionElementStyles_4001);
			KNOWN_ELEMENT_TYPES.add(NewsReportElements_4002);
			KNOWN_ELEMENT_TYPES.add(FashionStyleElements_4003);
			KNOWN_ELEMENT_TYPES.add(BrandCampaigns_4004);
			KNOWN_ELEMENT_TYPES.add(BrandProductLines_4005);
			KNOWN_ELEMENT_TYPES.add(BrandDesigners_4006);
			KNOWN_ELEMENT_TYPES.add(AdvertisingCampaignBrand_4007);
			KNOWN_ELEMENT_TYPES.add(EventRoles_4008);
			KNOWN_ELEMENT_TYPES.add(SingleBrandEventBrand_4009);
			KNOWN_ELEMENT_TYPES.add(ProductLineBrand_4010);
			KNOWN_ELEMENT_TYPES.add(ProductReviews_4011);
			KNOWN_ELEMENT_TYPES.add(ReviewProduct_4012);
			KNOWN_ELEMENT_TYPES.add(ReviewReviewer_4013);
			KNOWN_ELEMENT_TYPES.add(RoleEvents_4014);
			KNOWN_ELEMENT_TYPES.add(DesignerBrand_4015);
			KNOWN_ELEMENT_TYPES.add(ReviewerReviews_4016);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case FashionDomainEditPart.VISUAL_ID:
			return FashionDomain_1000;
		case BloggerEditPart.VISUAL_ID:
			return Blogger_2001;
		case CriticEditPart.VISUAL_ID:
			return Critic_2002;
		case InfluencerEditPart.VISUAL_ID:
			return Influencer_2003;
		case FamousBrandEditPart.VISUAL_ID:
			return FamousBrand_2004;
		case EmergingBrandEditPart.VISUAL_ID:
			return EmergingBrand_2005;
		case LocalBrandEditPart.VISUAL_ID:
			return LocalBrand_2006;
		case MacroEventEditPart.VISUAL_ID:
			return MacroEvent_2007;
		case SingleBrandEventEditPart.VISUAL_ID:
			return SingleBrandEvent_2008;
		case PhotoEditPart.VISUAL_ID:
			return Photo_2009;
		case DescriptionEditPart.VISUAL_ID:
			return Description_2010;
		case CommentEditPart.VISUAL_ID:
			return Comment_2011;
		case DesignerEditPart.VISUAL_ID:
			return Designer_2012;
		case ModelEditPart.VISUAL_ID:
			return Model_2013;
		case PresenterEditPart.VISUAL_ID:
			return Presenter_2014;
		case ChoreographerEditPart.VISUAL_ID:
			return Choreographer_2015;
		case PhotographerEditPart.VISUAL_ID:
			return Photographer_2016;
		case AdvertisingCampaignEditPart.VISUAL_ID:
			return AdvertisingCampaign_2017;
		case AdvertisingProductEditPart.VISUAL_ID:
			return AdvertisingProduct_2022;
		case ProductLineEditPart.VISUAL_ID:
			return ProductLine_2018;
		case ProductStyleEditPart.VISUAL_ID:
			return ProductStyle_2019;
		case ProductEditPart.VISUAL_ID:
			return Product_2020;
		case FashionStyleEditPart.VISUAL_ID:
			return FashionStyle_2021;
		case ArticleEditPart.VISUAL_ID:
			return Article_3001;
		case TVProgramEditPart.VISUAL_ID:
			return TVProgram_3002;
		case SingleBrandEvent2EditPart.VISUAL_ID:
			return SingleBrandEvent_3005;
		case AdvertisingProduct2EditPart.VISUAL_ID:
			return AdvertisingProduct_3004;
		case ProductStyle2EditPart.VISUAL_ID:
			return ProductStyle_3006;
		case Product2EditPart.VISUAL_ID:
			return Product_3007;
		case SpatioTemporalDescriptorEditPart.VISUAL_ID:
			return SpatioTemporalDescriptor_3003;
		case FashionElementStylesEditPart.VISUAL_ID:
			return FashionElementStyles_4001;
		case NewsReportElementsEditPart.VISUAL_ID:
			return NewsReportElements_4002;
		case FashionStyleElementsEditPart.VISUAL_ID:
			return FashionStyleElements_4003;
		case BrandCampaignsEditPart.VISUAL_ID:
			return BrandCampaigns_4004;
		case BrandProductLinesEditPart.VISUAL_ID:
			return BrandProductLines_4005;
		case BrandDesignersEditPart.VISUAL_ID:
			return BrandDesigners_4006;
		case AdvertisingCampaignBrandEditPart.VISUAL_ID:
			return AdvertisingCampaignBrand_4007;
		case EventRolesEditPart.VISUAL_ID:
			return EventRoles_4008;
		case SingleBrandEventBrandEditPart.VISUAL_ID:
			return SingleBrandEventBrand_4009;
		case ProductLineBrandEditPart.VISUAL_ID:
			return ProductLineBrand_4010;
		case ProductReviewsEditPart.VISUAL_ID:
			return ProductReviews_4011;
		case ReviewProductEditPart.VISUAL_ID:
			return ReviewProduct_4012;
		case ReviewReviewerEditPart.VISUAL_ID:
			return ReviewReviewer_4013;
		case RoleEventsEditPart.VISUAL_ID:
			return RoleEvents_4014;
		case DesignerBrandEditPart.VISUAL_ID:
			return DesignerBrand_4015;
		case ReviewerReviewsEditPart.VISUAL_ID:
			return ReviewerReviews_4016;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return fashion.diagram.providers.FashionElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return fashion.diagram.providers.FashionElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return fashion.diagram.providers.FashionElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
