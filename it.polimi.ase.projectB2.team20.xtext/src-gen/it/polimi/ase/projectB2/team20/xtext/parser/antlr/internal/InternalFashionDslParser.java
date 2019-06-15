package it.polimi.ase.projectB2.team20.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.polimi.ase.projectB2.team20.xtext.services.FashionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFashionDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fashionStyle'", "'{'", "'descriptors'", "'}'", "'elements:'", "','", "'descriptor'", "'period:'", "'location:'", "'article'", "'magazine:'", "'type:'", "'content:'", "'tvProgram'", "'famousBrand'", "'countries:'", "'styles:'", "'reports'", "'advertisingCampaigns:'", "'productLines:'", "'designers:'", "'emergingBrand'", "'localBrand'", "'country:'", "'advertisingCampaign'", "'brand:'", "'advertisingProducts'", "'advertisingProduct'", "'productLine'", "'productStyles'", "'products'", "'productStyle:'", "'product'", "'reviews:'", "'photo'", "'product:'", "'tags:'", "'reviewer:'", "'description'", "'text:'", "'comment'", "'blogger'", "'events:'", "'critic'", "'influencer'", "'designer'", "'model'", "'photographer'", "'choreographer'", "'presenter'", "'macroEvent'", "'year:'", "'month:'", "'roles:'", "'city:'", "'singleBrandEvents'", "'singleBrandEvent'", "'day:'", "'hour:'", "'minute:'", "'Online'", "'TV'", "'PhysicalBoard'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFashionDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFashionDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFashionDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFashionDsl.g"; }



     	private FashionDslGrammarAccess grammarAccess;

        public InternalFashionDslParser(TokenStream input, FashionDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FashionDomain";
       	}

       	@Override
       	protected FashionDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFashionDomain"
    // InternalFashionDsl.g:64:1: entryRuleFashionDomain returns [EObject current=null] : iv_ruleFashionDomain= ruleFashionDomain EOF ;
    public final EObject entryRuleFashionDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFashionDomain = null;


        try {
            // InternalFashionDsl.g:64:54: (iv_ruleFashionDomain= ruleFashionDomain EOF )
            // InternalFashionDsl.g:65:2: iv_ruleFashionDomain= ruleFashionDomain EOF
            {
             newCompositeNode(grammarAccess.getFashionDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFashionDomain=ruleFashionDomain();

            state._fsp--;

             current =iv_ruleFashionDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFashionDomain"


    // $ANTLR start "ruleFashionDomain"
    // InternalFashionDsl.g:71:1: ruleFashionDomain returns [EObject current=null] : ( ( (lv_elements_0_0= ruleFashionElement ) )+ ( (lv_styles_1_0= ruleFashionStyle ) )+ ) ;
    public final EObject ruleFashionDomain() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_styles_1_0 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:77:2: ( ( ( (lv_elements_0_0= ruleFashionElement ) )+ ( (lv_styles_1_0= ruleFashionStyle ) )+ ) )
            // InternalFashionDsl.g:78:2: ( ( (lv_elements_0_0= ruleFashionElement ) )+ ( (lv_styles_1_0= ruleFashionStyle ) )+ )
            {
            // InternalFashionDsl.g:78:2: ( ( (lv_elements_0_0= ruleFashionElement ) )+ ( (lv_styles_1_0= ruleFashionStyle ) )+ )
            // InternalFashionDsl.g:79:3: ( (lv_elements_0_0= ruleFashionElement ) )+ ( (lv_styles_1_0= ruleFashionStyle ) )+
            {
            // InternalFashionDsl.g:79:3: ( (lv_elements_0_0= ruleFashionElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25||(LA1_0>=32 && LA1_0<=33)||LA1_0==35||(LA1_0>=38 && LA1_0<=39)||(LA1_0>=42 && LA1_0<=43)||LA1_0==45||LA1_0==49||(LA1_0>=51 && LA1_0<=52)||(LA1_0>=54 && LA1_0<=61)||LA1_0==67) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFashionDsl.g:80:4: (lv_elements_0_0= ruleFashionElement )
            	    {
            	    // InternalFashionDsl.g:80:4: (lv_elements_0_0= ruleFashionElement )
            	    // InternalFashionDsl.g:81:5: lv_elements_0_0= ruleFashionElement
            	    {

            	    					newCompositeNode(grammarAccess.getFashionDomainAccess().getElementsFashionElementParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleFashionElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFashionDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"it.polimi.ase.projectB2.team20.xtext.FashionDsl.FashionElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalFashionDsl.g:98:3: ( (lv_styles_1_0= ruleFashionStyle ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFashionDsl.g:99:4: (lv_styles_1_0= ruleFashionStyle )
            	    {
            	    // InternalFashionDsl.g:99:4: (lv_styles_1_0= ruleFashionStyle )
            	    // InternalFashionDsl.g:100:5: lv_styles_1_0= ruleFashionStyle
            	    {

            	    					newCompositeNode(grammarAccess.getFashionDomainAccess().getStylesFashionStyleParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_styles_1_0=ruleFashionStyle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFashionDomainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"styles",
            	    						lv_styles_1_0,
            	    						"it.polimi.ase.projectB2.team20.xtext.FashionDsl.FashionStyle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFashionDomain"


    // $ANTLR start "entryRuleFashionElement"
    // InternalFashionDsl.g:121:1: entryRuleFashionElement returns [EObject current=null] : iv_ruleFashionElement= ruleFashionElement EOF ;
    public final EObject entryRuleFashionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFashionElement = null;


        try {
            // InternalFashionDsl.g:121:55: (iv_ruleFashionElement= ruleFashionElement EOF )
            // InternalFashionDsl.g:122:2: iv_ruleFashionElement= ruleFashionElement EOF
            {
             newCompositeNode(grammarAccess.getFashionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFashionElement=ruleFashionElement();

            state._fsp--;

             current =iv_ruleFashionElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFashionElement"


    // $ANTLR start "ruleFashionElement"
    // InternalFashionDsl.g:128:1: ruleFashionElement returns [EObject current=null] : (this_Brand_0= ruleBrand | this_AdvertisingCampaign_1= ruleAdvertisingCampaign | this_AdvertisingProduct_2= ruleAdvertisingProduct | this_ProductLine_3= ruleProductLine | this_ProductStyle_4= ruleProductStyle | this_Product_5= ruleProduct | this_Review_6= ruleReview | this_Role_7= ruleRole | this_Event_8= ruleEvent ) ;
    public final EObject ruleFashionElement() throws RecognitionException {
        EObject current = null;

        EObject this_Brand_0 = null;

        EObject this_AdvertisingCampaign_1 = null;

        EObject this_AdvertisingProduct_2 = null;

        EObject this_ProductLine_3 = null;

        EObject this_ProductStyle_4 = null;

        EObject this_Product_5 = null;

        EObject this_Review_6 = null;

        EObject this_Role_7 = null;

        EObject this_Event_8 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:134:2: ( (this_Brand_0= ruleBrand | this_AdvertisingCampaign_1= ruleAdvertisingCampaign | this_AdvertisingProduct_2= ruleAdvertisingProduct | this_ProductLine_3= ruleProductLine | this_ProductStyle_4= ruleProductStyle | this_Product_5= ruleProduct | this_Review_6= ruleReview | this_Role_7= ruleRole | this_Event_8= ruleEvent ) )
            // InternalFashionDsl.g:135:2: (this_Brand_0= ruleBrand | this_AdvertisingCampaign_1= ruleAdvertisingCampaign | this_AdvertisingProduct_2= ruleAdvertisingProduct | this_ProductLine_3= ruleProductLine | this_ProductStyle_4= ruleProductStyle | this_Product_5= ruleProduct | this_Review_6= ruleReview | this_Role_7= ruleRole | this_Event_8= ruleEvent )
            {
            // InternalFashionDsl.g:135:2: (this_Brand_0= ruleBrand | this_AdvertisingCampaign_1= ruleAdvertisingCampaign | this_AdvertisingProduct_2= ruleAdvertisingProduct | this_ProductLine_3= ruleProductLine | this_ProductStyle_4= ruleProductStyle | this_Product_5= ruleProduct | this_Review_6= ruleReview | this_Role_7= ruleRole | this_Event_8= ruleEvent )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 25:
            case 32:
            case 33:
                {
                alt3=1;
                }
                break;
            case 35:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            case 39:
                {
                alt3=4;
                }
                break;
            case 42:
                {
                alt3=5;
                }
                break;
            case 43:
                {
                alt3=6;
                }
                break;
            case 45:
            case 49:
            case 51:
                {
                alt3=7;
                }
                break;
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt3=8;
                }
                break;
            case 61:
            case 67:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFashionDsl.g:136:3: this_Brand_0= ruleBrand
                    {

                    			newCompositeNode(grammarAccess.getFashionElementAccess().getBrandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Brand_0=ruleBrand();

                    state._fsp--;


                    			current = this_Brand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFashionDsl.g:145:3: this_AdvertisingCampaign_1= ruleAdvertisingCampaign
                    {

                    			newCompositeNode(grammarAccess.getFashionElementAccess().getAdvertisingCampaignParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdvertisingCampaign_1=ruleAdvertisingCampaign();

                    state._fsp--;


                    			current = this_AdvertisingCampaign_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFashionDsl.g:154:3: this_AdvertisingProduct_2= ruleAdvertisingProduct
                    {

                    			newCompositeNode(grammarAccess.getFashionElementAccess().getAdvertisingProductParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdvertisingProduct_2=ruleAdvertisingProduct();

                    state._fsp--;


                    			current = this_AdvertisingProduct_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFashionDsl.g:163:3: this_ProductLine_3= ruleProductLine
                    {

                    			newCompositeNode(grammarAccess.getFashionElementAccess().getProductLineParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProductLine_3=ruleProductLine();

                    state._fsp--;


                    			current = this_ProductLine_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFashionDsl.g:172:3: this_ProductStyle_4= ruleProductStyle
                    {

                    			newCompositeNode(grammarAccess.getFashionElementAccess().getProductStyleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProductStyle_4=ruleProductStyle();

                    state._fsp--;


                    			current = this_ProductStyle_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFashionDsl.g:181:3: this_Product_5= ruleProduct
                    {

                    			newCompositeNode(grammarAccess.getFashionElementAccess().getProductParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Product_5=ruleProduct();

                    state._fsp--;


                    			current = this_Product_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFashionDsl.g:190:3: this_Review_6= ruleReview
                    {

                    			newCompositeNode(grammarAccess.getFashionElementAccess().getReviewParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Review_6=ruleReview();

                    state._fsp--;


                    			current = this_Review_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalFashionDsl.g:199:3: this_Role_7= ruleRole
                    {

                    			newCompositeNode(grammarAccess.getFashionElementAccess().getRoleParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Role_7=ruleRole();

                    state._fsp--;


                    			current = this_Role_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalFashionDsl.g:208:3: this_Event_8= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getFashionElementAccess().getEventParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_8=ruleEvent();

                    state._fsp--;


                    			current = this_Event_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFashionElement"


    // $ANTLR start "entryRuleBrand"
    // InternalFashionDsl.g:220:1: entryRuleBrand returns [EObject current=null] : iv_ruleBrand= ruleBrand EOF ;
    public final EObject entryRuleBrand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrand = null;


        try {
            // InternalFashionDsl.g:220:46: (iv_ruleBrand= ruleBrand EOF )
            // InternalFashionDsl.g:221:2: iv_ruleBrand= ruleBrand EOF
            {
             newCompositeNode(grammarAccess.getBrandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrand=ruleBrand();

            state._fsp--;

             current =iv_ruleBrand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrand"


    // $ANTLR start "ruleBrand"
    // InternalFashionDsl.g:227:1: ruleBrand returns [EObject current=null] : (this_FamousBrand_0= ruleFamousBrand | this_EmergingBrand_1= ruleEmergingBrand | this_LocalBrand_2= ruleLocalBrand ) ;
    public final EObject ruleBrand() throws RecognitionException {
        EObject current = null;

        EObject this_FamousBrand_0 = null;

        EObject this_EmergingBrand_1 = null;

        EObject this_LocalBrand_2 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:233:2: ( (this_FamousBrand_0= ruleFamousBrand | this_EmergingBrand_1= ruleEmergingBrand | this_LocalBrand_2= ruleLocalBrand ) )
            // InternalFashionDsl.g:234:2: (this_FamousBrand_0= ruleFamousBrand | this_EmergingBrand_1= ruleEmergingBrand | this_LocalBrand_2= ruleLocalBrand )
            {
            // InternalFashionDsl.g:234:2: (this_FamousBrand_0= ruleFamousBrand | this_EmergingBrand_1= ruleEmergingBrand | this_LocalBrand_2= ruleLocalBrand )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFashionDsl.g:235:3: this_FamousBrand_0= ruleFamousBrand
                    {

                    			newCompositeNode(grammarAccess.getBrandAccess().getFamousBrandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FamousBrand_0=ruleFamousBrand();

                    state._fsp--;


                    			current = this_FamousBrand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFashionDsl.g:244:3: this_EmergingBrand_1= ruleEmergingBrand
                    {

                    			newCompositeNode(grammarAccess.getBrandAccess().getEmergingBrandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmergingBrand_1=ruleEmergingBrand();

                    state._fsp--;


                    			current = this_EmergingBrand_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFashionDsl.g:253:3: this_LocalBrand_2= ruleLocalBrand
                    {

                    			newCompositeNode(grammarAccess.getBrandAccess().getLocalBrandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalBrand_2=ruleLocalBrand();

                    state._fsp--;


                    			current = this_LocalBrand_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrand"


    // $ANTLR start "entryRuleNewsReport"
    // InternalFashionDsl.g:265:1: entryRuleNewsReport returns [EObject current=null] : iv_ruleNewsReport= ruleNewsReport EOF ;
    public final EObject entryRuleNewsReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewsReport = null;


        try {
            // InternalFashionDsl.g:265:51: (iv_ruleNewsReport= ruleNewsReport EOF )
            // InternalFashionDsl.g:266:2: iv_ruleNewsReport= ruleNewsReport EOF
            {
             newCompositeNode(grammarAccess.getNewsReportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewsReport=ruleNewsReport();

            state._fsp--;

             current =iv_ruleNewsReport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewsReport"


    // $ANTLR start "ruleNewsReport"
    // InternalFashionDsl.g:272:1: ruleNewsReport returns [EObject current=null] : (this_Article_0= ruleArticle | this_TVProgram_1= ruleTVProgram ) ;
    public final EObject ruleNewsReport() throws RecognitionException {
        EObject current = null;

        EObject this_Article_0 = null;

        EObject this_TVProgram_1 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:278:2: ( (this_Article_0= ruleArticle | this_TVProgram_1= ruleTVProgram ) )
            // InternalFashionDsl.g:279:2: (this_Article_0= ruleArticle | this_TVProgram_1= ruleTVProgram )
            {
            // InternalFashionDsl.g:279:2: (this_Article_0= ruleArticle | this_TVProgram_1= ruleTVProgram )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFashionDsl.g:280:3: this_Article_0= ruleArticle
                    {

                    			newCompositeNode(grammarAccess.getNewsReportAccess().getArticleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Article_0=ruleArticle();

                    state._fsp--;


                    			current = this_Article_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFashionDsl.g:289:3: this_TVProgram_1= ruleTVProgram
                    {

                    			newCompositeNode(grammarAccess.getNewsReportAccess().getTVProgramParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TVProgram_1=ruleTVProgram();

                    state._fsp--;


                    			current = this_TVProgram_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewsReport"


    // $ANTLR start "entryRuleReview"
    // InternalFashionDsl.g:301:1: entryRuleReview returns [EObject current=null] : iv_ruleReview= ruleReview EOF ;
    public final EObject entryRuleReview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReview = null;


        try {
            // InternalFashionDsl.g:301:47: (iv_ruleReview= ruleReview EOF )
            // InternalFashionDsl.g:302:2: iv_ruleReview= ruleReview EOF
            {
             newCompositeNode(grammarAccess.getReviewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReview=ruleReview();

            state._fsp--;

             current =iv_ruleReview; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReview"


    // $ANTLR start "ruleReview"
    // InternalFashionDsl.g:308:1: ruleReview returns [EObject current=null] : (this_Photo_0= rulePhoto | this_Description_1= ruleDescription | this_Comment_2= ruleComment ) ;
    public final EObject ruleReview() throws RecognitionException {
        EObject current = null;

        EObject this_Photo_0 = null;

        EObject this_Description_1 = null;

        EObject this_Comment_2 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:314:2: ( (this_Photo_0= rulePhoto | this_Description_1= ruleDescription | this_Comment_2= ruleComment ) )
            // InternalFashionDsl.g:315:2: (this_Photo_0= rulePhoto | this_Description_1= ruleDescription | this_Comment_2= ruleComment )
            {
            // InternalFashionDsl.g:315:2: (this_Photo_0= rulePhoto | this_Description_1= ruleDescription | this_Comment_2= ruleComment )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt6=1;
                }
                break;
            case 49:
                {
                alt6=2;
                }
                break;
            case 51:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFashionDsl.g:316:3: this_Photo_0= rulePhoto
                    {

                    			newCompositeNode(grammarAccess.getReviewAccess().getPhotoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Photo_0=rulePhoto();

                    state._fsp--;


                    			current = this_Photo_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFashionDsl.g:325:3: this_Description_1= ruleDescription
                    {

                    			newCompositeNode(grammarAccess.getReviewAccess().getDescriptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Description_1=ruleDescription();

                    state._fsp--;


                    			current = this_Description_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFashionDsl.g:334:3: this_Comment_2= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getReviewAccess().getCommentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_2=ruleComment();

                    state._fsp--;


                    			current = this_Comment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReview"


    // $ANTLR start "entryRuleRole"
    // InternalFashionDsl.g:346:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalFashionDsl.g:346:45: (iv_ruleRole= ruleRole EOF )
            // InternalFashionDsl.g:347:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalFashionDsl.g:353:1: ruleRole returns [EObject current=null] : (this_Designer_0= ruleDesigner | this_Model_1= ruleModel | this_Photographer_2= rulePhotographer | this_Choreographer_3= ruleChoreographer | this_Presenter_4= rulePresenter | this_Reviewer_5= ruleReviewer ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        EObject this_Designer_0 = null;

        EObject this_Model_1 = null;

        EObject this_Photographer_2 = null;

        EObject this_Choreographer_3 = null;

        EObject this_Presenter_4 = null;

        EObject this_Reviewer_5 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:359:2: ( (this_Designer_0= ruleDesigner | this_Model_1= ruleModel | this_Photographer_2= rulePhotographer | this_Choreographer_3= ruleChoreographer | this_Presenter_4= rulePresenter | this_Reviewer_5= ruleReviewer ) )
            // InternalFashionDsl.g:360:2: (this_Designer_0= ruleDesigner | this_Model_1= ruleModel | this_Photographer_2= rulePhotographer | this_Choreographer_3= ruleChoreographer | this_Presenter_4= rulePresenter | this_Reviewer_5= ruleReviewer )
            {
            // InternalFashionDsl.g:360:2: (this_Designer_0= ruleDesigner | this_Model_1= ruleModel | this_Photographer_2= rulePhotographer | this_Choreographer_3= ruleChoreographer | this_Presenter_4= rulePresenter | this_Reviewer_5= ruleReviewer )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt7=1;
                }
                break;
            case 57:
                {
                alt7=2;
                }
                break;
            case 58:
                {
                alt7=3;
                }
                break;
            case 59:
                {
                alt7=4;
                }
                break;
            case 60:
                {
                alt7=5;
                }
                break;
            case 52:
            case 54:
            case 55:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFashionDsl.g:361:3: this_Designer_0= ruleDesigner
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getDesignerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Designer_0=ruleDesigner();

                    state._fsp--;


                    			current = this_Designer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFashionDsl.g:370:3: this_Model_1= ruleModel
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Model_1=ruleModel();

                    state._fsp--;


                    			current = this_Model_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFashionDsl.g:379:3: this_Photographer_2= rulePhotographer
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getPhotographerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Photographer_2=rulePhotographer();

                    state._fsp--;


                    			current = this_Photographer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFashionDsl.g:388:3: this_Choreographer_3= ruleChoreographer
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getChoreographerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Choreographer_3=ruleChoreographer();

                    state._fsp--;


                    			current = this_Choreographer_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFashionDsl.g:397:3: this_Presenter_4= rulePresenter
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getPresenterParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Presenter_4=rulePresenter();

                    state._fsp--;


                    			current = this_Presenter_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFashionDsl.g:406:3: this_Reviewer_5= ruleReviewer
                    {

                    			newCompositeNode(grammarAccess.getRoleAccess().getReviewerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reviewer_5=ruleReviewer();

                    state._fsp--;


                    			current = this_Reviewer_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleReviewer"
    // InternalFashionDsl.g:418:1: entryRuleReviewer returns [EObject current=null] : iv_ruleReviewer= ruleReviewer EOF ;
    public final EObject entryRuleReviewer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReviewer = null;


        try {
            // InternalFashionDsl.g:418:49: (iv_ruleReviewer= ruleReviewer EOF )
            // InternalFashionDsl.g:419:2: iv_ruleReviewer= ruleReviewer EOF
            {
             newCompositeNode(grammarAccess.getReviewerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReviewer=ruleReviewer();

            state._fsp--;

             current =iv_ruleReviewer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReviewer"


    // $ANTLR start "ruleReviewer"
    // InternalFashionDsl.g:425:1: ruleReviewer returns [EObject current=null] : (this_Blogger_0= ruleBlogger | this_Critic_1= ruleCritic | this_Influencer_2= ruleInfluencer ) ;
    public final EObject ruleReviewer() throws RecognitionException {
        EObject current = null;

        EObject this_Blogger_0 = null;

        EObject this_Critic_1 = null;

        EObject this_Influencer_2 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:431:2: ( (this_Blogger_0= ruleBlogger | this_Critic_1= ruleCritic | this_Influencer_2= ruleInfluencer ) )
            // InternalFashionDsl.g:432:2: (this_Blogger_0= ruleBlogger | this_Critic_1= ruleCritic | this_Influencer_2= ruleInfluencer )
            {
            // InternalFashionDsl.g:432:2: (this_Blogger_0= ruleBlogger | this_Critic_1= ruleCritic | this_Influencer_2= ruleInfluencer )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt8=1;
                }
                break;
            case 54:
                {
                alt8=2;
                }
                break;
            case 55:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalFashionDsl.g:433:3: this_Blogger_0= ruleBlogger
                    {

                    			newCompositeNode(grammarAccess.getReviewerAccess().getBloggerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Blogger_0=ruleBlogger();

                    state._fsp--;


                    			current = this_Blogger_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFashionDsl.g:442:3: this_Critic_1= ruleCritic
                    {

                    			newCompositeNode(grammarAccess.getReviewerAccess().getCriticParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Critic_1=ruleCritic();

                    state._fsp--;


                    			current = this_Critic_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFashionDsl.g:451:3: this_Influencer_2= ruleInfluencer
                    {

                    			newCompositeNode(grammarAccess.getReviewerAccess().getInfluencerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Influencer_2=ruleInfluencer();

                    state._fsp--;


                    			current = this_Influencer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReviewer"


    // $ANTLR start "entryRuleEvent"
    // InternalFashionDsl.g:463:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalFashionDsl.g:463:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalFashionDsl.g:464:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalFashionDsl.g:470:1: ruleEvent returns [EObject current=null] : (this_MacroEvent_0= ruleMacroEvent | this_SingleBrandEvent_1= ruleSingleBrandEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_MacroEvent_0 = null;

        EObject this_SingleBrandEvent_1 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:476:2: ( (this_MacroEvent_0= ruleMacroEvent | this_SingleBrandEvent_1= ruleSingleBrandEvent ) )
            // InternalFashionDsl.g:477:2: (this_MacroEvent_0= ruleMacroEvent | this_SingleBrandEvent_1= ruleSingleBrandEvent )
            {
            // InternalFashionDsl.g:477:2: (this_MacroEvent_0= ruleMacroEvent | this_SingleBrandEvent_1= ruleSingleBrandEvent )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==61) ) {
                alt9=1;
            }
            else if ( (LA9_0==67) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFashionDsl.g:478:3: this_MacroEvent_0= ruleMacroEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getMacroEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MacroEvent_0=ruleMacroEvent();

                    state._fsp--;


                    			current = this_MacroEvent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFashionDsl.g:487:3: this_SingleBrandEvent_1= ruleSingleBrandEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getSingleBrandEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleBrandEvent_1=ruleSingleBrandEvent();

                    state._fsp--;


                    			current = this_SingleBrandEvent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleFashionStyle"
    // InternalFashionDsl.g:499:1: entryRuleFashionStyle returns [EObject current=null] : iv_ruleFashionStyle= ruleFashionStyle EOF ;
    public final EObject entryRuleFashionStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFashionStyle = null;


        try {
            // InternalFashionDsl.g:499:53: (iv_ruleFashionStyle= ruleFashionStyle EOF )
            // InternalFashionDsl.g:500:2: iv_ruleFashionStyle= ruleFashionStyle EOF
            {
             newCompositeNode(grammarAccess.getFashionStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFashionStyle=ruleFashionStyle();

            state._fsp--;

             current =iv_ruleFashionStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFashionStyle"


    // $ANTLR start "ruleFashionStyle"
    // InternalFashionDsl.g:506:1: ruleFashionStyle returns [EObject current=null] : (otherlv_0= 'fashionStyle' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'descriptors' otherlv_4= '{' ( (lv_descriptors_5_0= ruleSpatioTemporalDescriptor ) )+ otherlv_6= '}' otherlv_7= 'elements:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleFashionStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_descriptors_5_0 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:512:2: ( (otherlv_0= 'fashionStyle' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'descriptors' otherlv_4= '{' ( (lv_descriptors_5_0= ruleSpatioTemporalDescriptor ) )+ otherlv_6= '}' otherlv_7= 'elements:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' ) )
            // InternalFashionDsl.g:513:2: (otherlv_0= 'fashionStyle' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'descriptors' otherlv_4= '{' ( (lv_descriptors_5_0= ruleSpatioTemporalDescriptor ) )+ otherlv_6= '}' otherlv_7= 'elements:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' )
            {
            // InternalFashionDsl.g:513:2: (otherlv_0= 'fashionStyle' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'descriptors' otherlv_4= '{' ( (lv_descriptors_5_0= ruleSpatioTemporalDescriptor ) )+ otherlv_6= '}' otherlv_7= 'elements:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' )
            // InternalFashionDsl.g:514:3: otherlv_0= 'fashionStyle' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'descriptors' otherlv_4= '{' ( (lv_descriptors_5_0= ruleSpatioTemporalDescriptor ) )+ otherlv_6= '}' otherlv_7= 'elements:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFashionStyleAccess().getFashionStyleKeyword_0());
            		
            // InternalFashionDsl.g:518:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:519:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:519:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:520:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFashionStyleAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFashionStyleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFashionStyleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getFashionStyleAccess().getDescriptorsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFashionStyleAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalFashionDsl.g:548:3: ( (lv_descriptors_5_0= ruleSpatioTemporalDescriptor ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFashionDsl.g:549:4: (lv_descriptors_5_0= ruleSpatioTemporalDescriptor )
            	    {
            	    // InternalFashionDsl.g:549:4: (lv_descriptors_5_0= ruleSpatioTemporalDescriptor )
            	    // InternalFashionDsl.g:550:5: lv_descriptors_5_0= ruleSpatioTemporalDescriptor
            	    {

            	    					newCompositeNode(grammarAccess.getFashionStyleAccess().getDescriptorsSpatioTemporalDescriptorParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_descriptors_5_0=ruleSpatioTemporalDescriptor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFashionStyleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"descriptors",
            	    						lv_descriptors_5_0,
            	    						"it.polimi.ase.projectB2.team20.xtext.FashionDsl.SpatioTemporalDescriptor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getFashionStyleAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getFashionStyleAccess().getElementsKeyword_7());
            		
            // InternalFashionDsl.g:575:3: ( (otherlv_8= RULE_STRING ) )
            // InternalFashionDsl.g:576:4: (otherlv_8= RULE_STRING )
            {
            // InternalFashionDsl.g:576:4: (otherlv_8= RULE_STRING )
            // InternalFashionDsl.g:577:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFashionStyleRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getFashionStyleAccess().getElementsFashionElementCrossReference_8_0());
            				

            }


            }

            // InternalFashionDsl.g:588:3: (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFashionDsl.g:589:4: otherlv_9= ',' ( (otherlv_10= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getFashionStyleAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalFashionDsl.g:593:4: ( (otherlv_10= RULE_STRING ) )
            	    // InternalFashionDsl.g:594:5: (otherlv_10= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:594:5: (otherlv_10= RULE_STRING )
            	    // InternalFashionDsl.g:595:6: otherlv_10= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFashionStyleRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_10, grammarAccess.getFashionStyleAccess().getElementsFashionElementCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFashionStyleAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFashionStyle"


    // $ANTLR start "entryRuleSpatioTemporalDescriptor"
    // InternalFashionDsl.g:615:1: entryRuleSpatioTemporalDescriptor returns [EObject current=null] : iv_ruleSpatioTemporalDescriptor= ruleSpatioTemporalDescriptor EOF ;
    public final EObject entryRuleSpatioTemporalDescriptor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpatioTemporalDescriptor = null;


        try {
            // InternalFashionDsl.g:615:65: (iv_ruleSpatioTemporalDescriptor= ruleSpatioTemporalDescriptor EOF )
            // InternalFashionDsl.g:616:2: iv_ruleSpatioTemporalDescriptor= ruleSpatioTemporalDescriptor EOF
            {
             newCompositeNode(grammarAccess.getSpatioTemporalDescriptorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpatioTemporalDescriptor=ruleSpatioTemporalDescriptor();

            state._fsp--;

             current =iv_ruleSpatioTemporalDescriptor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpatioTemporalDescriptor"


    // $ANTLR start "ruleSpatioTemporalDescriptor"
    // InternalFashionDsl.g:622:1: ruleSpatioTemporalDescriptor returns [EObject current=null] : (otherlv_0= 'descriptor' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'period:' ( (lv_period_4_0= RULE_STRING ) ) otherlv_5= 'location:' ( (lv_location_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleSpatioTemporalDescriptor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_period_4_0=null;
        Token otherlv_5=null;
        Token lv_location_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:628:2: ( (otherlv_0= 'descriptor' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'period:' ( (lv_period_4_0= RULE_STRING ) ) otherlv_5= 'location:' ( (lv_location_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalFashionDsl.g:629:2: (otherlv_0= 'descriptor' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'period:' ( (lv_period_4_0= RULE_STRING ) ) otherlv_5= 'location:' ( (lv_location_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalFashionDsl.g:629:2: (otherlv_0= 'descriptor' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'period:' ( (lv_period_4_0= RULE_STRING ) ) otherlv_5= 'location:' ( (lv_location_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalFashionDsl.g:630:3: otherlv_0= 'descriptor' ( (lv_number_1_0= RULE_INT ) ) otherlv_2= '{' otherlv_3= 'period:' ( (lv_period_4_0= RULE_STRING ) ) otherlv_5= 'location:' ( (lv_location_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSpatioTemporalDescriptorAccess().getDescriptorKeyword_0());
            		
            // InternalFashionDsl.g:634:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalFashionDsl.g:635:4: (lv_number_1_0= RULE_INT )
            {
            // InternalFashionDsl.g:635:4: (lv_number_1_0= RULE_INT )
            // InternalFashionDsl.g:636:5: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_number_1_0, grammarAccess.getSpatioTemporalDescriptorAccess().getNumberINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpatioTemporalDescriptorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSpatioTemporalDescriptorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSpatioTemporalDescriptorAccess().getPeriodKeyword_3());
            		
            // InternalFashionDsl.g:660:3: ( (lv_period_4_0= RULE_STRING ) )
            // InternalFashionDsl.g:661:4: (lv_period_4_0= RULE_STRING )
            {
            // InternalFashionDsl.g:661:4: (lv_period_4_0= RULE_STRING )
            // InternalFashionDsl.g:662:5: lv_period_4_0= RULE_STRING
            {
            lv_period_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_period_4_0, grammarAccess.getSpatioTemporalDescriptorAccess().getPeriodSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpatioTemporalDescriptorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"period",
            						lv_period_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSpatioTemporalDescriptorAccess().getLocationKeyword_5());
            		
            // InternalFashionDsl.g:682:3: ( (lv_location_6_0= RULE_STRING ) )
            // InternalFashionDsl.g:683:4: (lv_location_6_0= RULE_STRING )
            {
            // InternalFashionDsl.g:683:4: (lv_location_6_0= RULE_STRING )
            // InternalFashionDsl.g:684:5: lv_location_6_0= RULE_STRING
            {
            lv_location_6_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_location_6_0, grammarAccess.getSpatioTemporalDescriptorAccess().getLocationSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpatioTemporalDescriptorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSpatioTemporalDescriptorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpatioTemporalDescriptor"


    // $ANTLR start "entryRuleArticle"
    // InternalFashionDsl.g:708:1: entryRuleArticle returns [EObject current=null] : iv_ruleArticle= ruleArticle EOF ;
    public final EObject entryRuleArticle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArticle = null;


        try {
            // InternalFashionDsl.g:708:48: (iv_ruleArticle= ruleArticle EOF )
            // InternalFashionDsl.g:709:2: iv_ruleArticle= ruleArticle EOF
            {
             newCompositeNode(grammarAccess.getArticleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArticle=ruleArticle();

            state._fsp--;

             current =iv_ruleArticle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArticle"


    // $ANTLR start "ruleArticle"
    // InternalFashionDsl.g:715:1: ruleArticle returns [EObject current=null] : (otherlv_0= 'article' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'magazine:' ( (lv_magazine_4_0= RULE_STRING ) ) otherlv_5= 'type:' ( (lv_type_6_0= ruleMediaType ) ) otherlv_7= 'content:' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= 'elements:' ( (otherlv_10= RULE_STRING ) ) (otherlv_11= ',' ( (otherlv_12= RULE_STRING ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleArticle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_magazine_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_content_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:721:2: ( (otherlv_0= 'article' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'magazine:' ( (lv_magazine_4_0= RULE_STRING ) ) otherlv_5= 'type:' ( (lv_type_6_0= ruleMediaType ) ) otherlv_7= 'content:' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= 'elements:' ( (otherlv_10= RULE_STRING ) ) (otherlv_11= ',' ( (otherlv_12= RULE_STRING ) ) )* otherlv_13= '}' ) )
            // InternalFashionDsl.g:722:2: (otherlv_0= 'article' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'magazine:' ( (lv_magazine_4_0= RULE_STRING ) ) otherlv_5= 'type:' ( (lv_type_6_0= ruleMediaType ) ) otherlv_7= 'content:' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= 'elements:' ( (otherlv_10= RULE_STRING ) ) (otherlv_11= ',' ( (otherlv_12= RULE_STRING ) ) )* otherlv_13= '}' )
            {
            // InternalFashionDsl.g:722:2: (otherlv_0= 'article' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'magazine:' ( (lv_magazine_4_0= RULE_STRING ) ) otherlv_5= 'type:' ( (lv_type_6_0= ruleMediaType ) ) otherlv_7= 'content:' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= 'elements:' ( (otherlv_10= RULE_STRING ) ) (otherlv_11= ',' ( (otherlv_12= RULE_STRING ) ) )* otherlv_13= '}' )
            // InternalFashionDsl.g:723:3: otherlv_0= 'article' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'magazine:' ( (lv_magazine_4_0= RULE_STRING ) ) otherlv_5= 'type:' ( (lv_type_6_0= ruleMediaType ) ) otherlv_7= 'content:' ( (lv_content_8_0= RULE_STRING ) ) otherlv_9= 'elements:' ( (otherlv_10= RULE_STRING ) ) (otherlv_11= ',' ( (otherlv_12= RULE_STRING ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getArticleAccess().getArticleKeyword_0());
            		
            // InternalFashionDsl.g:727:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:728:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:728:4: (lv_title_1_0= RULE_STRING )
            // InternalFashionDsl.g:729:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_title_1_0, grammarAccess.getArticleAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArticleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getArticleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getArticleAccess().getMagazineKeyword_3());
            		
            // InternalFashionDsl.g:753:3: ( (lv_magazine_4_0= RULE_STRING ) )
            // InternalFashionDsl.g:754:4: (lv_magazine_4_0= RULE_STRING )
            {
            // InternalFashionDsl.g:754:4: (lv_magazine_4_0= RULE_STRING )
            // InternalFashionDsl.g:755:5: lv_magazine_4_0= RULE_STRING
            {
            lv_magazine_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_magazine_4_0, grammarAccess.getArticleAccess().getMagazineSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArticleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"magazine",
            						lv_magazine_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getArticleAccess().getTypeKeyword_5());
            		
            // InternalFashionDsl.g:775:3: ( (lv_type_6_0= ruleMediaType ) )
            // InternalFashionDsl.g:776:4: (lv_type_6_0= ruleMediaType )
            {
            // InternalFashionDsl.g:776:4: (lv_type_6_0= ruleMediaType )
            // InternalFashionDsl.g:777:5: lv_type_6_0= ruleMediaType
            {

            					newCompositeNode(grammarAccess.getArticleAccess().getTypeMediaTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_6_0=ruleMediaType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArticleRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"it.polimi.ase.projectB2.team20.xtext.FashionDsl.MediaType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getArticleAccess().getContentKeyword_7());
            		
            // InternalFashionDsl.g:798:3: ( (lv_content_8_0= RULE_STRING ) )
            // InternalFashionDsl.g:799:4: (lv_content_8_0= RULE_STRING )
            {
            // InternalFashionDsl.g:799:4: (lv_content_8_0= RULE_STRING )
            // InternalFashionDsl.g:800:5: lv_content_8_0= RULE_STRING
            {
            lv_content_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_content_8_0, grammarAccess.getArticleAccess().getContentSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArticleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getArticleAccess().getElementsKeyword_9());
            		
            // InternalFashionDsl.g:820:3: ( (otherlv_10= RULE_STRING ) )
            // InternalFashionDsl.g:821:4: (otherlv_10= RULE_STRING )
            {
            // InternalFashionDsl.g:821:4: (otherlv_10= RULE_STRING )
            // InternalFashionDsl.g:822:5: otherlv_10= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArticleRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_10, grammarAccess.getArticleAccess().getElementsFashionElementCrossReference_10_0());
            				

            }


            }

            // InternalFashionDsl.g:833:3: (otherlv_11= ',' ( (otherlv_12= RULE_STRING ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFashionDsl.g:834:4: otherlv_11= ',' ( (otherlv_12= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_11, grammarAccess.getArticleAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalFashionDsl.g:838:4: ( (otherlv_12= RULE_STRING ) )
            	    // InternalFashionDsl.g:839:5: (otherlv_12= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:839:5: (otherlv_12= RULE_STRING )
            	    // InternalFashionDsl.g:840:6: otherlv_12= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getArticleRule());
            	    						}
            	    					
            	    otherlv_12=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_12, grammarAccess.getArticleAccess().getElementsFashionElementCrossReference_11_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArticle"


    // $ANTLR start "entryRuleTVProgram"
    // InternalFashionDsl.g:860:1: entryRuleTVProgram returns [EObject current=null] : iv_ruleTVProgram= ruleTVProgram EOF ;
    public final EObject entryRuleTVProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTVProgram = null;


        try {
            // InternalFashionDsl.g:860:50: (iv_ruleTVProgram= ruleTVProgram EOF )
            // InternalFashionDsl.g:861:2: iv_ruleTVProgram= ruleTVProgram EOF
            {
             newCompositeNode(grammarAccess.getTVProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTVProgram=ruleTVProgram();

            state._fsp--;

             current =iv_ruleTVProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTVProgram"


    // $ANTLR start "ruleTVProgram"
    // InternalFashionDsl.g:867:1: ruleTVProgram returns [EObject current=null] : (otherlv_0= 'tvProgram' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleMediaType ) ) otherlv_5= 'content:' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'elements:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleTVProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_content_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:873:2: ( (otherlv_0= 'tvProgram' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleMediaType ) ) otherlv_5= 'content:' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'elements:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' ) )
            // InternalFashionDsl.g:874:2: (otherlv_0= 'tvProgram' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleMediaType ) ) otherlv_5= 'content:' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'elements:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' )
            {
            // InternalFashionDsl.g:874:2: (otherlv_0= 'tvProgram' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleMediaType ) ) otherlv_5= 'content:' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'elements:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' )
            // InternalFashionDsl.g:875:3: otherlv_0= 'tvProgram' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleMediaType ) ) otherlv_5= 'content:' ( (lv_content_6_0= RULE_STRING ) ) otherlv_7= 'elements:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTVProgramAccess().getTvProgramKeyword_0());
            		
            // InternalFashionDsl.g:879:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:880:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:880:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:881:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTVProgramAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTVProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTVProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getTVProgramAccess().getTypeKeyword_3());
            		
            // InternalFashionDsl.g:905:3: ( (lv_type_4_0= ruleMediaType ) )
            // InternalFashionDsl.g:906:4: (lv_type_4_0= ruleMediaType )
            {
            // InternalFashionDsl.g:906:4: (lv_type_4_0= ruleMediaType )
            // InternalFashionDsl.g:907:5: lv_type_4_0= ruleMediaType
            {

            					newCompositeNode(grammarAccess.getTVProgramAccess().getTypeMediaTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_4_0=ruleMediaType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTVProgramRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"it.polimi.ase.projectB2.team20.xtext.FashionDsl.MediaType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getTVProgramAccess().getContentKeyword_5());
            		
            // InternalFashionDsl.g:928:3: ( (lv_content_6_0= RULE_STRING ) )
            // InternalFashionDsl.g:929:4: (lv_content_6_0= RULE_STRING )
            {
            // InternalFashionDsl.g:929:4: (lv_content_6_0= RULE_STRING )
            // InternalFashionDsl.g:930:5: lv_content_6_0= RULE_STRING
            {
            lv_content_6_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_content_6_0, grammarAccess.getTVProgramAccess().getContentSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTVProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getTVProgramAccess().getElementsKeyword_7());
            		
            // InternalFashionDsl.g:950:3: ( (otherlv_8= RULE_STRING ) )
            // InternalFashionDsl.g:951:4: (otherlv_8= RULE_STRING )
            {
            // InternalFashionDsl.g:951:4: (otherlv_8= RULE_STRING )
            // InternalFashionDsl.g:952:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTVProgramRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getTVProgramAccess().getElementsFashionElementCrossReference_8_0());
            				

            }


            }

            // InternalFashionDsl.g:963:3: (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFashionDsl.g:964:4: otherlv_9= ',' ( (otherlv_10= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getTVProgramAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalFashionDsl.g:968:4: ( (otherlv_10= RULE_STRING ) )
            	    // InternalFashionDsl.g:969:5: (otherlv_10= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:969:5: (otherlv_10= RULE_STRING )
            	    // InternalFashionDsl.g:970:6: otherlv_10= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTVProgramRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_10, grammarAccess.getTVProgramAccess().getElementsFashionElementCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTVProgramAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTVProgram"


    // $ANTLR start "entryRuleFamousBrand"
    // InternalFashionDsl.g:990:1: entryRuleFamousBrand returns [EObject current=null] : iv_ruleFamousBrand= ruleFamousBrand EOF ;
    public final EObject entryRuleFamousBrand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFamousBrand = null;


        try {
            // InternalFashionDsl.g:990:52: (iv_ruleFamousBrand= ruleFamousBrand EOF )
            // InternalFashionDsl.g:991:2: iv_ruleFamousBrand= ruleFamousBrand EOF
            {
             newCompositeNode(grammarAccess.getFamousBrandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFamousBrand=ruleFamousBrand();

            state._fsp--;

             current =iv_ruleFamousBrand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFamousBrand"


    // $ANTLR start "ruleFamousBrand"
    // InternalFashionDsl.g:997:1: ruleFamousBrand returns [EObject current=null] : (otherlv_0= 'famousBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'countries:' ( (lv_countries_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' ) ;
    public final EObject ruleFamousBrand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_countries_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_reports_11_0 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:1003:2: ( (otherlv_0= 'famousBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'countries:' ( (lv_countries_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' ) )
            // InternalFashionDsl.g:1004:2: (otherlv_0= 'famousBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'countries:' ( (lv_countries_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' )
            {
            // InternalFashionDsl.g:1004:2: (otherlv_0= 'famousBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'countries:' ( (lv_countries_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' )
            // InternalFashionDsl.g:1005:3: otherlv_0= 'famousBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'countries:' ( (lv_countries_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFamousBrandAccess().getFamousBrandKeyword_0());
            		
            // InternalFashionDsl.g:1009:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:1010:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:1010:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:1011:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFamousBrandAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamousBrandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getFamousBrandAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFamousBrandAccess().getCountriesKeyword_3());
            		
            // InternalFashionDsl.g:1035:3: ( (lv_countries_4_0= RULE_STRING ) )
            // InternalFashionDsl.g:1036:4: (lv_countries_4_0= RULE_STRING )
            {
            // InternalFashionDsl.g:1036:4: (lv_countries_4_0= RULE_STRING )
            // InternalFashionDsl.g:1037:5: lv_countries_4_0= RULE_STRING
            {
            lv_countries_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_countries_4_0, grammarAccess.getFamousBrandAccess().getCountriesSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamousBrandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"countries",
            						lv_countries_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalFashionDsl.g:1053:3: (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFashionDsl.g:1054:4: otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getFamousBrandAccess().getStylesKeyword_5_0());
                    			
                    // InternalFashionDsl.g:1058:4: ( (otherlv_6= RULE_STRING ) )
                    // InternalFashionDsl.g:1059:5: (otherlv_6= RULE_STRING )
                    {
                    // InternalFashionDsl.g:1059:5: (otherlv_6= RULE_STRING )
                    // InternalFashionDsl.g:1060:6: otherlv_6= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFamousBrandRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(otherlv_6, grammarAccess.getFamousBrandAccess().getStylesFashionStyleCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalFashionDsl.g:1071:4: (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalFashionDsl.g:1072:5: otherlv_7= ',' ( (otherlv_8= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFamousBrandAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalFashionDsl.g:1076:5: ( (otherlv_8= RULE_STRING ) )
                    	    // InternalFashionDsl.g:1077:6: (otherlv_8= RULE_STRING )
                    	    {
                    	    // InternalFashionDsl.g:1077:6: (otherlv_8= RULE_STRING )
                    	    // InternalFashionDsl.g:1078:7: otherlv_8= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFamousBrandRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getFamousBrandAccess().getStylesFashionStyleCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFashionDsl.g:1091:3: (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFashionDsl.g:1092:4: otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getFamousBrandAccess().getReportsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getFamousBrandAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalFashionDsl.g:1100:4: ( (lv_reports_11_0= ruleNewsReport ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==20||LA16_0==24) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalFashionDsl.g:1101:5: (lv_reports_11_0= ruleNewsReport )
                    	    {
                    	    // InternalFashionDsl.g:1101:5: (lv_reports_11_0= ruleNewsReport )
                    	    // InternalFashionDsl.g:1102:6: lv_reports_11_0= ruleNewsReport
                    	    {

                    	    						newCompositeNode(grammarAccess.getFamousBrandAccess().getReportsNewsReportParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_24);
                    	    lv_reports_11_0=ruleNewsReport();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFamousBrandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"reports",
                    	    							lv_reports_11_0,
                    	    							"it.polimi.ase.projectB2.team20.xtext.FashionDsl.NewsReport");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getFamousBrandAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalFashionDsl.g:1124:3: (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFashionDsl.g:1125:4: otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )*
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getFamousBrandAccess().getAdvertisingCampaignsKeyword_7_0());
                    			
                    // InternalFashionDsl.g:1129:4: ( (otherlv_14= RULE_STRING ) )
                    // InternalFashionDsl.g:1130:5: (otherlv_14= RULE_STRING )
                    {
                    // InternalFashionDsl.g:1130:5: (otherlv_14= RULE_STRING )
                    // InternalFashionDsl.g:1131:6: otherlv_14= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFamousBrandRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(otherlv_14, grammarAccess.getFamousBrandAccess().getCampaignsAdvertisingCampaignCrossReference_7_1_0());
                    					

                    }


                    }

                    // InternalFashionDsl.g:1142:4: (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalFashionDsl.g:1143:5: otherlv_15= ',' ( (otherlv_16= RULE_STRING ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getFamousBrandAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalFashionDsl.g:1147:5: ( (otherlv_16= RULE_STRING ) )
                    	    // InternalFashionDsl.g:1148:6: (otherlv_16= RULE_STRING )
                    	    {
                    	    // InternalFashionDsl.g:1148:6: (otherlv_16= RULE_STRING )
                    	    // InternalFashionDsl.g:1149:7: otherlv_16= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFamousBrandRule());
                    	    							}
                    	    						
                    	    otherlv_16=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    	    							newLeafNode(otherlv_16, grammarAccess.getFamousBrandAccess().getCampaignsAdvertisingCampaignCrossReference_7_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getFamousBrandAccess().getProductLinesKeyword_8());
            		
            // InternalFashionDsl.g:1166:3: ( (otherlv_18= RULE_STRING ) )
            // InternalFashionDsl.g:1167:4: (otherlv_18= RULE_STRING )
            {
            // InternalFashionDsl.g:1167:4: (otherlv_18= RULE_STRING )
            // InternalFashionDsl.g:1168:5: otherlv_18= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamousBrandRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(otherlv_18, grammarAccess.getFamousBrandAccess().getProductlinesProductLineCrossReference_9_0());
            				

            }


            }

            // InternalFashionDsl.g:1179:3: (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFashionDsl.g:1180:4: otherlv_19= ',' ( (otherlv_20= RULE_STRING ) )
            	    {
            	    otherlv_19=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_19, grammarAccess.getFamousBrandAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalFashionDsl.g:1184:4: ( (otherlv_20= RULE_STRING ) )
            	    // InternalFashionDsl.g:1185:5: (otherlv_20= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:1185:5: (otherlv_20= RULE_STRING )
            	    // InternalFashionDsl.g:1186:6: otherlv_20= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFamousBrandRule());
            	    						}
            	    					
            	    otherlv_20=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    						newLeafNode(otherlv_20, grammarAccess.getFamousBrandAccess().getProductlinesProductLineCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_21=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_21, grammarAccess.getFamousBrandAccess().getDesignersKeyword_11());
            		
            // InternalFashionDsl.g:1202:3: ( (otherlv_22= RULE_STRING ) )
            // InternalFashionDsl.g:1203:4: (otherlv_22= RULE_STRING )
            {
            // InternalFashionDsl.g:1203:4: (otherlv_22= RULE_STRING )
            // InternalFashionDsl.g:1204:5: otherlv_22= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFamousBrandRule());
            					}
            				
            otherlv_22=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_22, grammarAccess.getFamousBrandAccess().getDesignersDesignerCrossReference_12_0());
            				

            }


            }

            // InternalFashionDsl.g:1215:3: (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFashionDsl.g:1216:4: otherlv_23= ',' ( (otherlv_24= RULE_STRING ) )
            	    {
            	    otherlv_23=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_23, grammarAccess.getFamousBrandAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalFashionDsl.g:1220:4: ( (otherlv_24= RULE_STRING ) )
            	    // InternalFashionDsl.g:1221:5: (otherlv_24= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:1221:5: (otherlv_24= RULE_STRING )
            	    // InternalFashionDsl.g:1222:6: otherlv_24= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFamousBrandRule());
            	    						}
            	    					
            	    otherlv_24=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_24, grammarAccess.getFamousBrandAccess().getDesignersDesignerCrossReference_13_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_25=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getFamousBrandAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFamousBrand"


    // $ANTLR start "entryRuleEmergingBrand"
    // InternalFashionDsl.g:1242:1: entryRuleEmergingBrand returns [EObject current=null] : iv_ruleEmergingBrand= ruleEmergingBrand EOF ;
    public final EObject entryRuleEmergingBrand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmergingBrand = null;


        try {
            // InternalFashionDsl.g:1242:54: (iv_ruleEmergingBrand= ruleEmergingBrand EOF )
            // InternalFashionDsl.g:1243:2: iv_ruleEmergingBrand= ruleEmergingBrand EOF
            {
             newCompositeNode(grammarAccess.getEmergingBrandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmergingBrand=ruleEmergingBrand();

            state._fsp--;

             current =iv_ruleEmergingBrand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmergingBrand"


    // $ANTLR start "ruleEmergingBrand"
    // InternalFashionDsl.g:1249:1: ruleEmergingBrand returns [EObject current=null] : (otherlv_0= 'emergingBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'countries:' ( (lv_countries_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' ) ;
    public final EObject ruleEmergingBrand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_countries_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_reports_11_0 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:1255:2: ( (otherlv_0= 'emergingBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'countries:' ( (lv_countries_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' ) )
            // InternalFashionDsl.g:1256:2: (otherlv_0= 'emergingBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'countries:' ( (lv_countries_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' )
            {
            // InternalFashionDsl.g:1256:2: (otherlv_0= 'emergingBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'countries:' ( (lv_countries_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' )
            // InternalFashionDsl.g:1257:3: otherlv_0= 'emergingBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'countries:' ( (lv_countries_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEmergingBrandAccess().getEmergingBrandKeyword_0());
            		
            // InternalFashionDsl.g:1261:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:1262:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:1262:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:1263:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEmergingBrandAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmergingBrandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getEmergingBrandAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getEmergingBrandAccess().getCountriesKeyword_3());
            		
            // InternalFashionDsl.g:1287:3: ( (lv_countries_4_0= RULE_STRING ) )
            // InternalFashionDsl.g:1288:4: (lv_countries_4_0= RULE_STRING )
            {
            // InternalFashionDsl.g:1288:4: (lv_countries_4_0= RULE_STRING )
            // InternalFashionDsl.g:1289:5: lv_countries_4_0= RULE_STRING
            {
            lv_countries_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_countries_4_0, grammarAccess.getEmergingBrandAccess().getCountriesSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmergingBrandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"countries",
            						lv_countries_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalFashionDsl.g:1305:3: (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFashionDsl.g:1306:4: otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getEmergingBrandAccess().getStylesKeyword_5_0());
                    			
                    // InternalFashionDsl.g:1310:4: ( (otherlv_6= RULE_STRING ) )
                    // InternalFashionDsl.g:1311:5: (otherlv_6= RULE_STRING )
                    {
                    // InternalFashionDsl.g:1311:5: (otherlv_6= RULE_STRING )
                    // InternalFashionDsl.g:1312:6: otherlv_6= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEmergingBrandRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(otherlv_6, grammarAccess.getEmergingBrandAccess().getStylesFashionStyleCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalFashionDsl.g:1323:4: (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalFashionDsl.g:1324:5: otherlv_7= ',' ( (otherlv_8= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEmergingBrandAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalFashionDsl.g:1328:5: ( (otherlv_8= RULE_STRING ) )
                    	    // InternalFashionDsl.g:1329:6: (otherlv_8= RULE_STRING )
                    	    {
                    	    // InternalFashionDsl.g:1329:6: (otherlv_8= RULE_STRING )
                    	    // InternalFashionDsl.g:1330:7: otherlv_8= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEmergingBrandRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getEmergingBrandAccess().getStylesFashionStyleCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFashionDsl.g:1343:3: (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFashionDsl.g:1344:4: otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getEmergingBrandAccess().getReportsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getEmergingBrandAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalFashionDsl.g:1352:4: ( (lv_reports_11_0= ruleNewsReport ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==20||LA24_0==24) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalFashionDsl.g:1353:5: (lv_reports_11_0= ruleNewsReport )
                    	    {
                    	    // InternalFashionDsl.g:1353:5: (lv_reports_11_0= ruleNewsReport )
                    	    // InternalFashionDsl.g:1354:6: lv_reports_11_0= ruleNewsReport
                    	    {

                    	    						newCompositeNode(grammarAccess.getEmergingBrandAccess().getReportsNewsReportParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_24);
                    	    lv_reports_11_0=ruleNewsReport();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEmergingBrandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"reports",
                    	    							lv_reports_11_0,
                    	    							"it.polimi.ase.projectB2.team20.xtext.FashionDsl.NewsReport");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getEmergingBrandAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalFashionDsl.g:1376:3: (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFashionDsl.g:1377:4: otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )*
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getEmergingBrandAccess().getAdvertisingCampaignsKeyword_7_0());
                    			
                    // InternalFashionDsl.g:1381:4: ( (otherlv_14= RULE_STRING ) )
                    // InternalFashionDsl.g:1382:5: (otherlv_14= RULE_STRING )
                    {
                    // InternalFashionDsl.g:1382:5: (otherlv_14= RULE_STRING )
                    // InternalFashionDsl.g:1383:6: otherlv_14= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEmergingBrandRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(otherlv_14, grammarAccess.getEmergingBrandAccess().getCampaignsAdvertisingCampaignCrossReference_7_1_0());
                    					

                    }


                    }

                    // InternalFashionDsl.g:1394:4: (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==16) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalFashionDsl.g:1395:5: otherlv_15= ',' ( (otherlv_16= RULE_STRING ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getEmergingBrandAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalFashionDsl.g:1399:5: ( (otherlv_16= RULE_STRING ) )
                    	    // InternalFashionDsl.g:1400:6: (otherlv_16= RULE_STRING )
                    	    {
                    	    // InternalFashionDsl.g:1400:6: (otherlv_16= RULE_STRING )
                    	    // InternalFashionDsl.g:1401:7: otherlv_16= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEmergingBrandRule());
                    	    							}
                    	    						
                    	    otherlv_16=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    	    							newLeafNode(otherlv_16, grammarAccess.getEmergingBrandAccess().getCampaignsAdvertisingCampaignCrossReference_7_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getEmergingBrandAccess().getProductLinesKeyword_8());
            		
            // InternalFashionDsl.g:1418:3: ( (otherlv_18= RULE_STRING ) )
            // InternalFashionDsl.g:1419:4: (otherlv_18= RULE_STRING )
            {
            // InternalFashionDsl.g:1419:4: (otherlv_18= RULE_STRING )
            // InternalFashionDsl.g:1420:5: otherlv_18= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmergingBrandRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(otherlv_18, grammarAccess.getEmergingBrandAccess().getProductlinesProductLineCrossReference_9_0());
            				

            }


            }

            // InternalFashionDsl.g:1431:3: (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFashionDsl.g:1432:4: otherlv_19= ',' ( (otherlv_20= RULE_STRING ) )
            	    {
            	    otherlv_19=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_19, grammarAccess.getEmergingBrandAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalFashionDsl.g:1436:4: ( (otherlv_20= RULE_STRING ) )
            	    // InternalFashionDsl.g:1437:5: (otherlv_20= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:1437:5: (otherlv_20= RULE_STRING )
            	    // InternalFashionDsl.g:1438:6: otherlv_20= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEmergingBrandRule());
            	    						}
            	    					
            	    otherlv_20=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    						newLeafNode(otherlv_20, grammarAccess.getEmergingBrandAccess().getProductlinesProductLineCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_21=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_21, grammarAccess.getEmergingBrandAccess().getDesignersKeyword_11());
            		
            // InternalFashionDsl.g:1454:3: ( (otherlv_22= RULE_STRING ) )
            // InternalFashionDsl.g:1455:4: (otherlv_22= RULE_STRING )
            {
            // InternalFashionDsl.g:1455:4: (otherlv_22= RULE_STRING )
            // InternalFashionDsl.g:1456:5: otherlv_22= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmergingBrandRule());
            					}
            				
            otherlv_22=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_22, grammarAccess.getEmergingBrandAccess().getDesignersDesignerCrossReference_12_0());
            				

            }


            }

            // InternalFashionDsl.g:1467:3: (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalFashionDsl.g:1468:4: otherlv_23= ',' ( (otherlv_24= RULE_STRING ) )
            	    {
            	    otherlv_23=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_23, grammarAccess.getEmergingBrandAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalFashionDsl.g:1472:4: ( (otherlv_24= RULE_STRING ) )
            	    // InternalFashionDsl.g:1473:5: (otherlv_24= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:1473:5: (otherlv_24= RULE_STRING )
            	    // InternalFashionDsl.g:1474:6: otherlv_24= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEmergingBrandRule());
            	    						}
            	    					
            	    otherlv_24=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_24, grammarAccess.getEmergingBrandAccess().getDesignersDesignerCrossReference_13_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_25=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getEmergingBrandAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmergingBrand"


    // $ANTLR start "entryRuleLocalBrand"
    // InternalFashionDsl.g:1494:1: entryRuleLocalBrand returns [EObject current=null] : iv_ruleLocalBrand= ruleLocalBrand EOF ;
    public final EObject entryRuleLocalBrand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalBrand = null;


        try {
            // InternalFashionDsl.g:1494:51: (iv_ruleLocalBrand= ruleLocalBrand EOF )
            // InternalFashionDsl.g:1495:2: iv_ruleLocalBrand= ruleLocalBrand EOF
            {
             newCompositeNode(grammarAccess.getLocalBrandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalBrand=ruleLocalBrand();

            state._fsp--;

             current =iv_ruleLocalBrand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalBrand"


    // $ANTLR start "ruleLocalBrand"
    // InternalFashionDsl.g:1501:1: ruleLocalBrand returns [EObject current=null] : (otherlv_0= 'localBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'country:' ( (lv_country_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' ) ;
    public final EObject ruleLocalBrand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_country_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_reports_11_0 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:1507:2: ( (otherlv_0= 'localBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'country:' ( (lv_country_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' ) )
            // InternalFashionDsl.g:1508:2: (otherlv_0= 'localBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'country:' ( (lv_country_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' )
            {
            // InternalFashionDsl.g:1508:2: (otherlv_0= 'localBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'country:' ( (lv_country_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}' )
            // InternalFashionDsl.g:1509:3: otherlv_0= 'localBrand' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'country:' ( (lv_country_4_0= RULE_STRING ) ) (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )? (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )? (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )? otherlv_17= 'productLines:' ( (otherlv_18= RULE_STRING ) ) (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )* otherlv_21= 'designers:' ( (otherlv_22= RULE_STRING ) ) (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )* otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalBrandAccess().getLocalBrandKeyword_0());
            		
            // InternalFashionDsl.g:1513:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:1514:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:1514:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:1515:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLocalBrandAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalBrandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getLocalBrandAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalBrandAccess().getCountryKeyword_3());
            		
            // InternalFashionDsl.g:1539:3: ( (lv_country_4_0= RULE_STRING ) )
            // InternalFashionDsl.g:1540:4: (lv_country_4_0= RULE_STRING )
            {
            // InternalFashionDsl.g:1540:4: (lv_country_4_0= RULE_STRING )
            // InternalFashionDsl.g:1541:5: lv_country_4_0= RULE_STRING
            {
            lv_country_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_country_4_0, grammarAccess.getLocalBrandAccess().getCountrySTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalBrandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"country",
            						lv_country_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalFashionDsl.g:1557:3: (otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalFashionDsl.g:1558:4: otherlv_5= 'styles:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getLocalBrandAccess().getStylesKeyword_5_0());
                    			
                    // InternalFashionDsl.g:1562:4: ( (otherlv_6= RULE_STRING ) )
                    // InternalFashionDsl.g:1563:5: (otherlv_6= RULE_STRING )
                    {
                    // InternalFashionDsl.g:1563:5: (otherlv_6= RULE_STRING )
                    // InternalFashionDsl.g:1564:6: otherlv_6= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocalBrandRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(otherlv_6, grammarAccess.getLocalBrandAccess().getStylesFashionStyleCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalFashionDsl.g:1575:4: (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==16) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalFashionDsl.g:1576:5: otherlv_7= ',' ( (otherlv_8= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getLocalBrandAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalFashionDsl.g:1580:5: ( (otherlv_8= RULE_STRING ) )
                    	    // InternalFashionDsl.g:1581:6: (otherlv_8= RULE_STRING )
                    	    {
                    	    // InternalFashionDsl.g:1581:6: (otherlv_8= RULE_STRING )
                    	    // InternalFashionDsl.g:1582:7: otherlv_8= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLocalBrandRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getLocalBrandAccess().getStylesFashionStyleCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFashionDsl.g:1595:3: (otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFashionDsl.g:1596:4: otherlv_9= 'reports' otherlv_10= '{' ( (lv_reports_11_0= ruleNewsReport ) )+ otherlv_12= '}'
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getLocalBrandAccess().getReportsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_10, grammarAccess.getLocalBrandAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalFashionDsl.g:1604:4: ( (lv_reports_11_0= ruleNewsReport ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==20||LA32_0==24) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalFashionDsl.g:1605:5: (lv_reports_11_0= ruleNewsReport )
                    	    {
                    	    // InternalFashionDsl.g:1605:5: (lv_reports_11_0= ruleNewsReport )
                    	    // InternalFashionDsl.g:1606:6: lv_reports_11_0= ruleNewsReport
                    	    {

                    	    						newCompositeNode(grammarAccess.getLocalBrandAccess().getReportsNewsReportParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_24);
                    	    lv_reports_11_0=ruleNewsReport();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLocalBrandRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"reports",
                    	    							lv_reports_11_0,
                    	    							"it.polimi.ase.projectB2.team20.xtext.FashionDsl.NewsReport");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getLocalBrandAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalFashionDsl.g:1628:3: (otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFashionDsl.g:1629:4: otherlv_13= 'advertisingCampaigns:' ( (otherlv_14= RULE_STRING ) ) (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )*
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getLocalBrandAccess().getAdvertisingCampaignsKeyword_7_0());
                    			
                    // InternalFashionDsl.g:1633:4: ( (otherlv_14= RULE_STRING ) )
                    // InternalFashionDsl.g:1634:5: (otherlv_14= RULE_STRING )
                    {
                    // InternalFashionDsl.g:1634:5: (otherlv_14= RULE_STRING )
                    // InternalFashionDsl.g:1635:6: otherlv_14= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocalBrandRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(otherlv_14, grammarAccess.getLocalBrandAccess().getCampaignsAdvertisingCampaignCrossReference_7_1_0());
                    					

                    }


                    }

                    // InternalFashionDsl.g:1646:4: (otherlv_15= ',' ( (otherlv_16= RULE_STRING ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==16) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalFashionDsl.g:1647:5: otherlv_15= ',' ( (otherlv_16= RULE_STRING ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getLocalBrandAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalFashionDsl.g:1651:5: ( (otherlv_16= RULE_STRING ) )
                    	    // InternalFashionDsl.g:1652:6: (otherlv_16= RULE_STRING )
                    	    {
                    	    // InternalFashionDsl.g:1652:6: (otherlv_16= RULE_STRING )
                    	    // InternalFashionDsl.g:1653:7: otherlv_16= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLocalBrandRule());
                    	    							}
                    	    						
                    	    otherlv_16=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    	    							newLeafNode(otherlv_16, grammarAccess.getLocalBrandAccess().getCampaignsAdvertisingCampaignCrossReference_7_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getLocalBrandAccess().getProductLinesKeyword_8());
            		
            // InternalFashionDsl.g:1670:3: ( (otherlv_18= RULE_STRING ) )
            // InternalFashionDsl.g:1671:4: (otherlv_18= RULE_STRING )
            {
            // InternalFashionDsl.g:1671:4: (otherlv_18= RULE_STRING )
            // InternalFashionDsl.g:1672:5: otherlv_18= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalBrandRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(otherlv_18, grammarAccess.getLocalBrandAccess().getProductlinesProductLineCrossReference_9_0());
            				

            }


            }

            // InternalFashionDsl.g:1683:3: (otherlv_19= ',' ( (otherlv_20= RULE_STRING ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==16) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalFashionDsl.g:1684:4: otherlv_19= ',' ( (otherlv_20= RULE_STRING ) )
            	    {
            	    otherlv_19=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_19, grammarAccess.getLocalBrandAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalFashionDsl.g:1688:4: ( (otherlv_20= RULE_STRING ) )
            	    // InternalFashionDsl.g:1689:5: (otherlv_20= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:1689:5: (otherlv_20= RULE_STRING )
            	    // InternalFashionDsl.g:1690:6: otherlv_20= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLocalBrandRule());
            	    						}
            	    					
            	    otherlv_20=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    						newLeafNode(otherlv_20, grammarAccess.getLocalBrandAccess().getProductlinesProductLineCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_21=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_21, grammarAccess.getLocalBrandAccess().getDesignersKeyword_11());
            		
            // InternalFashionDsl.g:1706:3: ( (otherlv_22= RULE_STRING ) )
            // InternalFashionDsl.g:1707:4: (otherlv_22= RULE_STRING )
            {
            // InternalFashionDsl.g:1707:4: (otherlv_22= RULE_STRING )
            // InternalFashionDsl.g:1708:5: otherlv_22= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalBrandRule());
            					}
            				
            otherlv_22=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_22, grammarAccess.getLocalBrandAccess().getDesignersDesignerCrossReference_12_0());
            				

            }


            }

            // InternalFashionDsl.g:1719:3: (otherlv_23= ',' ( (otherlv_24= RULE_STRING ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==16) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalFashionDsl.g:1720:4: otherlv_23= ',' ( (otherlv_24= RULE_STRING ) )
            	    {
            	    otherlv_23=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_23, grammarAccess.getLocalBrandAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalFashionDsl.g:1724:4: ( (otherlv_24= RULE_STRING ) )
            	    // InternalFashionDsl.g:1725:5: (otherlv_24= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:1725:5: (otherlv_24= RULE_STRING )
            	    // InternalFashionDsl.g:1726:6: otherlv_24= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLocalBrandRule());
            	    						}
            	    					
            	    otherlv_24=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_24, grammarAccess.getLocalBrandAccess().getDesignersDesignerCrossReference_13_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_25=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getLocalBrandAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalBrand"


    // $ANTLR start "entryRuleAdvertisingCampaign"
    // InternalFashionDsl.g:1746:1: entryRuleAdvertisingCampaign returns [EObject current=null] : iv_ruleAdvertisingCampaign= ruleAdvertisingCampaign EOF ;
    public final EObject entryRuleAdvertisingCampaign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvertisingCampaign = null;


        try {
            // InternalFashionDsl.g:1746:60: (iv_ruleAdvertisingCampaign= ruleAdvertisingCampaign EOF )
            // InternalFashionDsl.g:1747:2: iv_ruleAdvertisingCampaign= ruleAdvertisingCampaign EOF
            {
             newCompositeNode(grammarAccess.getAdvertisingCampaignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdvertisingCampaign=ruleAdvertisingCampaign();

            state._fsp--;

             current =iv_ruleAdvertisingCampaign; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdvertisingCampaign"


    // $ANTLR start "ruleAdvertisingCampaign"
    // InternalFashionDsl.g:1753:1: ruleAdvertisingCampaign returns [EObject current=null] : (otherlv_0= 'advertisingCampaign' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'advertisingProducts' otherlv_6= '{' ( (lv_products_7_0= ruleAdvertisingProduct ) )+ otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleAdvertisingCampaign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_products_7_0 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:1759:2: ( (otherlv_0= 'advertisingCampaign' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'advertisingProducts' otherlv_6= '{' ( (lv_products_7_0= ruleAdvertisingProduct ) )+ otherlv_8= '}' otherlv_9= '}' ) )
            // InternalFashionDsl.g:1760:2: (otherlv_0= 'advertisingCampaign' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'advertisingProducts' otherlv_6= '{' ( (lv_products_7_0= ruleAdvertisingProduct ) )+ otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalFashionDsl.g:1760:2: (otherlv_0= 'advertisingCampaign' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'advertisingProducts' otherlv_6= '{' ( (lv_products_7_0= ruleAdvertisingProduct ) )+ otherlv_8= '}' otherlv_9= '}' )
            // InternalFashionDsl.g:1761:3: otherlv_0= 'advertisingCampaign' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'advertisingProducts' otherlv_6= '{' ( (lv_products_7_0= ruleAdvertisingProduct ) )+ otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAdvertisingCampaignAccess().getAdvertisingCampaignKeyword_0());
            		
            // InternalFashionDsl.g:1765:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:1766:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:1766:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:1767:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAdvertisingCampaignAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdvertisingCampaignRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getAdvertisingCampaignAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAdvertisingCampaignAccess().getBrandKeyword_3());
            		
            // InternalFashionDsl.g:1791:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:1792:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:1792:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:1793:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdvertisingCampaignRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(otherlv_4, grammarAccess.getAdvertisingCampaignAccess().getBrandBrandCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getAdvertisingCampaignAccess().getAdvertisingProductsKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_6, grammarAccess.getAdvertisingCampaignAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalFashionDsl.g:1812:3: ( (lv_products_7_0= ruleAdvertisingProduct ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==38) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalFashionDsl.g:1813:4: (lv_products_7_0= ruleAdvertisingProduct )
            	    {
            	    // InternalFashionDsl.g:1813:4: (lv_products_7_0= ruleAdvertisingProduct )
            	    // InternalFashionDsl.g:1814:5: lv_products_7_0= ruleAdvertisingProduct
            	    {

            	    					newCompositeNode(grammarAccess.getAdvertisingCampaignAccess().getProductsAdvertisingProductParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_products_7_0=ruleAdvertisingProduct();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAdvertisingCampaignRule());
            	    					}
            	    					add(
            	    						current,
            	    						"products",
            	    						lv_products_7_0,
            	    						"it.polimi.ase.projectB2.team20.xtext.FashionDsl.AdvertisingProduct");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getAdvertisingCampaignAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAdvertisingCampaignAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdvertisingCampaign"


    // $ANTLR start "entryRuleAdvertisingProduct"
    // InternalFashionDsl.g:1843:1: entryRuleAdvertisingProduct returns [EObject current=null] : iv_ruleAdvertisingProduct= ruleAdvertisingProduct EOF ;
    public final EObject entryRuleAdvertisingProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvertisingProduct = null;


        try {
            // InternalFashionDsl.g:1843:59: (iv_ruleAdvertisingProduct= ruleAdvertisingProduct EOF )
            // InternalFashionDsl.g:1844:2: iv_ruleAdvertisingProduct= ruleAdvertisingProduct EOF
            {
             newCompositeNode(grammarAccess.getAdvertisingProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdvertisingProduct=ruleAdvertisingProduct();

            state._fsp--;

             current =iv_ruleAdvertisingProduct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdvertisingProduct"


    // $ANTLR start "ruleAdvertisingProduct"
    // InternalFashionDsl.g:1850:1: ruleAdvertisingProduct returns [EObject current=null] : (otherlv_0= 'advertisingProduct' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleMediaType ) ) otherlv_5= '}' ) ;
    public final EObject ruleAdvertisingProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:1856:2: ( (otherlv_0= 'advertisingProduct' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleMediaType ) ) otherlv_5= '}' ) )
            // InternalFashionDsl.g:1857:2: (otherlv_0= 'advertisingProduct' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleMediaType ) ) otherlv_5= '}' )
            {
            // InternalFashionDsl.g:1857:2: (otherlv_0= 'advertisingProduct' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleMediaType ) ) otherlv_5= '}' )
            // InternalFashionDsl.g:1858:3: otherlv_0= 'advertisingProduct' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'type:' ( (lv_type_4_0= ruleMediaType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAdvertisingProductAccess().getAdvertisingProductKeyword_0());
            		
            // InternalFashionDsl.g:1862:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:1863:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:1863:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:1864:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAdvertisingProductAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdvertisingProductRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAdvertisingProductAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getAdvertisingProductAccess().getTypeKeyword_3());
            		
            // InternalFashionDsl.g:1888:3: ( (lv_type_4_0= ruleMediaType ) )
            // InternalFashionDsl.g:1889:4: (lv_type_4_0= ruleMediaType )
            {
            // InternalFashionDsl.g:1889:4: (lv_type_4_0= ruleMediaType )
            // InternalFashionDsl.g:1890:5: lv_type_4_0= ruleMediaType
            {

            					newCompositeNode(grammarAccess.getAdvertisingProductAccess().getTypeMediaTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_type_4_0=ruleMediaType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdvertisingProductRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"it.polimi.ase.projectB2.team20.xtext.FashionDsl.MediaType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAdvertisingProductAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdvertisingProduct"


    // $ANTLR start "entryRuleProductLine"
    // InternalFashionDsl.g:1915:1: entryRuleProductLine returns [EObject current=null] : iv_ruleProductLine= ruleProductLine EOF ;
    public final EObject entryRuleProductLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductLine = null;


        try {
            // InternalFashionDsl.g:1915:52: (iv_ruleProductLine= ruleProductLine EOF )
            // InternalFashionDsl.g:1916:2: iv_ruleProductLine= ruleProductLine EOF
            {
             newCompositeNode(grammarAccess.getProductLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductLine=ruleProductLine();

            state._fsp--;

             current =iv_ruleProductLine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductLine"


    // $ANTLR start "ruleProductLine"
    // InternalFashionDsl.g:1922:1: ruleProductLine returns [EObject current=null] : (otherlv_0= 'productLine' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'productStyles' otherlv_6= '{' ( (lv_styles_7_0= ruleProductStyle ) )+ otherlv_8= '}' otherlv_9= 'products' otherlv_10= '{' ( (lv_products_11_0= ruleProduct ) )+ otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleProductLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_styles_7_0 = null;

        EObject lv_products_11_0 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:1928:2: ( (otherlv_0= 'productLine' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'productStyles' otherlv_6= '{' ( (lv_styles_7_0= ruleProductStyle ) )+ otherlv_8= '}' otherlv_9= 'products' otherlv_10= '{' ( (lv_products_11_0= ruleProduct ) )+ otherlv_12= '}' otherlv_13= '}' ) )
            // InternalFashionDsl.g:1929:2: (otherlv_0= 'productLine' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'productStyles' otherlv_6= '{' ( (lv_styles_7_0= ruleProductStyle ) )+ otherlv_8= '}' otherlv_9= 'products' otherlv_10= '{' ( (lv_products_11_0= ruleProduct ) )+ otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalFashionDsl.g:1929:2: (otherlv_0= 'productLine' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'productStyles' otherlv_6= '{' ( (lv_styles_7_0= ruleProductStyle ) )+ otherlv_8= '}' otherlv_9= 'products' otherlv_10= '{' ( (lv_products_11_0= ruleProduct ) )+ otherlv_12= '}' otherlv_13= '}' )
            // InternalFashionDsl.g:1930:3: otherlv_0= 'productLine' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'productStyles' otherlv_6= '{' ( (lv_styles_7_0= ruleProductStyle ) )+ otherlv_8= '}' otherlv_9= 'products' otherlv_10= '{' ( (lv_products_11_0= ruleProduct ) )+ otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProductLineAccess().getProductLineKeyword_0());
            		
            // InternalFashionDsl.g:1934:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:1935:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:1935:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:1936:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProductLineAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getProductLineAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getProductLineAccess().getBrandKeyword_3());
            		
            // InternalFashionDsl.g:1960:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:1961:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:1961:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:1962:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductLineRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(otherlv_4, grammarAccess.getProductLineAccess().getBrandBrandCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getProductLineAccess().getProductStylesKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getProductLineAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalFashionDsl.g:1981:3: ( (lv_styles_7_0= ruleProductStyle ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==42) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalFashionDsl.g:1982:4: (lv_styles_7_0= ruleProductStyle )
            	    {
            	    // InternalFashionDsl.g:1982:4: (lv_styles_7_0= ruleProductStyle )
            	    // InternalFashionDsl.g:1983:5: lv_styles_7_0= ruleProductStyle
            	    {

            	    					newCompositeNode(grammarAccess.getProductLineAccess().getStylesProductStyleParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_styles_7_0=ruleProductStyle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProductLineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"styles",
            	    						lv_styles_7_0,
            	    						"it.polimi.ase.projectB2.team20.xtext.FashionDsl.ProductStyle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_8, grammarAccess.getProductLineAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getProductLineAccess().getProductsKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_10, grammarAccess.getProductLineAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalFashionDsl.g:2012:3: ( (lv_products_11_0= ruleProduct ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==43) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalFashionDsl.g:2013:4: (lv_products_11_0= ruleProduct )
            	    {
            	    // InternalFashionDsl.g:2013:4: (lv_products_11_0= ruleProduct )
            	    // InternalFashionDsl.g:2014:5: lv_products_11_0= ruleProduct
            	    {

            	    					newCompositeNode(grammarAccess.getProductLineAccess().getProductsProductParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_products_11_0=ruleProduct();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProductLineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"products",
            	    						lv_products_11_0,
            	    						"it.polimi.ase.projectB2.team20.xtext.FashionDsl.Product");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            otherlv_12=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_12, grammarAccess.getProductLineAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getProductLineAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductLine"


    // $ANTLR start "entryRuleProductStyle"
    // InternalFashionDsl.g:2043:1: entryRuleProductStyle returns [EObject current=null] : iv_ruleProductStyle= ruleProductStyle EOF ;
    public final EObject entryRuleProductStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductStyle = null;


        try {
            // InternalFashionDsl.g:2043:53: (iv_ruleProductStyle= ruleProductStyle EOF )
            // InternalFashionDsl.g:2044:2: iv_ruleProductStyle= ruleProductStyle EOF
            {
             newCompositeNode(grammarAccess.getProductStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductStyle=ruleProductStyle();

            state._fsp--;

             current =iv_ruleProductStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductStyle"


    // $ANTLR start "ruleProductStyle"
    // InternalFashionDsl.g:2050:1: ruleProductStyle returns [EObject current=null] : (otherlv_0= 'productStyle:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleProductStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:2056:2: ( (otherlv_0= 'productStyle:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalFashionDsl.g:2057:2: (otherlv_0= 'productStyle:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalFashionDsl.g:2057:2: (otherlv_0= 'productStyle:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalFashionDsl.g:2058:3: otherlv_0= 'productStyle:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProductStyleAccess().getProductStyleKeyword_0());
            		
            // InternalFashionDsl.g:2062:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:2063:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2063:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:2064:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProductStyleAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductStyleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductStyle"


    // $ANTLR start "entryRuleProduct"
    // InternalFashionDsl.g:2084:1: entryRuleProduct returns [EObject current=null] : iv_ruleProduct= ruleProduct EOF ;
    public final EObject entryRuleProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProduct = null;


        try {
            // InternalFashionDsl.g:2084:48: (iv_ruleProduct= ruleProduct EOF )
            // InternalFashionDsl.g:2085:2: iv_ruleProduct= ruleProduct EOF
            {
             newCompositeNode(grammarAccess.getProductRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProduct=ruleProduct();

            state._fsp--;

             current =iv_ruleProduct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProduct"


    // $ANTLR start "ruleProduct"
    // InternalFashionDsl.g:2091:1: ruleProduct returns [EObject current=null] : (otherlv_0= 'product' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:2097:2: ( (otherlv_0= 'product' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )? otherlv_7= '}' ) )
            // InternalFashionDsl.g:2098:2: (otherlv_0= 'product' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )? otherlv_7= '}' )
            {
            // InternalFashionDsl.g:2098:2: (otherlv_0= 'product' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )? otherlv_7= '}' )
            // InternalFashionDsl.g:2099:3: otherlv_0= 'product' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProductAccess().getProductKeyword_0());
            		
            // InternalFashionDsl.g:2103:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:2104:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2104:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:2105:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProductAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getProductAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFashionDsl.g:2125:3: (otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalFashionDsl.g:2126:4: otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getProductAccess().getReviewsKeyword_3_0());
                    			
                    // InternalFashionDsl.g:2130:4: ( (otherlv_4= RULE_STRING ) )
                    // InternalFashionDsl.g:2131:5: (otherlv_4= RULE_STRING )
                    {
                    // InternalFashionDsl.g:2131:5: (otherlv_4= RULE_STRING )
                    // InternalFashionDsl.g:2132:6: otherlv_4= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProductRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(otherlv_4, grammarAccess.getProductAccess().getReviewsReviewCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalFashionDsl.g:2143:4: (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==16) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalFashionDsl.g:2144:5: otherlv_5= ',' ( (otherlv_6= RULE_STRING ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getProductAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalFashionDsl.g:2148:5: ( (otherlv_6= RULE_STRING ) )
                    	    // InternalFashionDsl.g:2149:6: (otherlv_6= RULE_STRING )
                    	    {
                    	    // InternalFashionDsl.g:2149:6: (otherlv_6= RULE_STRING )
                    	    // InternalFashionDsl.g:2150:7: otherlv_6= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProductRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getProductAccess().getReviewsReviewCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProductAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProduct"


    // $ANTLR start "entryRulePhoto"
    // InternalFashionDsl.g:2171:1: entryRulePhoto returns [EObject current=null] : iv_rulePhoto= rulePhoto EOF ;
    public final EObject entryRulePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoto = null;


        try {
            // InternalFashionDsl.g:2171:46: (iv_rulePhoto= rulePhoto EOF )
            // InternalFashionDsl.g:2172:2: iv_rulePhoto= rulePhoto EOF
            {
             newCompositeNode(grammarAccess.getPhotoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhoto=rulePhoto();

            state._fsp--;

             current =iv_rulePhoto; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhoto"


    // $ANTLR start "rulePhoto"
    // InternalFashionDsl.g:2178:1: rulePhoto returns [EObject current=null] : (otherlv_0= 'photo' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'tags:' ( (lv_tags_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject rulePhoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_tags_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:2184:2: ( (otherlv_0= 'photo' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'tags:' ( (lv_tags_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalFashionDsl.g:2185:2: (otherlv_0= 'photo' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'tags:' ( (lv_tags_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalFashionDsl.g:2185:2: (otherlv_0= 'photo' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'tags:' ( (lv_tags_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' )
            // InternalFashionDsl.g:2186:3: otherlv_0= 'photo' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'tags:' ( (lv_tags_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoAccess().getPhotoKeyword_0());
            		
            // InternalFashionDsl.g:2190:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:2191:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2191:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:2192:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPhotoAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPhotoAccess().getProductKeyword_3());
            		
            // InternalFashionDsl.g:2216:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:2217:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:2217:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:2218:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(otherlv_4, grammarAccess.getPhotoAccess().getProductProductCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getPhotoAccess().getTagsKeyword_5());
            		
            // InternalFashionDsl.g:2233:3: ( (lv_tags_6_0= RULE_STRING ) )
            // InternalFashionDsl.g:2234:4: (lv_tags_6_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2234:4: (lv_tags_6_0= RULE_STRING )
            // InternalFashionDsl.g:2235:5: lv_tags_6_0= RULE_STRING
            {
            lv_tags_6_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_tags_6_0, grammarAccess.getPhotoAccess().getTagsSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tags",
            						lv_tags_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getPhotoAccess().getReviewerKeyword_7());
            		
            // InternalFashionDsl.g:2255:3: ( (otherlv_8= RULE_STRING ) )
            // InternalFashionDsl.g:2256:4: (otherlv_8= RULE_STRING )
            {
            // InternalFashionDsl.g:2256:4: (otherlv_8= RULE_STRING )
            // InternalFashionDsl.g:2257:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(otherlv_8, grammarAccess.getPhotoAccess().getReviewerReviewerCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPhotoAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhoto"


    // $ANTLR start "entryRuleDescription"
    // InternalFashionDsl.g:2276:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalFashionDsl.g:2276:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalFashionDsl.g:2277:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalFashionDsl.g:2283:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'text:' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_text_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:2289:2: ( (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'text:' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalFashionDsl.g:2290:2: (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'text:' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalFashionDsl.g:2290:2: (otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'text:' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' )
            // InternalFashionDsl.g:2291:3: otherlv_0= 'description' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'text:' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalFashionDsl.g:2295:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:2296:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2296:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:2297:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDescriptionAccess().getProductKeyword_3());
            		
            // InternalFashionDsl.g:2321:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:2322:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:2322:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:2323:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(otherlv_4, grammarAccess.getDescriptionAccess().getProductProductCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getDescriptionAccess().getTextKeyword_5());
            		
            // InternalFashionDsl.g:2338:3: ( (lv_text_6_0= RULE_STRING ) )
            // InternalFashionDsl.g:2339:4: (lv_text_6_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2339:4: (lv_text_6_0= RULE_STRING )
            // InternalFashionDsl.g:2340:5: lv_text_6_0= RULE_STRING
            {
            lv_text_6_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_text_6_0, grammarAccess.getDescriptionAccess().getTextSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getDescriptionAccess().getReviewerKeyword_7());
            		
            // InternalFashionDsl.g:2360:3: ( (otherlv_8= RULE_STRING ) )
            // InternalFashionDsl.g:2361:4: (otherlv_8= RULE_STRING )
            {
            // InternalFashionDsl.g:2361:4: (otherlv_8= RULE_STRING )
            // InternalFashionDsl.g:2362:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(otherlv_8, grammarAccess.getDescriptionAccess().getReviewerReviewerCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDescriptionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleComment"
    // InternalFashionDsl.g:2381:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalFashionDsl.g:2381:48: (iv_ruleComment= ruleComment EOF )
            // InternalFashionDsl.g:2382:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalFashionDsl.g:2388:1: ruleComment returns [EObject current=null] : (otherlv_0= 'comment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'text:' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_text_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:2394:2: ( (otherlv_0= 'comment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'text:' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalFashionDsl.g:2395:2: (otherlv_0= 'comment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'text:' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalFashionDsl.g:2395:2: (otherlv_0= 'comment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'text:' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}' )
            // InternalFashionDsl.g:2396:3: otherlv_0= 'comment' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'product:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'text:' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= 'reviewer:' ( (otherlv_8= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCommentKeyword_0());
            		
            // InternalFashionDsl.g:2400:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:2401:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2401:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:2402:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCommentAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCommentAccess().getProductKeyword_3());
            		
            // InternalFashionDsl.g:2426:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:2427:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:2427:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:2428:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(otherlv_4, grammarAccess.getCommentAccess().getProductProductCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getCommentAccess().getTextKeyword_5());
            		
            // InternalFashionDsl.g:2443:3: ( (lv_text_6_0= RULE_STRING ) )
            // InternalFashionDsl.g:2444:4: (lv_text_6_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2444:4: (lv_text_6_0= RULE_STRING )
            // InternalFashionDsl.g:2445:5: lv_text_6_0= RULE_STRING
            {
            lv_text_6_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_text_6_0, grammarAccess.getCommentAccess().getTextSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getCommentAccess().getReviewerKeyword_7());
            		
            // InternalFashionDsl.g:2465:3: ( (otherlv_8= RULE_STRING ) )
            // InternalFashionDsl.g:2466:4: (otherlv_8= RULE_STRING )
            {
            // InternalFashionDsl.g:2466:4: (otherlv_8= RULE_STRING )
            // InternalFashionDsl.g:2467:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(otherlv_8, grammarAccess.getCommentAccess().getReviewerReviewerCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCommentAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleBlogger"
    // InternalFashionDsl.g:2486:1: entryRuleBlogger returns [EObject current=null] : iv_ruleBlogger= ruleBlogger EOF ;
    public final EObject entryRuleBlogger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlogger = null;


        try {
            // InternalFashionDsl.g:2486:48: (iv_ruleBlogger= ruleBlogger EOF )
            // InternalFashionDsl.g:2487:2: iv_ruleBlogger= ruleBlogger EOF
            {
             newCompositeNode(grammarAccess.getBloggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlogger=ruleBlogger();

            state._fsp--;

             current =iv_ruleBlogger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlogger"


    // $ANTLR start "ruleBlogger"
    // InternalFashionDsl.g:2493:1: ruleBlogger returns [EObject current=null] : (otherlv_0= 'blogger' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleBlogger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:2499:2: ( (otherlv_0= 'blogger' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' ) )
            // InternalFashionDsl.g:2500:2: (otherlv_0= 'blogger' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' )
            {
            // InternalFashionDsl.g:2500:2: (otherlv_0= 'blogger' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' )
            // InternalFashionDsl.g:2501:3: otherlv_0= 'blogger' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBloggerAccess().getBloggerKeyword_0());
            		
            // InternalFashionDsl.g:2505:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:2506:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2506:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:2507:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBloggerAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBloggerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getBloggerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getBloggerAccess().getReviewsKeyword_3());
            		
            // InternalFashionDsl.g:2531:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:2532:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:2532:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:2533:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBloggerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_45); 

            					newLeafNode(otherlv_4, grammarAccess.getBloggerAccess().getReviewsReviewCrossReference_4_0());
            				

            }


            }

            // InternalFashionDsl.g:2544:3: (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==16) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalFashionDsl.g:2545:4: otherlv_5= ',' ( (otherlv_6= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getBloggerAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalFashionDsl.g:2549:4: ( (otherlv_6= RULE_STRING ) )
            	    // InternalFashionDsl.g:2550:5: (otherlv_6= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:2550:5: (otherlv_6= RULE_STRING )
            	    // InternalFashionDsl.g:2551:6: otherlv_6= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBloggerRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_45); 

            	    						newLeafNode(otherlv_6, grammarAccess.getBloggerAccess().getReviewsReviewCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_7=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getBloggerAccess().getEventsKeyword_6());
            		
            // InternalFashionDsl.g:2567:3: ( (otherlv_8= RULE_STRING ) )
            // InternalFashionDsl.g:2568:4: (otherlv_8= RULE_STRING )
            {
            // InternalFashionDsl.g:2568:4: (otherlv_8= RULE_STRING )
            // InternalFashionDsl.g:2569:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBloggerRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getBloggerAccess().getEventsEventCrossReference_7_0());
            				

            }


            }

            // InternalFashionDsl.g:2580:3: (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==16) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalFashionDsl.g:2581:4: otherlv_9= ',' ( (otherlv_10= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getBloggerAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalFashionDsl.g:2585:4: ( (otherlv_10= RULE_STRING ) )
            	    // InternalFashionDsl.g:2586:5: (otherlv_10= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:2586:5: (otherlv_10= RULE_STRING )
            	    // InternalFashionDsl.g:2587:6: otherlv_10= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBloggerRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_10, grammarAccess.getBloggerAccess().getEventsEventCrossReference_8_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getBloggerAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlogger"


    // $ANTLR start "entryRuleCritic"
    // InternalFashionDsl.g:2607:1: entryRuleCritic returns [EObject current=null] : iv_ruleCritic= ruleCritic EOF ;
    public final EObject entryRuleCritic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCritic = null;


        try {
            // InternalFashionDsl.g:2607:47: (iv_ruleCritic= ruleCritic EOF )
            // InternalFashionDsl.g:2608:2: iv_ruleCritic= ruleCritic EOF
            {
             newCompositeNode(grammarAccess.getCriticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCritic=ruleCritic();

            state._fsp--;

             current =iv_ruleCritic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCritic"


    // $ANTLR start "ruleCritic"
    // InternalFashionDsl.g:2614:1: ruleCritic returns [EObject current=null] : (otherlv_0= 'critic' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleCritic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:2620:2: ( (otherlv_0= 'critic' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' ) )
            // InternalFashionDsl.g:2621:2: (otherlv_0= 'critic' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' )
            {
            // InternalFashionDsl.g:2621:2: (otherlv_0= 'critic' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' )
            // InternalFashionDsl.g:2622:3: otherlv_0= 'critic' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCriticAccess().getCriticKeyword_0());
            		
            // InternalFashionDsl.g:2626:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:2627:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2627:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:2628:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCriticAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCriticRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getCriticAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCriticAccess().getReviewsKeyword_3());
            		
            // InternalFashionDsl.g:2652:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:2653:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:2653:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:2654:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCriticRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_45); 

            					newLeafNode(otherlv_4, grammarAccess.getCriticAccess().getReviewsReviewCrossReference_4_0());
            				

            }


            }

            // InternalFashionDsl.g:2665:3: (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==16) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalFashionDsl.g:2666:4: otherlv_5= ',' ( (otherlv_6= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCriticAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalFashionDsl.g:2670:4: ( (otherlv_6= RULE_STRING ) )
            	    // InternalFashionDsl.g:2671:5: (otherlv_6= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:2671:5: (otherlv_6= RULE_STRING )
            	    // InternalFashionDsl.g:2672:6: otherlv_6= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCriticRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_45); 

            	    						newLeafNode(otherlv_6, grammarAccess.getCriticAccess().getReviewsReviewCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_7=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getCriticAccess().getEventsKeyword_6());
            		
            // InternalFashionDsl.g:2688:3: ( (otherlv_8= RULE_STRING ) )
            // InternalFashionDsl.g:2689:4: (otherlv_8= RULE_STRING )
            {
            // InternalFashionDsl.g:2689:4: (otherlv_8= RULE_STRING )
            // InternalFashionDsl.g:2690:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCriticRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getCriticAccess().getEventsEventCrossReference_7_0());
            				

            }


            }

            // InternalFashionDsl.g:2701:3: (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==16) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalFashionDsl.g:2702:4: otherlv_9= ',' ( (otherlv_10= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getCriticAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalFashionDsl.g:2706:4: ( (otherlv_10= RULE_STRING ) )
            	    // InternalFashionDsl.g:2707:5: (otherlv_10= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:2707:5: (otherlv_10= RULE_STRING )
            	    // InternalFashionDsl.g:2708:6: otherlv_10= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCriticRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_10, grammarAccess.getCriticAccess().getEventsEventCrossReference_8_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCriticAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCritic"


    // $ANTLR start "entryRuleInfluencer"
    // InternalFashionDsl.g:2728:1: entryRuleInfluencer returns [EObject current=null] : iv_ruleInfluencer= ruleInfluencer EOF ;
    public final EObject entryRuleInfluencer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfluencer = null;


        try {
            // InternalFashionDsl.g:2728:51: (iv_ruleInfluencer= ruleInfluencer EOF )
            // InternalFashionDsl.g:2729:2: iv_ruleInfluencer= ruleInfluencer EOF
            {
             newCompositeNode(grammarAccess.getInfluencerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfluencer=ruleInfluencer();

            state._fsp--;

             current =iv_ruleInfluencer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfluencer"


    // $ANTLR start "ruleInfluencer"
    // InternalFashionDsl.g:2735:1: ruleInfluencer returns [EObject current=null] : (otherlv_0= 'influencer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleInfluencer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:2741:2: ( (otherlv_0= 'influencer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' ) )
            // InternalFashionDsl.g:2742:2: (otherlv_0= 'influencer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' )
            {
            // InternalFashionDsl.g:2742:2: (otherlv_0= 'influencer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}' )
            // InternalFashionDsl.g:2743:3: otherlv_0= 'influencer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'reviews:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= 'events:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInfluencerAccess().getInfluencerKeyword_0());
            		
            // InternalFashionDsl.g:2747:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:2748:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2748:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:2749:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInfluencerAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfluencerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getInfluencerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getInfluencerAccess().getReviewsKeyword_3());
            		
            // InternalFashionDsl.g:2773:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:2774:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:2774:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:2775:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfluencerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_45); 

            					newLeafNode(otherlv_4, grammarAccess.getInfluencerAccess().getReviewsReviewCrossReference_4_0());
            				

            }


            }

            // InternalFashionDsl.g:2786:3: (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==16) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalFashionDsl.g:2787:4: otherlv_5= ',' ( (otherlv_6= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getInfluencerAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalFashionDsl.g:2791:4: ( (otherlv_6= RULE_STRING ) )
            	    // InternalFashionDsl.g:2792:5: (otherlv_6= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:2792:5: (otherlv_6= RULE_STRING )
            	    // InternalFashionDsl.g:2793:6: otherlv_6= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInfluencerRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_45); 

            	    						newLeafNode(otherlv_6, grammarAccess.getInfluencerAccess().getReviewsReviewCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_7=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getInfluencerAccess().getEventsKeyword_6());
            		
            // InternalFashionDsl.g:2809:3: ( (otherlv_8= RULE_STRING ) )
            // InternalFashionDsl.g:2810:4: (otherlv_8= RULE_STRING )
            {
            // InternalFashionDsl.g:2810:4: (otherlv_8= RULE_STRING )
            // InternalFashionDsl.g:2811:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfluencerRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getInfluencerAccess().getEventsEventCrossReference_7_0());
            				

            }


            }

            // InternalFashionDsl.g:2822:3: (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==16) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalFashionDsl.g:2823:4: otherlv_9= ',' ( (otherlv_10= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getInfluencerAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalFashionDsl.g:2827:4: ( (otherlv_10= RULE_STRING ) )
            	    // InternalFashionDsl.g:2828:5: (otherlv_10= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:2828:5: (otherlv_10= RULE_STRING )
            	    // InternalFashionDsl.g:2829:6: otherlv_10= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInfluencerRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_10, grammarAccess.getInfluencerAccess().getEventsEventCrossReference_8_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getInfluencerAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfluencer"


    // $ANTLR start "entryRuleDesigner"
    // InternalFashionDsl.g:2849:1: entryRuleDesigner returns [EObject current=null] : iv_ruleDesigner= ruleDesigner EOF ;
    public final EObject entryRuleDesigner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesigner = null;


        try {
            // InternalFashionDsl.g:2849:49: (iv_ruleDesigner= ruleDesigner EOF )
            // InternalFashionDsl.g:2850:2: iv_ruleDesigner= ruleDesigner EOF
            {
             newCompositeNode(grammarAccess.getDesignerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesigner=ruleDesigner();

            state._fsp--;

             current =iv_ruleDesigner; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesigner"


    // $ANTLR start "ruleDesigner"
    // InternalFashionDsl.g:2856:1: ruleDesigner returns [EObject current=null] : (otherlv_0= 'designer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'events:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleDesigner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:2862:2: ( (otherlv_0= 'designer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'events:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' ) )
            // InternalFashionDsl.g:2863:2: (otherlv_0= 'designer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'events:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )
            {
            // InternalFashionDsl.g:2863:2: (otherlv_0= 'designer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'events:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}' )
            // InternalFashionDsl.g:2864:3: otherlv_0= 'designer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'brand:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'events:' ( (otherlv_6= RULE_STRING ) ) (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDesignerAccess().getDesignerKeyword_0());
            		
            // InternalFashionDsl.g:2868:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:2869:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2869:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:2870:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDesignerAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDesignerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getDesignerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDesignerAccess().getBrandKeyword_3());
            		
            // InternalFashionDsl.g:2894:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:2895:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:2895:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:2896:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDesignerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(otherlv_4, grammarAccess.getDesignerAccess().getBrandBrandCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getDesignerAccess().getEventsKeyword_5());
            		
            // InternalFashionDsl.g:2911:3: ( (otherlv_6= RULE_STRING ) )
            // InternalFashionDsl.g:2912:4: (otherlv_6= RULE_STRING )
            {
            // InternalFashionDsl.g:2912:4: (otherlv_6= RULE_STRING )
            // InternalFashionDsl.g:2913:5: otherlv_6= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDesignerRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_6, grammarAccess.getDesignerAccess().getEventsEventCrossReference_6_0());
            				

            }


            }

            // InternalFashionDsl.g:2924:3: (otherlv_7= ',' ( (otherlv_8= RULE_STRING ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==16) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalFashionDsl.g:2925:4: otherlv_7= ',' ( (otherlv_8= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDesignerAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalFashionDsl.g:2929:4: ( (otherlv_8= RULE_STRING ) )
            	    // InternalFashionDsl.g:2930:5: (otherlv_8= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:2930:5: (otherlv_8= RULE_STRING )
            	    // InternalFashionDsl.g:2931:6: otherlv_8= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDesignerRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_8, grammarAccess.getDesignerAccess().getEventsEventCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDesignerAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesigner"


    // $ANTLR start "entryRuleModel"
    // InternalFashionDsl.g:2951:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalFashionDsl.g:2951:46: (iv_ruleModel= ruleModel EOF )
            // InternalFashionDsl.g:2952:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFashionDsl.g:2958:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:2964:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' ) )
            // InternalFashionDsl.g:2965:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' )
            {
            // InternalFashionDsl.g:2965:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' )
            // InternalFashionDsl.g:2966:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalFashionDsl.g:2970:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:2971:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:2971:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:2972:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getEventsKeyword_3());
            		
            // InternalFashionDsl.g:2996:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:2997:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:2997:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:2998:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getModelAccess().getEventsEventCrossReference_4_0());
            				

            }


            }

            // InternalFashionDsl.g:3009:3: (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==16) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalFashionDsl.g:3010:4: otherlv_5= ',' ( (otherlv_6= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalFashionDsl.g:3014:4: ( (otherlv_6= RULE_STRING ) )
            	    // InternalFashionDsl.g:3015:5: (otherlv_6= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:3015:5: (otherlv_6= RULE_STRING )
            	    // InternalFashionDsl.g:3016:6: otherlv_6= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getModelRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_6, grammarAccess.getModelAccess().getEventsEventCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePhotographer"
    // InternalFashionDsl.g:3036:1: entryRulePhotographer returns [EObject current=null] : iv_rulePhotographer= rulePhotographer EOF ;
    public final EObject entryRulePhotographer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhotographer = null;


        try {
            // InternalFashionDsl.g:3036:53: (iv_rulePhotographer= rulePhotographer EOF )
            // InternalFashionDsl.g:3037:2: iv_rulePhotographer= rulePhotographer EOF
            {
             newCompositeNode(grammarAccess.getPhotographerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhotographer=rulePhotographer();

            state._fsp--;

             current =iv_rulePhotographer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhotographer"


    // $ANTLR start "rulePhotographer"
    // InternalFashionDsl.g:3043:1: rulePhotographer returns [EObject current=null] : (otherlv_0= 'photographer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' ) ;
    public final EObject rulePhotographer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:3049:2: ( (otherlv_0= 'photographer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' ) )
            // InternalFashionDsl.g:3050:2: (otherlv_0= 'photographer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' )
            {
            // InternalFashionDsl.g:3050:2: (otherlv_0= 'photographer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' )
            // InternalFashionDsl.g:3051:3: otherlv_0= 'photographer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotographerAccess().getPhotographerKeyword_0());
            		
            // InternalFashionDsl.g:3055:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:3056:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:3056:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:3057:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPhotographerAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotographerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getPhotographerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPhotographerAccess().getEventsKeyword_3());
            		
            // InternalFashionDsl.g:3081:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:3082:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:3082:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:3083:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotographerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getPhotographerAccess().getEventsEventCrossReference_4_0());
            				

            }


            }

            // InternalFashionDsl.g:3094:3: (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==16) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalFashionDsl.g:3095:4: otherlv_5= ',' ( (otherlv_6= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getPhotographerAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalFashionDsl.g:3099:4: ( (otherlv_6= RULE_STRING ) )
            	    // InternalFashionDsl.g:3100:5: (otherlv_6= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:3100:5: (otherlv_6= RULE_STRING )
            	    // InternalFashionDsl.g:3101:6: otherlv_6= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPhotographerRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_6, grammarAccess.getPhotographerAccess().getEventsEventCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPhotographerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhotographer"


    // $ANTLR start "entryRuleChoreographer"
    // InternalFashionDsl.g:3121:1: entryRuleChoreographer returns [EObject current=null] : iv_ruleChoreographer= ruleChoreographer EOF ;
    public final EObject entryRuleChoreographer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoreographer = null;


        try {
            // InternalFashionDsl.g:3121:54: (iv_ruleChoreographer= ruleChoreographer EOF )
            // InternalFashionDsl.g:3122:2: iv_ruleChoreographer= ruleChoreographer EOF
            {
             newCompositeNode(grammarAccess.getChoreographerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoreographer=ruleChoreographer();

            state._fsp--;

             current =iv_ruleChoreographer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoreographer"


    // $ANTLR start "ruleChoreographer"
    // InternalFashionDsl.g:3128:1: ruleChoreographer returns [EObject current=null] : (otherlv_0= 'choreographer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleChoreographer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:3134:2: ( (otherlv_0= 'choreographer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' ) )
            // InternalFashionDsl.g:3135:2: (otherlv_0= 'choreographer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' )
            {
            // InternalFashionDsl.g:3135:2: (otherlv_0= 'choreographer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' )
            // InternalFashionDsl.g:3136:3: otherlv_0= 'choreographer' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getChoreographerAccess().getChoreographerKeyword_0());
            		
            // InternalFashionDsl.g:3140:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:3141:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:3141:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:3142:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChoreographerAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoreographerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getChoreographerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getChoreographerAccess().getEventsKeyword_3());
            		
            // InternalFashionDsl.g:3166:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:3167:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:3167:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:3168:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoreographerRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getChoreographerAccess().getEventsEventCrossReference_4_0());
            				

            }


            }

            // InternalFashionDsl.g:3179:3: (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==16) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalFashionDsl.g:3180:4: otherlv_5= ',' ( (otherlv_6= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getChoreographerAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalFashionDsl.g:3184:4: ( (otherlv_6= RULE_STRING ) )
            	    // InternalFashionDsl.g:3185:5: (otherlv_6= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:3185:5: (otherlv_6= RULE_STRING )
            	    // InternalFashionDsl.g:3186:6: otherlv_6= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getChoreographerRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_6, grammarAccess.getChoreographerAccess().getEventsEventCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getChoreographerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoreographer"


    // $ANTLR start "entryRulePresenter"
    // InternalFashionDsl.g:3206:1: entryRulePresenter returns [EObject current=null] : iv_rulePresenter= rulePresenter EOF ;
    public final EObject entryRulePresenter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresenter = null;


        try {
            // InternalFashionDsl.g:3206:50: (iv_rulePresenter= rulePresenter EOF )
            // InternalFashionDsl.g:3207:2: iv_rulePresenter= rulePresenter EOF
            {
             newCompositeNode(grammarAccess.getPresenterRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePresenter=rulePresenter();

            state._fsp--;

             current =iv_rulePresenter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePresenter"


    // $ANTLR start "rulePresenter"
    // InternalFashionDsl.g:3213:1: rulePresenter returns [EObject current=null] : (otherlv_0= 'presenter' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' ) ;
    public final EObject rulePresenter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:3219:2: ( (otherlv_0= 'presenter' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' ) )
            // InternalFashionDsl.g:3220:2: (otherlv_0= 'presenter' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' )
            {
            // InternalFashionDsl.g:3220:2: (otherlv_0= 'presenter' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}' )
            // InternalFashionDsl.g:3221:3: otherlv_0= 'presenter' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'events:' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPresenterAccess().getPresenterKeyword_0());
            		
            // InternalFashionDsl.g:3225:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:3226:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:3226:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:3227:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPresenterAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresenterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getPresenterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPresenterAccess().getEventsKeyword_3());
            		
            // InternalFashionDsl.g:3251:3: ( (otherlv_4= RULE_STRING ) )
            // InternalFashionDsl.g:3252:4: (otherlv_4= RULE_STRING )
            {
            // InternalFashionDsl.g:3252:4: (otherlv_4= RULE_STRING )
            // InternalFashionDsl.g:3253:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPresenterRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getPresenterAccess().getEventsEventCrossReference_4_0());
            				

            }


            }

            // InternalFashionDsl.g:3264:3: (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==16) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalFashionDsl.g:3265:4: otherlv_5= ',' ( (otherlv_6= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getPresenterAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalFashionDsl.g:3269:4: ( (otherlv_6= RULE_STRING ) )
            	    // InternalFashionDsl.g:3270:5: (otherlv_6= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:3270:5: (otherlv_6= RULE_STRING )
            	    // InternalFashionDsl.g:3271:6: otherlv_6= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPresenterRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    						newLeafNode(otherlv_6, grammarAccess.getPresenterAccess().getEventsEventCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPresenterAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePresenter"


    // $ANTLR start "entryRuleMacroEvent"
    // InternalFashionDsl.g:3291:1: entryRuleMacroEvent returns [EObject current=null] : iv_ruleMacroEvent= ruleMacroEvent EOF ;
    public final EObject entryRuleMacroEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacroEvent = null;


        try {
            // InternalFashionDsl.g:3291:51: (iv_ruleMacroEvent= ruleMacroEvent EOF )
            // InternalFashionDsl.g:3292:2: iv_ruleMacroEvent= ruleMacroEvent EOF
            {
             newCompositeNode(grammarAccess.getMacroEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacroEvent=ruleMacroEvent();

            state._fsp--;

             current =iv_ruleMacroEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMacroEvent"


    // $ANTLR start "ruleMacroEvent"
    // InternalFashionDsl.g:3298:1: ruleMacroEvent returns [EObject current=null] : (otherlv_0= 'macroEvent' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'year:' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'month:' ( (lv_month_6_0= RULE_INT ) ) otherlv_7= 'roles:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= 'city:' ( (lv_city_12_0= RULE_STRING ) ) otherlv_13= 'singleBrandEvents' otherlv_14= '{' ( (lv_singleBrandEvents_15_0= ruleSingleBrandEvent ) )+ otherlv_16= '}' otherlv_17= '}' ) ;
    public final EObject ruleMacroEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;
        Token otherlv_5=null;
        Token lv_month_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_city_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_singleBrandEvents_15_0 = null;



        	enterRule();

        try {
            // InternalFashionDsl.g:3304:2: ( (otherlv_0= 'macroEvent' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'year:' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'month:' ( (lv_month_6_0= RULE_INT ) ) otherlv_7= 'roles:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= 'city:' ( (lv_city_12_0= RULE_STRING ) ) otherlv_13= 'singleBrandEvents' otherlv_14= '{' ( (lv_singleBrandEvents_15_0= ruleSingleBrandEvent ) )+ otherlv_16= '}' otherlv_17= '}' ) )
            // InternalFashionDsl.g:3305:2: (otherlv_0= 'macroEvent' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'year:' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'month:' ( (lv_month_6_0= RULE_INT ) ) otherlv_7= 'roles:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= 'city:' ( (lv_city_12_0= RULE_STRING ) ) otherlv_13= 'singleBrandEvents' otherlv_14= '{' ( (lv_singleBrandEvents_15_0= ruleSingleBrandEvent ) )+ otherlv_16= '}' otherlv_17= '}' )
            {
            // InternalFashionDsl.g:3305:2: (otherlv_0= 'macroEvent' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'year:' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'month:' ( (lv_month_6_0= RULE_INT ) ) otherlv_7= 'roles:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= 'city:' ( (lv_city_12_0= RULE_STRING ) ) otherlv_13= 'singleBrandEvents' otherlv_14= '{' ( (lv_singleBrandEvents_15_0= ruleSingleBrandEvent ) )+ otherlv_16= '}' otherlv_17= '}' )
            // InternalFashionDsl.g:3306:3: otherlv_0= 'macroEvent' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'year:' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'month:' ( (lv_month_6_0= RULE_INT ) ) otherlv_7= 'roles:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= 'city:' ( (lv_city_12_0= RULE_STRING ) ) otherlv_13= 'singleBrandEvents' otherlv_14= '{' ( (lv_singleBrandEvents_15_0= ruleSingleBrandEvent ) )+ otherlv_16= '}' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMacroEventAccess().getMacroEventKeyword_0());
            		
            // InternalFashionDsl.g:3310:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:3311:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:3311:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:3312:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMacroEventAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacroEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getMacroEventAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getMacroEventAccess().getYearKeyword_3());
            		
            // InternalFashionDsl.g:3336:3: ( (lv_year_4_0= RULE_INT ) )
            // InternalFashionDsl.g:3337:4: (lv_year_4_0= RULE_INT )
            {
            // InternalFashionDsl.g:3337:4: (lv_year_4_0= RULE_INT )
            // InternalFashionDsl.g:3338:5: lv_year_4_0= RULE_INT
            {
            lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_48); 

            					newLeafNode(lv_year_4_0, grammarAccess.getMacroEventAccess().getYearINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacroEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,63,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getMacroEventAccess().getMonthKeyword_5());
            		
            // InternalFashionDsl.g:3358:3: ( (lv_month_6_0= RULE_INT ) )
            // InternalFashionDsl.g:3359:4: (lv_month_6_0= RULE_INT )
            {
            // InternalFashionDsl.g:3359:4: (lv_month_6_0= RULE_INT )
            // InternalFashionDsl.g:3360:5: lv_month_6_0= RULE_INT
            {
            lv_month_6_0=(Token)match(input,RULE_INT,FOLLOW_49); 

            					newLeafNode(lv_month_6_0, grammarAccess.getMacroEventAccess().getMonthINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacroEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"month",
            						lv_month_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,64,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getMacroEventAccess().getRolesKeyword_7());
            		
            // InternalFashionDsl.g:3380:3: ( (otherlv_8= RULE_STRING ) )
            // InternalFashionDsl.g:3381:4: (otherlv_8= RULE_STRING )
            {
            // InternalFashionDsl.g:3381:4: (otherlv_8= RULE_STRING )
            // InternalFashionDsl.g:3382:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacroEventRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_50); 

            					newLeafNode(otherlv_8, grammarAccess.getMacroEventAccess().getRolesRoleCrossReference_8_0());
            				

            }


            }

            // InternalFashionDsl.g:3393:3: (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==16) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalFashionDsl.g:3394:4: otherlv_9= ',' ( (otherlv_10= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getMacroEventAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalFashionDsl.g:3398:4: ( (otherlv_10= RULE_STRING ) )
            	    // InternalFashionDsl.g:3399:5: (otherlv_10= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:3399:5: (otherlv_10= RULE_STRING )
            	    // InternalFashionDsl.g:3400:6: otherlv_10= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMacroEventRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_STRING,FOLLOW_50); 

            	    						newLeafNode(otherlv_10, grammarAccess.getMacroEventAccess().getRolesRoleCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_11=(Token)match(input,65,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getMacroEventAccess().getCityKeyword_10());
            		
            // InternalFashionDsl.g:3416:3: ( (lv_city_12_0= RULE_STRING ) )
            // InternalFashionDsl.g:3417:4: (lv_city_12_0= RULE_STRING )
            {
            // InternalFashionDsl.g:3417:4: (lv_city_12_0= RULE_STRING )
            // InternalFashionDsl.g:3418:5: lv_city_12_0= RULE_STRING
            {
            lv_city_12_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

            					newLeafNode(lv_city_12_0, grammarAccess.getMacroEventAccess().getCitySTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacroEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"city",
            						lv_city_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,66,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getMacroEventAccess().getSingleBrandEventsKeyword_12());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getMacroEventAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalFashionDsl.g:3442:3: ( (lv_singleBrandEvents_15_0= ruleSingleBrandEvent ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==67) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalFashionDsl.g:3443:4: (lv_singleBrandEvents_15_0= ruleSingleBrandEvent )
            	    {
            	    // InternalFashionDsl.g:3443:4: (lv_singleBrandEvents_15_0= ruleSingleBrandEvent )
            	    // InternalFashionDsl.g:3444:5: lv_singleBrandEvents_15_0= ruleSingleBrandEvent
            	    {

            	    					newCompositeNode(grammarAccess.getMacroEventAccess().getSingleBrandEventsSingleBrandEventParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_52);
            	    lv_singleBrandEvents_15_0=ruleSingleBrandEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMacroEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"singleBrandEvents",
            	    						lv_singleBrandEvents_15_0,
            	    						"it.polimi.ase.projectB2.team20.xtext.FashionDsl.SingleBrandEvent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            otherlv_16=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_16, grammarAccess.getMacroEventAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_17=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getMacroEventAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMacroEvent"


    // $ANTLR start "entryRuleSingleBrandEvent"
    // InternalFashionDsl.g:3473:1: entryRuleSingleBrandEvent returns [EObject current=null] : iv_ruleSingleBrandEvent= ruleSingleBrandEvent EOF ;
    public final EObject entryRuleSingleBrandEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleBrandEvent = null;


        try {
            // InternalFashionDsl.g:3473:57: (iv_ruleSingleBrandEvent= ruleSingleBrandEvent EOF )
            // InternalFashionDsl.g:3474:2: iv_ruleSingleBrandEvent= ruleSingleBrandEvent EOF
            {
             newCompositeNode(grammarAccess.getSingleBrandEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleBrandEvent=ruleSingleBrandEvent();

            state._fsp--;

             current =iv_ruleSingleBrandEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleBrandEvent"


    // $ANTLR start "ruleSingleBrandEvent"
    // InternalFashionDsl.g:3480:1: ruleSingleBrandEvent returns [EObject current=null] : (otherlv_0= 'singleBrandEvent' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'year:' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'month:' ( (lv_month_6_0= RULE_INT ) ) otherlv_7= 'roles:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= 'day:' ( (lv_day_12_0= RULE_INT ) ) otherlv_13= 'hour:' ( (lv_hour_14_0= RULE_INT ) ) otherlv_15= 'minute:' ( (lv_minute_16_0= RULE_INT ) ) otherlv_17= 'brand:' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '}' ) ;
    public final EObject ruleSingleBrandEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_year_4_0=null;
        Token otherlv_5=null;
        Token lv_month_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_day_12_0=null;
        Token otherlv_13=null;
        Token lv_hour_14_0=null;
        Token otherlv_15=null;
        Token lv_minute_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:3486:2: ( (otherlv_0= 'singleBrandEvent' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'year:' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'month:' ( (lv_month_6_0= RULE_INT ) ) otherlv_7= 'roles:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= 'day:' ( (lv_day_12_0= RULE_INT ) ) otherlv_13= 'hour:' ( (lv_hour_14_0= RULE_INT ) ) otherlv_15= 'minute:' ( (lv_minute_16_0= RULE_INT ) ) otherlv_17= 'brand:' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '}' ) )
            // InternalFashionDsl.g:3487:2: (otherlv_0= 'singleBrandEvent' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'year:' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'month:' ( (lv_month_6_0= RULE_INT ) ) otherlv_7= 'roles:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= 'day:' ( (lv_day_12_0= RULE_INT ) ) otherlv_13= 'hour:' ( (lv_hour_14_0= RULE_INT ) ) otherlv_15= 'minute:' ( (lv_minute_16_0= RULE_INT ) ) otherlv_17= 'brand:' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '}' )
            {
            // InternalFashionDsl.g:3487:2: (otherlv_0= 'singleBrandEvent' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'year:' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'month:' ( (lv_month_6_0= RULE_INT ) ) otherlv_7= 'roles:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= 'day:' ( (lv_day_12_0= RULE_INT ) ) otherlv_13= 'hour:' ( (lv_hour_14_0= RULE_INT ) ) otherlv_15= 'minute:' ( (lv_minute_16_0= RULE_INT ) ) otherlv_17= 'brand:' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '}' )
            // InternalFashionDsl.g:3488:3: otherlv_0= 'singleBrandEvent' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'year:' ( (lv_year_4_0= RULE_INT ) ) otherlv_5= 'month:' ( (lv_month_6_0= RULE_INT ) ) otherlv_7= 'roles:' ( (otherlv_8= RULE_STRING ) ) (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )* otherlv_11= 'day:' ( (lv_day_12_0= RULE_INT ) ) otherlv_13= 'hour:' ( (lv_hour_14_0= RULE_INT ) ) otherlv_15= 'minute:' ( (lv_minute_16_0= RULE_INT ) ) otherlv_17= 'brand:' ( (otherlv_18= RULE_STRING ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleBrandEventAccess().getSingleBrandEventKeyword_0());
            		
            // InternalFashionDsl.g:3492:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFashionDsl.g:3493:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFashionDsl.g:3493:4: (lv_name_1_0= RULE_STRING )
            // InternalFashionDsl.g:3494:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSingleBrandEventAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleBrandEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getSingleBrandEventAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSingleBrandEventAccess().getYearKeyword_3());
            		
            // InternalFashionDsl.g:3518:3: ( (lv_year_4_0= RULE_INT ) )
            // InternalFashionDsl.g:3519:4: (lv_year_4_0= RULE_INT )
            {
            // InternalFashionDsl.g:3519:4: (lv_year_4_0= RULE_INT )
            // InternalFashionDsl.g:3520:5: lv_year_4_0= RULE_INT
            {
            lv_year_4_0=(Token)match(input,RULE_INT,FOLLOW_48); 

            					newLeafNode(lv_year_4_0, grammarAccess.getSingleBrandEventAccess().getYearINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleBrandEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,63,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getSingleBrandEventAccess().getMonthKeyword_5());
            		
            // InternalFashionDsl.g:3540:3: ( (lv_month_6_0= RULE_INT ) )
            // InternalFashionDsl.g:3541:4: (lv_month_6_0= RULE_INT )
            {
            // InternalFashionDsl.g:3541:4: (lv_month_6_0= RULE_INT )
            // InternalFashionDsl.g:3542:5: lv_month_6_0= RULE_INT
            {
            lv_month_6_0=(Token)match(input,RULE_INT,FOLLOW_49); 

            					newLeafNode(lv_month_6_0, grammarAccess.getSingleBrandEventAccess().getMonthINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleBrandEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"month",
            						lv_month_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,64,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getSingleBrandEventAccess().getRolesKeyword_7());
            		
            // InternalFashionDsl.g:3562:3: ( (otherlv_8= RULE_STRING ) )
            // InternalFashionDsl.g:3563:4: (otherlv_8= RULE_STRING )
            {
            // InternalFashionDsl.g:3563:4: (otherlv_8= RULE_STRING )
            // InternalFashionDsl.g:3564:5: otherlv_8= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleBrandEventRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_STRING,FOLLOW_53); 

            					newLeafNode(otherlv_8, grammarAccess.getSingleBrandEventAccess().getRolesRoleCrossReference_8_0());
            				

            }


            }

            // InternalFashionDsl.g:3575:3: (otherlv_9= ',' ( (otherlv_10= RULE_STRING ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==16) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalFashionDsl.g:3576:4: otherlv_9= ',' ( (otherlv_10= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getSingleBrandEventAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalFashionDsl.g:3580:4: ( (otherlv_10= RULE_STRING ) )
            	    // InternalFashionDsl.g:3581:5: (otherlv_10= RULE_STRING )
            	    {
            	    // InternalFashionDsl.g:3581:5: (otherlv_10= RULE_STRING )
            	    // InternalFashionDsl.g:3582:6: otherlv_10= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSingleBrandEventRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_STRING,FOLLOW_53); 

            	    						newLeafNode(otherlv_10, grammarAccess.getSingleBrandEventAccess().getRolesRoleCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_11=(Token)match(input,68,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getSingleBrandEventAccess().getDayKeyword_10());
            		
            // InternalFashionDsl.g:3598:3: ( (lv_day_12_0= RULE_INT ) )
            // InternalFashionDsl.g:3599:4: (lv_day_12_0= RULE_INT )
            {
            // InternalFashionDsl.g:3599:4: (lv_day_12_0= RULE_INT )
            // InternalFashionDsl.g:3600:5: lv_day_12_0= RULE_INT
            {
            lv_day_12_0=(Token)match(input,RULE_INT,FOLLOW_54); 

            					newLeafNode(lv_day_12_0, grammarAccess.getSingleBrandEventAccess().getDayINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleBrandEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"day",
            						lv_day_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,69,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getSingleBrandEventAccess().getHourKeyword_12());
            		
            // InternalFashionDsl.g:3620:3: ( (lv_hour_14_0= RULE_INT ) )
            // InternalFashionDsl.g:3621:4: (lv_hour_14_0= RULE_INT )
            {
            // InternalFashionDsl.g:3621:4: (lv_hour_14_0= RULE_INT )
            // InternalFashionDsl.g:3622:5: lv_hour_14_0= RULE_INT
            {
            lv_hour_14_0=(Token)match(input,RULE_INT,FOLLOW_55); 

            					newLeafNode(lv_hour_14_0, grammarAccess.getSingleBrandEventAccess().getHourINTTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleBrandEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hour",
            						lv_hour_14_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_15=(Token)match(input,70,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getSingleBrandEventAccess().getMinuteKeyword_14());
            		
            // InternalFashionDsl.g:3642:3: ( (lv_minute_16_0= RULE_INT ) )
            // InternalFashionDsl.g:3643:4: (lv_minute_16_0= RULE_INT )
            {
            // InternalFashionDsl.g:3643:4: (lv_minute_16_0= RULE_INT )
            // InternalFashionDsl.g:3644:5: lv_minute_16_0= RULE_INT
            {
            lv_minute_16_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_minute_16_0, grammarAccess.getSingleBrandEventAccess().getMinuteINTTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleBrandEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minute",
            						lv_minute_16_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_17=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getSingleBrandEventAccess().getBrandKeyword_16());
            		
            // InternalFashionDsl.g:3664:3: ( (otherlv_18= RULE_STRING ) )
            // InternalFashionDsl.g:3665:4: (otherlv_18= RULE_STRING )
            {
            // InternalFashionDsl.g:3665:4: (otherlv_18= RULE_STRING )
            // InternalFashionDsl.g:3666:5: otherlv_18= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleBrandEventRule());
            					}
            				
            otherlv_18=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(otherlv_18, grammarAccess.getSingleBrandEventAccess().getBrandBrandCrossReference_17_0());
            				

            }


            }

            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSingleBrandEventAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleBrandEvent"


    // $ANTLR start "entryRuleMediaType"
    // InternalFashionDsl.g:3685:1: entryRuleMediaType returns [String current=null] : iv_ruleMediaType= ruleMediaType EOF ;
    public final String entryRuleMediaType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMediaType = null;


        try {
            // InternalFashionDsl.g:3685:49: (iv_ruleMediaType= ruleMediaType EOF )
            // InternalFashionDsl.g:3686:2: iv_ruleMediaType= ruleMediaType EOF
            {
             newCompositeNode(grammarAccess.getMediaTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMediaType=ruleMediaType();

            state._fsp--;

             current =iv_ruleMediaType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediaType"


    // $ANTLR start "ruleMediaType"
    // InternalFashionDsl.g:3692:1: ruleMediaType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Online' | kw= 'TV' | kw= 'PhysicalBoard' ) ;
    public final AntlrDatatypeRuleToken ruleMediaType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFashionDsl.g:3698:2: ( (kw= 'Online' | kw= 'TV' | kw= 'PhysicalBoard' ) )
            // InternalFashionDsl.g:3699:2: (kw= 'Online' | kw= 'TV' | kw= 'PhysicalBoard' )
            {
            // InternalFashionDsl.g:3699:2: (kw= 'Online' | kw= 'TV' | kw= 'PhysicalBoard' )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt57=1;
                }
                break;
            case 72:
                {
                alt57=2;
                }
                break;
            case 73:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalFashionDsl.g:3700:3: kw= 'Online'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMediaTypeAccess().getOnlineKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFashionDsl.g:3706:3: kw= 'TV'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMediaTypeAccess().getTVKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalFashionDsl.g:3712:3: kw= 'PhysicalBoard'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMediaTypeAccess().getPhysicalBoardKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediaType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x3FDA2CCB02000800L,0x0000000000000008L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000070010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001104000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x3FDA2CCB02004800L,0x0000000000000008L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});

}