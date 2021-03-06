/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to add a custom domain for tracking open and click events to a configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetTrackingOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfigurationSetTrackingOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set that you want to add a custom tracking domain to.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The domain that you want to use to track open and click events.
     * </p>
     */
    private String customRedirectDomain;

    /**
     * <p>
     * The name of the configuration set that you want to add a custom tracking domain to.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to add a custom tracking domain to.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to add a custom tracking domain to.
     * </p>
     * 
     * @return The name of the configuration set that you want to add a custom tracking domain to.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to add a custom tracking domain to.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to add a custom tracking domain to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetTrackingOptionsRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The domain that you want to use to track open and click events.
     * </p>
     * 
     * @param customRedirectDomain
     *        The domain that you want to use to track open and click events.
     */

    public void setCustomRedirectDomain(String customRedirectDomain) {
        this.customRedirectDomain = customRedirectDomain;
    }

    /**
     * <p>
     * The domain that you want to use to track open and click events.
     * </p>
     * 
     * @return The domain that you want to use to track open and click events.
     */

    public String getCustomRedirectDomain() {
        return this.customRedirectDomain;
    }

    /**
     * <p>
     * The domain that you want to use to track open and click events.
     * </p>
     * 
     * @param customRedirectDomain
     *        The domain that you want to use to track open and click events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetTrackingOptionsRequest withCustomRedirectDomain(String customRedirectDomain) {
        setCustomRedirectDomain(customRedirectDomain);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getCustomRedirectDomain() != null)
            sb.append("CustomRedirectDomain: ").append(getCustomRedirectDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigurationSetTrackingOptionsRequest == false)
            return false;
        PutConfigurationSetTrackingOptionsRequest other = (PutConfigurationSetTrackingOptionsRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getCustomRedirectDomain() == null ^ this.getCustomRedirectDomain() == null)
            return false;
        if (other.getCustomRedirectDomain() != null && other.getCustomRedirectDomain().equals(this.getCustomRedirectDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getCustomRedirectDomain() == null) ? 0 : getCustomRedirectDomain().hashCode());
        return hashCode;
    }

    @Override
    public PutConfigurationSetTrackingOptionsRequest clone() {
        return (PutConfigurationSetTrackingOptionsRequest) super.clone();
    }

}
