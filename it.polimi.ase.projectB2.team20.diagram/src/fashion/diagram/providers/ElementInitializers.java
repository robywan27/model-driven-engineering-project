/*
 * 
 */
package fashion.diagram.providers;

import fashion.diagram.part.FashionDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = FashionDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			FashionDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
