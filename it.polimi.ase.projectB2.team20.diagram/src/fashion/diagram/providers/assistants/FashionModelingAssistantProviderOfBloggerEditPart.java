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
import fashion.diagram.edit.parts.CommentEditPart;
import fashion.diagram.edit.parts.DescriptionEditPart;
import fashion.diagram.edit.parts.FashionStyleEditPart;
import fashion.diagram.edit.parts.MacroEventEditPart;
import fashion.diagram.edit.parts.PhotoEditPart;
import fashion.diagram.edit.parts.SingleBrandEvent2EditPart;
import fashion.diagram.edit.parts.SingleBrandEventEditPart;
import fashion.diagram.providers.FashionElementTypes;
import fashion.diagram.providers.FashionModelingAssistantProvider;

/**
 * @generated
 */
public class FashionModelingAssistantProviderOfBloggerEditPart extends
		FashionModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((BloggerEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(BloggerEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(FashionElementTypes.FashionElementStyles_4001);
		types.add(FashionElementTypes.RoleEvents_4014);
		types.add(FashionElementTypes.ReviewerReviews_4016);
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
		return doGetRelTypesOnSourceAndTarget((BloggerEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			BloggerEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FashionStyleEditPart) {
			types.add(FashionElementTypes.FashionElementStyles_4001);
		}
		if (targetEditPart instanceof MacroEventEditPart) {
			types.add(FashionElementTypes.RoleEvents_4014);
		}
		if (targetEditPart instanceof SingleBrandEventEditPart) {
			types.add(FashionElementTypes.RoleEvents_4014);
		}
		if (targetEditPart instanceof SingleBrandEvent2EditPart) {
			types.add(FashionElementTypes.RoleEvents_4014);
		}
		if (targetEditPart instanceof PhotoEditPart) {
			types.add(FashionElementTypes.ReviewerReviews_4016);
		}
		if (targetEditPart instanceof DescriptionEditPart) {
			types.add(FashionElementTypes.ReviewerReviews_4016);
		}
		if (targetEditPart instanceof CommentEditPart) {
			types.add(FashionElementTypes.ReviewerReviews_4016);
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
		return doGetTypesForTarget((BloggerEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(BloggerEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FashionElementTypes.FashionElementStyles_4001) {
			types.add(FashionElementTypes.FashionStyle_2021);
		} else if (relationshipType == FashionElementTypes.RoleEvents_4014) {
			types.add(FashionElementTypes.MacroEvent_2007);
			types.add(FashionElementTypes.SingleBrandEvent_2008);
			types.add(FashionElementTypes.SingleBrandEvent_3005);
		} else if (relationshipType == FashionElementTypes.ReviewerReviews_4016) {
			types.add(FashionElementTypes.Photo_2009);
			types.add(FashionElementTypes.Description_2010);
			types.add(FashionElementTypes.Comment_2011);
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
		return doGetRelTypesOnTarget((BloggerEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(BloggerEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(FashionElementTypes.NewsReportElements_4002);
		types.add(FashionElementTypes.FashionStyleElements_4003);
		types.add(FashionElementTypes.EventRoles_4008);
		types.add(FashionElementTypes.ReviewReviewer_4013);
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
		return doGetTypesForSource((BloggerEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(BloggerEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FashionElementTypes.NewsReportElements_4002) {
			types.add(FashionElementTypes.Article_3001);
			types.add(FashionElementTypes.TVProgram_3002);
		} else if (relationshipType == FashionElementTypes.FashionStyleElements_4003) {
			types.add(FashionElementTypes.FashionStyle_2021);
		} else if (relationshipType == FashionElementTypes.EventRoles_4008) {
			types.add(FashionElementTypes.MacroEvent_2007);
			types.add(FashionElementTypes.SingleBrandEvent_2008);
			types.add(FashionElementTypes.SingleBrandEvent_3005);
		} else if (relationshipType == FashionElementTypes.ReviewReviewer_4013) {
			types.add(FashionElementTypes.Photo_2009);
			types.add(FashionElementTypes.Description_2010);
			types.add(FashionElementTypes.Comment_2011);
		}
		return types;
	}

}
