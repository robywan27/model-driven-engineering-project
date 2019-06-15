/*
 * 
 */
package fashion.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import fashion.diagram.edit.parts.AdvertisingCampaignEditPart;
import fashion.diagram.edit.parts.AdvertisingProduct2EditPart;
import fashion.diagram.edit.parts.AdvertisingProductEditPart;
import fashion.diagram.edit.parts.BloggerEditPart;
import fashion.diagram.edit.parts.ChoreographerEditPart;
import fashion.diagram.edit.parts.CommentEditPart;
import fashion.diagram.edit.parts.CriticEditPart;
import fashion.diagram.edit.parts.DescriptionEditPart;
import fashion.diagram.edit.parts.DesignerEditPart;
import fashion.diagram.edit.parts.EmergingBrandEditPart;
import fashion.diagram.edit.parts.FamousBrandEditPart;
import fashion.diagram.edit.parts.InfluencerEditPart;
import fashion.diagram.edit.parts.LocalBrandEditPart;
import fashion.diagram.edit.parts.MacroEventEditPart;
import fashion.diagram.edit.parts.ModelEditPart;
import fashion.diagram.edit.parts.PhotoEditPart;
import fashion.diagram.edit.parts.PhotographerEditPart;
import fashion.diagram.edit.parts.PresenterEditPart;
import fashion.diagram.edit.parts.Product2EditPart;
import fashion.diagram.edit.parts.ProductEditPart;
import fashion.diagram.edit.parts.ProductLineEditPart;
import fashion.diagram.edit.parts.ProductStyle2EditPart;
import fashion.diagram.edit.parts.ProductStyleEditPart;
import fashion.diagram.edit.parts.SingleBrandEvent2EditPart;
import fashion.diagram.edit.parts.SingleBrandEventEditPart;
import fashion.diagram.edit.parts.TVProgramEditPart;
import fashion.diagram.providers.FashionElementTypes;
import fashion.diagram.providers.FashionModelingAssistantProvider;

/**
 * @generated
 */
public class FashionModelingAssistantProviderOfTVProgramEditPart extends
		FashionModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TVProgramEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(TVProgramEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(FashionElementTypes.NewsReportElements_4002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(TVProgramEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			TVProgramEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof BloggerEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof CriticEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof InfluencerEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof FamousBrandEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof EmergingBrandEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof LocalBrandEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof MacroEventEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof SingleBrandEventEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof PhotoEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof DescriptionEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof CommentEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof DesignerEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof ModelEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof PresenterEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof ChoreographerEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof PhotographerEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof AdvertisingCampaignEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof AdvertisingProductEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof ProductLineEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof ProductStyleEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof ProductEditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof SingleBrandEvent2EditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof AdvertisingProduct2EditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof ProductStyle2EditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		if (targetEditPart instanceof Product2EditPart) {
			types.add(FashionElementTypes.NewsReportElements_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TVProgramEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(TVProgramEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FashionElementTypes.NewsReportElements_4002) {
			types.add(FashionElementTypes.Blogger_2001);
			types.add(FashionElementTypes.Critic_2002);
			types.add(FashionElementTypes.Influencer_2003);
			types.add(FashionElementTypes.FamousBrand_2004);
			types.add(FashionElementTypes.EmergingBrand_2005);
			types.add(FashionElementTypes.LocalBrand_2006);
			types.add(FashionElementTypes.MacroEvent_2007);
			types.add(FashionElementTypes.SingleBrandEvent_2008);
			types.add(FashionElementTypes.Photo_2009);
			types.add(FashionElementTypes.Description_2010);
			types.add(FashionElementTypes.Comment_2011);
			types.add(FashionElementTypes.Designer_2012);
			types.add(FashionElementTypes.Model_2013);
			types.add(FashionElementTypes.Presenter_2014);
			types.add(FashionElementTypes.Choreographer_2015);
			types.add(FashionElementTypes.Photographer_2016);
			types.add(FashionElementTypes.AdvertisingCampaign_2017);
			types.add(FashionElementTypes.AdvertisingProduct_2022);
			types.add(FashionElementTypes.ProductLine_2018);
			types.add(FashionElementTypes.ProductStyle_2019);
			types.add(FashionElementTypes.Product_2020);
			types.add(FashionElementTypes.SingleBrandEvent_3005);
			types.add(FashionElementTypes.AdvertisingProduct_3004);
			types.add(FashionElementTypes.ProductStyle_3006);
			types.add(FashionElementTypes.Product_3007);
		}
		return types;
	}

}
