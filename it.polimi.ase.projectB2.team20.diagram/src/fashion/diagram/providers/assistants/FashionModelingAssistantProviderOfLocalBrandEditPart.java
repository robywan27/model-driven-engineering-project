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
import fashion.diagram.edit.parts.DesignerEditPart;
import fashion.diagram.edit.parts.FashionStyleEditPart;
import fashion.diagram.edit.parts.LocalBrandEditPart;
import fashion.diagram.edit.parts.ProductLineEditPart;
import fashion.diagram.providers.FashionElementTypes;
import fashion.diagram.providers.FashionModelingAssistantProvider;

/**
 * @generated
 */
public class FashionModelingAssistantProviderOfLocalBrandEditPart extends
		FashionModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((LocalBrandEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(LocalBrandEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(FashionElementTypes.FashionElementStyles_4001);
		types.add(FashionElementTypes.BrandCampaigns_4004);
		types.add(FashionElementTypes.BrandProductLines_4005);
		types.add(FashionElementTypes.BrandDesigners_4006);
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
				(LocalBrandEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			LocalBrandEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FashionStyleEditPart) {
			types.add(FashionElementTypes.FashionElementStyles_4001);
		}
		if (targetEditPart instanceof AdvertisingCampaignEditPart) {
			types.add(FashionElementTypes.BrandCampaigns_4004);
		}
		if (targetEditPart instanceof ProductLineEditPart) {
			types.add(FashionElementTypes.BrandProductLines_4005);
		}
		if (targetEditPart instanceof DesignerEditPart) {
			types.add(FashionElementTypes.BrandDesigners_4006);
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
		return doGetTypesForTarget((LocalBrandEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(LocalBrandEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FashionElementTypes.FashionElementStyles_4001) {
			types.add(FashionElementTypes.FashionStyle_2021);
		} else if (relationshipType == FashionElementTypes.BrandCampaigns_4004) {
			types.add(FashionElementTypes.AdvertisingCampaign_2017);
		} else if (relationshipType == FashionElementTypes.BrandProductLines_4005) {
			types.add(FashionElementTypes.ProductLine_2018);
		} else if (relationshipType == FashionElementTypes.BrandDesigners_4006) {
			types.add(FashionElementTypes.Designer_2012);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((LocalBrandEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(LocalBrandEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(FashionElementTypes.NewsReportElements_4002);
		types.add(FashionElementTypes.FashionStyleElements_4003);
		types.add(FashionElementTypes.AdvertisingCampaignBrand_4007);
		types.add(FashionElementTypes.SingleBrandEventBrand_4009);
		types.add(FashionElementTypes.ProductLineBrand_4010);
		types.add(FashionElementTypes.DesignerBrand_4015);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((LocalBrandEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(LocalBrandEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FashionElementTypes.NewsReportElements_4002) {
			types.add(FashionElementTypes.Article_3001);
			types.add(FashionElementTypes.TVProgram_3002);
		} else if (relationshipType == FashionElementTypes.FashionStyleElements_4003) {
			types.add(FashionElementTypes.FashionStyle_2021);
		} else if (relationshipType == FashionElementTypes.AdvertisingCampaignBrand_4007) {
			types.add(FashionElementTypes.AdvertisingCampaign_2017);
		} else if (relationshipType == FashionElementTypes.SingleBrandEventBrand_4009) {
			types.add(FashionElementTypes.SingleBrandEvent_2008);
			types.add(FashionElementTypes.SingleBrandEvent_3005);
		} else if (relationshipType == FashionElementTypes.ProductLineBrand_4010) {
			types.add(FashionElementTypes.ProductLine_2018);
		} else if (relationshipType == FashionElementTypes.DesignerBrand_4015) {
			types.add(FashionElementTypes.Designer_2012);
		}
		return types;
	}

}
