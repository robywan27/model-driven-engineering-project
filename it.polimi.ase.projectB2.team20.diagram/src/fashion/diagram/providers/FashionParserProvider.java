/*
 * 
 */
package fashion.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import fashion.FashionPackage;
import fashion.diagram.edit.parts.AdvertisingCampaignNameEditPart;
import fashion.diagram.edit.parts.AdvertisingProductNameType2EditPart;
import fashion.diagram.edit.parts.AdvertisingProductNameTypeEditPart;
import fashion.diagram.edit.parts.ArticleMagazineEditPart;
import fashion.diagram.edit.parts.ArticleTypeMagazineEditPart;
import fashion.diagram.edit.parts.ArticleTypeTitleEditPart;
import fashion.diagram.edit.parts.BloggerNameEditPart;
import fashion.diagram.edit.parts.ChoreographerNameEditPart;
import fashion.diagram.edit.parts.CommentIdEditPart;
import fashion.diagram.edit.parts.CommentTextEditPart;
import fashion.diagram.edit.parts.CriticNameEditPart;
import fashion.diagram.edit.parts.DescriptionIdEditPart;
import fashion.diagram.edit.parts.DescriptionTextEditPart;
import fashion.diagram.edit.parts.DesignerNameEditPart;
import fashion.diagram.edit.parts.EmergingBrandCountriesEditPart;
import fashion.diagram.edit.parts.EmergingBrandNameEditPart;
import fashion.diagram.edit.parts.FamousBrandCountriesEditPart;
import fashion.diagram.edit.parts.FamousBrandNameEditPart;
import fashion.diagram.edit.parts.FashionStyleNameEditPart;
import fashion.diagram.edit.parts.InfluencerNameEditPart;
import fashion.diagram.edit.parts.LocalBrandCountryEditPart;
import fashion.diagram.edit.parts.LocalBrandNameEditPart;
import fashion.diagram.edit.parts.MacroEventCityEditPart;
import fashion.diagram.edit.parts.MacroEventNameEditPart;
import fashion.diagram.edit.parts.MacroEventNameYearMonthCityEditPart;
import fashion.diagram.edit.parts.ModelNameEditPart;
import fashion.diagram.edit.parts.PhotoIdEditPart;
import fashion.diagram.edit.parts.PhotoTagsEditPart;
import fashion.diagram.edit.parts.PhotographerNameEditPart;
import fashion.diagram.edit.parts.PresenterNameEditPart;
import fashion.diagram.edit.parts.ProductLineNameEditPart;
import fashion.diagram.edit.parts.ProductName2EditPart;
import fashion.diagram.edit.parts.ProductNameEditPart;
import fashion.diagram.edit.parts.ProductStyleName2EditPart;
import fashion.diagram.edit.parts.ProductStyleNameEditPart;
import fashion.diagram.edit.parts.SingleBrandEventDayHourMinute2EditPart;
import fashion.diagram.edit.parts.SingleBrandEventDayHourMinuteEditPart;
import fashion.diagram.edit.parts.SingleBrandEventNameEditPart;
import fashion.diagram.edit.parts.SingleBrandEventNameYearMonthDayHourMin2EditPart;
import fashion.diagram.edit.parts.SingleBrandEventNameYearMonthDayHourMinEditPart;
import fashion.diagram.edit.parts.SpatioTemporalDescriptorPeriodLocationEditPart;
import fashion.diagram.edit.parts.TVProgramNameEditPart;
import fashion.diagram.edit.parts.TVProgramTypeNameEditPart;
import fashion.diagram.parsers.MessageFormatParser;
import fashion.diagram.part.FashionVisualIDRegistry;

/**
 * @generated
 */
public class FashionParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser bloggerName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getBloggerName_5001Parser() {
		if (bloggerName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			bloggerName_5001Parser = parser;
		}
		return bloggerName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser criticName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getCriticName_5002Parser() {
		if (criticName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			criticName_5002Parser = parser;
		}
		return criticName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser influencerName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getInfluencerName_5003Parser() {
		if (influencerName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			influencerName_5003Parser = parser;
		}
		return influencerName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser famousBrandName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getFamousBrandName_5004Parser() {
		if (famousBrandName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getBrand_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			famousBrandName_5004Parser = parser;
		}
		return famousBrandName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser emergingBrandName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getEmergingBrandName_5005Parser() {
		if (emergingBrandName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getBrand_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			emergingBrandName_5005Parser = parser;
		}
		return emergingBrandName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser localBrandName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getLocalBrandName_5006Parser() {
		if (localBrandName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getBrand_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			localBrandName_5006Parser = parser;
		}
		return localBrandName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser macroEventNameYearMonthCity_5007Parser;

	/**
	 * @generated
	 */
	private IParser getMacroEventNameYearMonthCity_5007Parser() {
		if (macroEventNameYearMonthCity_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					FashionPackage.eINSTANCE.getEvent_Name(),
					FashionPackage.eINSTANCE.getEvent_Year(),
					FashionPackage.eINSTANCE.getEvent_Month(),
					FashionPackage.eINSTANCE.getMacroEvent_City() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}, {1}-{2}, {3}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}, {1}-{2}, {3}"); //$NON-NLS-1$
			parser.setEditPattern("{0}, {1}-{2}, {3}"); //$NON-NLS-1$
			macroEventNameYearMonthCity_5007Parser = parser;
		}
		return macroEventNameYearMonthCity_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleBrandEventNameYearMonthDayHourMinute_5008Parser;

	/**
	 * @generated
	 */
	private IParser getSingleBrandEventNameYearMonthDayHourMinute_5008Parser() {
		if (singleBrandEventNameYearMonthDayHourMinute_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					FashionPackage.eINSTANCE.getEvent_Name(),
					FashionPackage.eINSTANCE.getEvent_Year(),
					FashionPackage.eINSTANCE.getEvent_Month(),
					FashionPackage.eINSTANCE.getSingleBrandEvent_Day(),
					FashionPackage.eINSTANCE.getSingleBrandEvent_Hour(),
					FashionPackage.eINSTANCE.getSingleBrandEvent_Minute() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}, {1}-{2}-{3}, {4}:{5}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}, {1}-{2}-{3}, {4}:{5}"); //$NON-NLS-1$
			parser.setEditPattern("{0}, {1}-{2}-{3}, {4}:{5}"); //$NON-NLS-1$
			singleBrandEventNameYearMonthDayHourMinute_5008Parser = parser;
		}
		return singleBrandEventNameYearMonthDayHourMinute_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser photoId_5009Parser;

	/**
	 * @generated
	 */
	private IParser getPhotoId_5009Parser() {
		if (photoId_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getReview_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			photoId_5009Parser = parser;
		}
		return photoId_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser descriptionId_5010Parser;

	/**
	 * @generated
	 */
	private IParser getDescriptionId_5010Parser() {
		if (descriptionId_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getReview_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			descriptionId_5010Parser = parser;
		}
		return descriptionId_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser commentId_5011Parser;

	/**
	 * @generated
	 */
	private IParser getCommentId_5011Parser() {
		if (commentId_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getReview_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			commentId_5011Parser = parser;
		}
		return commentId_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser designerName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getDesignerName_5012Parser() {
		if (designerName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			designerName_5012Parser = parser;
		}
		return designerName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser modelName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getModelName_5013Parser() {
		if (modelName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelName_5013Parser = parser;
		}
		return modelName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser presenterName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getPresenterName_5014Parser() {
		if (presenterName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			presenterName_5014Parser = parser;
		}
		return presenterName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser choreographerName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getChoreographerName_5015Parser() {
		if (choreographerName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			choreographerName_5015Parser = parser;
		}
		return choreographerName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser photographerName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getPhotographerName_5016Parser() {
		if (photographerName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getRole_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			photographerName_5016Parser = parser;
		}
		return photographerName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser advertisingCampaignName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getAdvertisingCampaignName_5017Parser() {
		if (advertisingCampaignName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getAdvertisingCampaign_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			advertisingCampaignName_5017Parser = parser;
		}
		return advertisingCampaignName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser advertisingProductNameType_5027Parser;

	/**
	 * @generated
	 */
	private IParser getAdvertisingProductNameType_5027Parser() {
		if (advertisingProductNameType_5027Parser == null) {
			EAttribute[] features = new EAttribute[] {
					FashionPackage.eINSTANCE.getAdvertisingProduct_Name(),
					FashionPackage.eINSTANCE.getAdvertisingProduct_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			advertisingProductNameType_5027Parser = parser;
		}
		return advertisingProductNameType_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser productLineName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getProductLineName_5018Parser() {
		if (productLineName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getProductLine_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			productLineName_5018Parser = parser;
		}
		return productLineName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser productStyleName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getProductStyleName_5019Parser() {
		if (productStyleName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getProductStyle_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			productStyleName_5019Parser = parser;
		}
		return productStyleName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser productName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getProductName_5020Parser() {
		if (productName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getProduct_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			productName_5020Parser = parser;
		}
		return productName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser fashionStyleName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getFashionStyleName_5021Parser() {
		if (fashionStyleName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getFashionStyle_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fashionStyleName_5021Parser = parser;
		}
		return fashionStyleName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser articleTypeTitle_5022Parser;

	/**
	 * @generated
	 */
	private IParser getArticleTypeTitle_5022Parser() {
		if (articleTypeTitle_5022Parser == null) {
			EAttribute[] features = new EAttribute[] {
					FashionPackage.eINSTANCE.getNewsReport_Type(),
					FashionPackage.eINSTANCE.getArticle_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{1}: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{1}: {0}"); //$NON-NLS-1$
			parser.setEditPattern("{1}: {0}"); //$NON-NLS-1$
			articleTypeTitle_5022Parser = parser;
		}
		return articleTypeTitle_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser tVProgramTypeName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getTVProgramTypeName_5023Parser() {
		if (tVProgramTypeName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] {
					FashionPackage.eINSTANCE.getNewsReport_Type(),
					FashionPackage.eINSTANCE.getTVProgram_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{1}: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{1}: {0}"); //$NON-NLS-1$
			parser.setEditPattern("{1}: {0}"); //$NON-NLS-1$
			tVProgramTypeName_5023Parser = parser;
		}
		return tVProgramTypeName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser singleBrandEventNameYearMonthDayHourMinute_5026Parser;

	/**
	 * @generated
	 */
	private IParser getSingleBrandEventNameYearMonthDayHourMinute_5026Parser() {
		if (singleBrandEventNameYearMonthDayHourMinute_5026Parser == null) {
			EAttribute[] features = new EAttribute[] {
					FashionPackage.eINSTANCE.getEvent_Name(),
					FashionPackage.eINSTANCE.getEvent_Year(),
					FashionPackage.eINSTANCE.getEvent_Month(),
					FashionPackage.eINSTANCE.getSingleBrandEvent_Day(),
					FashionPackage.eINSTANCE.getSingleBrandEvent_Hour(),
					FashionPackage.eINSTANCE.getSingleBrandEvent_Minute() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}, {1}-{2}-{3}, {4}:{5}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}, {1}-{2}-{3}, {4}:{5}"); //$NON-NLS-1$
			parser.setEditPattern("{0}, {1}-{2}-{3}, {4}:{5}"); //$NON-NLS-1$
			singleBrandEventNameYearMonthDayHourMinute_5026Parser = parser;
		}
		return singleBrandEventNameYearMonthDayHourMinute_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser advertisingProductNameType_5025Parser;

	/**
	 * @generated
	 */
	private IParser getAdvertisingProductNameType_5025Parser() {
		if (advertisingProductNameType_5025Parser == null) {
			EAttribute[] features = new EAttribute[] {
					FashionPackage.eINSTANCE.getAdvertisingProduct_Name(),
					FashionPackage.eINSTANCE.getAdvertisingProduct_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			advertisingProductNameType_5025Parser = parser;
		}
		return advertisingProductNameType_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser productStyleName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getProductStyleName_5028Parser() {
		if (productStyleName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getProductStyle_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			productStyleName_5028Parser = parser;
		}
		return productStyleName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser productName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getProductName_5029Parser() {
		if (productName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { FashionPackage.eINSTANCE
					.getProduct_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			productName_5029Parser = parser;
		}
		return productName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser spatioTemporalDescriptorPeriodLocation_5024Parser;

	/**
	 * @generated
	 */
	private IParser getSpatioTemporalDescriptorPeriodLocation_5024Parser() {
		if (spatioTemporalDescriptorPeriodLocation_5024Parser == null) {
			EAttribute[] features = new EAttribute[] {
					FashionPackage.eINSTANCE
							.getSpatioTemporalDescriptor_Period(),
					FashionPackage.eINSTANCE
							.getSpatioTemporalDescriptor_Location() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}, {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}, {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}, {1}"); //$NON-NLS-1$
			spatioTemporalDescriptorPeriodLocation_5024Parser = parser;
		}
		return spatioTemporalDescriptorPeriodLocation_5024Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case BloggerNameEditPart.VISUAL_ID:
			return getBloggerName_5001Parser();
		case CriticNameEditPart.VISUAL_ID:
			return getCriticName_5002Parser();
		case InfluencerNameEditPart.VISUAL_ID:
			return getInfluencerName_5003Parser();
		case FamousBrandNameEditPart.VISUAL_ID:
			return getFamousBrandName_5004Parser();
		case EmergingBrandNameEditPart.VISUAL_ID:
			return getEmergingBrandName_5005Parser();
		case LocalBrandNameEditPart.VISUAL_ID:
			return getLocalBrandName_5006Parser();
		case MacroEventNameYearMonthCityEditPart.VISUAL_ID:
			return getMacroEventNameYearMonthCity_5007Parser();
		case SingleBrandEventNameYearMonthDayHourMinEditPart.VISUAL_ID:
			return getSingleBrandEventNameYearMonthDayHourMinute_5008Parser();
		case PhotoIdEditPart.VISUAL_ID:
			return getPhotoId_5009Parser();
		case DescriptionIdEditPart.VISUAL_ID:
			return getDescriptionId_5010Parser();
		case CommentIdEditPart.VISUAL_ID:
			return getCommentId_5011Parser();
		case DesignerNameEditPart.VISUAL_ID:
			return getDesignerName_5012Parser();
		case ModelNameEditPart.VISUAL_ID:
			return getModelName_5013Parser();
		case PresenterNameEditPart.VISUAL_ID:
			return getPresenterName_5014Parser();
		case ChoreographerNameEditPart.VISUAL_ID:
			return getChoreographerName_5015Parser();
		case PhotographerNameEditPart.VISUAL_ID:
			return getPhotographerName_5016Parser();
		case AdvertisingCampaignNameEditPart.VISUAL_ID:
			return getAdvertisingCampaignName_5017Parser();
		case AdvertisingProductNameTypeEditPart.VISUAL_ID:
			return getAdvertisingProductNameType_5027Parser();
		case ProductLineNameEditPart.VISUAL_ID:
			return getProductLineName_5018Parser();
		case ProductStyleNameEditPart.VISUAL_ID:
			return getProductStyleName_5019Parser();
		case ProductNameEditPart.VISUAL_ID:
			return getProductName_5020Parser();
		case FashionStyleNameEditPart.VISUAL_ID:
			return getFashionStyleName_5021Parser();
		case ArticleTypeTitleEditPart.VISUAL_ID:
			return getArticleTypeTitle_5022Parser();
		case TVProgramTypeNameEditPart.VISUAL_ID:
			return getTVProgramTypeName_5023Parser();
		case SingleBrandEventNameYearMonthDayHourMin2EditPart.VISUAL_ID:
			return getSingleBrandEventNameYearMonthDayHourMinute_5026Parser();
		case AdvertisingProductNameType2EditPart.VISUAL_ID:
			return getAdvertisingProductNameType_5025Parser();
		case ProductStyleName2EditPart.VISUAL_ID:
			return getProductStyleName_5028Parser();
		case ProductName2EditPart.VISUAL_ID:
			return getProductName_5029Parser();
		case SpatioTemporalDescriptorPeriodLocationEditPart.VISUAL_ID:
			return getSpatioTemporalDescriptorPeriodLocation_5024Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(FashionVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(FashionVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (FashionElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
