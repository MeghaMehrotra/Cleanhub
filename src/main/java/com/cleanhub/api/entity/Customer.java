package com.cleanhub.api.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Customer implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String uuid;
    String state;
    Date createdAt;
    Date lastModifiedAt;
    String companyName;
    String companyUrl;
    String companyLink;
    Date contractStartDate;
    String landingPageRoute;
    String landingPageMode;
    Double quantity;
    String quantityUnit;
    Double recoveredQuantity;
    Double recoveredPercentage;
    String language;
    String country;
    String mainProduct;
    String industry;
    String featuredStatement;
    String onboardingCallScheduled;
    Boolean fixedGoal;
    Boolean commitment;
    String goalType;
    String serviceType;
    @OneToOne
    CompanyLogo companyLogo;

    @OneToOne
    TrustMark trustMark;

    @OneToOne
    ProductImage productImage;
    String productBackgroundPosition;
    String customerImpactGoalTitle;
    String statement;
    String ongoingPlanTitle;
    Boolean strategySectionEnabled;
    String impactStrategyTitle;
    String strategyParagraphs;
    Boolean strategySectionDetailsEnabled;
    String reductionStrategyTitle;
    @Lob
    String reductionStrategyDescription;
    String empoweringStrategyTitle;
    @Lob
    String empoweringStrategyDescription;

    String disposalStrategyTitle;
    @Lob
    String disposalStrategyDescription;
    Boolean communityActivityEventsSectionEnabled;

    @OneToOne
    Hub hub;
    Boolean shopifyAppInstalled;
    Date hubAssignmentTimestamp;
    Date collectionStartedTimestamp;
    Date recoveryStartedTimestamp;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<ProgressSteps> progressSteps;
    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    List<Contract> contracts;
    String formattedQuantity;
    String formattedRecoveredQuantity;
    String equivalentPlasticBottles;
    String recoveredEquivalentPlasticBottles;

    Double increaseInQuantity;



    /**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     *            the uuid to set
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     *            the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the lastModifiedAt
     */
    public Date getLastModifiedAt() {
        return lastModifiedAt;
    }

    /**
     * @param lastModifiedAt
     *            the lastModifiedAt to set
     */
    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName
     *            the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the companyUrl
     */
    public String getCompanyUrl() {
        return companyUrl;
    }

    /**
     * @param companyUrl
     *            the companyUrl to set
     */
    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    /**
     * @return the companyLink
     */
    public String getCompanyLink() {
        return companyLink;
    }

    /**
     * @param companyLink
     *            the companyLink to set
     */
    public void setCompanyLink(String companyLink) {
        this.companyLink = companyLink;
    }

    /**
     * @return the contractStartDate
     */
    public Date getContractStartDate() {
        return contractStartDate;
    }

    /**
     * @param contractStartDate
     *            the contractStartDate to set
     */
    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    /**
     * @return the landingPageRoute
     */
    public String getLandingPageRoute() {
        return landingPageRoute;
    }

    /**
     * @param landingPageRoute
     *            the landingPageRoute to set
     */
    public void setLandingPageRoute(String landingPageRoute) {
        this.landingPageRoute = landingPageRoute;
    }

    /**
     * @return the landingPageMode
     */
    public String getLandingPageMode() {
        return landingPageMode;
    }

    /**
     * @param landingPageMode
     *            the landingPageMode to set
     */
    public void setLandingPageMode(String landingPageMode) {
        this.landingPageMode = landingPageMode;
    }

    /**
     * @return the quantity
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity
     *            the quantity to set
     */
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the quantityUnit
     */
    public String getQuantityUnit() {
        return quantityUnit;
    }

    /**
     * @param quantityUnit
     *            the quantityUnit to set
     */
    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    /**
     * @return the recoveredQuantity
     */
    public Double getRecoveredQuantity() {
        return recoveredQuantity;
    }

    /**
     * @param recoveredQuantity
     *            the recoveredQuantity to set
     */
    public void setRecoveredQuantity(Double recoveredQuantity) {
        this.recoveredQuantity = recoveredQuantity;
    }

    /**
     * @return the recoveredPercentage
     */
    public Double getRecoveredPercentage() {
        return recoveredPercentage;
    }

    /**
     * @param recoveredPercentage
     *            the recoveredPercentage to set
     */
    public void setRecoveredPercentage(Double recoveredPercentage) {
        this.recoveredPercentage = recoveredPercentage;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language
     *            the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     *            the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the mainProduct
     */
    public String getMainProduct() {
        return mainProduct;
    }

    /**
     * @param mainProduct
     *            the mainProduct to set
     */
    public void setMainProduct(String mainProduct) {
        this.mainProduct = mainProduct;
    }

    /**
     * @return the industry
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * @param industry
     *            the industry to set
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * @return the featuredStatement
     */
    public String getFeaturedStatement() {
        return featuredStatement;
    }

    /**
     * @param featuredStatement
     *            the featuredStatement to set
     */
    public void setFeaturedStatement(String featuredStatement) {
        this.featuredStatement = featuredStatement;
    }

    /**
     * @return the onboardingCallScheduled
     */
    public String getOnboardingCallScheduled() {
        return onboardingCallScheduled;
    }

    /**
     * @param onboardingCallScheduled
     *            the onboardingCallScheduled to set
     */
    public void setOnboardingCallScheduled(String onboardingCallScheduled) {
        this.onboardingCallScheduled = onboardingCallScheduled;
    }

    /**
     * @return the fixedGoal
     */
    public Boolean getFixedGoal() {
        return fixedGoal;
    }

    /**
     * @param fixedGoal
     *            the fixedGoal to set
     */
    public void setFixedGoal(Boolean fixedGoal) {
        this.fixedGoal = fixedGoal;
    }

    /**
     * @return the commitment
     */
    public Boolean getCommitment() {
        return commitment;
    }

    /**
     * @param commitment
     *            the commitment to set
     */
    public void setCommitment(Boolean commitment) {
        this.commitment = commitment;
    }

    /**
     * @return the goalType
     */
    public String getGoalType() {
        return goalType;
    }

    /**
     * @param goalType
     *            the goalType to set
     */
    public void setGoalType(String goalType) {
        this.goalType = goalType;
    }

    /**
     * @return the serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * @param serviceType
     *            the serviceType to set
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * @return the companyLogo
     */
    public CompanyLogo getCompanyLogo() {
        return companyLogo;
    }

    /**
     * @param companyLogo
     *            the companyLogo to set
     */
    public void setCompanyLogo(CompanyLogo companyLogo) {
        this.companyLogo = companyLogo;
    }

    /**
     * @return the trustMark
     */
    public TrustMark getTrustMark() {
        return trustMark;
    }

    /**
     * @param trustMark
     *            the trustMark to set
     */
    public void setTrustMark(TrustMark trustMark) {
        this.trustMark = trustMark;
    }

    /**
     * @return the productImage
     */
    public ProductImage getProductImage() {
        return productImage;
    }

    /**
     * @param productImage
     *            the productImage to set
     */
    public void setProductImage(ProductImage productImage) {
        this.productImage = productImage;
    }

    /**
     * @return the productBackgroundPosition
     */
    public String getProductBackgroundPosition() {
        return productBackgroundPosition;
    }

    /**
     * @param productBackgroundPosition
     *            the productBackgroundPosition to set
     */
    public void setProductBackgroundPosition(String productBackgroundPosition) {
        this.productBackgroundPosition = productBackgroundPosition;
    }

    /**
     * @return the customerImpactGoalTitle
     */
    public String getCustomerImpactGoalTitle() {
        return customerImpactGoalTitle;
    }

    /**
     * @param customerImpactGoalTitle
     *            the customerImpactGoalTitle to set
     */
    public void setCustomerImpactGoalTitle(String customerImpactGoalTitle) {
        this.customerImpactGoalTitle = customerImpactGoalTitle;
    }

    /**
     * @return the statement
     */
    public String getStatement() {
        return statement;
    }

    /**
     * @param statement
     *            the statement to set
     */
    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * @return the ongoingPlanTitle
     */
    public String getOngoingPlanTitle() {
        return ongoingPlanTitle;
    }

    /**
     * @param ongoingPlanTitle
     *            the ongoingPlanTitle to set
     */
    public void setOngoingPlanTitle(String ongoingPlanTitle) {
        this.ongoingPlanTitle = ongoingPlanTitle;
    }

    /**
     * @return the strategySectionEnabled
     */
    public Boolean getStrategySectionEnabled() {
        return strategySectionEnabled;
    }

    /**
     * @param strategySectionEnabled
     *            the strategySectionEnabled to set
     */
    public void setStrategySectionEnabled(Boolean strategySectionEnabled) {
        this.strategySectionEnabled = strategySectionEnabled;
    }

    /**
     * @return the impactStrategyTitle
     */
    public String getImpactStrategyTitle() {
        return impactStrategyTitle;
    }

    /**
     * @param impactStrategyTitle
     *            the impactStrategyTitle to set
     */
    public void setImpactStrategyTitle(String impactStrategyTitle) {
        this.impactStrategyTitle = impactStrategyTitle;
    }

    /**
     * @return the strategyParagraphs
     */
    public String getStrategyParagraphs() {
        return strategyParagraphs;
    }

    /**
     * @param strategyParagraphs
     *            the strategyParagraphs to set
     */
    public void setStrategyParagraphs(String strategyParagraphs) {
        this.strategyParagraphs = strategyParagraphs;
    }

    /**
     * @return the strategySectionDetailsEnabled
     */
    public Boolean getStrategySectionDetailsEnabled() {
        return strategySectionDetailsEnabled;
    }

    /**
     * @param strategySectionDetailsEnabled
     *            the strategySectionDetailsEnabled to set
     */
    public void setStrategySectionDetailsEnabled(
            Boolean strategySectionDetailsEnabled) {
        this.strategySectionDetailsEnabled = strategySectionDetailsEnabled;
    }

    /**
     * @return the reductionStrategyTitle
     */
    public String getReductionStrategyTitle() {
        return reductionStrategyTitle;
    }

    /**
     * @param reductionStrategyTitle
     *            the reductionStrategyTitle to set
     */
    public void setReductionStrategyTitle(String reductionStrategyTitle) {
        this.reductionStrategyTitle = reductionStrategyTitle;
    }

    /**
     * @return the reductionStrategyDescription
     */
    public String getReductionStrategyDescription() {
        return reductionStrategyDescription;
    }

    /**
     * @param reductionStrategyDescription
     *            the reductionStrategyDescription to set
     */
    public void setReductionStrategyDescription(
            String reductionStrategyDescription) {
        this.reductionStrategyDescription = reductionStrategyDescription;
    }

    /**
     * @return the empoweringStrategyTitle
     */
    public String getEmpoweringStrategyTitle() {
        return empoweringStrategyTitle;
    }

    /**
     * @param empoweringStrategyTitle
     *            the empoweringStrategyTitle to set
     */
    public void setEmpoweringStrategyTitle(String empoweringStrategyTitle) {
        this.empoweringStrategyTitle = empoweringStrategyTitle;
    }

    /**
     * @return the empoweringStrategyDescription
     */
    public String getEmpoweringStrategyDescription() {
        return empoweringStrategyDescription;
    }

    /**
     * @param empoweringStrategyDescription
     *            the empoweringStrategyDescription to set
     */
    public void setEmpoweringStrategyDescription(
            String empoweringStrategyDescription) {
        this.empoweringStrategyDescription = empoweringStrategyDescription;
    }

    /**
     * @return the disposalStrategyTitle
     */
    public String getDisposalStrategyTitle() {
        return disposalStrategyTitle;
    }

    /**
     * @param disposalStrategyTitle
     *            the disposalStrategyTitle to set
     */
    public void setDisposalStrategyTitle(String disposalStrategyTitle) {
        this.disposalStrategyTitle = disposalStrategyTitle;
    }

    /**
     * @return the disposalStrategyDescription
     */
    public String getDisposalStrategyDescription() {
        return disposalStrategyDescription;
    }

    /**
     * @param disposalStrategyDescription
     *            the disposalStrategyDescription to set
     */
    public void setDisposalStrategyDescription(
            String disposalStrategyDescription) {
        this.disposalStrategyDescription = disposalStrategyDescription;
    }

    /**
     * @return the communityActivityEventsSectionEnabled
     */
    public Boolean getCommunityActivityEventsSectionEnabled() {
        return communityActivityEventsSectionEnabled;
    }

    /**
     * @param communityActivityEventsSectionEnabled
     *            the communityActivityEventsSectionEnabled to set
     */
    public void setCommunityActivityEventsSectionEnabled(
            Boolean communityActivityEventsSectionEnabled) {
        this.communityActivityEventsSectionEnabled = communityActivityEventsSectionEnabled;
    }

    /**
     * @return the shopifyAppInstalled
     */
    public Boolean getShopifyAppInstalled() {
        return shopifyAppInstalled;
    }

    /**
     * @param shopifyAppInstalled
     *            the shopifyAppInstalled to set
     */
    public void setShopifyAppInstalled(Boolean shopifyAppInstalled) {
        this.shopifyAppInstalled = shopifyAppInstalled;
    }

    /**
     * @return the hubAssignmentTimestamp
     */
    public Date getHubAssignmentTimestamp() {
        return hubAssignmentTimestamp;
    }

    /**
     * @param hubAssignmentTimestamp
     *            the hubAssignmentTimestamp to set
     */
    public void setHubAssignmentTimestamp(Date hubAssignmentTimestamp) {
        this.hubAssignmentTimestamp = hubAssignmentTimestamp;
    }

    /**
     * @return the collectionStartedTimestamp
     */
    public Date getCollectionStartedTimestamp() {
        return collectionStartedTimestamp;
    }

    /**
     * @param collectionStartedTimestamp
     *            the collectionStartedTimestamp to set
     */
    public void setCollectionStartedTimestamp(Date collectionStartedTimestamp) {
        this.collectionStartedTimestamp = collectionStartedTimestamp;
    }

    /**
     * @return the recoveryStartedTimestamp
     */
    public Date getRecoveryStartedTimestamp() {
        return recoveryStartedTimestamp;
    }

    /**
     * @param recoveryStartedTimestamp
     *            the recoveryStartedTimestamp to set
     */
    public void setRecoveryStartedTimestamp(Date recoveryStartedTimestamp) {
        this.recoveryStartedTimestamp = recoveryStartedTimestamp;
    }

    /**
     * @return the contracts
     */
    public List<Contract> getContracts() {
        return contracts;
    }

    /**
     * @param contracts
     *            the contracts to set
     */
    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    /**
     * @return the formattedQuantity
     */
    public String getFormattedQuantity() {
        return formattedQuantity;
    }

    /**
     * @param formattedQuantity
     *            the formattedQuantity to set
     */
    public void setFormattedQuantity(String formattedQuantity) {
        this.formattedQuantity = formattedQuantity;
    }

    /**
     * @return the formattedRecoveredQuantity
     */
    public String getFormattedRecoveredQuantity() {
        return formattedRecoveredQuantity;
    }

    /**
     * @param formattedRecoveredQuantity
     *            the formattedRecoveredQuantity to set
     */
    public void setFormattedRecoveredQuantity(String formattedRecoveredQuantity) {
        this.formattedRecoveredQuantity = formattedRecoveredQuantity;
    }

    /**
     * @return the equivalentPlasticBottles
     */
    public String getEquivalentPlasticBottles() {
        return equivalentPlasticBottles;
    }

    /**
     * @param equivalentPlasticBottles
     *            the equivalentPlasticBottles to set
     */
    public void setEquivalentPlasticBottles(String equivalentPlasticBottles) {
        this.equivalentPlasticBottles = equivalentPlasticBottles;
    }

    /**
     * @return the recoveredEquivalentPlasticBottles
     */
    public String getRecoveredEquivalentPlasticBottles() {
        return recoveredEquivalentPlasticBottles;
    }

    /**
     * @param recoveredEquivalentPlasticBottles
     *            the recoveredEquivalentPlasticBottles to set
     */
    public void setRecoveredEquivalentPlasticBottles(
            String recoveredEquivalentPlasticBottles) {
        this.recoveredEquivalentPlasticBottles = recoveredEquivalentPlasticBottles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hub getHub() {
        return hub;
    }

    public void setHub(Hub hub) {
        this.hub = hub;
    }

    public List<ProgressSteps> getProgressSteps() {
        return progressSteps;
    }

    public void setProgressSteps(List<ProgressSteps> progressSteps) {
        this.progressSteps = progressSteps;
    }

    public Double getIncreaseInQuantity() {
        return increaseInQuantity;
    }

    public void setIncreaseInQuantity(Double increaseInQuantity) {
        this.increaseInQuantity = increaseInQuantity;
    }
}
