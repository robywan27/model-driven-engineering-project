/*
 * 
 */
package fashion.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import fashion.diagram.providers.FashionElementTypes;

/**
 * @generated
 */
public class FashionPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAdvertisingCampaign1CreationTool());
		paletteContainer.add(createAdvertisingProduct2CreationTool());
		paletteContainer.add(createArticle3CreationTool());
		paletteContainer.add(createBlogger4CreationTool());
		paletteContainer.add(createChoreographer5CreationTool());
		paletteContainer.add(createComment6CreationTool());
		paletteContainer.add(createCritic7CreationTool());
		paletteContainer.add(createDescription8CreationTool());
		paletteContainer.add(createDesigner9CreationTool());
		paletteContainer.add(createEmergingBrand10CreationTool());
		paletteContainer.add(createFamousBrand11CreationTool());
		paletteContainer.add(createFashionStyle12CreationTool());
		paletteContainer.add(createInfluencer13CreationTool());
		paletteContainer.add(createLocalBrand14CreationTool());
		paletteContainer.add(createMacroEvent15CreationTool());
		paletteContainer.add(createModel16CreationTool());
		paletteContainer.add(createPhoto17CreationTool());
		paletteContainer.add(createPhotographer18CreationTool());
		paletteContainer.add(createPresenter19CreationTool());
		paletteContainer.add(createProduct20CreationTool());
		paletteContainer.add(createProductLine21CreationTool());
		paletteContainer.add(createProductStyle22CreationTool());
		paletteContainer.add(createSingleBrandEvent23CreationTool());
		paletteContainer.add(createSpatioTemporalDescriptor24CreationTool());
		paletteContainer.add(createTVProgram25CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createBrand1CreationTool());
		paletteContainer.add(createBrand2CreationTool());
		paletteContainer.add(createBrand3CreationTool());
		paletteContainer.add(createBrand4CreationTool());
		paletteContainer.add(createCampaigns5CreationTool());
		paletteContainer.add(createDesigners6CreationTool());
		paletteContainer.add(createElements7CreationTool());
		paletteContainer.add(createElements8CreationTool());
		paletteContainer.add(createEvents9CreationTool());
		paletteContainer.add(createProduct10CreationTool());
		paletteContainer.add(createProductLines11CreationTool());
		paletteContainer.add(createReviewer12CreationTool());
		paletteContainer.add(createReviews13CreationTool());
		paletteContainer.add(createReviews14CreationTool());
		paletteContainer.add(createRoles15CreationTool());
		paletteContainer.add(createStyles16CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAdvertisingCampaign1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.AdvertisingCampaign1CreationTool_title,
				Messages.AdvertisingCampaign1CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.AdvertisingCampaign_2017));
		entry.setId("createAdvertisingCampaign1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.AdvertisingCampaign_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAdvertisingProduct2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FashionElementTypes.AdvertisingProduct_3004);
		types.add(FashionElementTypes.AdvertisingProduct_2022);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.AdvertisingProduct2CreationTool_title,
				Messages.AdvertisingProduct2CreationTool_desc, types);
		entry.setId("createAdvertisingProduct2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.AdvertisingProduct_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArticle3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Article3CreationTool_title,
				Messages.Article3CreationTool_desc,
				Collections.singletonList(FashionElementTypes.Article_3001));
		entry.setId("createArticle3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Article_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBlogger4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Blogger4CreationTool_title,
				Messages.Blogger4CreationTool_desc,
				Collections.singletonList(FashionElementTypes.Blogger_2001));
		entry.setId("createBlogger4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Blogger_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChoreographer5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Choreographer5CreationTool_title,
				Messages.Choreographer5CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.Choreographer_2015));
		entry.setId("createChoreographer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Choreographer_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComment6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Comment6CreationTool_title,
				Messages.Comment6CreationTool_desc,
				Collections.singletonList(FashionElementTypes.Comment_2011));
		entry.setId("createComment6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Comment_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCritic7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Critic7CreationTool_title,
				Messages.Critic7CreationTool_desc,
				Collections.singletonList(FashionElementTypes.Critic_2002));
		entry.setId("createCritic7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Critic_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDescription8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Description8CreationTool_title,
				Messages.Description8CreationTool_desc,
				Collections.singletonList(FashionElementTypes.Description_2010));
		entry.setId("createDescription8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Description_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDesigner9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Designer9CreationTool_title,
				Messages.Designer9CreationTool_desc,
				Collections.singletonList(FashionElementTypes.Designer_2012));
		entry.setId("createDesigner9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Designer_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEmergingBrand10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.EmergingBrand10CreationTool_title,
				Messages.EmergingBrand10CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.EmergingBrand_2005));
		entry.setId("createEmergingBrand10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.EmergingBrand_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFamousBrand11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.FamousBrand11CreationTool_title,
				Messages.FamousBrand11CreationTool_desc,
				Collections.singletonList(FashionElementTypes.FamousBrand_2004));
		entry.setId("createFamousBrand11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.FamousBrand_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFashionStyle12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.FashionStyle12CreationTool_title,
				Messages.FashionStyle12CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.FashionStyle_2021));
		entry.setId("createFashionStyle12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.FashionStyle_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfluencer13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Influencer13CreationTool_title,
				Messages.Influencer13CreationTool_desc,
				Collections.singletonList(FashionElementTypes.Influencer_2003));
		entry.setId("createInfluencer13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Influencer_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLocalBrand14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.LocalBrand14CreationTool_title,
				Messages.LocalBrand14CreationTool_desc,
				Collections.singletonList(FashionElementTypes.LocalBrand_2006));
		entry.setId("createLocalBrand14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.LocalBrand_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMacroEvent15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.MacroEvent15CreationTool_title,
				Messages.MacroEvent15CreationTool_desc,
				Collections.singletonList(FashionElementTypes.MacroEvent_2007));
		entry.setId("createMacroEvent15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.MacroEvent_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createModel16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Model16CreationTool_title,
				Messages.Model16CreationTool_desc,
				Collections.singletonList(FashionElementTypes.Model_2013));
		entry.setId("createModel16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Model_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPhoto17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Photo17CreationTool_title,
				Messages.Photo17CreationTool_desc,
				Collections.singletonList(FashionElementTypes.Photo_2009));
		entry.setId("createPhoto17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Photo_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPhotographer18CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Photographer18CreationTool_title,
				Messages.Photographer18CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.Photographer_2016));
		entry.setId("createPhotographer18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Photographer_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPresenter19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Presenter19CreationTool_title,
				Messages.Presenter19CreationTool_desc,
				Collections.singletonList(FashionElementTypes.Presenter_2014));
		entry.setId("createPresenter19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Presenter_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProduct20CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FashionElementTypes.Product_3007);
		types.add(FashionElementTypes.Product_2020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Product20CreationTool_title,
				Messages.Product20CreationTool_desc, types);
		entry.setId("createProduct20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.Product_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProductLine21CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ProductLine21CreationTool_title,
				Messages.ProductLine21CreationTool_desc,
				Collections.singletonList(FashionElementTypes.ProductLine_2018));
		entry.setId("createProductLine21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.ProductLine_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProductStyle22CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FashionElementTypes.ProductStyle_3006);
		types.add(FashionElementTypes.ProductStyle_2019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ProductStyle22CreationTool_title,
				Messages.ProductStyle22CreationTool_desc, types);
		entry.setId("createProductStyle22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.ProductStyle_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSingleBrandEvent23CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FashionElementTypes.SingleBrandEvent_3005);
		types.add(FashionElementTypes.SingleBrandEvent_2008);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.SingleBrandEvent23CreationTool_title,
				Messages.SingleBrandEvent23CreationTool_desc, types);
		entry.setId("createSingleBrandEvent23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.SingleBrandEvent_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpatioTemporalDescriptor24CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.SpatioTemporalDescriptor24CreationTool_title,
				Messages.SpatioTemporalDescriptor24CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.SpatioTemporalDescriptor_3003));
		entry.setId("createSpatioTemporalDescriptor24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.SpatioTemporalDescriptor_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTVProgram25CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.TVProgram25CreationTool_title,
				Messages.TVProgram25CreationTool_desc,
				Collections.singletonList(FashionElementTypes.TVProgram_3002));
		entry.setId("createTVProgram25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.TVProgram_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBrand1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Brand1CreationTool_title,
				Messages.Brand1CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.AdvertisingCampaignBrand_4007));
		entry.setId("createBrand1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.AdvertisingCampaignBrand_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBrand2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Brand2CreationTool_title,
				Messages.Brand2CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.SingleBrandEventBrand_4009));
		entry.setId("createBrand2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.SingleBrandEventBrand_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBrand3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Brand3CreationTool_title,
				Messages.Brand3CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.ProductLineBrand_4010));
		entry.setId("createBrand3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.ProductLineBrand_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBrand4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Brand4CreationTool_title,
				Messages.Brand4CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.DesignerBrand_4015));
		entry.setId("createBrand4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.DesignerBrand_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCampaigns5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Campaigns5CreationTool_title,
				Messages.Campaigns5CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.BrandCampaigns_4004));
		entry.setId("createCampaigns5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.BrandCampaigns_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDesigners6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Designers6CreationTool_title,
				Messages.Designers6CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.BrandDesigners_4006));
		entry.setId("createDesigners6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.BrandDesigners_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElements7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Elements7CreationTool_title,
				Messages.Elements7CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.NewsReportElements_4002));
		entry.setId("createElements7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.NewsReportElements_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElements8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Elements8CreationTool_title,
				Messages.Elements8CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.FashionStyleElements_4003));
		entry.setId("createElements8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.FashionStyleElements_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvents9CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Events9CreationTool_title,
				Messages.Events9CreationTool_desc,
				Collections.singletonList(FashionElementTypes.RoleEvents_4014));
		entry.setId("createEvents9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.RoleEvents_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProduct10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Product10CreationTool_title,
				Messages.Product10CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.ReviewProduct_4012));
		entry.setId("createProduct10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.ReviewProduct_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProductLines11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ProductLines11CreationTool_title,
				Messages.ProductLines11CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.BrandProductLines_4005));
		entry.setId("createProductLines11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.BrandProductLines_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReviewer12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Reviewer12CreationTool_title,
				Messages.Reviewer12CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.ReviewReviewer_4013));
		entry.setId("createReviewer12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.ReviewReviewer_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReviews13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Reviews13CreationTool_title,
				Messages.Reviews13CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.ProductReviews_4011));
		entry.setId("createReviews13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.ProductReviews_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReviews14CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Reviews14CreationTool_title,
				Messages.Reviews14CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.ReviewerReviews_4016));
		entry.setId("createReviews14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.ReviewerReviews_4016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoles15CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Roles15CreationTool_title,
				Messages.Roles15CreationTool_desc,
				Collections.singletonList(FashionElementTypes.EventRoles_4008));
		entry.setId("createRoles15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.EventRoles_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStyles16CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.Styles16CreationTool_title,
				Messages.Styles16CreationTool_desc,
				Collections
						.singletonList(FashionElementTypes.FashionElementStyles_4001));
		entry.setId("createStyles16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FashionElementTypes
				.getImageDescriptor(FashionElementTypes.FashionElementStyles_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
