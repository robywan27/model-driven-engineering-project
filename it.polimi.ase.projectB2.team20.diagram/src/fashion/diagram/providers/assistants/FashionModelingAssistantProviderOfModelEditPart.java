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
import fashion.diagram.edit.parts.FashionStyleEditPart;
import fashion.diagram.edit.parts.MacroEventEditPart;
import fashion.diagram.edit.parts.ModelEditPart;
import fashion.diagram.edit.parts.SingleBrandEvent2EditPart;
import fashion.diagram.edit.parts.SingleBrandEventEditPart;
import fashion.diagram.providers.FashionElementTypes;
import fashion.diagram.providers.FashionModelingAssistantProvider;

/**
 * @generated
 */
public class FashionModelingAssistantProviderOfModelEditPart extends
		FashionModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ModelEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(ModelEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FashionElementTypes.FashionElementStyles_4001);
		types.add(FashionElementTypes.RoleEvents_4014);
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
		return doGetRelTypesOnSourceAndTarget((ModelEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ModelEditPart source, IGraphicalEditPart targetEditPart) {
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
		return doGetTypesForTarget((ModelEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(ModelEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == FashionElementTypes.FashionElementStyles_4001) {
			types.add(FashionElementTypes.FashionStyle_2021);
		} else if (relationshipType == FashionElementTypes.RoleEvents_4014) {
			types.add(FashionElementTypes.MacroEvent_2007);
			types.add(FashionElementTypes.SingleBrandEvent_2008);
			types.add(FashionElementTypes.SingleBrandEvent_3005);
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
		return doGetRelTypesOnTarget((ModelEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ModelEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(FashionElementTypes.NewsReportElements_4002);
		types.add(FashionElementTypes.FashionStyleElements_4003);
		types.add(FashionElementTypes.EventRoles_4008);
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
		return doGetTypesForSource((ModelEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ModelEditPart target,
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
		}
		return types;
	}

}
