/*
 * generated by Xtext 2.10.0
 */
package it.polimi.ase.projectB2.team20.xtext.serializer;

import com.google.inject.Inject;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingCampaign;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.AdvertisingProduct;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Article;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Blogger;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Choreographer;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Comment;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Critic;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Description;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Designer;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.EmergingBrand;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FamousBrand;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDomain;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionDslPackage;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.FashionStyle;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Influencer;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.LocalBrand;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.MacroEvent;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Model;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Photo;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Photographer;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Presenter;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.Product;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.ProductLine;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.ProductStyle;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.SingleBrandEvent;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.SpatioTemporalDescriptor;
import it.polimi.ase.projectB2.team20.xtext.fashionDsl.TVProgram;
import it.polimi.ase.projectB2.team20.xtext.services.FashionDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class FashionDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FashionDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FashionDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FashionDslPackage.ADVERTISING_CAMPAIGN:
				sequence_AdvertisingCampaign(context, (AdvertisingCampaign) semanticObject); 
				return; 
			case FashionDslPackage.ADVERTISING_PRODUCT:
				sequence_AdvertisingProduct(context, (AdvertisingProduct) semanticObject); 
				return; 
			case FashionDslPackage.ARTICLE:
				sequence_Article(context, (Article) semanticObject); 
				return; 
			case FashionDslPackage.BLOGGER:
				sequence_Blogger(context, (Blogger) semanticObject); 
				return; 
			case FashionDslPackage.CHOREOGRAPHER:
				sequence_Choreographer(context, (Choreographer) semanticObject); 
				return; 
			case FashionDslPackage.COMMENT:
				sequence_Comment(context, (Comment) semanticObject); 
				return; 
			case FashionDslPackage.CRITIC:
				sequence_Critic(context, (Critic) semanticObject); 
				return; 
			case FashionDslPackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case FashionDslPackage.DESIGNER:
				sequence_Designer(context, (Designer) semanticObject); 
				return; 
			case FashionDslPackage.EMERGING_BRAND:
				sequence_EmergingBrand(context, (EmergingBrand) semanticObject); 
				return; 
			case FashionDslPackage.FAMOUS_BRAND:
				sequence_FamousBrand(context, (FamousBrand) semanticObject); 
				return; 
			case FashionDslPackage.FASHION_DOMAIN:
				sequence_FashionDomain(context, (FashionDomain) semanticObject); 
				return; 
			case FashionDslPackage.FASHION_STYLE:
				sequence_FashionStyle(context, (FashionStyle) semanticObject); 
				return; 
			case FashionDslPackage.INFLUENCER:
				sequence_Influencer(context, (Influencer) semanticObject); 
				return; 
			case FashionDslPackage.LOCAL_BRAND:
				sequence_LocalBrand(context, (LocalBrand) semanticObject); 
				return; 
			case FashionDslPackage.MACRO_EVENT:
				sequence_MacroEvent(context, (MacroEvent) semanticObject); 
				return; 
			case FashionDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case FashionDslPackage.PHOTO:
				sequence_Photo(context, (Photo) semanticObject); 
				return; 
			case FashionDslPackage.PHOTOGRAPHER:
				sequence_Photographer(context, (Photographer) semanticObject); 
				return; 
			case FashionDslPackage.PRESENTER:
				sequence_Presenter(context, (Presenter) semanticObject); 
				return; 
			case FashionDslPackage.PRODUCT:
				sequence_Product(context, (Product) semanticObject); 
				return; 
			case FashionDslPackage.PRODUCT_LINE:
				sequence_ProductLine(context, (ProductLine) semanticObject); 
				return; 
			case FashionDslPackage.PRODUCT_STYLE:
				sequence_ProductStyle(context, (ProductStyle) semanticObject); 
				return; 
			case FashionDslPackage.SINGLE_BRAND_EVENT:
				sequence_SingleBrandEvent(context, (SingleBrandEvent) semanticObject); 
				return; 
			case FashionDslPackage.SPATIO_TEMPORAL_DESCRIPTOR:
				sequence_SpatioTemporalDescriptor(context, (SpatioTemporalDescriptor) semanticObject); 
				return; 
			case FashionDslPackage.TV_PROGRAM:
				sequence_TVProgram(context, (TVProgram) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FashionElement returns AdvertisingCampaign
	 *     AdvertisingCampaign returns AdvertisingCampaign
	 *
	 * Constraint:
	 *     (name=STRING brand=[Brand|STRING] products+=AdvertisingProduct+)
	 */
	protected void sequence_AdvertisingCampaign(ISerializationContext context, AdvertisingCampaign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns AdvertisingProduct
	 *     AdvertisingProduct returns AdvertisingProduct
	 *
	 * Constraint:
	 *     (name=STRING type=MediaType)
	 */
	protected void sequence_AdvertisingProduct(ISerializationContext context, AdvertisingProduct semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.FASHION_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.FASHION_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.ADVERTISING_PRODUCT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.ADVERTISING_PRODUCT__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdvertisingProductAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAdvertisingProductAccess().getTypeMediaTypeParserRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NewsReport returns Article
	 *     Article returns Article
	 *
	 * Constraint:
	 *     (
	 *         title=STRING 
	 *         magazine=STRING 
	 *         type=MediaType 
	 *         content=STRING 
	 *         elements+=[FashionElement|STRING] 
	 *         elements+=[FashionElement|STRING]*
	 *     )
	 */
	protected void sequence_Article(ISerializationContext context, Article semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Blogger
	 *     Role returns Blogger
	 *     Reviewer returns Blogger
	 *     Blogger returns Blogger
	 *
	 * Constraint:
	 *     (name=STRING reviews+=[Review|STRING] reviews+=[Review|STRING]* events+=[Event|STRING] events+=[Event|STRING]*)
	 */
	protected void sequence_Blogger(ISerializationContext context, Blogger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Choreographer
	 *     Role returns Choreographer
	 *     Choreographer returns Choreographer
	 *
	 * Constraint:
	 *     (name=STRING events+=[Event|STRING] events+=[Event|STRING]*)
	 */
	protected void sequence_Choreographer(ISerializationContext context, Choreographer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Comment
	 *     Review returns Comment
	 *     Comment returns Comment
	 *
	 * Constraint:
	 *     (name=STRING product=[Product|STRING] text=STRING reviewer=[Reviewer|STRING])
	 */
	protected void sequence_Comment(ISerializationContext context, Comment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.FASHION_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.FASHION_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.REVIEW__PRODUCT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.REVIEW__PRODUCT));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.COMMENT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.COMMENT__TEXT));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.REVIEW__REVIEWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.REVIEW__REVIEWER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommentAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCommentAccess().getProductProductSTRINGTerminalRuleCall_4_0_1(), semanticObject.getProduct());
		feeder.accept(grammarAccess.getCommentAccess().getTextSTRINGTerminalRuleCall_6_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getCommentAccess().getReviewerReviewerSTRINGTerminalRuleCall_8_0_1(), semanticObject.getReviewer());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Critic
	 *     Role returns Critic
	 *     Reviewer returns Critic
	 *     Critic returns Critic
	 *
	 * Constraint:
	 *     (name=STRING reviews+=[Review|STRING] reviews+=[Review|STRING]* events+=[Event|STRING] events+=[Event|STRING]*)
	 */
	protected void sequence_Critic(ISerializationContext context, Critic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Description
	 *     Review returns Description
	 *     Description returns Description
	 *
	 * Constraint:
	 *     (name=STRING product=[Product|STRING] text=STRING reviewer=[Reviewer|STRING])
	 */
	protected void sequence_Description(ISerializationContext context, Description semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.FASHION_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.FASHION_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.REVIEW__PRODUCT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.REVIEW__PRODUCT));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.DESCRIPTION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.DESCRIPTION__TEXT));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.REVIEW__REVIEWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.REVIEW__REVIEWER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDescriptionAccess().getProductProductSTRINGTerminalRuleCall_4_0_1(), semanticObject.getProduct());
		feeder.accept(grammarAccess.getDescriptionAccess().getTextSTRINGTerminalRuleCall_6_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getDescriptionAccess().getReviewerReviewerSTRINGTerminalRuleCall_8_0_1(), semanticObject.getReviewer());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Designer
	 *     Role returns Designer
	 *     Designer returns Designer
	 *
	 * Constraint:
	 *     (name=STRING brand=[Brand|STRING] events+=[Event|STRING] events+=[Event|STRING]*)
	 */
	protected void sequence_Designer(ISerializationContext context, Designer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns EmergingBrand
	 *     Brand returns EmergingBrand
	 *     EmergingBrand returns EmergingBrand
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         countries=STRING 
	 *         (styles+=[FashionStyle|STRING] styles+=[FashionStyle|STRING]*)? 
	 *         reports+=NewsReport* 
	 *         (campaigns+=[AdvertisingCampaign|STRING] campaigns+=[AdvertisingCampaign|STRING]*)? 
	 *         productlines+=[ProductLine|STRING] 
	 *         productlines+=[ProductLine|STRING]* 
	 *         designers+=[Designer|STRING] 
	 *         designers+=[Designer|STRING]*
	 *     )
	 */
	protected void sequence_EmergingBrand(ISerializationContext context, EmergingBrand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns FamousBrand
	 *     Brand returns FamousBrand
	 *     FamousBrand returns FamousBrand
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         countries=STRING 
	 *         (styles+=[FashionStyle|STRING] styles+=[FashionStyle|STRING]*)? 
	 *         reports+=NewsReport* 
	 *         (campaigns+=[AdvertisingCampaign|STRING] campaigns+=[AdvertisingCampaign|STRING]*)? 
	 *         productlines+=[ProductLine|STRING] 
	 *         productlines+=[ProductLine|STRING]* 
	 *         designers+=[Designer|STRING] 
	 *         designers+=[Designer|STRING]*
	 *     )
	 */
	protected void sequence_FamousBrand(ISerializationContext context, FamousBrand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionDomain returns FashionDomain
	 *
	 * Constraint:
	 *     (elements+=FashionElement+ styles+=FashionStyle+)
	 */
	protected void sequence_FashionDomain(ISerializationContext context, FashionDomain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionStyle returns FashionStyle
	 *
	 * Constraint:
	 *     (name=STRING descriptors+=SpatioTemporalDescriptor+ elements+=[FashionElement|STRING] elements+=[FashionElement|STRING]*)
	 */
	protected void sequence_FashionStyle(ISerializationContext context, FashionStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Influencer
	 *     Role returns Influencer
	 *     Reviewer returns Influencer
	 *     Influencer returns Influencer
	 *
	 * Constraint:
	 *     (name=STRING reviews+=[Review|STRING] reviews+=[Review|STRING]* events+=[Event|STRING] events+=[Event|STRING]*)
	 */
	protected void sequence_Influencer(ISerializationContext context, Influencer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns LocalBrand
	 *     Brand returns LocalBrand
	 *     LocalBrand returns LocalBrand
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         country=STRING 
	 *         (styles+=[FashionStyle|STRING] styles+=[FashionStyle|STRING]*)? 
	 *         reports+=NewsReport* 
	 *         (campaigns+=[AdvertisingCampaign|STRING] campaigns+=[AdvertisingCampaign|STRING]*)? 
	 *         productlines+=[ProductLine|STRING] 
	 *         productlines+=[ProductLine|STRING]* 
	 *         designers+=[Designer|STRING] 
	 *         designers+=[Designer|STRING]*
	 *     )
	 */
	protected void sequence_LocalBrand(ISerializationContext context, LocalBrand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns MacroEvent
	 *     Event returns MacroEvent
	 *     MacroEvent returns MacroEvent
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         year=INT 
	 *         month=INT 
	 *         roles+=[Role|STRING] 
	 *         roles+=[Role|STRING]* 
	 *         city=STRING 
	 *         singleBrandEvents+=SingleBrandEvent+
	 *     )
	 */
	protected void sequence_MacroEvent(ISerializationContext context, MacroEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Model
	 *     Role returns Model
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=STRING events+=[Event|STRING] events+=[Event|STRING]*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Photo
	 *     Review returns Photo
	 *     Photo returns Photo
	 *
	 * Constraint:
	 *     (name=STRING product=[Product|STRING] tags=STRING reviewer=[Reviewer|STRING])
	 */
	protected void sequence_Photo(ISerializationContext context, Photo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.FASHION_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.FASHION_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.REVIEW__PRODUCT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.REVIEW__PRODUCT));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.PHOTO__TAGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.PHOTO__TAGS));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.REVIEW__REVIEWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.REVIEW__REVIEWER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPhotoAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPhotoAccess().getProductProductSTRINGTerminalRuleCall_4_0_1(), semanticObject.getProduct());
		feeder.accept(grammarAccess.getPhotoAccess().getTagsSTRINGTerminalRuleCall_6_0(), semanticObject.getTags());
		feeder.accept(grammarAccess.getPhotoAccess().getReviewerReviewerSTRINGTerminalRuleCall_8_0_1(), semanticObject.getReviewer());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Photographer
	 *     Role returns Photographer
	 *     Photographer returns Photographer
	 *
	 * Constraint:
	 *     (name=STRING events+=[Event|STRING] events+=[Event|STRING]*)
	 */
	protected void sequence_Photographer(ISerializationContext context, Photographer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Presenter
	 *     Role returns Presenter
	 *     Presenter returns Presenter
	 *
	 * Constraint:
	 *     (name=STRING events+=[Event|STRING] events+=[Event|STRING]*)
	 */
	protected void sequence_Presenter(ISerializationContext context, Presenter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns ProductLine
	 *     ProductLine returns ProductLine
	 *
	 * Constraint:
	 *     (name=STRING brand=[Brand|STRING] styles+=ProductStyle+ products+=Product+)
	 */
	protected void sequence_ProductLine(ISerializationContext context, ProductLine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns ProductStyle
	 *     ProductStyle returns ProductStyle
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_ProductStyle(ISerializationContext context, ProductStyle semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.FASHION_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.FASHION_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProductStyleAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns Product
	 *     Product returns Product
	 *
	 * Constraint:
	 *     (name=STRING (reviews+=[Review|STRING] reviews+=[Review|STRING]*)?)
	 */
	protected void sequence_Product(ISerializationContext context, Product semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FashionElement returns SingleBrandEvent
	 *     Event returns SingleBrandEvent
	 *     SingleBrandEvent returns SingleBrandEvent
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         year=INT 
	 *         month=INT 
	 *         roles+=[Role|STRING] 
	 *         roles+=[Role|STRING]* 
	 *         day=INT 
	 *         hour=INT 
	 *         minute=INT 
	 *         brand=[Brand|STRING]
	 *     )
	 */
	protected void sequence_SingleBrandEvent(ISerializationContext context, SingleBrandEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpatioTemporalDescriptor returns SpatioTemporalDescriptor
	 *
	 * Constraint:
	 *     (number=INT period=STRING location=STRING)
	 */
	protected void sequence_SpatioTemporalDescriptor(ISerializationContext context, SpatioTemporalDescriptor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.SPATIO_TEMPORAL_DESCRIPTOR__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.SPATIO_TEMPORAL_DESCRIPTOR__NUMBER));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.SPATIO_TEMPORAL_DESCRIPTOR__PERIOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.SPATIO_TEMPORAL_DESCRIPTOR__PERIOD));
			if (transientValues.isValueTransient(semanticObject, FashionDslPackage.Literals.SPATIO_TEMPORAL_DESCRIPTOR__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FashionDslPackage.Literals.SPATIO_TEMPORAL_DESCRIPTOR__LOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSpatioTemporalDescriptorAccess().getNumberINTTerminalRuleCall_1_0(), semanticObject.getNumber());
		feeder.accept(grammarAccess.getSpatioTemporalDescriptorAccess().getPeriodSTRINGTerminalRuleCall_4_0(), semanticObject.getPeriod());
		feeder.accept(grammarAccess.getSpatioTemporalDescriptorAccess().getLocationSTRINGTerminalRuleCall_6_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NewsReport returns TVProgram
	 *     TVProgram returns TVProgram
	 *
	 * Constraint:
	 *     (name=STRING type=MediaType content=STRING elements+=[FashionElement|STRING] elements+=[FashionElement|STRING]*)
	 */
	protected void sequence_TVProgram(ISerializationContext context, TVProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
