/*
 * 
 */
package fashion.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import fashion.diagram.part.FashionVisualIDRegistry;

/**
 * @generated
 */
public class FashionNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7032;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7031;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof FashionNavigatorItem) {
			FashionNavigatorItem item = (FashionNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return FashionVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
