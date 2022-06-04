package com.cleanhub.api.entity;

import java.io.Serializable;
/**
 *
 * @author Megha Mehrotra
 *
 */
public class Order implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    Logo logo;
    String landingPageRoute;
    Boolean featured;

    /**
     * @return the logo
     */
    public Logo getLogo() {
        return logo;
    }

    /**
     * @param logo
     *            the logo to set
     */
    public void setLogo(Logo logo) {
        this.logo = logo;
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
     * @return the featured
     */
    public Boolean getFeatured() {
        return featured;
    }

    /**
     * @param featured
     *            the featured to set
     */
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

}
