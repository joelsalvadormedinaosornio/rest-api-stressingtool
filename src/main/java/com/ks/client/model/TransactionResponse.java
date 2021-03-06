/*
 * KM Router
 * Allows processing of different types of transactions
 *
 * OpenAPI spec version: 2.0.0.0
 * Contact: atencionclientes@kssoluciones.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ks.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * TransactionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T18:10:54.088Z")
public class TransactionResponse
{
    @SerializedName("transaction_id")
    private String transactionId = null;

    @SerializedName("card_number")
    private String cardNumber = null;

    @SerializedName("authorization_number")
    private String authorizationNumber = null;

    @SerializedName("response_code_bank")
    private String responseCodeBank = null;

    @SerializedName("response_code_app")
    private String responseCodeApp = null;

    @SerializedName("issuer_authentication")
    private String issuerAuthentication = null;

    @SerializedName("issuer_script")
    private String issuerScript = null;

    @SerializedName("contains_reference")
    private Boolean containsReference = false;

    @SerializedName("points")
    private Points points = null;

    public TransactionResponse cardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
        return this;
    }

    /**
     * Number card with X-Reference
     *
     * @return cardNumber
     **/
    @ApiModelProperty(example = "4444555566667777888", required = true, value = "Number card with X-Reference")
    public String getCardNumber()
    {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public TransactionResponse transactionId(String transactionId)
    {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Number card with X-Reference
     *
     * @return transactionId
     **/
    @ApiModelProperty(example = "123456789123", required = true, value = "ColectorTransaction Identifiacion Number")
    public String getTransactionId()
    {
        return transactionId;
    }

    public void setTransactionId(String transactionId)
    {
        this.transactionId = transactionId;
    }

    public TransactionResponse authorizationNumber(String authorizationNumber)
    {
        this.authorizationNumber = authorizationNumber;
        return this;
    }

    /**
     * Get authorizationNumber
     *
     * @return authorizationNumber
     **/
    @ApiModelProperty(required = true, value = "")
    public String getAuthorizationNumber()
    {
        return authorizationNumber;
    }

    public void setAuthorizationNumber(String authorizationNumber)
    {
        this.authorizationNumber = authorizationNumber;
    }

    public TransactionResponse responseCodeBank(String responseCodeBank)
    {
        this.responseCodeBank = responseCodeBank;
        return this;
    }

    /**
     * Get responseCodeBank
     *
     * @return responseCodeBank
     **/
    @ApiModelProperty(required = true, value = "")
    public String getResponseCodeBank()
    {
        return responseCodeBank;
    }

    public void setResponseCodeBank(String responseCodeBank)
    {
        this.responseCodeBank = responseCodeBank;
    }

    public TransactionResponse responseCodeApp(String responseCodeApp)
    {
        this.responseCodeApp = responseCodeApp;
        return this;
    }

    /**
     * Get responseCodeApp
     *
     * @return responseCodeApp
     **/
    @ApiModelProperty(required = true, value = "")
    public String getResponseCodeApp()
    {
        return responseCodeApp;
    }

    public void setResponseCodeApp(String responseCodeApp)
    {
        this.responseCodeApp = responseCodeApp;
    }

    public TransactionResponse issuerAuthentication(String issuerAuthentication)
    {
        this.issuerAuthentication = issuerAuthentication;
        return this;
    }

    /**
     * Get issuerAuthentication
     *
     * @return issuerAuthentication
     **/
    @ApiModelProperty(required = false, value = "")
    public String getIssuerAuthentication()
    {
        return issuerAuthentication;
    }

    public void setIssuerAuthentication(String issuerAuthentication)
    {
        this.issuerAuthentication = issuerAuthentication;
    }

    public TransactionResponse issuerScript(String issuerScript)
    {
        this.issuerScript = issuerScript;
        return this;
    }

    /**
     * Get issuerScript
     *
     * @return issuerScript
     **/
    @ApiModelProperty(required = false, value = "")
    public String getIssuerScript()
    {
        return issuerScript;
    }

    public void setIssuerScript(String issuerScript)
    {
        this.issuerScript = issuerScript;
    }

    public TransactionResponse containsReference(Boolean containsReference)
    {
        this.containsReference = containsReference;
        return this;
    }

    /**
     * Get containsReference
     *
     * @return containsReference
     **/
    @ApiModelProperty(required = false, value = "")
    public Boolean containsReference()
    {
        return containsReference;
    }

    public void setContainsReference(Boolean containsReference)
    {
        this.containsReference = containsReference;
    }

    public TransactionResponse points(Points points)
    {
        this.points = points;
        return this;
    }

    /**
     * Get points
     *
     * @return points
     **/
    @ApiModelProperty(value = "")
    public Points getPoints()
    {
        return points;
    }

    public void setPoints(Points points)
    {
        this.points = points;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        TransactionResponse transactionResponse = (TransactionResponse) o;
        return Objects.equals(this.cardNumber, transactionResponse.cardNumber) && Objects.equals(this.transactionId, transactionResponse.transactionId) && Objects.equals(this.authorizationNumber, transactionResponse.authorizationNumber) && Objects.equals(this.responseCodeBank, transactionResponse.responseCodeBank) && Objects.equals(this.responseCodeApp, transactionResponse.responseCodeApp) && Objects.equals(this.points, transactionResponse.points) && Objects.equals(this.containsReference, transactionResponse.containsReference);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(cardNumber, transactionId, authorizationNumber, responseCodeBank, responseCodeApp, issuerAuthentication, issuerScript, containsReference, points);
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionResponse {\n");

        sb.append("    card_number: ").append(toIndentedString(cardNumber)).append("\n");
        sb.append("    card_number: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    authorization_number: ").append(toIndentedString(authorizationNumber)).append("\n");
        sb.append("    response_code_bank: ").append(toIndentedString(responseCodeBank)).append("\n");
        sb.append("    response_code_app: ").append(toIndentedString(responseCodeApp)).append("\n");
        sb.append("    issuer_authentication: ").append(toIndentedString(issuerAuthentication)).append("\n");
        sb.append("    issuer_script: ").append(toIndentedString(issuerScript)).append("\n");
        sb.append("    contains_reference: ").append(toIndentedString(containsReference)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o)
    {
        if (o == null)
        {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public String toSingleLineMaskString()
    {
        if (cardNumber != null)
        {
            return this.toMaskaredString().replace("\n", "  ");
        }
        else
        {
            return this.toSingleLineString();
        }
    }

    public String toMaskaredString()
    {
        if (this.cardNumber.length() == 19)
        {
            return this.toSingleLineString();
        }
        final String cardNumber = this.cardNumber.toString();
        final int length = cardNumber.length();
        final String maskedCard = cardNumber.substring(0, 6).concat(this.refill("*", length - 10)).concat(cardNumber.substring(length - 4));

        return this.toSingleLineString().replace(cardNumber, maskedCard);
    }

    public String toSingleLineString()
    {
        return this.toString().replace("\n", "  ");
    }

    public static String refill(String character, int length)
    {
        final StringBuilder refill = new StringBuilder();

        for (int i = 0; i < length; i++)
        {
            refill.append(character);
        }
        return refill.toString();
    }
}

