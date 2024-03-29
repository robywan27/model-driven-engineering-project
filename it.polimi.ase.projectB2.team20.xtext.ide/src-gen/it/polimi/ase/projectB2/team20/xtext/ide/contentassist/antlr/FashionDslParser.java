/*
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import it.polimi.ase.projectB2.team20.xtext.ide.contentassist.antlr.internal.InternalFashionDslParser;
import it.polimi.ase.projectB2.team20.xtext.services.FashionDslGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class FashionDslParser extends AbstractContentAssistParser {

	@Inject
	private FashionDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFashionDslParser createParser() {
		InternalFashionDslParser result = new InternalFashionDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFashionElementAccess().getAlternatives(), "rule__FashionElement__Alternatives");
					put(grammarAccess.getBrandAccess().getAlternatives(), "rule__Brand__Alternatives");
					put(grammarAccess.getNewsReportAccess().getAlternatives(), "rule__NewsReport__Alternatives");
					put(grammarAccess.getReviewAccess().getAlternatives(), "rule__Review__Alternatives");
					put(grammarAccess.getRoleAccess().getAlternatives(), "rule__Role__Alternatives");
					put(grammarAccess.getReviewerAccess().getAlternatives(), "rule__Reviewer__Alternatives");
					put(grammarAccess.getEventAccess().getAlternatives(), "rule__Event__Alternatives");
					put(grammarAccess.getMediaTypeAccess().getAlternatives(), "rule__MediaType__Alternatives");
					put(grammarAccess.getFashionDomainAccess().getGroup(), "rule__FashionDomain__Group__0");
					put(grammarAccess.getFashionStyleAccess().getGroup(), "rule__FashionStyle__Group__0");
					put(grammarAccess.getFashionStyleAccess().getGroup_9(), "rule__FashionStyle__Group_9__0");
					put(grammarAccess.getSpatioTemporalDescriptorAccess().getGroup(), "rule__SpatioTemporalDescriptor__Group__0");
					put(grammarAccess.getArticleAccess().getGroup(), "rule__Article__Group__0");
					put(grammarAccess.getArticleAccess().getGroup_11(), "rule__Article__Group_11__0");
					put(grammarAccess.getTVProgramAccess().getGroup(), "rule__TVProgram__Group__0");
					put(grammarAccess.getTVProgramAccess().getGroup_9(), "rule__TVProgram__Group_9__0");
					put(grammarAccess.getFamousBrandAccess().getGroup(), "rule__FamousBrand__Group__0");
					put(grammarAccess.getFamousBrandAccess().getGroup_5(), "rule__FamousBrand__Group_5__0");
					put(grammarAccess.getFamousBrandAccess().getGroup_5_2(), "rule__FamousBrand__Group_5_2__0");
					put(grammarAccess.getFamousBrandAccess().getGroup_6(), "rule__FamousBrand__Group_6__0");
					put(grammarAccess.getFamousBrandAccess().getGroup_7(), "rule__FamousBrand__Group_7__0");
					put(grammarAccess.getFamousBrandAccess().getGroup_7_2(), "rule__FamousBrand__Group_7_2__0");
					put(grammarAccess.getFamousBrandAccess().getGroup_10(), "rule__FamousBrand__Group_10__0");
					put(grammarAccess.getFamousBrandAccess().getGroup_13(), "rule__FamousBrand__Group_13__0");
					put(grammarAccess.getEmergingBrandAccess().getGroup(), "rule__EmergingBrand__Group__0");
					put(grammarAccess.getEmergingBrandAccess().getGroup_5(), "rule__EmergingBrand__Group_5__0");
					put(grammarAccess.getEmergingBrandAccess().getGroup_5_2(), "rule__EmergingBrand__Group_5_2__0");
					put(grammarAccess.getEmergingBrandAccess().getGroup_6(), "rule__EmergingBrand__Group_6__0");
					put(grammarAccess.getEmergingBrandAccess().getGroup_7(), "rule__EmergingBrand__Group_7__0");
					put(grammarAccess.getEmergingBrandAccess().getGroup_7_2(), "rule__EmergingBrand__Group_7_2__0");
					put(grammarAccess.getEmergingBrandAccess().getGroup_10(), "rule__EmergingBrand__Group_10__0");
					put(grammarAccess.getEmergingBrandAccess().getGroup_13(), "rule__EmergingBrand__Group_13__0");
					put(grammarAccess.getLocalBrandAccess().getGroup(), "rule__LocalBrand__Group__0");
					put(grammarAccess.getLocalBrandAccess().getGroup_5(), "rule__LocalBrand__Group_5__0");
					put(grammarAccess.getLocalBrandAccess().getGroup_5_2(), "rule__LocalBrand__Group_5_2__0");
					put(grammarAccess.getLocalBrandAccess().getGroup_6(), "rule__LocalBrand__Group_6__0");
					put(grammarAccess.getLocalBrandAccess().getGroup_7(), "rule__LocalBrand__Group_7__0");
					put(grammarAccess.getLocalBrandAccess().getGroup_7_2(), "rule__LocalBrand__Group_7_2__0");
					put(grammarAccess.getLocalBrandAccess().getGroup_10(), "rule__LocalBrand__Group_10__0");
					put(grammarAccess.getLocalBrandAccess().getGroup_13(), "rule__LocalBrand__Group_13__0");
					put(grammarAccess.getAdvertisingCampaignAccess().getGroup(), "rule__AdvertisingCampaign__Group__0");
					put(grammarAccess.getAdvertisingProductAccess().getGroup(), "rule__AdvertisingProduct__Group__0");
					put(grammarAccess.getProductLineAccess().getGroup(), "rule__ProductLine__Group__0");
					put(grammarAccess.getProductStyleAccess().getGroup(), "rule__ProductStyle__Group__0");
					put(grammarAccess.getProductAccess().getGroup(), "rule__Product__Group__0");
					put(grammarAccess.getProductAccess().getGroup_3(), "rule__Product__Group_3__0");
					put(grammarAccess.getProductAccess().getGroup_3_2(), "rule__Product__Group_3_2__0");
					put(grammarAccess.getPhotoAccess().getGroup(), "rule__Photo__Group__0");
					put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
					put(grammarAccess.getCommentAccess().getGroup(), "rule__Comment__Group__0");
					put(grammarAccess.getBloggerAccess().getGroup(), "rule__Blogger__Group__0");
					put(grammarAccess.getBloggerAccess().getGroup_5(), "rule__Blogger__Group_5__0");
					put(grammarAccess.getBloggerAccess().getGroup_8(), "rule__Blogger__Group_8__0");
					put(grammarAccess.getCriticAccess().getGroup(), "rule__Critic__Group__0");
					put(grammarAccess.getCriticAccess().getGroup_5(), "rule__Critic__Group_5__0");
					put(grammarAccess.getCriticAccess().getGroup_8(), "rule__Critic__Group_8__0");
					put(grammarAccess.getInfluencerAccess().getGroup(), "rule__Influencer__Group__0");
					put(grammarAccess.getInfluencerAccess().getGroup_5(), "rule__Influencer__Group_5__0");
					put(grammarAccess.getInfluencerAccess().getGroup_8(), "rule__Influencer__Group_8__0");
					put(grammarAccess.getDesignerAccess().getGroup(), "rule__Designer__Group__0");
					put(grammarAccess.getDesignerAccess().getGroup_7(), "rule__Designer__Group_7__0");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_5(), "rule__Model__Group_5__0");
					put(grammarAccess.getPhotographerAccess().getGroup(), "rule__Photographer__Group__0");
					put(grammarAccess.getPhotographerAccess().getGroup_5(), "rule__Photographer__Group_5__0");
					put(grammarAccess.getChoreographerAccess().getGroup(), "rule__Choreographer__Group__0");
					put(grammarAccess.getChoreographerAccess().getGroup_5(), "rule__Choreographer__Group_5__0");
					put(grammarAccess.getPresenterAccess().getGroup(), "rule__Presenter__Group__0");
					put(grammarAccess.getPresenterAccess().getGroup_5(), "rule__Presenter__Group_5__0");
					put(grammarAccess.getMacroEventAccess().getGroup(), "rule__MacroEvent__Group__0");
					put(grammarAccess.getMacroEventAccess().getGroup_9(), "rule__MacroEvent__Group_9__0");
					put(grammarAccess.getSingleBrandEventAccess().getGroup(), "rule__SingleBrandEvent__Group__0");
					put(grammarAccess.getSingleBrandEventAccess().getGroup_9(), "rule__SingleBrandEvent__Group_9__0");
					put(grammarAccess.getFashionDomainAccess().getElementsAssignment_0(), "rule__FashionDomain__ElementsAssignment_0");
					put(grammarAccess.getFashionDomainAccess().getStylesAssignment_1(), "rule__FashionDomain__StylesAssignment_1");
					put(grammarAccess.getFashionStyleAccess().getNameAssignment_1(), "rule__FashionStyle__NameAssignment_1");
					put(grammarAccess.getFashionStyleAccess().getDescriptorsAssignment_5(), "rule__FashionStyle__DescriptorsAssignment_5");
					put(grammarAccess.getFashionStyleAccess().getElementsAssignment_8(), "rule__FashionStyle__ElementsAssignment_8");
					put(grammarAccess.getFashionStyleAccess().getElementsAssignment_9_1(), "rule__FashionStyle__ElementsAssignment_9_1");
					put(grammarAccess.getSpatioTemporalDescriptorAccess().getNumberAssignment_1(), "rule__SpatioTemporalDescriptor__NumberAssignment_1");
					put(grammarAccess.getSpatioTemporalDescriptorAccess().getPeriodAssignment_4(), "rule__SpatioTemporalDescriptor__PeriodAssignment_4");
					put(grammarAccess.getSpatioTemporalDescriptorAccess().getLocationAssignment_6(), "rule__SpatioTemporalDescriptor__LocationAssignment_6");
					put(grammarAccess.getArticleAccess().getTitleAssignment_1(), "rule__Article__TitleAssignment_1");
					put(grammarAccess.getArticleAccess().getMagazineAssignment_4(), "rule__Article__MagazineAssignment_4");
					put(grammarAccess.getArticleAccess().getTypeAssignment_6(), "rule__Article__TypeAssignment_6");
					put(grammarAccess.getArticleAccess().getContentAssignment_8(), "rule__Article__ContentAssignment_8");
					put(grammarAccess.getArticleAccess().getElementsAssignment_10(), "rule__Article__ElementsAssignment_10");
					put(grammarAccess.getArticleAccess().getElementsAssignment_11_1(), "rule__Article__ElementsAssignment_11_1");
					put(grammarAccess.getTVProgramAccess().getNameAssignment_1(), "rule__TVProgram__NameAssignment_1");
					put(grammarAccess.getTVProgramAccess().getTypeAssignment_4(), "rule__TVProgram__TypeAssignment_4");
					put(grammarAccess.getTVProgramAccess().getContentAssignment_6(), "rule__TVProgram__ContentAssignment_6");
					put(grammarAccess.getTVProgramAccess().getElementsAssignment_8(), "rule__TVProgram__ElementsAssignment_8");
					put(grammarAccess.getTVProgramAccess().getElementsAssignment_9_1(), "rule__TVProgram__ElementsAssignment_9_1");
					put(grammarAccess.getFamousBrandAccess().getNameAssignment_1(), "rule__FamousBrand__NameAssignment_1");
					put(grammarAccess.getFamousBrandAccess().getCountriesAssignment_4(), "rule__FamousBrand__CountriesAssignment_4");
					put(grammarAccess.getFamousBrandAccess().getStylesAssignment_5_1(), "rule__FamousBrand__StylesAssignment_5_1");
					put(grammarAccess.getFamousBrandAccess().getStylesAssignment_5_2_1(), "rule__FamousBrand__StylesAssignment_5_2_1");
					put(grammarAccess.getFamousBrandAccess().getReportsAssignment_6_2(), "rule__FamousBrand__ReportsAssignment_6_2");
					put(grammarAccess.getFamousBrandAccess().getCampaignsAssignment_7_1(), "rule__FamousBrand__CampaignsAssignment_7_1");
					put(grammarAccess.getFamousBrandAccess().getCampaignsAssignment_7_2_1(), "rule__FamousBrand__CampaignsAssignment_7_2_1");
					put(grammarAccess.getFamousBrandAccess().getProductlinesAssignment_9(), "rule__FamousBrand__ProductlinesAssignment_9");
					put(grammarAccess.getFamousBrandAccess().getProductlinesAssignment_10_1(), "rule__FamousBrand__ProductlinesAssignment_10_1");
					put(grammarAccess.getFamousBrandAccess().getDesignersAssignment_12(), "rule__FamousBrand__DesignersAssignment_12");
					put(grammarAccess.getFamousBrandAccess().getDesignersAssignment_13_1(), "rule__FamousBrand__DesignersAssignment_13_1");
					put(grammarAccess.getEmergingBrandAccess().getNameAssignment_1(), "rule__EmergingBrand__NameAssignment_1");
					put(grammarAccess.getEmergingBrandAccess().getCountriesAssignment_4(), "rule__EmergingBrand__CountriesAssignment_4");
					put(grammarAccess.getEmergingBrandAccess().getStylesAssignment_5_1(), "rule__EmergingBrand__StylesAssignment_5_1");
					put(grammarAccess.getEmergingBrandAccess().getStylesAssignment_5_2_1(), "rule__EmergingBrand__StylesAssignment_5_2_1");
					put(grammarAccess.getEmergingBrandAccess().getReportsAssignment_6_2(), "rule__EmergingBrand__ReportsAssignment_6_2");
					put(grammarAccess.getEmergingBrandAccess().getCampaignsAssignment_7_1(), "rule__EmergingBrand__CampaignsAssignment_7_1");
					put(grammarAccess.getEmergingBrandAccess().getCampaignsAssignment_7_2_1(), "rule__EmergingBrand__CampaignsAssignment_7_2_1");
					put(grammarAccess.getEmergingBrandAccess().getProductlinesAssignment_9(), "rule__EmergingBrand__ProductlinesAssignment_9");
					put(grammarAccess.getEmergingBrandAccess().getProductlinesAssignment_10_1(), "rule__EmergingBrand__ProductlinesAssignment_10_1");
					put(grammarAccess.getEmergingBrandAccess().getDesignersAssignment_12(), "rule__EmergingBrand__DesignersAssignment_12");
					put(grammarAccess.getEmergingBrandAccess().getDesignersAssignment_13_1(), "rule__EmergingBrand__DesignersAssignment_13_1");
					put(grammarAccess.getLocalBrandAccess().getNameAssignment_1(), "rule__LocalBrand__NameAssignment_1");
					put(grammarAccess.getLocalBrandAccess().getCountryAssignment_4(), "rule__LocalBrand__CountryAssignment_4");
					put(grammarAccess.getLocalBrandAccess().getStylesAssignment_5_1(), "rule__LocalBrand__StylesAssignment_5_1");
					put(grammarAccess.getLocalBrandAccess().getStylesAssignment_5_2_1(), "rule__LocalBrand__StylesAssignment_5_2_1");
					put(grammarAccess.getLocalBrandAccess().getReportsAssignment_6_2(), "rule__LocalBrand__ReportsAssignment_6_2");
					put(grammarAccess.getLocalBrandAccess().getCampaignsAssignment_7_1(), "rule__LocalBrand__CampaignsAssignment_7_1");
					put(grammarAccess.getLocalBrandAccess().getCampaignsAssignment_7_2_1(), "rule__LocalBrand__CampaignsAssignment_7_2_1");
					put(grammarAccess.getLocalBrandAccess().getProductlinesAssignment_9(), "rule__LocalBrand__ProductlinesAssignment_9");
					put(grammarAccess.getLocalBrandAccess().getProductlinesAssignment_10_1(), "rule__LocalBrand__ProductlinesAssignment_10_1");
					put(grammarAccess.getLocalBrandAccess().getDesignersAssignment_12(), "rule__LocalBrand__DesignersAssignment_12");
					put(grammarAccess.getLocalBrandAccess().getDesignersAssignment_13_1(), "rule__LocalBrand__DesignersAssignment_13_1");
					put(grammarAccess.getAdvertisingCampaignAccess().getNameAssignment_1(), "rule__AdvertisingCampaign__NameAssignment_1");
					put(grammarAccess.getAdvertisingCampaignAccess().getBrandAssignment_4(), "rule__AdvertisingCampaign__BrandAssignment_4");
					put(grammarAccess.getAdvertisingCampaignAccess().getProductsAssignment_7(), "rule__AdvertisingCampaign__ProductsAssignment_7");
					put(grammarAccess.getAdvertisingProductAccess().getNameAssignment_1(), "rule__AdvertisingProduct__NameAssignment_1");
					put(grammarAccess.getAdvertisingProductAccess().getTypeAssignment_4(), "rule__AdvertisingProduct__TypeAssignment_4");
					put(grammarAccess.getProductLineAccess().getNameAssignment_1(), "rule__ProductLine__NameAssignment_1");
					put(grammarAccess.getProductLineAccess().getBrandAssignment_4(), "rule__ProductLine__BrandAssignment_4");
					put(grammarAccess.getProductLineAccess().getStylesAssignment_7(), "rule__ProductLine__StylesAssignment_7");
					put(grammarAccess.getProductLineAccess().getProductsAssignment_11(), "rule__ProductLine__ProductsAssignment_11");
					put(grammarAccess.getProductStyleAccess().getNameAssignment_1(), "rule__ProductStyle__NameAssignment_1");
					put(grammarAccess.getProductAccess().getNameAssignment_1(), "rule__Product__NameAssignment_1");
					put(grammarAccess.getProductAccess().getReviewsAssignment_3_1(), "rule__Product__ReviewsAssignment_3_1");
					put(grammarAccess.getProductAccess().getReviewsAssignment_3_2_1(), "rule__Product__ReviewsAssignment_3_2_1");
					put(grammarAccess.getPhotoAccess().getNameAssignment_1(), "rule__Photo__NameAssignment_1");
					put(grammarAccess.getPhotoAccess().getProductAssignment_4(), "rule__Photo__ProductAssignment_4");
					put(grammarAccess.getPhotoAccess().getTagsAssignment_6(), "rule__Photo__TagsAssignment_6");
					put(grammarAccess.getPhotoAccess().getReviewerAssignment_8(), "rule__Photo__ReviewerAssignment_8");
					put(grammarAccess.getDescriptionAccess().getNameAssignment_1(), "rule__Description__NameAssignment_1");
					put(grammarAccess.getDescriptionAccess().getProductAssignment_4(), "rule__Description__ProductAssignment_4");
					put(grammarAccess.getDescriptionAccess().getTextAssignment_6(), "rule__Description__TextAssignment_6");
					put(grammarAccess.getDescriptionAccess().getReviewerAssignment_8(), "rule__Description__ReviewerAssignment_8");
					put(grammarAccess.getCommentAccess().getNameAssignment_1(), "rule__Comment__NameAssignment_1");
					put(grammarAccess.getCommentAccess().getProductAssignment_4(), "rule__Comment__ProductAssignment_4");
					put(grammarAccess.getCommentAccess().getTextAssignment_6(), "rule__Comment__TextAssignment_6");
					put(grammarAccess.getCommentAccess().getReviewerAssignment_8(), "rule__Comment__ReviewerAssignment_8");
					put(grammarAccess.getBloggerAccess().getNameAssignment_1(), "rule__Blogger__NameAssignment_1");
					put(grammarAccess.getBloggerAccess().getReviewsAssignment_4(), "rule__Blogger__ReviewsAssignment_4");
					put(grammarAccess.getBloggerAccess().getReviewsAssignment_5_1(), "rule__Blogger__ReviewsAssignment_5_1");
					put(grammarAccess.getBloggerAccess().getEventsAssignment_7(), "rule__Blogger__EventsAssignment_7");
					put(grammarAccess.getBloggerAccess().getEventsAssignment_8_1(), "rule__Blogger__EventsAssignment_8_1");
					put(grammarAccess.getCriticAccess().getNameAssignment_1(), "rule__Critic__NameAssignment_1");
					put(grammarAccess.getCriticAccess().getReviewsAssignment_4(), "rule__Critic__ReviewsAssignment_4");
					put(grammarAccess.getCriticAccess().getReviewsAssignment_5_1(), "rule__Critic__ReviewsAssignment_5_1");
					put(grammarAccess.getCriticAccess().getEventsAssignment_7(), "rule__Critic__EventsAssignment_7");
					put(grammarAccess.getCriticAccess().getEventsAssignment_8_1(), "rule__Critic__EventsAssignment_8_1");
					put(grammarAccess.getInfluencerAccess().getNameAssignment_1(), "rule__Influencer__NameAssignment_1");
					put(grammarAccess.getInfluencerAccess().getReviewsAssignment_4(), "rule__Influencer__ReviewsAssignment_4");
					put(grammarAccess.getInfluencerAccess().getReviewsAssignment_5_1(), "rule__Influencer__ReviewsAssignment_5_1");
					put(grammarAccess.getInfluencerAccess().getEventsAssignment_7(), "rule__Influencer__EventsAssignment_7");
					put(grammarAccess.getInfluencerAccess().getEventsAssignment_8_1(), "rule__Influencer__EventsAssignment_8_1");
					put(grammarAccess.getDesignerAccess().getNameAssignment_1(), "rule__Designer__NameAssignment_1");
					put(grammarAccess.getDesignerAccess().getBrandAssignment_4(), "rule__Designer__BrandAssignment_4");
					put(grammarAccess.getDesignerAccess().getEventsAssignment_6(), "rule__Designer__EventsAssignment_6");
					put(grammarAccess.getDesignerAccess().getEventsAssignment_7_1(), "rule__Designer__EventsAssignment_7_1");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getEventsAssignment_4(), "rule__Model__EventsAssignment_4");
					put(grammarAccess.getModelAccess().getEventsAssignment_5_1(), "rule__Model__EventsAssignment_5_1");
					put(grammarAccess.getPhotographerAccess().getNameAssignment_1(), "rule__Photographer__NameAssignment_1");
					put(grammarAccess.getPhotographerAccess().getEventsAssignment_4(), "rule__Photographer__EventsAssignment_4");
					put(grammarAccess.getPhotographerAccess().getEventsAssignment_5_1(), "rule__Photographer__EventsAssignment_5_1");
					put(grammarAccess.getChoreographerAccess().getNameAssignment_1(), "rule__Choreographer__NameAssignment_1");
					put(grammarAccess.getChoreographerAccess().getEventsAssignment_4(), "rule__Choreographer__EventsAssignment_4");
					put(grammarAccess.getChoreographerAccess().getEventsAssignment_5_1(), "rule__Choreographer__EventsAssignment_5_1");
					put(grammarAccess.getPresenterAccess().getNameAssignment_1(), "rule__Presenter__NameAssignment_1");
					put(grammarAccess.getPresenterAccess().getEventsAssignment_4(), "rule__Presenter__EventsAssignment_4");
					put(grammarAccess.getPresenterAccess().getEventsAssignment_5_1(), "rule__Presenter__EventsAssignment_5_1");
					put(grammarAccess.getMacroEventAccess().getNameAssignment_1(), "rule__MacroEvent__NameAssignment_1");
					put(grammarAccess.getMacroEventAccess().getYearAssignment_4(), "rule__MacroEvent__YearAssignment_4");
					put(grammarAccess.getMacroEventAccess().getMonthAssignment_6(), "rule__MacroEvent__MonthAssignment_6");
					put(grammarAccess.getMacroEventAccess().getRolesAssignment_8(), "rule__MacroEvent__RolesAssignment_8");
					put(grammarAccess.getMacroEventAccess().getRolesAssignment_9_1(), "rule__MacroEvent__RolesAssignment_9_1");
					put(grammarAccess.getMacroEventAccess().getCityAssignment_11(), "rule__MacroEvent__CityAssignment_11");
					put(grammarAccess.getMacroEventAccess().getSingleBrandEventsAssignment_14(), "rule__MacroEvent__SingleBrandEventsAssignment_14");
					put(grammarAccess.getSingleBrandEventAccess().getNameAssignment_1(), "rule__SingleBrandEvent__NameAssignment_1");
					put(grammarAccess.getSingleBrandEventAccess().getYearAssignment_4(), "rule__SingleBrandEvent__YearAssignment_4");
					put(grammarAccess.getSingleBrandEventAccess().getMonthAssignment_6(), "rule__SingleBrandEvent__MonthAssignment_6");
					put(grammarAccess.getSingleBrandEventAccess().getRolesAssignment_8(), "rule__SingleBrandEvent__RolesAssignment_8");
					put(grammarAccess.getSingleBrandEventAccess().getRolesAssignment_9_1(), "rule__SingleBrandEvent__RolesAssignment_9_1");
					put(grammarAccess.getSingleBrandEventAccess().getDayAssignment_11(), "rule__SingleBrandEvent__DayAssignment_11");
					put(grammarAccess.getSingleBrandEventAccess().getHourAssignment_13(), "rule__SingleBrandEvent__HourAssignment_13");
					put(grammarAccess.getSingleBrandEventAccess().getMinuteAssignment_15(), "rule__SingleBrandEvent__MinuteAssignment_15");
					put(grammarAccess.getSingleBrandEventAccess().getBrandAssignment_17(), "rule__SingleBrandEvent__BrandAssignment_17");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalFashionDslParser typedParser = (InternalFashionDslParser) parser;
			typedParser.entryRuleFashionDomain();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FashionDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FashionDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
