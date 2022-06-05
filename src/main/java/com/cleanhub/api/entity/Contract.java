package com.cleanhub.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contract implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String uuid;
    String type;
    Date createdAt;
    Date startDate;
    Date endDate;
    String period;
    Integer quantity;
    Integer recoveredQuantity;
    Boolean isFulfilled;
    String quantityUnit;
    String salesforceOpportunityExternalId;



    /**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }
    /**
     * @param uuid the uuid to set
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }
    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }
    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }
    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    /**
     * @return the period
     */
    public String getPeriod() {
        return period;
    }
    /**
     * @param period the period to set
     */
    public void setPeriod(String period) {
        this.period = period;
    }
    /**
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }
    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    /**
     * @return the recoveredQuantity
     */
    public Integer getRecoveredQuantity() {
        return recoveredQuantity;
    }
    /**
     * @param recoveredQuantity the recoveredQuantity to set
     */
    public void setRecoveredQuantity(Integer recoveredQuantity) {
        this.recoveredQuantity = recoveredQuantity;
    }
    /**
     * @return the isFulfilled
     */
    public Boolean getIsFulfilled() {
        return isFulfilled;
    }
    /**
     * @param isFulfilled the isFulfilled to set
     */
    public void setIsFulfilled(Boolean isFulfilled) {
        this.isFulfilled = isFulfilled;
    }
    /**
     * @return the quantityUnit
     */
    public String getQuantityUnit() {
        return quantityUnit;
    }
    /**
     * @param quantityUnit the quantityUnit to set
     */
    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }
    /**
     * @return the salesforceOpportunityExternalId
     */
    public String getSalesforceOpportunityExternalId() {
        return salesforceOpportunityExternalId;
    }
    /**
     * @param salesforceOpportunityExternalId the salesforceOpportunityExternalId to set
     */
    public void setSalesforceOpportunityExternalId(
            String salesforceOpportunityExternalId) {
        this.salesforceOpportunityExternalId = salesforceOpportunityExternalId;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public Boolean getFulfilled() {
        return isFulfilled;
    }

    public void setFulfilled(Boolean fulfilled) {
        isFulfilled = fulfilled;
    }

}
