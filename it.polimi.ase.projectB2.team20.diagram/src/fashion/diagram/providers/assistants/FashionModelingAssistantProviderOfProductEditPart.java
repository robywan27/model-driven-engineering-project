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
import fashion.diagram.edit.parts.CommentEditPart;
import fashion.diagram.edit.parts.DescriptionEditPart;
import fashion.diagram.edit.parts.FashionStyleEditPart;
import fashion.diagram.edit.parts.PhotoEditPart;
import fashion.diagram.edit.parts.ProductEditPart;
import fashion.diagram.providers.FashionElementTypes;
import fashion.diagram.providers.FashionModelingAssistantProvider;

/**
 * @generated
 */
public class FashionModelingAssistantProviderOfProductEditPart extends
		FashionModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ProductEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(ProductEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FashionElementTypes.FashionElementStyles_4001);
		types.add(FashionElementTypes.ProductReviews_4011);
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
		return doGetRelTypesOnSourceAndTarget((ProductEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ProductEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof FashionStyleEditPart) {
			types.add(FashionElementTypes.FashionElementStyles_4001);
		}
		if (targetEditPart instanceof PhotoEditPart) {
			types.add(FashionElementTypes.ProductReviews_4011);
		}
		if (targetEditPart instanceof DescriptionEditPart) {
			types.add(FashionElementTypes.ProductReviews_4011);
		}
		if (targetEditPart instanceof CommentEditPart) {
			types.add(FashionElementTypes.ProductReviews_4011);
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
		return doGetTypesForTarget((ProductEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(ProductEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FashionElementTypes.FashionElementStyles_4001) {
			types.add(FashionElementTypes.FashionStyle_2021);
		} else if (relationshipType == FashionElementTypes.ProductReviews_4011) {
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
		return doGetRelTypesOnTarget((ProductEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ProductEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(FashionElementTypes.NewsReportElements_4002);
		types.add(FashionElementTypes.FashionStyleElements_4003);
		types.add(FashionElementTypes.ReviewProduct_4012);
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
		return doGetTypesForSource((ProductEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ProductEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FashionElementTypes.NewsReportElements_4002) {
			types.add(FashionElementTypes.Article_3001);
			types.add(FashionElementTypes.TVProgram_3002);
		} else if (relationshipType == FashionElementTypes.FashionStyleElements_4003) {
			types.add(FashionElementTypes.FashionStyle_2021);
		} else if (relationshipType == FashionElementTypes.ReviewProduct_4012) {
			types.add(FashionElementTypes.Photo_2009);
			types.add(FashionElementTypes.Description_2010);
			types.add(FashionElementTypes.Comment_2011);
		}
		return types;
	}

}
