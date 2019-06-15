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

import fashion.diagram.edit.parts.BloggerEditPart;
import fashion.diagram.edit.parts.ChoreographerEditPart;
import fashion.diagram.edit.parts.CriticEditPart;
import fashion.diagram.edit.parts.DesignerEditPart;
import fashion.diagram.edit.parts.EmergingBrandEditPart;
import fashion.diagram.edit.parts.FamousBrandEditPart;
import fashion.diagram.edit.parts.FashionStyleEditPart;
import fashion.diagram.edit.parts.InfluencerEditPart;
import fashion.diagram.edit.parts.LocalBrandEditPart;
import fashion.diagram.edit.parts.ModelEditPart;
import fashion.diagram.edit.parts.PhotographerEditPart;
import fashion.diagram.edit.parts.PresenterEditPart;
import fashion.diagram.edit.parts.SingleBrandEvent2EditPart;
import fashion.diagram.providers.FashionElementTypes;
import fashion.diagram.providers.FashionModelingAssistantProvider;

/**
 * @generated
 */
public class FashionModelingAssistantProviderOfSingleBrandEvent2EditPart extends
		FashionModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((SingleBrandEvent2EditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			SingleBrandEvent2EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(FashionElementTypes.FashionElementStyles_4001);
		types.add(FashionElementTypes.EventRoles_4008);
		types.add(FashionElementTypes.SingleBrandEventBrand_4009);
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
				(SingleBrandEvent2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			SingleBrandEvent2EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FashionStyleEditPart) {
			types.add(FashionElementTypes.FashionElementStyles_4001);
		}
		if (targetEditPart instanceof BloggerEditPart) {
			types.add(FashionElementTypes.EventRoles_4008);
		}
		if (targetEditPart instanceof CriticEditPart) {
			types.add(FashionElementTypes.EventRoles_4008);
		}
		if (targetEditPart instanceof InfluencerEditPart) {
			types.add(FashionElementTypes.EventRoles_4008);
		}
		if (targetEditPart instanceof DesignerEditPart) {
			types.add(FashionElementTypes.EventRoles_4008);
		}
		if (targetEditPart instanceof ModelEditPart) {
			types.add(FashionElementTypes.EventRoles_4008);
		}
		if (targetEditPart instanceof PresenterEditPart) {
			types.add(FashionElementTypes.EventRoles_4008);
		}
		if (targetEditPart instanceof ChoreographerEditPart) {
			types.add(FashionElementTypes.EventRoles_4008);
		}
		if (targetEditPart instanceof PhotographerEditPart) {
			types.add(FashionElementTypes.EventRoles_4008);
		}
		if (targetEditPart instanceof FamousBrandEditPart) {
			types.add(FashionElementTypes.SingleBrandEventBrand_4009);
		}
		if (targetEditPart instanceof EmergingBrandEditPart) {
			types.add(FashionElementTypes.SingleBrandEventBrand_4009);
		}
		if (targetEditPart instanceof LocalBrandEditPart) {
			types.add(FashionElementTypes.SingleBrandEventBrand_4009);
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
		return doGetTypesForTarget((SingleBrandEvent2EditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			SingleBrandEvent2EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FashionElementTypes.FashionElementStyles_4001) {
			types.add(FashionElementTypes.FashionStyle_2021);
		} else if (relationshipType == FashionElementTypes.EventRoles_4008) {
			types.add(FashionElementTypes.Blogger_2001);
			types.add(FashionElementTypes.Critic_2002);
			types.add(FashionElementTypes.Influencer_2003);
			types.add(FashionElementTypes.Designer_2012);
			types.add(FashionElementTypes.Model_2013);
			types.add(FashionElementTypes.Presenter_2014);
			types.add(FashionElementTypes.Choreographer_2015);
			types.add(FashionElementTypes.Photographer_2016);
		} else if (relationshipType == FashionElementTypes.SingleBrandEventBrand_4009) {
			types.add(FashionElementTypes.FamousBrand_2004);
			types.add(FashionElementTypes.EmergingBrand_2005);
			types.add(FashionElementTypes.LocalBrand_2006);
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
		return doGetRelTypesOnTarget((SingleBrandEvent2EditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			SingleBrandEvent2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(FashionElementTypes.NewsReportElements_4002);
		types.add(FashionElementTypes.FashionStyleElements_4003);
		types.add(FashionElementTypes.RoleEvents_4014);
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
		return doGetTypesForSource((SingleBrandEvent2EditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			SingleBrandEvent2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FashionElementTypes.NewsReportElements_4002) {
			types.add(FashionElementTypes.Article_3001);
			types.add(FashionElementTypes.TVProgram_3002);
		} else if (relationshipType == FashionElementTypes.FashionStyleElements_4003) {
			types.add(FashionElementTypes.FashionStyle_2021);
		} else if (relationshipType == FashionElementTypes.RoleEvents_4014) {
			types.add(FashionElementTypes.Blogger_2001);
			types.add(FashionElementTypes.Critic_2002);
			types.add(FashionElementTypes.Influencer_2003);
			types.add(FashionElementTypes.Designer_2012);
			types.add(FashionElementTypes.Model_2013);
			types.add(FashionElementTypes.Presenter_2014);
			types.add(FashionElementTypes.Choreographer_2015);
			types.add(FashionElementTypes.Photographer_2016);
		}
		return types;
	}

}
