
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum AutofillHintsSchema {

    @SerializedName("addressCity")
    ADDRESS_CITY("addressCity"),
    @SerializedName("addressCityAndState")
    ADDRESS_CITY_AND_STATE("addressCityAndState"),
    @SerializedName("addressState")
    ADDRESS_STATE("addressState"),
    @SerializedName("birthday")
    BIRTHDAY("birthday"),
    @SerializedName("birthdayDay")
    BIRTHDAY_DAY("birthdayDay"),
    @SerializedName("birthdayMonth")
    BIRTHDAY_MONTH("birthdayMonth"),
    @SerializedName("birthdayYear")
    BIRTHDAY_YEAR("birthdayYear"),
    @SerializedName("countryCode")
    COUNTRY_CODE("countryCode"),
    @SerializedName("countryName")
    COUNTRY_NAME("countryName"),
    @SerializedName("creditCardExpirationDate")
    CREDIT_CARD_EXPIRATION_DATE("creditCardExpirationDate"),
    @SerializedName("creditCardExpirationDay")
    CREDIT_CARD_EXPIRATION_DAY("creditCardExpirationDay"),
    @SerializedName("creditCardExpirationMonth")
    CREDIT_CARD_EXPIRATION_MONTH("creditCardExpirationMonth"),
    @SerializedName("creditCardExpirationYear")
    CREDIT_CARD_EXPIRATION_YEAR("creditCardExpirationYear"),
    @SerializedName("creditCardFamilyName")
    CREDIT_CARD_FAMILY_NAME("creditCardFamilyName"),
    @SerializedName("creditCardGivenName")
    CREDIT_CARD_GIVEN_NAME("creditCardGivenName"),
    @SerializedName("creditCardMiddleName")
    CREDIT_CARD_MIDDLE_NAME("creditCardMiddleName"),
    @SerializedName("creditCardName")
    CREDIT_CARD_NAME("creditCardName"),
    @SerializedName("creditCardNumber")
    CREDIT_CARD_NUMBER("creditCardNumber"),
    @SerializedName("creditCardSecurityCode")
    CREDIT_CARD_SECURITY_CODE("creditCardSecurityCode"),
    @SerializedName("creditCardType")
    CREDIT_CARD_TYPE("creditCardType"),
    @SerializedName("email")
    EMAIL("email"),
    @SerializedName("familyName")
    FAMILY_NAME("familyName"),
    @SerializedName("fullStreetAddress")
    FULL_STREET_ADDRESS("fullStreetAddress"),
    @SerializedName("gender")
    GENDER("gender"),
    @SerializedName("givenName")
    GIVEN_NAME("givenName"),
    @SerializedName("impp")
    IMPP("impp"),
    @SerializedName("jobTitle")
    JOB_TITLE("jobTitle"),
    @SerializedName("language")
    LANGUAGE("language"),
    @SerializedName("location")
    LOCATION("location"),
    @SerializedName("middleInitial")
    MIDDLE_INITIAL("middleInitial"),
    @SerializedName("middleName")
    MIDDLE_NAME("middleName"),
    @SerializedName("name")
    NAME("name"),
    @SerializedName("namePrefix")
    NAME_PREFIX("namePrefix"),
    @SerializedName("nameSuffix")
    NAME_SUFFIX("nameSuffix"),
    @SerializedName("newPassword")
    NEW_PASSWORD("newPassword"),
    @SerializedName("newUsername")
    NEW_USERNAME("newUsername"),
    @SerializedName("nickname")
    NICKNAME("nickname"),
    @SerializedName("oneTimeCode")
    ONE_TIME_CODE("oneTimeCode"),
    @SerializedName("organizationName")
    ORGANIZATION_NAME("organizationName"),
    @SerializedName("password")
    PASSWORD("password"),
    @SerializedName("photo")
    PHOTO("photo"),
    @SerializedName("postalAddress")
    POSTAL_ADDRESS("postalAddress"),
    @SerializedName("postalAddressExtended")
    POSTAL_ADDRESS_EXTENDED("postalAddressExtended"),
    @SerializedName("postalAddressExtendedPostalCode")
    POSTAL_ADDRESS_EXTENDED_POSTAL_CODE("postalAddressExtendedPostalCode"),
    @SerializedName("postalCode")
    POSTAL_CODE("postalCode"),
    @SerializedName("streetAddressLevel1")
    STREET_ADDRESS_LEVEL_1("streetAddressLevel1"),
    @SerializedName("streetAddressLevel2")
    STREET_ADDRESS_LEVEL_2("streetAddressLevel2"),
    @SerializedName("streetAddressLevel3")
    STREET_ADDRESS_LEVEL_3("streetAddressLevel3"),
    @SerializedName("streetAddressLevel4")
    STREET_ADDRESS_LEVEL_4("streetAddressLevel4"),
    @SerializedName("streetAddressLine1")
    STREET_ADDRESS_LINE_1("streetAddressLine1"),
    @SerializedName("streetAddressLine2")
    STREET_ADDRESS_LINE_2("streetAddressLine2"),
    @SerializedName("streetAddressLine3")
    STREET_ADDRESS_LINE_3("streetAddressLine3"),
    @SerializedName("sublocality")
    SUBLOCALITY("sublocality"),
    @SerializedName("telephoneNumber")
    TELEPHONE_NUMBER("telephoneNumber"),
    @SerializedName("telephoneNumberAreaCode")
    TELEPHONE_NUMBER_AREA_CODE("telephoneNumberAreaCode"),
    @SerializedName("telephoneNumberCountryCode")
    TELEPHONE_NUMBER_COUNTRY_CODE("telephoneNumberCountryCode"),
    @SerializedName("telephoneNumberDevice")
    TELEPHONE_NUMBER_DEVICE("telephoneNumberDevice"),
    @SerializedName("telephoneNumberExtension")
    TELEPHONE_NUMBER_EXTENSION("telephoneNumberExtension"),
    @SerializedName("telephoneNumberLocal")
    TELEPHONE_NUMBER_LOCAL("telephoneNumberLocal"),
    @SerializedName("telephoneNumberLocalPrefix")
    TELEPHONE_NUMBER_LOCAL_PREFIX("telephoneNumberLocalPrefix"),
    @SerializedName("telephoneNumberLocalSuffix")
    TELEPHONE_NUMBER_LOCAL_SUFFIX("telephoneNumberLocalSuffix"),
    @SerializedName("telephoneNumberNational")
    TELEPHONE_NUMBER_NATIONAL("telephoneNumberNational"),
    @SerializedName("transactionAmount")
    TRANSACTION_AMOUNT("transactionAmount"),
    @SerializedName("transactionCurrency")
    TRANSACTION_CURRENCY("transactionCurrency"),
    @SerializedName("url")
    URL("url"),
    @SerializedName("username")
    USERNAME("username");

    private final String value;
    private final static Map<String, AutofillHintsSchema> CONSTANTS = new HashMap<String, AutofillHintsSchema>();

    static {
        for (AutofillHintsSchema c : values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AutofillHintsSchema(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static AutofillHintsSchema fromValue(String value) {
        AutofillHintsSchema constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
