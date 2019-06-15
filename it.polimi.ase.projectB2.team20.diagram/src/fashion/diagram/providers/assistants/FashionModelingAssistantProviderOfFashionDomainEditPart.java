/*
 * 
 */
package fashion.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import fashion.diagram.providers.FashionElementTypes;
import fashion.diagram.providers.FashionModelingAssistantProvider;

/**
 * @generated
 */
public class FashionModelingAssistantProviderOfFashionDomainEditPart extends
		FashionModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(22);
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
		types.add(FashionElementTypes.FashionStyle_2021);
		return types;
	}

}
