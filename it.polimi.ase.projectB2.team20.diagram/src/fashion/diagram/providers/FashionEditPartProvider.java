/*
 * 
 */
package fashion.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import fashion.diagram.edit.parts.FashionDomainEditPart;
import fashion.diagram.edit.parts.FashionEditPartFactory;
import fashion.diagram.part.FashionVisualIDRegistry;

/**
 * @generated
 */
public class FashionEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public FashionEditPartProvider() {
		super(new FashionEditPartFactory(),
				FashionVisualIDRegistry.TYPED_INSTANCE,
				FashionDomainEditPart.MODEL_ID);
	}

}
